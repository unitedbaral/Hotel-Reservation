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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link RoomType}.
 * </p>
 *
 * @author    ranjan
 * @see       RoomType
 * @generated
 */
public class RoomTypeWrapper implements RoomType, ModelWrapper<RoomType> {
	public RoomTypeWrapper(RoomType roomType) {
		_roomType = roomType;
	}

	public Class<?> getModelClass() {
		return RoomType.class;
	}

	public String getModelClassName() {
		return RoomType.class.getName();
	}

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

	/**
	* Returns the primary key of this room type.
	*
	* @return the primary key of this room type
	*/
	public long getPrimaryKey() {
		return _roomType.getPrimaryKey();
	}

	/**
	* Sets the primary key of this room type.
	*
	* @param primaryKey the primary key of this room type
	*/
	public void setPrimaryKey(long primaryKey) {
		_roomType.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the roomtype ID of this room type.
	*
	* @return the roomtype ID of this room type
	*/
	public long getRoomtypeId() {
		return _roomType.getRoomtypeId();
	}

	/**
	* Sets the roomtype ID of this room type.
	*
	* @param roomtypeId the roomtype ID of this room type
	*/
	public void setRoomtypeId(long roomtypeId) {
		_roomType.setRoomtypeId(roomtypeId);
	}

	/**
	* Returns the group ID of this room type.
	*
	* @return the group ID of this room type
	*/
	public long getGroupId() {
		return _roomType.getGroupId();
	}

	/**
	* Sets the group ID of this room type.
	*
	* @param groupId the group ID of this room type
	*/
	public void setGroupId(long groupId) {
		_roomType.setGroupId(groupId);
	}

	/**
	* Returns the company ID of this room type.
	*
	* @return the company ID of this room type
	*/
	public long getCompanyId() {
		return _roomType.getCompanyId();
	}

	/**
	* Sets the company ID of this room type.
	*
	* @param companyId the company ID of this room type
	*/
	public void setCompanyId(long companyId) {
		_roomType.setCompanyId(companyId);
	}

	/**
	* Returns the user ID of this room type.
	*
	* @return the user ID of this room type
	*/
	public long getUserId() {
		return _roomType.getUserId();
	}

	/**
	* Sets the user ID of this room type.
	*
	* @param userId the user ID of this room type
	*/
	public void setUserId(long userId) {
		_roomType.setUserId(userId);
	}

	/**
	* Returns the user uuid of this room type.
	*
	* @return the user uuid of this room type
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _roomType.getUserUuid();
	}

	/**
	* Sets the user uuid of this room type.
	*
	* @param userUuid the user uuid of this room type
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_roomType.setUserUuid(userUuid);
	}

	/**
	* Returns the description of this room type.
	*
	* @return the description of this room type
	*/
	public java.lang.String getDescription() {
		return _roomType.getDescription();
	}

	/**
	* Sets the description of this room type.
	*
	* @param description the description of this room type
	*/
	public void setDescription(java.lang.String description) {
		_roomType.setDescription(description);
	}

	/**
	* Returns the pricepernight of this room type.
	*
	* @return the pricepernight of this room type
	*/
	public java.util.Date getPricepernight() {
		return _roomType.getPricepernight();
	}

	/**
	* Sets the pricepernight of this room type.
	*
	* @param pricepernight the pricepernight of this room type
	*/
	public void setPricepernight(java.util.Date pricepernight) {
		_roomType.setPricepernight(pricepernight);
	}

	public boolean isNew() {
		return _roomType.isNew();
	}

	public void setNew(boolean n) {
		_roomType.setNew(n);
	}

	public boolean isCachedModel() {
		return _roomType.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_roomType.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _roomType.isEscapedModel();
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _roomType.getPrimaryKeyObj();
	}

	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_roomType.setPrimaryKeyObj(primaryKeyObj);
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _roomType.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_roomType.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new RoomTypeWrapper((RoomType)_roomType.clone());
	}

	public int compareTo(com.lftechnology.hotel.model.RoomType roomType) {
		return _roomType.compareTo(roomType);
	}

	@Override
	public int hashCode() {
		return _roomType.hashCode();
	}

	public com.liferay.portal.model.CacheModel<com.lftechnology.hotel.model.RoomType> toCacheModel() {
		return _roomType.toCacheModel();
	}

	public com.lftechnology.hotel.model.RoomType toEscapedModel() {
		return new RoomTypeWrapper(_roomType.toEscapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _roomType.toString();
	}

	public java.lang.String toXmlString() {
		return _roomType.toXmlString();
	}

	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_roomType.persist();
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedModel}
	 */
	public RoomType getWrappedRoomType() {
		return _roomType;
	}

	public RoomType getWrappedModel() {
		return _roomType;
	}

	public void resetOriginalValues() {
		_roomType.resetOriginalValues();
	}

	private RoomType _roomType;
}