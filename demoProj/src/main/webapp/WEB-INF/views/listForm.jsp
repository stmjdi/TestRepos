<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("utf-8");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List Page</title>

<style>
	#tab{
		border-style:solid;
		border-width:1px;
		
		margin-top:200px;
		margin-left:auto;
		margin-right:auto;
		
		text-align:center;
	}
	
	th{
		background-color:lightgreen;
	}
</style>
</head>
<body>
<h1>List Page</h1>


<button onclick="location.href='searchForm'">Search</button><br>
<table id="tab">
	<tr>
		<th>bid</th>
		<th>title</th>
		<th>author</th>
		<th>category</th>
		<th>catDetail</th>
		<th></th>
	</tr>
	<c:forEach var="itm" items="${list }">
	<tr>
		<td>${itm.bid }</td>
		<td>${itm.title }</td>
		<td>${itm.author }</td>
		<td>${itm.category }</td>
		<td>${itm.catDetail }</td>
		<td></td>
	</tr>
	</c:forEach>
</table>

</body>
</html>