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

import com.lftechnology.hotel.service.RoomLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ranjan
 */
public class RoomClp extends BaseModelImpl<Room> implements Room {
	public RoomClp() {
	}

	public Class<?> getModelClass() {
		return Room.class;
	}

	public String getModelClassName() {
		return Room.class.getName();
	}

	public long getPrimaryKey() {
		return _roomId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRoomId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_roomId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
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

	@Override
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

	public long getRoomId() {
		return _roomId;
	}

	public void setRoomId(long roomId) {
		_roomId = roomId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getRoomno() {
		return _roomno;
	}

	public void setRoomno(long roomno) {
		_roomno = roomno;
	}

	public String getLocation() {
		return _location;
	}

	public void setLocation(String location) {
		_location = location;
	}

	public long getRoomtypeId() {
		return _roomtypeId;
	}

	public void setRoomtypeId(long roomtypeId) {
		_roomtypeId = roomtypeId;
	}

	public BaseModel<?> getRoomRemoteModel() {
		return _roomRemoteModel;
	}

	public void setRoomRemoteModel(BaseModel<?> roomRemoteModel) {
		_roomRemoteModel = roomRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			RoomLocalServiceUtil.addRoom(this);
		}
		else {
			RoomLocalServiceUtil.updateRoom(this);
		}
	}

	@Override
	public Room toEscapedModel() {
		return (Room)Proxy.newProxyInstance(Room.class.getClassLoader(),
			new Class[] { Room.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RoomClp clone = new RoomClp();

		clone.setRoomId(getRoomId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setRoomno(getRoomno());
		clone.setLocation(getLocation());
		clone.setRoomtypeId(getRoomtypeId());

		return clone;
	}

	public int compareTo(Room room) {
		long primaryKey = room.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		RoomClp room = null;

		try {
			room = (RoomClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = room.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{roomId=");
		sb.append(getRoomId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", roomno=");
		sb.append(getRoomno());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", roomtypeId=");
		sb.append(getRoomtypeId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.lftechnology.hotel.model.Room");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>roomId</column-name><column-value><![CDATA[");
		sb.append(getRoomId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roomno</column-name><column-value><![CDATA[");
		sb.append(getRoomno());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>roomtypeId</column-name><column-value><![CDATA[");
		sb.append(getRoomtypeId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _roomId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private long _roomno;
	private String _location;
	private long _roomtypeId;
	private BaseModel<?> _roomRemoteModel;
}