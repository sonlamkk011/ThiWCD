<%@ page import="com.example.thiwcd.entity.Employee" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="/client/include/heade.jsp"/>
<jsp:include page="/client/include/navbar.jsp"/>
<jsp:include page="/client/include/silebar.jsp"/>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%  Employee employee = (Employee) request.getAttribute("employee");
    if(employee == null) {
        employee = new Employee();
    }
    %>
<section class="section" style="margin-left: 400px; margin-top: 100px">
    <div class="row">
        <div class="card">
            <div class="card-body">
                <div class="col-lg-8">
                    <div class="col-md-4">

                    </div>
                    <form action="/create" method="post">
                        <div class="col-md-12">
                            <label class="col-md-12 col-form-label">Full Name</label>
                            <div class="col-sm-12" style="width: 180px">
                                <input type="text" name="fullname" class="form-control">
                            </div>
                        </div>
                        <div class="col-md-10">
                                <label for="html5-date-input" class="col-md-2 col-form-label">Birthday</label>
                                <div class="col-sm-12" style="width: 180px">
                                    <input class="form-control" type="date" name="birthday"  id="html5-date-input" />
                                </div>
                        </div>
                        <div class="col-md-12">
                            <label class="col-md-12 col-form-label">Address</label>
                            <div class="col-sm-12" style="width: 180px">
                                <input type="text" name="address" class="form-control">
                            </div>
                        </div>
                        <div class="col-md-12">
                            <label class="col-md-12 col-form-label">Position </label>
                            <div class="col-sm-12" style="width: 180px">
                                <input type="text" name="position" class="form-control">
                            </div>
                        </div>
                        <div class="col-md-12">
                            <label class="col-md-12 col-form-label">Department</label>
                            <div class="col-sm-12" style="width: 180px">
                                <input type="text" name="department" class="form-control">
                            </div>
                        </div>
                        <div class="row mb-3" style="margin-top: 30px">
                            <div class="col-sm-10">
                                <button type="submit" class="btn btn-primary">Submit</button>
                                <button type="reset" value="Reset" class="btn btn-primary">Reset</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</section>

<jsp:include page="/client/include/footer.jsp"/>
<jsp:include page="/client/include/scrip.jsp"/>
</body>
</html>
