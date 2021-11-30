<%-- 
    Document   : layout
    Created on : Oct 27, 2021, 10:47:44 AM
    Author     : Duy Manh
--%>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <title>List Customers</title>    
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">        
         
        <!--BOOTSTRAP5-->
        <link
            href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
            rel="stylesheet"
            integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
            crossorigin="anonymous"
            />
        <!--FONTAWESOME-->
        <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css"
            integrity="sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w=="
            crossorigin="anonymous"
            referrerpolicy="no-referrer"
            />          
        <!-- CSS -->
       
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css" />
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/queries.css" />
        
        
        <!--===============================================================================================-->
    </head>    
    <body>
        <jsp:include page="model/header.jsp"/>  
        <div class="container">               
            <div class="row">
                <article class="col-sm-9">
                    <!--content-->
                    <h2>List Customers</h2>                   
                    <table class="table table-bordered">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>Name</th>
                                <th>Birthday</th>
                                <th>Gender</th>
                                <th>Email</th>
                                <th>Phone</th>
                                <th>Register Date</th>
                                <th>Action</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="c" items="${LIST_CUSTOMER}">
                                <tr>
                                    <td>${c.id}</td>
                                    <td>${c.name}</td>
                                    <td>
                                        <fmt:formatDate pattern = "yyyy-MM-dd" 
                                                        value = "${c.birthday}" />
                                    </td>
                                    <td>
                                        <c:if test="${c.gender}">Nam</c:if>
                                        <c:if test="${not c.gender}">Nu</c:if>
                                        </td>
                                        <td>${c.email}</td>
                                    <td>${c.phone}</td>
                                    <td>                                       
                                        <fmt:formatDate pattern = "yyyy-MM-dd" 
                                                        value = "${c.registerDate}" />
                                    </td>                               
                                    <td><a class="btn btn-primary btn-sm" href="UserServlet?action=AddOrEdit&username=12">Edit</a> |
                                        <a class="btn btn-danger btn-sm" href="UserServlet?action=Delete&username=12">Del</a></td>
                                </tr>   
                            </c:forEach>
                        </tbody>
                    </table>
                    <!--end content-->              

                </article>             
            </div>             
        </div>
            <jsp:include page="model/footer.jsp"/> 
        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"></script>
    </body>

</html>
