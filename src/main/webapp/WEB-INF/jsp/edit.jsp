<%@ page language="java" pageEncoding="UTF-8"%>
<%@ page contentType="text/html;charset=UTF-8" %>

<html>
<head>
    <title>edit Phones</title>

</head>
<body>
<section>
    <pre>${phoneToEdit.client.lastName} ${phoneToEdit.client.firstName} ${phoneToEdit.client.middleName}</pre>
    <form method="post" action="save">
        <input type="hidden" name="id" value="${phoneToEdit.id}">
        <dl>
            <dt>Number:</dt>
            <dd><input type="text" value="${phoneToEdit.number}" name="number"></dd>
        </dl>
        <dl>
            <dt>Description:</dt>
            <p><select name="description">
                <option selected>${phoneToEdit.description}</option>
                <option value="Домашний">Домашний</option>
                <option  value="Мобильный">Мобильный</option>
                <option value="Нет сведений">Нет сведений</option>
            </select></p>
            <%--<dd><input type="text" value="${phoneToEdit.description}" size=40 name="description"></dd>--%>
        </dl>
        <dl>
            <dt>Comments:</dt>
            <dd><input type="text" value="${phoneToEdit.comments}" name="comments"></dd>
        </dl>
        <button type="submit">Save</button>
        <button onclick="window.history.back()">Cancel</button>
    </form>
</section>
</body>
</html>
