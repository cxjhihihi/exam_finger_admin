<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="examid" name="examid" value="${exam.examid}"/>

	<tr>	
		<td class="tdLabel">
			<%=Exam.ALIAS_EXAMNAME%>:
		</td>		
		<td>
		<form:input path="exam.examname" id="examname" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="examname"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Exam.ALIAS_MEMO%>:
		</td>		
		<td>
		<form:input path="exam.memo" id="memo" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="memo"/></font>
		</td>
	</tr>	
	


