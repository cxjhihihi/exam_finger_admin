<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Examroom.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}/pages/Examroom/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}/pages/Examroom/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="examroomid" name="examroomid" value="${examroom.examroomid}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=Examroom.ALIAS_ROOMADDRESS%></td>	
				<td><c:out value='${examroom.roomaddress}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Examroom.ALIAS_IS_USED_TIME%></td>	
				<td><c:out value='${examroom.isUsedTime}'/></td>
			</tr>
						<tr>	
				<td class="tdLabel"><%=Examroom.ALIAS_ROOM_NUM%></td>	
				<td><c:out value='${examroom.roomNum}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>