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

package com.lftechnology.hotel.model.impl;

import com.lftechnology.hotel.model.RoomType;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

import java.util.Date;

/**
 * The cache model class for representing RoomType in entity cache.
 *
 * @author ranjan
 * @see RoomType
 * @generated
 */
public class RoomTypeCacheModel implements CacheModel<RoomType>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(13);

		sb.append("{roomtypeId=");
		sb.append(roomtypeId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", description=");
		sb.append(description);
		sb.append(", pricepernight=");
		sb.append(pricepernight);
		sb.append("}");

		return sb.toString();
	}

	public RoomType toEntityModel() {
		RoomTypeImpl roomTypeImpl = new RoomTypeImpl();

		roomTypeImpl.setRoomtypeId(roomtypeId);
		roomTypeImpl.setGroupId(groupId);
		roomTypeImpl.setCompanyId(companyId);
		roomTypeImpl.setUserId(userId);

		if (description == null) {
			roomTypeImpl.setDescription(StringPool.BLANK);
		}
		else {
			roomTypeImpl.setDescription(description);
		}

		if (pricepernight == Long.MIN_VALUE) {
			roomTypeImpl.setPricepernight(null);
		}
		else {
			roomTypeImpl.setPricepernight(new Date(pricepernight));
		}

		roomTypeImpl.resetOriginalValues();

		return roomTypeImpl;
	}

	public long roomtypeId;
	public long groupId;
	public long companyId;
	public long userId;
	public String description;
	public long pricepernight;
}