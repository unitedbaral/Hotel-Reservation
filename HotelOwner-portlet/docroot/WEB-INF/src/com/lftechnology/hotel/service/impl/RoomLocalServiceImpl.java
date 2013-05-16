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

package com.lftechnology.hotel.service.impl;

import com.lftechnology.hotel.model.Room;
import com.lftechnology.hotel.service.base.RoomLocalServiceBaseImpl;
import com.liferay.portal.kernel.exception.SystemException;

/**
 * The implementation of the room local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.lftechnology.hotel.service.RoomLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author ranjan
 * @see com.lftechnology.hotel.service.base.RoomLocalServiceBaseImpl
 * @see com.lftechnology.hotel.service.RoomLocalServiceUtil
 */
public class RoomLocalServiceImpl extends RoomLocalServiceBaseImpl {
	
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this interface directly. Always use {@link com.lftechnology.hotel.service.RoomLocalServiceUtil} to access the room local service.
	 */
	public Room add(Room room) throws SystemException{
		Room newRoom=roomPersistence.create(counterLocalService.increment(Room.class.getName()));
		
		// Copy values to new DTO
		newRoom.setLocation(room.getLocation());
		newRoom.setRoomno(room.getRoomno());
		

		newRoom.setCompanyId(room.getCompanyId());
		newRoom.setGroupId(room.getGroupId());

		// Commit changes to DB
		newRoom = roomPersistence.update(newRoom, false);
		return newRoom;

		
		
	}
	public Room update(Room room){
		return room;
	}
	public Room get(long id) throws SystemException {

		Room room = roomPersistence.fetchByPrimaryKey(id);

		return room;
}
}