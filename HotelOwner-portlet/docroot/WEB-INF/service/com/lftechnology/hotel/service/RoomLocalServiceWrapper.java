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

package com.lftechnology.hotel.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link RoomLocalService}.
 * </p>
 *
 * @author    ranjan
 * @see       RoomLocalService
 * @generated
 */
public class RoomLocalServiceWrapper implements RoomLocalService,
	ServiceWrapper<RoomLocalService> {
	public RoomLocalServiceWrapper(RoomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	/**
	* Adds the room to the database. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room addRoom(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.addRoom(room);
	}

	/**
	* Creates a new room with the primary key. Does not add the room to the database.
	*
	* @param roomId the primary key for the new room
	* @return the new room
	*/
	public com.lftechnology.hotel.model.Room createRoom(long roomId) {
		return _roomLocalService.createRoom(roomId);
	}

	/**
	* Deletes the room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomId the primary key of the room
	* @return the room that was removed
	* @throws PortalException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room deleteRoom(long roomId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.deleteRoom(roomId);
	}

	/**
	* Deletes the room from the database. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room deleteRoom(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.deleteRoom(room);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _roomLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.lftechnology.hotel.model.Room fetchRoom(long roomId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.fetchRoom(roomId);
	}

	/**
	* Returns the room with the primary key.
	*
	* @param roomId the primary key of the room
	* @return the room
	* @throws PortalException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room getRoom(long roomId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.getRoom(roomId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.getPersistedModel(primaryKeyObj);
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
	public java.util.List<com.lftechnology.hotel.model.Room> getRooms(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.getRooms(start, end);
	}

	/**
	* Returns the number of rooms.
	*
	* @return the number of rooms
	* @throws SystemException if a system exception occurred
	*/
	public int getRoomsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.getRoomsCount();
	}

	/**
	* Updates the room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room updateRoom(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.updateRoom(room);
	}

	/**
	* Updates the room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @param merge whether to merge the room with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the room that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.lftechnology.hotel.model.Room updateRoom(
		com.lftechnology.hotel.model.Room room, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.updateRoom(room, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _roomLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_roomLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _roomLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	public com.lftechnology.hotel.model.Room add(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomLocalService.add(room);
	}

	public com.lftechnology.hotel.model.Room update(
		com.lftechnology.hotel.model.Room room) {
		return _roomLocalService.update(room);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public RoomLocalService getWrappedRoomLocalService() {
		return _roomLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedRoomLocalService(RoomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	public RoomLocalService getWrappedService() {
		return _roomLocalService;
	}

	public void setWrappedService(RoomLocalService roomLocalService) {
		_roomLocalService = roomLocalService;
	}

	private RoomLocalService _roomLocalService;
}