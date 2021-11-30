<%-- 
    Document   : PostList
    Created on : Oct 28, 2021, 4:26:59 PM
    Author     : phunghe150108
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <!-- link Fonts -->
        <link
            href="https://fonts.googleapis.com/css2?family=Poppins:wght@400;500;600&display=swap"
            rel="stylesheet"
            />
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
        <title>Post List</title>
        <!------ Include the above in your HEAD tag ---------->
        <link href="css/Postlist.css" rel="stylesheet" type="text/css"/>
        
        <script src="//netdna.bootstrapcdn.com/bootstrap/3.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>


    </head>
    <body>

        <%@include file="model/header.jsp" %>
        <div class="container">
            <div class="col-md-12 d-flex flex-wrap justify-content-between">


                <c:forEach var="o" items="${postList}">
                    <div class="col-md-4 p-3">
                        <div class="single-blog-item1">
                            <div class="blog-thumnail">
                                <img src="./resources/${o.postImgURL}" alt="blog-img">
                            </div>
                            <div class="blog-content1">
                                <p>post ID:${o.ID}<p>
                                <h4>${o.description} </h4>
                                <div value="${o.userID}" >Author: ${o.userID}</div>
                                <div>date: ${o.date}</div>
                                <div class="btngroup" >
                                    <div class="btn-group" role="group" aria-label="Basic mixed styles example">
                                        <button type="button" class="btn btn-danger">Delete</button>
                                        <button type="button" class="btn btn-warning" ><a href="PostDetail">Detail</a></button>
                                        <button type="button" class="btn btn-success">Hide</button>
                                    </div>
                                </div>
                            </div>

                        </div>
                    </div>
                </c:forEach>
            </div>

        </div>



    </body>
</html>
