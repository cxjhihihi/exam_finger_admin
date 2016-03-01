<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=AllExams.TABLE_ALIAS%>信息</title>
</rapid:override>

<rapid:override name="content">
	<form action="${ctx}/pages/AllExams/list.do" method="post">
		<input type="button" value="返回列表" onclick="window.location='${ctx}/pages/AllExams/list.do'"/>
		<input type="button" value="后退" onclick="history.back();"/>
		
		<input type="hidden" id="id" name="id" value="${allExams.id}"/>
	
		<table class="formTable">
			<tr>	
				<td class="tdLabel"><%=AllExams.ALIAS_EXAMROMMID%></td>	
				<td><c:out value='${allExams.examrommid}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=AllExams.ALIAS_EXAMID%></td>	
				<td><c:out value='${allExams.examid}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=AllExams.ALIAS_STUID%></td>	
				<td><c:out value='${allExams.stuid}'/></td>
			</tr>
			<tr>	
				<td class="tdLabel"><%=AllExams.ALIAS_SCORE%></td>	
				<td><c:out value='${allExams.score}'/></td>
			</tr>
		</table>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>