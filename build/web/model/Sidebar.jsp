<%-- 
    Document   : Sidebar
    Created on : 30-10-2021, 23:38:06
    Author     : BEAN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

 <nav id="sidebar">
            <div id="dismiss">
                <i class="bi bi-arrow-left"></i>
            </div>

            <div class="sidebar-header">
                <h3>Bootstrap Sidebar</h3>
            </div>

            <ul class="list-unstyled components">
                <p>Dummy Heading</p>
                <li>
                    <a href="home">Home
                        <i class="bi bi-house float-end"></i>
                    </a>

                </li>
                <li>
                    <a href="ManagerOrder">Manager Order <i class="bi bi-cart-check float-end"></i></i></a>
                </li>
                <li>
                    <a href="ManagerProduct">Manager Product <i class="bi bi-bag-fill float-end"></i></a>
                </li>
                <li>
                    <a href="ManagerBlog">Manager Blog <i class="bi bi-bootstrap float-end"></i></a>
                </li>
                <li>
                    <a href="ManagerAccount">Manager Account<i class="bi bi-person float-end"></i></a>
                </li>
            </ul>

            <ul class="list-unstyled CTAs">
                <li><a href="home" class="download">Log out</a></li>
            </ul>
        </nav>