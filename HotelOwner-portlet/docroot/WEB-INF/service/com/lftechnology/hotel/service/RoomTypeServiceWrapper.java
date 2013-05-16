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
 * This class is a wrapper for {@link RoomTypeService}.
 * </p>
 *
 * @author    ranjan
 * @see       RoomTypeService
 * @generated
 */
public class RoomTypeServiceWrapper implements RoomTypeService,
	ServiceWrapper<RoomTypeService> {
	public RoomTypeServiceWrapper(RoomTypeService roomTypeService) {
		_roomTypeService = roomTypeService;
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _roomTypeService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_roomTypeService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _roomTypeService.invokeMethod(name, parameterTypes, arguments);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public RoomTypeService getWrappedRoomTypeService() {
		return _roomTypeService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedRoomTypeService(RoomTypeService roomTypeService) {
		_roomTypeService = roomTypeService;
	}

	public RoomTypeService getWrappedService() {
		return _roomTypeService;
	}

	public void setWrappedService(RoomTypeService roomTypeService) {
		_roomTypeService = roomTypeService;
	}

	private RoomTypeService _roomTypeService;
}