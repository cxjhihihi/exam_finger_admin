<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="id" name="id" value="${allExams.id}"/>

	<tr>	
		<td class="tdLabel">
			<%=AllExams.ALIAS_EXAMROMMID%>:
		</td>		
		<td>
		<form:input path="allExams.examrommid" id="examrommid" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="examrommid"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=AllExams.ALIAS_EXAMID%>:
		</td>		
		<td>
		<form:input path="allExams.examid" id="examid" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="examid"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=AllExams.ALIAS_STUID%>:
		</td>		
		<td>
		<form:input path="allExams.stuid" id="stuid" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="stuid"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=AllExams.ALIAS_SCORE%>:
		</td>		
		<td>
		<form:input path="allExams.score" id="score" cssClass="validate-number " maxlength="1" />
		<font color='red'><form:errors path="score"/></font>
		</td>
	</tr>	
	


