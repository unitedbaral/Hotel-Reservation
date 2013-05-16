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

import java.util.Date;

/**
 * The base model interface for the RoomType service. Represents a row in the &quot;SD_RoomType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.lftechnology.hotel.model.impl.RoomTypeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.lftechnology.hotel.model.impl.RoomTypeImpl}.
 * </p>
 *
 * @author ranjan
 * @see RoomType
 * @see com.lftechnology.hotel.model.impl.RoomTypeImpl
 * @see com.lftechnology.hotel.model.impl.RoomTypeModelImpl
 * @generated
 */
public interface RoomTypeModel extends BaseModel<RoomType> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a room type model instance should use the {@link RoomType} interface instead.
	 */

	/**
	 * Returns the primary key of this room type.
	 *
	 * @return the primary key of this room type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this room type.
	 *
	 * @param primaryKey the primary key of this room type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the roomtype ID of this room type.
	 *
	 * @return the roomtype ID of this room type
	 */
	public long getRoomtypeId();

	/**
	 * Sets the roomtype ID of this room type.
	 *
	 * @param roomtypeId the roomtype ID of this room type
	 */
	public void setRoomtypeId(long roomtypeId);

	/**
	 * Returns the group ID of this room type.
	 *
	 * @return the group ID of this room type
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this room type.
	 *
	 * @param groupId the group ID of this room type
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this room type.
	 *
	 * @return the company ID of this room type
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this room type.
	 *
	 * @param companyId the company ID of this room type
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this room type.
	 *
	 * @return the user ID of this room type
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this room type.
	 *
	 * @param userId the user ID of this room type
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this room type.
	 *
	 * @return the user uuid of this room type
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this room type.
	 *
	 * @param userUuid the user uuid of this room type
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the description of this room type.
	 *
	 * @return the description of this room type
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this room type.
	 *
	 * @param description the description of this room type
	 */
	public void setDescription(String description);

	/**
	 * Returns the pricepernight of this room type.
	 *
	 * @return the pricepernight of this room type
	 */
	public Date getPricepernight();

	/**
	 * Sets the pricepernight of this room type.
	 *
	 * @param pricepernight the pricepernight of this room type
	 */
	public void setPricepernight(Date pricepernight);

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

	public int compareTo(RoomType roomType);

	public int hashCode();

	public CacheModel<RoomType> toCacheModel();

	public RoomType toEscapedModel();

	public String toString();

	public String toXmlString();
}