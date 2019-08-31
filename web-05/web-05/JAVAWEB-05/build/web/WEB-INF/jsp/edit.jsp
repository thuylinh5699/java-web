<%-- 
    Document   : edit
    Created on : Aug 31, 2019, 1:24:55 PM
    Author     : ThuyLinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <h1>Edit CUSTOMER</h1>
        <form:form action="update.htm" method="POST">
            <table>
                <tr>
                    <td>ID: </td>
                    <td> <form:input path="id" readonly="true"/> </td>
                </tr>
                <tr>
                    <td>NAME: </td>
                    <td> <form:input path="name" /> </td>
                </tr>
                <tr>
                    <td>EMAIL: </td>
                    <td> <form:input path="email" /> </td>
                </tr>
                <tr>
                    <td> <input type="submit" value="UPDATE" /> </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
