<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
       <h1>Customer LIST</h1>
        
        <table border="1">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th></th>
                <th></th>
            </tr>
            
            <c:forEach items="${customers}" var="item">
            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.email}</td>
                <td>
                    <a href="edit.htm?id=${item.id}">Edit</a>
                </td>
                <td>
                    <a href="delete.htm?id=${item.id}">Delete</a>
                </td>
            </tr>
            </c:forEach>
        </table>
        
        <a href="add.htm">Add Customer >></a>
    </body>
</html>
