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

import com.lftechnology.hotel.NoSuchRoomTypeException;
import com.lftechnology.hotel.model.RoomType;
import com.lftechnology.hotel.model.impl.RoomTypeImpl;
import com.lftechnology.hotel.model.impl.RoomTypeModelImpl;

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
 * The persistence implementation for the room type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ranjan
 * @see RoomTypePersistence
 * @see RoomTypeUtil
 * @generated
 */
public class RoomTypePersistenceImpl extends BasePersistenceImpl<RoomType>
	implements RoomTypePersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link RoomTypeUtil} to access the room type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = RoomTypeImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
			RoomTypeModelImpl.FINDER_CACHE_ENABLED, RoomTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
			RoomTypeModelImpl.FINDER_CACHE_ENABLED, RoomTypeImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
			RoomTypeModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	/**
	 * Caches the room type in the entity cache if it is enabled.
	 *
	 * @param roomType the room type
	 */
	public void cacheResult(RoomType roomType) {
		EntityCacheUtil.putResult(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
			RoomTypeImpl.class, roomType.getPrimaryKey(), roomType);

		roomType.resetOriginalValues();
	}

	/**
	 * Caches the room types in the entity cache if it is enabled.
	 *
	 * @param roomTypes the room types
	 */
	public void cacheResult(List<RoomType> roomTypes) {
		for (RoomType roomType : roomTypes) {
			if (EntityCacheUtil.getResult(
						RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
						RoomTypeImpl.class, roomType.getPrimaryKey()) == null) {
				cacheResult(roomType);
			}
			else {
				roomType.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all room types.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(RoomTypeImpl.class.getName());
		}

		EntityCacheUtil.clearCache(RoomTypeImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the room type.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(RoomType roomType) {
		EntityCacheUtil.removeResult(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
			RoomTypeImpl.class, roomType.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<RoomType> roomTypes) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (RoomType roomType : roomTypes) {
			EntityCacheUtil.removeResult(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
				RoomTypeImpl.class, roomType.getPrimaryKey());
		}
	}

	/**
	 * Creates a new room type with the primary key. Does not add the room type to the database.
	 *
	 * @param roomtypeId the primary key for the new room type
	 * @return the new room type
	 */
	public RoomType create(long roomtypeId) {
		RoomType roomType = new RoomTypeImpl();

		roomType.setNew(true);
		roomType.setPrimaryKey(roomtypeId);

		return roomType;
	}

	/**
	 * Removes the room type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param roomtypeId the primary key of the room type
	 * @return the room type that was removed
	 * @throws com.lftechnology.hotel.NoSuchRoomTypeException if a room type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RoomType remove(long roomtypeId)
		throws NoSuchRoomTypeException, SystemException {
		return remove(Long.valueOf(roomtypeId));
	}

	/**
	 * Removes the room type with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the room type
	 * @return the room type that was removed
	 * @throws com.lftechnology.hotel.NoSuchRoomTypeException if a room type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomType remove(Serializable primaryKey)
		throws NoSuchRoomTypeException, SystemException {
		Session session = null;

		try {
			session = openSession();

			RoomType roomType = (RoomType)session.get(RoomTypeImpl.class,
					primaryKey);

			if (roomType == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchRoomTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(roomType);
		}
		catch (NoSuchRoomTypeException nsee) {
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
	protected RoomType removeImpl(RoomType roomType) throws SystemException {
		roomType = toUnwrappedModel(roomType);

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.delete(session, roomType);
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		clearCache(roomType);

		return roomType;
	}

	@Override
	public RoomType updateImpl(com.lftechnology.hotel.model.RoomType roomType,
		boolean merge) throws SystemException {
		roomType = toUnwrappedModel(roomType);

		boolean isNew = roomType.isNew();

		Session session = null;

		try {
			session = openSession();

			BatchSessionUtil.update(session, roomType, merge);

			roomType.setNew(false);
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

		EntityCacheUtil.putResult(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
			RoomTypeImpl.class, roomType.getPrimaryKey(), roomType);

		return roomType;
	}

	protected RoomType toUnwrappedModel(RoomType roomType) {
		if (roomType instanceof RoomTypeImpl) {
			return roomType;
		}

		RoomTypeImpl roomTypeImpl = new RoomTypeImpl();

		roomTypeImpl.setNew(roomType.isNew());
		roomTypeImpl.setPrimaryKey(roomType.getPrimaryKey());

		roomTypeImpl.setRoomtypeId(roomType.getRoomtypeId());
		roomTypeImpl.setGroupId(roomType.getGroupId());
		roomTypeImpl.setCompanyId(roomType.getCompanyId());
		roomTypeImpl.setUserId(roomType.getUserId());
		roomTypeImpl.setDescription(roomType.getDescription());
		roomTypeImpl.setPricepernight(roomType.getPricepernight());

		return roomTypeImpl;
	}

	/**
	 * Returns the room type with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the room type
	 * @return the room type
	 * @throws com.liferay.portal.NoSuchModelException if a room type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomType findByPrimaryKey(Serializable primaryKey)
		throws NoSuchModelException, SystemException {
		return findByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the room type with the primary key or throws a {@link com.lftechnology.hotel.NoSuchRoomTypeException} if it could not be found.
	 *
	 * @param roomtypeId the primary key of the room type
	 * @return the room type
	 * @throws com.lftechnology.hotel.NoSuchRoomTypeException if a room type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RoomType findByPrimaryKey(long roomtypeId)
		throws NoSuchRoomTypeException, SystemException {
		RoomType roomType = fetchByPrimaryKey(roomtypeId);

		if (roomType == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + roomtypeId);
			}

			throw new NoSuchRoomTypeException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				roomtypeId);
		}

		return roomType;
	}

	/**
	 * Returns the room type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the room type
	 * @return the room type, or <code>null</code> if a room type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public RoomType fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		return fetchByPrimaryKey(((Long)primaryKey).longValue());
	}

	/**
	 * Returns the room type with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param roomtypeId the primary key of the room type
	 * @return the room type, or <code>null</code> if a room type with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	public RoomType fetchByPrimaryKey(long roomtypeId)
		throws SystemException {
		RoomType roomType = (RoomType)EntityCacheUtil.getResult(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
				RoomTypeImpl.class, roomtypeId);

		if (roomType == _nullRoomType) {
			return null;
		}

		if (roomType == null) {
			Session session = null;

			boolean hasException = false;

			try {
				session = openSession();

				roomType = (RoomType)session.get(RoomTypeImpl.class,
						Long.valueOf(roomtypeId));
			}
			catch (Exception e) {
				hasException = true;

				throw processException(e);
			}
			finally {
				if (roomType != null) {
					cacheResult(roomType);
				}
				else if (!hasException) {
					EntityCacheUtil.putResult(RoomTypeModelImpl.ENTITY_CACHE_ENABLED,
						RoomTypeImpl.class, roomtypeId, _nullRoomType);
				}

				closeSession(session);
			}
		}

		return roomType;
	}

	/**
	 * Returns all the room types.
	 *
	 * @return the room types
	 * @throws SystemException if a system exception occurred
	 */
	public List<RoomType> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the room types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of room types
	 * @param end the upper bound of the range of room types (not inclusive)
	 * @return the range of room types
	 * @throws SystemException if a system exception occurred
	 */
	public List<RoomType> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the room types.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	 * </p>
	 *
	 * @param start the lower bound of the range of room types
	 * @param end the upper bound of the range of room types (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of room types
	 * @throws SystemException if a system exception occurred
	 */
	public List<RoomType> findAll(int start, int end,
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

		List<RoomType> list = (List<RoomType>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_ROOMTYPE);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_ROOMTYPE;
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (orderByComparator == null) {
					list = (List<RoomType>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);
				}
				else {
					list = (List<RoomType>)QueryUtil.list(q, getDialect(),
							start, end);
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
	 * Removes all the room types from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	public void removeAll() throws SystemException {
		for (RoomType roomType : findAll()) {
			remove(roomType);
		}
	}

	/**
	 * Returns the number of room types.
	 *
	 * @return the number of room types
	 * @throws SystemException if a system exception occurred
	 */
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_ROOMTYPE);

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
	 * Initializes the room type persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.lftechnology.hotel.model.RoomType")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<RoomType>> listenersList = new ArrayList<ModelListener<RoomType>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<RoomType>)InstanceFactory.newInstance(
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
		EntityCacheUtil.removeCache(RoomTypeImpl.class.getName());
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
	private static final String _SQL_SELECT_ROOMTYPE = "SELECT roomType FROM RoomType roomType";
	private static final String _SQL_COUNT_ROOMTYPE = "SELECT COUNT(roomType) FROM RoomType roomType";
	private static final String _ORDER_BY_ENTITY_ALIAS = "roomType.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No RoomType exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(RoomTypePersistenceImpl.class);
	private static RoomType _nullRoomType = new RoomTypeImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<RoomType> toCacheModel() {
				return _nullRoomTypeCacheModel;
			}
		};

	private static CacheModel<RoomType> _nullRoomTypeCacheModel = new CacheModel<RoomType>() {
			public RoomType toEntityModel() {
				return _nullRoomType;
			}
		};
}