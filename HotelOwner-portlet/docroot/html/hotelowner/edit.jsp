<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui" %>
<portlet:defineObjects />
<portlet:actionURL name="commitOwner" var="commitUrl"></portlet:actionURL>
This is the <b>Hotel Owner</b> portlet in Edit mode.
<aui:form action="<%=commitUrl%>">

	<aui:fieldset>

		
		<aui:input name="roomno" id="roomno" label="Room Number" />
		<aui:input name="location" id="location" label="Location" />
		
		<aui:input name="price" id="price" label="Price Per Night" />
		<aui:input name="desc" id="desc" label="Description" />
		
		<aui:button-row>
			<aui:button name="submit" type="submit"></aui:button>
			<aui:button onClick="" value="Clear"></aui:button>
		</aui:button-row>

	</aui:fieldset>

</aui:form>