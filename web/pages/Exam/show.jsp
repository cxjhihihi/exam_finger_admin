<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Exam.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}/pages/Exam/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}/pages/Exam/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="examid" name="examid" value="${exam.examid}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=Exam.ALIAS_EXAMNAME%></td>	
				<td><c:out value='${exam.examname}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=Exam.ALIAS_MEMO%></td>	
				<td><c:out value='${exam.memo}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>