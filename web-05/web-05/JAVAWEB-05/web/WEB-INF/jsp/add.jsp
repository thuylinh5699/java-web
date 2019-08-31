<%-- 
    Document   : add
    Created on : Aug 31, 2019, 1:24:17 PM
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
        <h1>Add CUSTOMER</h1>
        <form:form action="save.htm" method="POST">
            <table>
                <tr>
                    <td>NAME: </td>
                    <td> <form:input path="name" /> </td>
                </tr>
                <tr>
                    <td>EMAIL: </td>
                    <td> <form:input path="email" /> </td>
                </tr>
                <tr>
                    <td> <input type="submit" value="ADD" /> </td>
                </tr>
            </table>
        </form:form>
    </body>
</html>
