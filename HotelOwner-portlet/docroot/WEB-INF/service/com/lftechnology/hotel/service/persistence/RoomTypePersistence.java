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

import com.lftechnology.hotel.model.RoomType;

import com.liferay.portal.service.persistence.BasePersistence;

/**
 * The persistence interface for the room type service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ranjan
 * @see RoomTypePersistenceImpl
 * @see RoomTypeUtil
 * @generated
 */
public interface RoomTypePersistence extends BasePersistence<RoomType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link RoomTypeUtil} to access the room type persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the room type in the entity cache if it is enabled.
	*
	* @param roomType the room type
	*/
	public void cacheResult(com.lftechnology.hotel.model.RoomType roomType);

	/**
	* Caches the room types in the entity cache if it is enabled.
	*
	* @param roomTypes the room types
	*/
	public void cacheResult(
		java.util.List<com.lftechnology.hotel.model.RoomType> roomTypes);

	/**
	* Creates a new room type with the primary key. Does not add the room type to the database.
	*
	* @param roomtypeId the primary key for the new room type
	* @return the new room type
	*/
	public com.lftechnology.hotel.model.RoomType create(long roomtypeId);

	/**
	* Removes the room type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomtypeId the primary key of the room type
	* @return the room type that was removed
	* @throws com.lftechnology.hotel.NoSuchRoomTypeException if a room type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.RoomType remove(long roomtypeId)
		throws com.lftechnology.hotel.NoSuchRoomTypeException,
			com.liferay.portal.kernel.exception.SystemException;

	public com.lftechnology.hotel.model.RoomType updateImpl(
		com.lftechnology.hotel.model.RoomType roomType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the room type with the primary key or throws a {@link com.lftechnology.hotel.NoSuchRoomTypeException} if it could not be found.
	*
	* @param roomtypeId the primary key of the room type
	* @return the room type
	* @throws com.lftechnology.hotel.NoSuchRoomTypeException if a room type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.RoomType findByPrimaryKey(
		long roomtypeId)
		throws com.lftechnology.hotel.NoSuchRoomTypeException,
			com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the room type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomtypeId the primary key of the room type
	* @return the room type, or <code>null</code> if a room type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.RoomType fetchByPrimaryKey(
		long roomtypeId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the room types.
	*
	* @return the room types
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.lftechnology.hotel.model.RoomType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.hotel.model.RoomType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

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
	public java.util.List<com.lftechnology.hotel.model.RoomType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the room types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of room types.
	*
	* @return the number of room types
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}