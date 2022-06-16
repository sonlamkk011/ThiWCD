<%@ page import="com.example.thiwcd.entity.Employee" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/client/include/heade.jsp"/>
<jsp:include page="/client/include/navbar.jsp"/>
<jsp:include page="/client/include/silebar.jsp"/>
<html>
<%
    List<Employee> employeeList = (List<Employee>) request.getAttribute("employeelist");
%>
<head>
    <title>Title</title>
</head>
<body>
<section class="section" style="margin-left: 20rem; margin-top: 80px;border-radius: 8px ">
    <div class="row">
        <div class="col-md-8">
            <div class="card">
                <div class="card-body">
                    <h5 class="card-title">Default Table</h5>
                    <table class="table">

                        <tbody>
                        <table class="table table-bordered">
                            <thead>
                            <tr>
                                <th scope="col">Id</th>
                                <th scope="col">Full Name</th>
                                <th scope="col">Birthday</th>
                                <th scope="col">Address</th>
                                <th scope="col">Position</th>
                                <th scope="col">Department</th>

                            </tr>
                            </thead>
                            <tbody>
                            <%
                                List<Employee> employees = (ArrayList<Employee>) request.getAttribute("employeelist");
                                if (employees == null) {
                                    employees = new ArrayList<>();
                                }
                                for (Employee employee : employees) {%>
                            <tr>
                                <td>
                                    <%= employee.getId() %>
                                </td>
                                <td><%= employee.getFullName() %>
                                </td>
                                <td><%= employee.getBirthday()%>
                                </td>
                                <td><%= employee.getAddress() %>
                                </td>
                                <td><%= employee.getPosition() %>
                                </td>
                                <td><%= employee.getDepartment() %>
                                </td>


                            </tr>
                            <%}%>
                            </tbody>
                        </table>


                        </tbody>
                    </table>
                </div>
            </div>


            <jsp:include page="/client/include/scrip.jsp"/>
</body>
</html>
