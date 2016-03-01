<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${admin.id}"/>

	<tr>	
		<td class="tdLabel">
			<%=Admin.ALIAS_USERNAME%>:
		</td>		
		<td>
		<form:input path="admin.username" id="username" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="username"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Admin.ALIAS_PASSWORD%>:
		</td>		
		<td>
		<form:input path="admin.password" id="password" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="password"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Admin.ALIAS_TYPE%>:
		</td>		
		<td>
		<form:input path="admin.type" id="type" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="type"/></font>
		</td>
	</tr>	
	


