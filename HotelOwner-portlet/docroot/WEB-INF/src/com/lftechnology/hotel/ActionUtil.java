package com.lftechnology.hotel;

import javax.portlet.ActionRequest;

import com.lftechnology.hotel.model.Room;
import com.lftechnology.hotel.model.impl.RoomImpl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.User;
import com.liferay.portal.service.UserLocalServiceUtil;
import com.liferay.portal.util.PortalUtil;

public class ActionUtil {
     public static Room getRoom(ActionRequest request) throws PortalException,SystemException{
    	 
    Room room = new RoomImpl();
    
//	Fill in primary key
		room.setRoomId(ParamUtil.getLong(request, "id"));
		
 		//	Fill in room detail from form
    	 room.setLocation(ParamUtil.getString(request, "location"));
    	 
 		room.setRoomno(ParamUtil.getLong(request, "roomno"));
 		
 		User user=UserLocalServiceUtil.getUser(PortalUtil.getUserId(request));
 		room.setGroupId(user.getGroupId());
		room.setCompanyId(PortalUtil.getCompanyId(request));
		
		return room;
    	 
     }
}
