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

import com.lftechnology.hotel.model.Room;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the room service. This utility wraps {@link RoomPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ranjan
 * @see RoomPersistence
 * @see RoomPersistenceImpl
 * @generated
 */
public class RoomUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Room room) {
		getPersistence().clearCache(room);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Room> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Room> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Room> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static Room update(Room room, boolean merge)
		throws SystemException {
		return getPersistence().update(room, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static Room update(Room room, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(room, merge, serviceContext);
	}

	/**
	* Caches the room in the entity cache if it is enabled.
	*
	* @param room the room
	*/
	public static void cacheResult(com.lftechnology.hotel.model.Room room) {
		getPersistence().cacheResult(room);
	}

	/**
	* Caches the rooms in the entity cache if it is enabled.
	*
	* @param rooms the rooms
	*/
	public static void cacheResult(
		java.util.List<com.lftechnology.hotel.model.Room> rooms) {
		getPersistence().cacheResult(rooms);
	}

	/**
	* Creates a new room with the primary key. Does not add the room to the database.
	*
	* @param roomId the primary key for the new room
	* @return the new room
	*/
	public static com.lftechnology.hotel.model.Room create(long roomId) {
		return getPersistence().create(roomId);
	}

	/**
	* Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomId the primary key of the room
	* @return the room that was removed
	* @throws com.lftechnology.hotel.NoSuchRoomException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room remove(long roomId)
		throws com.lftechnology.hotel.NoSuchRoomException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(roomId);
	}

	public static com.lftechnology.hotel.model.Room updateImpl(
		com.lftechnology.hotel.model.Room room, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(room, merge);
	}

	/**
	* Returns the room with the primary key or throws a {@link com.lftechnology.hotel.NoSuchRoomException} if it could not be found.
	*
	* @param roomId the primary key of the room
	* @return the room
	* @throws com.lftechnology.hotel.NoSuchRoomException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room findByPrimaryKey(
		long roomId)
		throws com.lftechnology.hotel.NoSuchRoomException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(roomId);
	}

	/**
	* Returns the room with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomId the primary key of the room
	* @return the room, or <code>null</code> if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room fetchByPrimaryKey(
		long roomId) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(roomId);
	}

	/**
	* Returns all the rooms.
	*
	* @return the rooms
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.lftechnology.hotel.model.Room> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.lftechnology.hotel.model.Room> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.lftechnology.hotel.model.Room> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the rooms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of rooms.
	*
	* @return the number of rooms
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RoomPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RoomPersistence)PortletBeanLocatorUtil.locate(com.lftechnology.hotel.service.ClpSerializer.getServletContextName(),
					RoomPersistence.class.getName());

			ReferenceRegistry.registerReference(RoomUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(RoomPersistence persistence) {
	}

	private static RoomPersistence _persistence;
}