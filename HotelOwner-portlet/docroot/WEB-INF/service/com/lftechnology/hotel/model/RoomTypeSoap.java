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
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.lftechnology.hotel.service.http.RoomTypeServiceSoap}.
 *
 * @author    ranjan
 * @see       com.lftechnology.hotel.service.http.RoomTypeServiceSoap
 * @generated
 */
public class RoomTypeSoap implements Serializable {
	public static RoomTypeSoap toSoapModel(RoomType model) {
		RoomTypeSoap soapModel = new RoomTypeSoap();

		soapModel.setRoomtypeId(model.getRoomtypeId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setDescription(model.getDescription());
		soapModel.setPricepernight(model.getPricepernight());

		return soapModel;
	}

	public static RoomTypeSoap[] toSoapModels(RoomType[] models) {
		RoomTypeSoap[] soapModels = new RoomTypeSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static RoomTypeSoap[][] toSoapModels(RoomType[][] models) {
		RoomTypeSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new RoomTypeSoap[models.length][models[0].length];
		}
		else {
			soapModels = new RoomTypeSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static RoomTypeSoap[] toSoapModels(List<RoomType> models) {
		List<RoomTypeSoap> soapModels = new ArrayList<RoomTypeSoap>(models.size());

		for (RoomType model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new RoomTypeSoap[soapModels.size()]);
	}

	public RoomTypeSoap() {
	}

	public long getPrimaryKey() {
		return _roomtypeId;
	}

	public void setPrimaryKey(long pk) {
		setRoomtypeId(pk);
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

	private long _roomtypeId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _description;
	private Date _pricepernight;
}