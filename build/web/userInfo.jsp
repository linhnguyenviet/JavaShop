<%-- 
    Document   : index
    Created on : Jun 13, 2019, 12:49:11 PM
    Author     : HP
--%>

<%@page import="dao.CustomerDAO"%>
<%@page import="model.Customer"%>
<%@page import="java.util.ArrayList"%>
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
-->     <link href="./Style/HeaderImg.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/TopHeader.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/App.css" type="text/css" rel="stylesheet" /><!--
-->     <link href="./Style/BottomFooter.css" type="text/css" rel="stylesheet" /><!--<!--
-->     <link href="./Style/TopFooter.css" type="text/css" rel="stylesheet" /><!--
                                                                         
-->
    
    </head>
    <style>
  #myDIV {
    display:none;
        text-align: left;
 
         width:670px;
  }

</style>
    <body>
        <%@ include file="/Structure/header.jsp" %>
        
           <% 
        CustomerDAO d = new CustomerDAO();
        ArrayList<Customer> pr = d.getAll();
      
        for(int i = 0 ; i < pr.size(); i++){
        %>
        <div align="center">
            <h2 align="center"> Thông tin người dùng </h1>
              <table align="center" width="670">
                  
            <tr height="50">
                
                <td width="155">Customer Name</td>
                <td width="500"><input type="text" value="<%=c.getcName()%>" style="width: 500px;"> </td>
            </tr>

            <tr height="50">
                
                <td width="155">Phone</td>
                <td width="500"><input type="text" value="<%=pr.get(i).getPhone()%>" style="width: 500px;"></td>
            </tr>

            <tr height="50">
                
                <td width="155">Email</td>
                <td width="500"><input type="text" value="<%=pr.get(i).getEmail()%>" style="width: 500px;"></td>
            </tr>

            <tr height="50">
                
                <td width="155">Address</td>
                <td width="500"><input type="text" value="<%=pr.get(i).getAddress()%>" style="width: 500px;"></td>
            </tr>

                 <tr height="50"><td><button onclick="myFunction()">Change Password</button></td></tr>
                                        <tr>
                <td width="155"></td>
                <td width="500" >${MESS}</td></tr>
            <tr height="50">
              </table>
            <form action="changePassword" method="POST">
            <table id="myDIV" align="center">
           
            <tr height="50" >
                <td width="155">Old Password</td>
                <td width="500"><input type="text" placeholder="Input your old password" style="width: 500px;" name="oldPassword"></td>
            </tr>
 
                
                <td width="155">New Password</td>
                <td width="500"><input type="text" placeholder="Inpur your new password" style="width: 500px;" name="newPassword"></td>
            </tr>

            <tr height="50">
                
                <td width="155">Confirm new Password</td>
                <td width="500"><input type="text" placeholder="Inpur your new password" style="width: 500px;" name="confirmNewPassword"></td>
            </tr>

            <tr height="50"><td><input type="submit" value="Confirm" name="update"></td><td></td></tr>
            <% } %>
            
                <tr>
                <td width="155"></td>
                <td width="500">${MESS2}</td></tr>
       </table>
       
            </form>
            
            
            <script>
function myFunction() {
  var x = document.getElementById("myDIV");
  if (x.style.display === "block" ) {
    x.style.display = "none";
  } else {
    x.style.display = "block";
  }
}
</script>
</div>
    
        <%@ include file="/Structure/footer.jsp" %>

    </body>
</html>
