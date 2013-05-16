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

import com.lftechnology.hotel.model.Room;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import java.io.Serializable;

/**
 * The cache model class for representing Room in entity cache.
 *
 * @author ranjan
 * @see Room
 * @generated
 */
public class RoomCacheModel implements CacheModel<Room>, Serializable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{roomId=");
		sb.append(roomId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", roomno=");
		sb.append(roomno);
		sb.append(", location=");
		sb.append(location);
		sb.append(", roomtypeId=");
		sb.append(roomtypeId);
		sb.append("}");

		return sb.toString();
	}

	public Room toEntityModel() {
		RoomImpl roomImpl = new RoomImpl();

		roomImpl.setRoomId(roomId);
		roomImpl.setGroupId(groupId);
		roomImpl.setCompanyId(companyId);
		roomImpl.setUserId(userId);
		roomImpl.setRoomno(roomno);

		if (location == null) {
			roomImpl.setLocation(StringPool.BLANK);
		}
		else {
			roomImpl.setLocation(location);
		}

		roomImpl.setRoomtypeId(roomtypeId);

		roomImpl.resetOriginalValues();

		return roomImpl;
	}

	public long roomId;
	public long groupId;
	public long companyId;
	public long userId;
	public long roomno;
	public String location;
	public long roomtypeId;
}