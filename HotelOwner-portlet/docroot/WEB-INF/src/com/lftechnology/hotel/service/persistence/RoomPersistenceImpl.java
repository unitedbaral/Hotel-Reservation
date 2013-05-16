/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.lftechnology.hotel.service.persistence;

import com.lftechnology.hotel.NoSuchRoomException;
import com.lftechnology.hotel.model.Room;
import com.lftechnology.hotel.model.impl.RoomImpl;
import com.lftechnology.hotel.model.impl.RoomModelImpl;

import com.liferay.portal.NoSuchModelException;
import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.BatchSessionUtil;
import com.liferay.portal.service.persistence.ResourcePersistence;
import com.liferay.portal.service.persistence.UserPersistence;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ranjan
 * @see RoomPersistence
 * @see RoomUtil
 * @generated
 */
public class RoomPersistenceImpl extends BasePersistenceImpl<Room>
	implements RoomPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RoomUtil} to access the room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RoomImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RoomModelImpl.ENTITY_CACHE_ENABLED,
			RoomModelImpl.FINDER_CACHE_ENABLED, RoomImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RoomModelImpl.ENTITY_CACHE_ENABLED,
			RoomModelImpl.FINDER_CACHE_ENABLED, RoomImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RoomModelImpl.ENTITY_CACHE_ENABLED,
			RoomModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the room in the entity cache if it is enabled.
	 *
	 * @param room the room
	 */
	public void cacheResult(Room room) {
		EntityCacheUtil.putResult(RoomModelImpl.ENTITY_CACHE_ENABLED,
			RoomImpl.class, room.getPrimaryKey(), room);

		room.resetOriginalValues();
	}

	/**
	 * Caches the rooms in the entity cache if it is enabled.
	 *
	 * @param rooms the rooms
	 */
	public void cacheResult(List<Room> rooms) {
		for (Room room : rooms) {
			if (EntityCacheUtil.getResult(RoomModelImpl.ENTITY_CACHE_ENABLED,
						RoomImpl.class, room.getPrimaryKey()) == null) {
				cacheResult(room);
			}
			else {
				room.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all rooms.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RoomImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RoomImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the room.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Room room) {
		EntityCacheUtil.removeResult(RoomModelImpl.ENTITY_CACHE_ENABLED,
			RoomImpl.class, room.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Room> rooms) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Room room : rooms) {
			EntityCacheUtil.removeResult(RoomModelImpl.ENTITY_CACHE_ENABLED,
				RoomImpl.class, room.getPrimaryKey());
		}
	}

	/**
	 * Creates a new room with the primary key. Does not add the room to the database.
	 *
	 * @param roomId the primary key for the new room
	 * @return the new room
	 */
	public Room create(long roomId) {
		Room room = new RoomImpl();

		room.setNew(true);
		room.setPrimaryKey(roomId);

		return room;
	}

	/**
	 * Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomId the primary key of the room
	 * @return the room that was removed
	 * @throws com.lftechnology.hotel.NoSuchRoomException if a room with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Room remove(long roomId) throws NoSuchRoomException, SystemException {
		return remove(Long.valueOf(roomId));
	}

	/**
	 * Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the room
	 * @return the room that was removed
	 * @throws com.lftechnology.hotel.NoSuchRoomException if a room with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Room remove(Serializable primaryKey)
		throws NoSuchRoomException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Room room = (Room)session.get(RoomImpl.class, primaryKey);

			if (room == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRoomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(room);
		}
		catch (NoSuchRoomException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Room removeImpl(Room room) throws SystemException {
		room = toUnwrappedModel(room);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, room);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(room);

		return room;
	}

	@Override
	public Room updateImpl(com.lftechnology.hotel.model.Room room, boolean merge)
		throws SystemException {
		room = toUnwrappedModel(room);

		boolean isNew = room.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, room, merge);

			room.setNew(false);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(RoomModelImpl.ENTITY_CACHE_ENABLED,
			RoomImpl.class, room.getPrimaryKey(), room);

		return room;
	}

	protected Room toUnwrappedModel(Room room) {
		if (room instanceof RoomImpl) {
			return room;
		}

		RoomImpl roomImpl = new RoomImpl();

		roomImpl.setNew(room.isNew());
		roomImpl.setPrimaryKey(room.getPrimaryKey());

		roomImpl.setRoomId(room.getRoomId());
		roomImpl.setGroupId(room.getGroupId());
		roomImpl.setCompanyId(room.getCompanyId());
		roomImpl.setUserId(room.getUserId());
		roomImpl.setRoomno(room.getRoomno());
		roomImpl.setLocation(room.getLocation());
		roomImpl.setRoomtypeId(room.getRoomtypeId());

		return roomImpl;
	}

	/**
	 * Returns the room with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the room
	 * @return the room
	 * @throws com.liferay.portal.NoSuchModelException if a room with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Room findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the room with the primary key or throws a {@link com.lftechnology.hotel.NoSuchRoomException} if it could not be found.
	 *
	 * @param roomId the primary key of the room
	 * @return the room
	 * @throws com.lftechnology.hotel.NoSuchRoomException if a room with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Room findByPrimaryKey(long roomId)
		throws NoSuchRoomException, SystemException {
		Room room = fetchByPrimaryKey(roomId);

		if (room == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + roomId);
			}

			throw new NoSuchRoomException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				roomId);
		}

		return room;
	}

	/**
	 * Returns the room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the room
	 * @return the room, or <code>null</code> if a room with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Room fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the room with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomId the primary key of the room
	 * @return the room, or <code>null</code> if a room with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public Room fetchByPrimaryKey(long roomId) throws SystemException {
		Room room = (Room)EntityCacheUtil.getResult(RoomModelImpl.ENTITY_CACHE_ENABLED,
				RoomImpl.class, roomId);

		if (room == _nullRoom) {
			return null;
		}

		if (room == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				room = (Room)session.get(RoomImpl.class, Long.valueOf(roomId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (room != null) {
					cacheResult(room);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(RoomModelImpl.ENTITY_CACHE_ENABLED,
						RoomImpl.class, roomId, _nullRoom);
				}

				closeSession(session);
			}
		}

		return room;
	}

	/**
	 * Returns all the rooms.
	 *
	 * @return the rooms
	 * @throws SystemException if a system exception occurred
	 */
	public List<Room> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @return the range of rooms
	 * @throws SystemException if a system exception occurred
	 */
	public List<Room> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the rooms.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of rooms
	 * @param end the upper bound of the range of rooms (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of rooms
	 * @throws SystemException if a system exception occurred
	 */
	public List<Room> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		FinderPath finderPath = null;
		Object[] finderArgs = new Object[] { start, end, orderByComparator };

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Room> list = (List<Room>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ROOM);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ROOM;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<Room>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);
				}
				else {
					list = (List<Room>)QueryUtil.list(q, getDialect(), start,
							end);
				}
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (list == null) {
					FinderCacheUtil.removeResult(finderPath, finderArgs);
				}
				else {
					cacheResult(list);

					FinderCacheUtil.putResult(finderPath, finderArgs, list);
				}

				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the rooms from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (Room room : findAll()) {
			remove(room);
		}
	}

	/**
	 * Returns the number of rooms.
	 *
	 * @return the number of rooms
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ROOM);

				count = (Long)q.uniqueResult();
			}
			catch (Exception e) {
				throw processException(e);
			}
			finally {
				if (count == null) {
					count = Long.valueOf(0);
				}

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);

				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the room persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.lftechnology.hotel.model.Room")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Room>> listenersList = new ArrayList<ModelListener<Room>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Room>)InstanceFactory.newInstance(
							listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(RoomImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@BeanReference(type = RoomPersistence.class)
	protected RoomPersistence roomPersistence;
	@BeanReference(type = RoomTypePersistence.class)
	protected RoomTypePersistence roomTypePersistence;
	@BeanReference(type = ResourcePersistence.class)
	protected ResourcePersistence resourcePersistence;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private static final String _SQL_SELECT_ROOM = "SELECT room FROM Room room";
	private static final String _SQL_COUNT_ROOM = "SELECT COUNT(room) FROM Room room";
	private static final String _ORDER_BY_ENTITY_ALIAS = "room.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Room exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RoomPersistenceImpl.class);
	private static Room _nullRoom = new RoomImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Room> toCacheModel() {
				return _nullRoomCacheModel;
			}
		};

	private static CacheModel<Room> _nullRoomCacheModel = new CacheModel<Room>() {
			public Room toEntityModel() {
				return _nullRoom;
			}
		};
}