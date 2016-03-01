<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

	<input type="hidden" id="stuid" name="stuid" value="${student.stuid}"/>

	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_USERNAME%>:
		</td>		
		<td>
		<form:input path="student.username" id="username" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="username"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_PASSWORD%>:
		</td>		
		<td>
		<form:input path="student.password" id="password" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="password"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_CARDNUM%>:
		</td>		
		<td>
		<form:input path="student.cardnum" id="cardnum" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="cardnum"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_MOBILE%>:
		</td>		
		<td>
		<form:input path="student.mobile" id="mobile" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="mobile"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_ADDRESS%>:
		</td>		
		<td>
		<form:input path="student.address" id="address" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="address"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_FINGERNUM%>:
		</td>		
		<td>
		<form:input path="student.fingernum" id="fingernum" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="fingernum"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_GRADE%>:
		</td>		
		<td>
		<form:input path="student.grade" id="grade" cssClass="validate-integer max-value-2147483647" maxlength="10" />
		<font color='red'><form:errors path="grade"/></font>
		</td>
	</tr>	
	
	<tr>	
		<td class="tdLabel">
			<%=Student.ALIAS_CLASS_NO%>:
		</td>		
		<td>
		<form:input path="student.classNo" id="classNo" cssClass="" maxlength="255" />
		<font color='red'><form:errors path="classNo"/></font>
		</td>
	</tr>	
	


