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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.InvokableLocalService;

/**
 * The utility for the room local service. This utility wraps {@link com.lftechnology.hotel.service.impl.RoomLocalServiceImpl} and is the primary access point for service operations in application layer code running on the local server.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ranjan
 * @see RoomLocalService
 * @see com.lftechnology.hotel.service.base.RoomLocalServiceBaseImpl
 * @see com.lftechnology.hotel.service.impl.RoomLocalServiceImpl
 * @generated
 */
public class RoomLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.lftechnology.hotel.service.impl.RoomLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the room to the database. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was added
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room addRoom(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().addRoom(room);
	}

	/**
	* Creates a new room with the primary key. Does not add the room to the database.
	*
	* @param roomId the primary key for the new room
	* @return the new room
	*/
	public static com.lftechnology.hotel.model.Room createRoom(long roomId) {
		return getService().createRoom(roomId);
	}

	/**
	* Deletes the room with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param roomId the primary key of the room
	* @return the room that was removed
	* @throws PortalException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room deleteRoom(long roomId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRoom(roomId);
	}

	/**
	* Deletes the room from the database. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was removed
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room deleteRoom(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().deleteRoom(room);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	public static com.lftechnology.hotel.model.Room fetchRoom(long roomId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().fetchRoom(roomId);
	}

	/**
	* Returns the room with the primary key.
	*
	* @param roomId the primary key of the room
	* @return the room
	* @throws PortalException if a room with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room getRoom(long roomId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getRoom(roomId);
	}

	public static com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return getService().getPersistedModel(primaryKeyObj);
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
	public static java.util.List<com.lftechnology.hotel.model.Room> getRooms(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRooms(start, end);
	}

	/**
	* Returns the number of rooms.
	*
	* @return the number of rooms
	* @throws SystemException if a system exception occurred
	*/
	public static int getRoomsCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().getRoomsCount();
	}

	/**
	* Updates the room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @return the room that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room updateRoom(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRoom(room);
	}

	/**
	* Updates the room in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param room the room
	* @param merge whether to merge the room with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the room that was updated
	* @throws SystemException if a system exception occurred
	*/
	public static com.lftechnology.hotel.model.Room updateRoom(
		com.lftechnology.hotel.model.Room room, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().updateRoom(room, merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public static java.lang.String getBeanIdentifier() {
		return getService().getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public static void setBeanIdentifier(java.lang.String beanIdentifier) {
		getService().setBeanIdentifier(beanIdentifier);
	}

	public static java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return getService().invokeMethod(name, parameterTypes, arguments);
	}

	public static com.lftechnology.hotel.model.Room add(
		com.lftechnology.hotel.model.Room room)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getService().add(room);
	}

	public static com.lftechnology.hotel.model.Room update(
		com.lftechnology.hotel.model.Room room) {
		return getService().update(room);
	}

	public static void clearService() {
		_service = null;
	}

	public static RoomLocalService getService() {
		if (_service == null) {
			InvokableLocalService invokableLocalService = (InvokableLocalService)PortletBeanLocatorUtil.locate(ClpSerializer.getServletContextName(),
					RoomLocalService.class.getName());

			if (invokableLocalService instanceof RoomLocalService) {
				_service = (RoomLocalService)invokableLocalService;
			}
			else {
				_service = new RoomLocalServiceClp(invokableLocalService);
			}

			ReferenceRegistry.registerReference(RoomLocalServiceUtil.class,
				"_service");
		}

		return _service;
	}

	/**
	 * @deprecated
	 */
	public void setService(RoomLocalService service) {
	}

	private static RoomLocalService _service;
}