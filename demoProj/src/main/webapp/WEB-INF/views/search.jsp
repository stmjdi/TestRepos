<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Search Result</title>

<style>
	table{
		margin-top:200px;
		margin-left:auto;
		margin-right:auto;
		
		border-style:solid;
		border-width:0.5px;
		
		text-align:center;
	}
	
	th{
		background-color:lightgreen;
	}
</style>
</head>
<body>
<h1>Search Result</h1>

<table>
	<tr>
		<th>bid</th>
		<th>title</th>
		<th>author</th>
		<th>category</th>
		<th>catDetail</th>
	</tr>
	<c:forEach var="res" items="${list }">
	<tr>
		<td>${res.bid }</td>
		<td>${res.title }</td>
		<td>${res.author }</td>
		<td>${res.category }</td>
		<td>${res.catDetail }</td>
	</tr>
	</c:forEach>
</table>

</body>
</html>