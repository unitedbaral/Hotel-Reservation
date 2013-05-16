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

import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Room}.
 * </p>
 *
 * @author    ranjan
 * @see       Room
 * @generated
 */
public class RoomWrapper implements Room, ModelWrapper<Room> {
	public RoomWrapper(Room room) {
		_room = room;
	}

	public Class<?> getModelClass() {
		return Room.class;
	}

	public String getModelClassName() {
		return Room.class.getName();
	}

	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("roomId", getRoomId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("roomno", getRoomno());
		attributes.put("location", getLocation());
		attributes.put("roomtypeId", getRoomtypeId());

		return attributes;
	}

	public void setModelAttributes(Map<String, Object> attributes) {
		Long roomId = (Long)attributes.get("roomId");

		if (roomId != null) {
			setRoomId(roomId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Long roomno = (Long)attributes.get("roomno");

		if (roomno != null) {
			setRoomno(roomno);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		Long roomtypeId = (Long)attributes.get("roomtypeId");

		if (roomtypeId != null) {
			setRoomtypeId(roomtypeId);
		}
	}

	/**
	* Returns the primary key of this room.
	*
	* @return the primary key of this room
	*/
	public long getPrimaryKey() {
		return _room.getPrimaryKey();
	}

	/**
	* Sets the primary key of this room.
	*
	* @param primaryKey the primary key of this room
	*/
	public void setPrimaryKey(long primaryKey) {
		_room.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the room ID of this room.
	*
	* @return the room ID of this room
	*/
	public long getRoomId() {
		return _room.getRoomId();
	}

	/**
	* Sets the room ID of this room.
	*
	* @param roomId the room ID of this room
	*/
	public void setRoomId(long roomId) {
		_room.setRoomId(roomId);
	}

	/**
	* Returns the group ID of this room.
	*
	* @return the group ID of this room
	*/
	public long getGroupId() {
		return _room.getGroupId();
	}

	/**
	* Sets the group ID of this room.
	*
	* @param groupId the group ID of this room
	*/
	public void setGroupId(long groupId) {
		_room.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this room.
	*
	* @return the company ID of this room
	*/
	public long getCompanyId() {
		return _room.getCompanyId();
	}

	/**
	* Sets the company ID of this room.
	*
	* @param companyId the company ID of this room
	*/
	public void setCompanyId(long companyId) {
		_room.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this room.
	*
	* @return the user ID of this room
	*/
	public long getUserId() {
		return _room.getUserId();
	}

	/**
	* Sets the user ID of this room.
	*
	* @param userId the user ID of this room
	*/
	public void setUserId(long userId) {
		_room.setUserId(userId);
	}

	/**
	* Returns the user uuid of this room.
	*
	* @return the user uuid of this room
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _room.getUserUuid();
	}

	/**
	* Sets the user uuid of this room.
	*
	* @param userUuid the user uuid of this room
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_room.setUserUuid(userUuid);
	}

	/**
	* Returns the roomno of this room.
	*
	* @return the roomno of this room
	*/
	public long getRoomno() {
		return _room.getRoomno();
	}

	/**
	* Sets the roomno of this room.
	*
	* @param roomno the roomno of this room
	*/
	public void setRoomno(long roomno) {
		_room.setRoomno(roomno);
	}

	/**
	* Returns the location of this room.
	*
	* @return the location of this room
	*/
	public java.lang.String getLocation() {
		return _room.getLocation();
	}

	/**
	* Sets the location of this room.
	*
	* @param location the location of this room
	*/
	public void setLocation(java.lang.String location) {
		_room.setLocation(location);
	}

	/**
	* Returns the roomtype ID of this room.
	*
	* @return the roomtype ID of this room
	*/
	public long getRoomtypeId() {
		return _room.getRoomtypeId();
	}

	/**
	* Sets the roomtype ID of this room.
	*
	* @param roomtypeId the roomtype ID of this room
	*/
	public void setRoomtypeId(long roomtypeId) {
		_room.setRoomtypeId(roomtypeId);
	}

	public boolean isNew() {
		return _room.isNew();
	}

	public void setNew(boolean n) {
		_room.setNew(n);
	}

	public boolean isCachedModel() {
		return _room.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_room.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _room.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _room.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_room.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _room.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_room.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RoomWrapper((Room)_room.clone());
	}

	public int compareTo(com.lftechnology.hotel.model.Room room) {
		return _room.compareTo(room);
	}

	@Override
	public int hashCode() {
		return _room.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.hotel.model.Room> toCacheModel() {
		return _room.toCacheModel();
	}

	public com.lftechnology.hotel.model.Room toEscapedModel() {
		return new RoomWrapper(_room.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _room.toString();
	}

	public java.lang.String toXmlString() {
		return _room.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_room.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public Room getWrappedRoom() {
		return _room;
	}

	public Room getWrappedModel() {
		return _room;
	}

	public void resetOriginalValues() {
		_room.resetOriginalValues();
	}

	private Room _room;
}