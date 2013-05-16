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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import java.util.List;

/**
 * The persistence utility for the room type service. This utility wraps {@link RoomTypePersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author ranjan
 * @see RoomTypePersistence
 * @see RoomTypePersistenceImpl
 * @generated
 */
public class RoomTypeUtil {
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
	public static void clearCache(RoomType roomType) {
		getPersistence().clearCache(roomType);
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
	public static List<RoomType> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<RoomType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<RoomType> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static RoomType update(RoomType roomType, boolean merge)
		throws SystemException {
		return getPersistence().update(roomType, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static RoomType update(RoomType roomType, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence().update(roomType, merge, serviceContext);
	}

	/**
	* Caches the room type in the entity cache if it is enabled.
	*
	* @param roomType the room type
	*/
	public static void cacheResult(
		com.lftechnology.hotel.model.RoomType roomType) {
		getPersistence().cacheResult(roomType);
	}

	/**
	* Caches the room types in the entity cache if it is enabled.
	*
	* @param roomTypes the room types
	*/
	public static void cacheResult(
		java.util.List<com.lftechnology.hotel.model.RoomType> roomTypes) {
		getPersistence().cacheResult(roomTypes);
	}

	/**
	* Creates a new room type with the primary key. Does not add the room type to the database.
	*
	* @param roomtypeId the primary key for the new room type
	* @return the new room type
	*/
	public static com.lftechnology.hotel.model.RoomType create(long roomtypeId) {
		return getPersistence().create(roomtypeId);
	}

	/**
	* Removes the room type with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomtypeId the primary key of the room type
	* @return the room type that was removed
	* @throws com.lftechnology.hotel.NoSuchRoomTypeException if a room type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.RoomType remove(long roomtypeId)
		throws com.lftechnology.hotel.NoSuchRoomTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().remove(roomtypeId);
	}

	public static com.lftechnology.hotel.model.RoomType updateImpl(
		com.lftechnology.hotel.model.RoomType roomType, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(roomType, merge);
	}

	/**
	* Returns the room type with the primary key or throws a {@link com.lftechnology.hotel.NoSuchRoomTypeException} if it could not be found.
	*
	* @param roomtypeId the primary key of the room type
	* @return the room type
	* @throws com.lftechnology.hotel.NoSuchRoomTypeException if a room type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.RoomType findByPrimaryKey(
		long roomtypeId)
		throws com.lftechnology.hotel.NoSuchRoomTypeException,
			com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByPrimaryKey(roomtypeId);
	}

	/**
	* Returns the room type with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param roomtypeId the primary key of the room type
	* @return the room type, or <code>null</code> if a room type with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.RoomType fetchByPrimaryKey(
		long roomtypeId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(roomtypeId);
	}

	/**
	* Returns all the room types.
	*
	* @return the room types
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.lftechnology.hotel.model.RoomType> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.lftechnology.hotel.model.RoomType> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
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
	public static java.util.List<com.lftechnology.hotel.model.RoomType> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the room types from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of room types.
	*
	* @return the number of room types
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static RoomTypePersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (RoomTypePersistence)PortletBeanLocatorUtil.locate(com.lftechnology.hotel.service.ClpSerializer.getServletContextName(),
					RoomTypePersistence.class.getName());

			ReferenceRegistry.registerReference(RoomTypeUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated
	 */
	public void setPersistence(RoomTypePersistence persistence) {
	}

	private static RoomTypePersistence _persistence;
}