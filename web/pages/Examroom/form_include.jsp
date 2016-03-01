<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="examroomid" name="examroomid" value="${examroom.examroomid}"/>

	<tr>	
		<td class="tdLabel">
			<%=Examroom.ALIAS_ROOMADDRESS%>:
		</td>		
		<td>
		<form:input path="examroom.roomaddress" id="roomaddress" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="roomaddress"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Examroom.ALIAS_IS_USED_TIME%>:
		</td>		
		<td>
		<form:input path="examroom.isUsedTime" id="isUsedTime" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="isUsedTime"/></font>
		</td>
	</tr>	
		<tr>	
		<td class="tdLabel">
			<%=Examroom.ALIAS_ROOM_NUM%>:
		</td>		
		<td>
		<form:input path="examroom.roomNum" id="roomNum" cssClass="" maxlength="11" />
		<font color='red'><form:errors path="roomNum"/></font>
		</td>
	</tr>
	


