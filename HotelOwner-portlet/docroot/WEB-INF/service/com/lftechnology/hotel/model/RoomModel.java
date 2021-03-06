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

package com.lftechnology.hotel.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the Room service. Represents a row in the &quot;SD_Room&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lftechnology.hotel.model.impl.RoomModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lftechnology.hotel.model.impl.RoomImpl}.
 * </p>
 *
 * @author ranjan
 * @see Room
 * @see com.lftechnology.hotel.model.impl.RoomImpl
 * @see com.lftechnology.hotel.model.impl.RoomModelImpl
 * @generated
 */
public interface RoomModel extends BaseModel<Room> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a room model instance should use the {@link Room} interface instead.
	 */

	/**
	 * Returns the primary key of this room.
	 *
	 * @return the primary key of this room
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this room.
	 *
	 * @param primaryKey the primary key of this room
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the room ID of this room.
	 *
	 * @return the room ID of this room
	 */
	public long getRoomId();

	/**
	 * Sets the room ID of this room.
	 *
	 * @param roomId the room ID of this room
	 */
	public void setRoomId(long roomId);

	/**
	 * Returns the group ID of this room.
	 *
	 * @return the group ID of this room
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this room.
	 *
	 * @param groupId the group ID of this room
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this room.
	 *
	 * @return the company ID of this room
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this room.
	 *
	 * @param companyId the company ID of this room
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this room.
	 *
	 * @return the user ID of this room
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this room.
	 *
	 * @param userId the user ID of this room
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this room.
	 *
	 * @return the user uuid of this room
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this room.
	 *
	 * @param userUuid the user uuid of this room
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the roomno of this room.
	 *
	 * @return the roomno of this room
	 */
	public long getRoomno();

	/**
	 * Sets the roomno of this room.
	 *
	 * @param roomno the roomno of this room
	 */
	public void setRoomno(long roomno);

	/**
	 * Returns the location of this room.
	 *
	 * @return the location of this room
	 */
	@AutoEscape
	public String getLocation();

	/**
	 * Sets the location of this room.
	 *
	 * @param location the location of this room
	 */
	public void setLocation(String location);

	/**
	 * Returns the roomtype ID of this room.
	 *
	 * @return the roomtype ID of this room
	 */
	public long getRoomtypeId();

	/**
	 * Sets the roomtype ID of this room.
	 *
	 * @param roomtypeId the roomtype ID of this room
	 */
	public void setRoomtypeId(long roomtypeId);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(Room room);

	public int hashCode();

	public CacheModel<Room> toCacheModel();

	public Room toEscapedModel();

	public String toString();

	public String toXmlString();
}