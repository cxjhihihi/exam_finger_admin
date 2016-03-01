<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Student.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}/pages/Student/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}/pages/Student/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="stuid" name="stuid" value="${student.stuid}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_USERNAME%></td>	
				<td><c:out value='${student.username}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_PASSWORD%></td>	
				<td><c:out value='${student.password}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_CARDNUM%></td>	
				<td><c:out value='${student.cardnum}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_MOBILE%></td>	
				<td><c:out value='${student.mobile}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_ADDRESS%></td>	
				<td><c:out value='${student.address}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_FINGERNUM%></td>	
				<td><c:out value='${student.fingernum}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_GRADE%></td>	
				<td><c:out value='${student.grade}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Student.ALIAS_CLASS_NO%></td>	
				<td><c:out value='${student.classNo}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>