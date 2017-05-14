<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <style type="text/css">
        .tg {
            border-collapse: collapse;
            border-spacing: 0;
            border-color: #ccc;
        }
        .tg td {
            font-family: Arial, sans-serif;
            font-size: 14px;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #fff;
        }
        .tg th {
            font-family: Arial, sans-serif;
            font-size: 14px;
            font-weight: normal;
            padding: 10px 5px;
            border-style: solid;
            border-width: 1px;
            overflow: hidden;
            word-break: normal;
            border-color: #ccc;
            color: #333;
            background-color: #f0f0f0;
        }
        .tg .tg-4eph {
            background-color: #f9f9f9
        }
    </style>
    <title>TestTask</title>
</head>

<%--<script type="text/javascript" src="resources/jquery/jquery-ui.js"></script>--%>
<a href="index">Home</a>
<h1>Client List</h1>
<table border="1" cellpadding="8" cellspacing="0">
    <thead>
    <tr>
        <th>FirstName</th>
        <th>SecondName</th>
        <th>LastName</th>
        <th>PhoneNumber</th>
        <th>PhoneDescription</th>
        <th>PhoneComments</th>
        <th></th>
    </tr>
    </thead>
    <c:forEach items="${phones}" var="phone">
        <jsp:useBean id="phone" scope="page" type="org.itnavigator.testtask.model.Phone"/>
        <td>${phone.client.firstName}</td>
        <td>${phone.client.middleName}</td>
        <td>${phone.client.lastName}</td>
        <td>${phone.number}</td>
        <td>${phone.description}</td>
        <td>${phone.comments}</td>
        <td><a href="phones/edit/${phone.id}">Update</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
