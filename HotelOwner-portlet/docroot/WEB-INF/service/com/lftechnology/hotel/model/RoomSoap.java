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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lftechnology.hotel.service.http.RoomServiceSoap}.
 *
 * @author    ranjan
 * @see       com.lftechnology.hotel.service.http.RoomServiceSoap
 * @generated
 */
public class RoomSoap implements Serializable {
	public static RoomSoap toSoapModel(Room model) {
		RoomSoap soapModel = new RoomSoap();

		soapModel.setRoomId(model.getRoomId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setRoomno(model.getRoomno());
		soapModel.setLocation(model.getLocation());
		soapModel.setRoomtypeId(model.getRoomtypeId());

		return soapModel;
	}

	public static RoomSoap[] toSoapModels(Room[] models) {
		RoomSoap[] soapModels = new RoomSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RoomSoap[][] toSoapModels(Room[][] models) {
		RoomSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RoomSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RoomSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RoomSoap[] toSoapModels(List<Room> models) {
		List<RoomSoap> soapModels = new ArrayList<RoomSoap>(models.size());

		for (Room model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RoomSoap[soapModels.size()]);
	}

	public RoomSoap() {
	}

	public long getPrimaryKey() {
		return _roomId;
	}

	public void setPrimaryKey(long pk) {
		setRoomId(pk);
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

	private long _roomId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private long _roomno;
	private String _location;
	private long _roomtypeId;
}