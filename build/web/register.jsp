<%-- 
    Document   : index
    Created on : Jun 13, 2019, 12:49:11 PM
    Author     : HP
--%>

<%@page import="java.util.regex.Pattern"%>
<%@page import="java.text.Normalizer"%>
<%@page import="model.Customer"%>
<%@page import="dao.CustomerDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <link rel="manifest" href="%PUBLIC_URL%/manifest.json" />
        <link rel="stylesheet" href="%PUBLIC_URL%/reset.css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css" integrity="sha384-oS3vJWv+0UjzBfQzYUhtDYW+Pj2yciDJxpsK1OYPAYjqT085Qq/1cq5FLXAZQ7Ay" crossorigin="anonymous">
        <link href="./Style/NavBar.css" type="text/css" rel="stylesheet" /><!--
-->    <link href="./Style/HeaderImg.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/TopHeader.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/App.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/BottomFooter.css" type="text/css" rel="stylesheet" /><!--<!--
-->     <link href="./Style/TopFooter.css" type="text/css" rel="stylesheet" /><!--
                                                                         
-->      
    </head>
    <style>
        input{
            width: 400px;
            height: 35px;
            font-size: 20px;
        }
        table{
            border-spacing: 50px 15px;
        }
        td{
            font-size: 20px;
        }
        h1{
            margin-left: 20%;
            margin-bottom: 0;
        }
        .validate{
            color : red;
        }
    </style>
    <%
        // Create cookies for first and last names.      
        Cookie name = new Cookie("name",
                               request.getParameter("name"));
        Cookie email = new Cookie("email",
                               request.getParameter("email"));
        Cookie address = new Cookie("address",
                               request.getParameter("address"));
        
        
  
        Cookie contact = new Cookie("contact",request.getParameter("contavt"));

        // Set expiry date after 24 Hrs for both the cookies.
        name.setMaxAge(60*60*24); 
        email.setMaxAge(60*60*24);
        address.setMaxAge(60*60*24); 
        contact.setMaxAge(60*60*24);

        // Add both the cookies in the response header.
        response.addCookie( name );
        response.addCookie( email );
        response.addCookie( address );
        response.addCookie( contact );
    %>
    <body>
        <%@ include file="/Structure/header.jsp" %>
            <h1>Register Form</h1>
            <form action="register" method="post" >

             <table style="with: 50%;margin: auto" >
                <tr>
                    <td></td><td class="validate">${NAME}</td>
                </tr>
                <tr>
                    <td>Name</td>
                    <td><input type="text" name="name" id="name" value="${name}"/></td>
                </tr>
                <tr>
                    <td></td><td class="validate">${MAIL}</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="email" name="email" id="email" value="${email}"/></td>
                </tr>
                <tr>
                    <td></td><td class="validate">${PW}</td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="password" id="password"/></td>
                </tr>
                <tr>
                    <td></td><td class="validate">${AD}</td>
                </tr>
                <tr>
                    <td>Address</td>
                    <td><input type="text" name="address" id="address" value="${address}"/></td>
                </tr>
                <tr>
                    <td></td><td class="validate">${PHONE}</td>
                </tr>
                <tr>
                        <td>Contact No</td>
                        <td><input type="text" name="contact" id="contact" value="${contact}"/></td>
                </tr>

            </table>
                
            <table style="margin: auto; ">
                <tr>
                    <td><input type="submit" value="Submit" style="width: 140%; height: 40px;"/></td>
                </tr>
            </table>


             </form>
       
        <%@ include file="/Structure/footer.jsp" %>
    </body>
</html>