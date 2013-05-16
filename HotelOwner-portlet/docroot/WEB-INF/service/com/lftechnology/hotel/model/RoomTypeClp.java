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

import com.lftechnology.hotel.service.RoomTypeLocalServiceUtil;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ranjan
 */
public class RoomTypeClp extends BaseModelImpl<RoomType> implements RoomType {
	public RoomTypeClp() {
	}

	public Class<?> getModelClass() {
		return RoomType.class;
	}

	public String getModelClassName() {
		return RoomType.class.getName();
	}

	public long getPrimaryKey() {
		return _roomtypeId;
	}

	public void setPrimaryKey(long primaryKey) {
		setRoomtypeId(primaryKey);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_roomtypeId);
	}

	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("roomtypeId", getRoomtypeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("description", getDescription());
		attributes.put("pricepernight", getPricepernight());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long roomtypeId = (Long)attributes.get("roomtypeId");

		if (roomtypeId != null) {
			setRoomtypeId(roomtypeId);
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

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date pricepernight = (Date)attributes.get("pricepernight");

		if (pricepernight != null) {
			setPricepernight(pricepernight);
		}
	}

	public long getRoomtypeId() {
		return _roomtypeId;
	}

	public void setRoomtypeId(long roomtypeId) {
		_roomtypeId = roomtypeId;
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

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public Date getPricepernight() {
		return _pricepernight;
	}

	public void setPricepernight(Date pricepernight) {
		_pricepernight = pricepernight;
	}

	public BaseModel<?> getRoomTypeRemoteModel() {
		return _roomTypeRemoteModel;
	}

	public void setRoomTypeRemoteModel(BaseModel<?> roomTypeRemoteModel) {
		_roomTypeRemoteModel = roomTypeRemoteModel;
	}

	public void persist() throws SystemException {
		if (this.isNew()) {
			RoomTypeLocalServiceUtil.addRoomType(this);
		}
		else {
			RoomTypeLocalServiceUtil.updateRoomType(this);
		}
	}

	@Override
	public RoomType toEscapedModel() {
		return (RoomType)Proxy.newProxyInstance(RoomType.class.getClassLoader(),
			new Class[] { RoomType.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		RoomTypeClp clone = new RoomTypeClp();

		clone.setRoomtypeId(getRoomtypeId());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setDescription(getDescription());
		clone.setPricepernight(getPricepernight());

		return clone;
	}

	public int compareTo(RoomType roomType) {
		long primaryKey = roomType.getPrimaryKey();

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

		RoomTypeClp roomType = null;

		try {
			roomType = (RoomTypeClp)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long primaryKey = roomType.getPrimaryKey();

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
		StringBundler sb = new StringBundler(13);

		sb.append("{roomtypeId=");
		sb.append(getRoomtypeId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", pricepernight=");
		sb.append(getPricepernight());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(22);

		sb.append("<model><model-name>");
		sb.append("com.lftechnology.hotel.model.RoomType");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>roomtypeId</column-name><column-value><![CDATA[");
		sb.append(getRoomtypeId());
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
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pricepernight</column-name><column-value><![CDATA[");
		sb.append(getPricepernight());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _roomtypeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _description;
	private Date _pricepernight;
	private BaseModel<?> _roomTypeRemoteModel;
}