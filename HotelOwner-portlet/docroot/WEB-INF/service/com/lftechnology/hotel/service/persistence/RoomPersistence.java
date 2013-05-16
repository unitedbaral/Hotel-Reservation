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

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the room service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ranjan
 * @see RoomPersistenceImpl
 * @see RoomUtil
 * @generated
 */
public interface RoomPersistence extends BasePersistence<Room> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RoomUtil} to access the room persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the room in the entity cache if it is enabled.
	*
	* @param room the room
	*/
	public void cacheResult(com.lftechnology.hotel.model.Room room);

	/**
	* Caches the rooms in the entity cache if it is enabled.
	*
	* @param rooms the rooms
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.hotel.model.Room> rooms);

	/**
	* Creates a new room with the primary key. Does not add the room to the database.
	*
	* @param roomId the primary key for the new room
	* @return the new room
	*/
	public com.lftechnology.hotel.model.Room create(long roomId);

	/**
	* Removes the room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomId the primary key of the room
	* @return the room that was removed
	* @throws com.lftechnology.hotel.NoSuchRoomException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room remove(long roomId)
		throws com.lftechnology.hotel.NoSuchRoomException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.hotel.model.Room updateImpl(
		com.lftechnology.hotel.model.Room room, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the room with the primary key or throws a {@link com.lftechnology.hotel.NoSuchRoomException} if it could not be found.
	*
	* @param roomId the primary key of the room
	* @return the room
	* @throws com.lftechnology.hotel.NoSuchRoomException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room findByPrimaryKey(long roomId)
		throws com.lftechnology.hotel.NoSuchRoomException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the room with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomId the primary key of the room
	* @return the room, or <code>null</code> if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room fetchByPrimaryKey(long roomId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the rooms.
	*
	* @return the rooms
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.hotel.model.Room> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.hotel.model.Room> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.hotel.model.Room> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the rooms from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of rooms.
	*
	* @return the number of rooms
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}