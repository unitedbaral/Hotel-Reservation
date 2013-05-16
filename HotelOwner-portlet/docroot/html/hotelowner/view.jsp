<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>

<portlet:defineObjects />
<portlet:actionURL portletMode="edit" var="editUrl"></portlet:actionURL>
This is the <b>Hotel Owner</b> portlet in View mode.
<a href="<%=editUrl%>">Click TO Add</a>