<%@page import="com.company.project.model.*" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/simpletable" prefix="simpletable"%>
<%@ include file="/commons/taglibs.jsp" %>

<rapid:override name="head">
	<title><%=Examroom.TABLE_ALIAS%> 维护</title>
	
	<link href="<c:url value="/widgets/simpletable/simpletable.css"/>" type="text/css" rel="stylesheet">
	<script type="text/javascript" src="<c:url value="/widgets/simpletable/simpletable.js"/>"></script>
	
	<script type="text/javascript" >
		$(document).ready(function() {
			// 分页需要依赖的初始化动作
			window.simpleTable = new SimpleTable('queryForm',${page.thisPageNumber},${page.pageSize},'${pageRequest.sortColumns}');
		});
	</script>
</rapid:override>

<rapid:override name="content">
	<form id="queryForm" name="queryForm" action="<c:url value="/pages/Examroom/list.do"/>" method="get" style="display: inline;">
	<div class="queryPanel">
		<fieldset>
			<legend>搜索</legend>
			<table>
				<tr>	
					<td class="tdLabel"><%=Examroom.ALIAS_ROOMADDRESS%></td>		
					<td>
						<input value="${query.roomaddress}" id="roomaddress" name="roomaddress" maxlength="255"  class=""/>
					</td>
					<td class="tdLabel"><%=Examroom.ALIAS_IS_USED_TIME%></td>		
					<td>
						<input value="${query.isUsedTime}" id="isUsedTime" name="isUsedTime" maxlength="255"  class=""/>
					</td>
					<td class="tdLabel"><%=Examroom.ALIAS_ROOM_NUM%></td>		
					<td>
						<input value="${query.roomNum}" id="roomNum" name="roomNum" maxlength="11"  class=""/>
					</td>
				</tr>	
			</table>
		</fieldset>
		<div class="handleControl">
			<input type="submit" class="stdButton" style="width:80px" value="查询" onclick="getReferenceForm(this).action='${ctx}/pages/Examroom/list.do'"/>
			<input type="submit" class="stdButton" style="width:80px" value="新增" onclick="getReferenceForm(this).action='${ctx}/pages/Examroom/create.do'"/>
			<input type="button" class="stdButton" style="width:80px" value="删除" onclick="batchDelete('${ctx}/pages/Examroom/delete.do','items',document.forms.queryForm)"/>
		<div>
	</div>
	
	<div class="gridTable">
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	
		<table width="100%"  border="0" cellspacing="0" class="gridBody">
		  <thead>
			  
			  <tr>
				<th style="width:1px;"> </th>
				<th style="width:1px;"><input type="checkbox" onclick="setAllCheckboxState('items',this.checked)"></th>
				
				<!-- 排序时为th增加sortColumn即可,new SimpleTable('sortColumns')会为tableHeader自动增加排序功能; -->
				<th sortColumn="roomaddress" ><%=Examroom.ALIAS_ROOMADDRESS%></th>
				<th sortColumn="is_used_time" ><%=Examroom.ALIAS_IS_USED_TIME%></th>
				<th sortColumn="is_used_time" ><%=Examroom.ALIAS_ROOM_NUM%></th>
				<th>操作</th>
			  </tr>
			  
		  </thead>
		  <tbody>
		  	  <c:forEach items="${page.result}" var="item" varStatus="status">
		  	  
			  <tr class="${status.count % 2 == 0 ? 'odd' : 'even'}">
				<td>${page.thisPageFirstElementNumber + status.index}</td>
				<td><input type="checkbox" name="items" value="examroomid=${item.examroomid}&"></td>
				
				<td><c:out value='${item.roomaddress}'/>&nbsp;</td>
				<td><c:out value='${item.isUsedTime}'/>&nbsp;</td>
				<td><c:out value='${item.roomNum}'/>&nbsp;</td>
				<td>
					<a href="${ctx}/pages/Examroom/show.do?examroomid=${item.examroomid}&">查看</a>&nbsp;&nbsp;&nbsp;
					<a href="${ctx}/pages/Examroom/edit.do?examroomid=${item.examroomid}&">修改</a>
				</td>
			  </tr>
			  
		  	  </c:forEach>
		  </tbody>
		</table>
	
		<simpletable:pageToolbar page="${page}">
		显示在这里是为了提示你如何自定义表头,可修改模板删除此行
		</simpletable:pageToolbar>
	</div>
	</form>
</rapid:override>

<%-- jsp模板继承,具体使用请查看: http://code.google.com/p/rapid-framework/wiki/rapid_jsp_extends --%>
<%@ include file="base.jsp" %>

