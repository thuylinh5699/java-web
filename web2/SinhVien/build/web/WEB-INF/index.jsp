<%-- 
    Document   : index
    Created on : Aug 2, 2019, 10:36:44 PM
    Author     : ThuyLinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarNav">
                <ul class="navbar-nav">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <br/>
            <table class="table border">
                <thead class="thead-dark">
                    <tr>
                        <th scope="col">#</th>
                        <th scope="col">Họ tên</th>
                        <th scope="col">Khoa</th>
                        <th scope="col">Lớp</th>
                        <th scope="col">Chức năng</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        StudentModel model = new StudentModel();
                        List<Student> list = model.getAll();
                        for (Student student : list) {
                    %>
                    <tr>
                        <th scope="row"><%= student.getId() %></th>
                        <td><%= student.getName() %></td>
                        <td><%= student.getMajor()%></td>
                        <td>@<%= student.getClassName()%></td>
                        <td>
                            <a class="btn btn-primary">Sửa</a>
                            <a class="btn btn-danger" href="delete?id=<%= student.getId() %>">Xoá</a>
                        </td>
                    </tr>
                    <%
                            }
                    %>
                </tbody>
            </table>
            
            <a href="add.jsp" class="btn btn-success">Thêm mới</a>
        </div>
    </body>
</html>
