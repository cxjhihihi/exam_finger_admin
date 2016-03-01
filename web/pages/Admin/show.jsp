<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Admin.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}/pages/Admin/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}/pages/Admin/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${admin.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=Admin.ALIAS_USERNAME%></td>	
				<td><c:out value='${admin.username}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Admin.ALIAS_PASSWORD%></td>	
				<td><c:out value='${admin.password}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Admin.ALIAS_TYPE%></td>	
				<td><c:out value='${admin.type}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>