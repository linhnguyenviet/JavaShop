<%@page import="dao.FlowerDAO"%>
<%@page import="model.Flower"%>
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
         --><link href="./Style/product.css" type="text/css" rel="stylesheet" /><!--
                                                                
-->
        <style>
        .productDetail  {
    display:grid;
    grid-template-columns: repeat(2,40%);
    grid-gap: 30px;
    width:80%;
    margin: 0 auto; 
    margin-top:50px;
} 
.productDetail img {
    width:100%;
}
.productDetail .detailImg {
    width:90%;

}
.productDetail .name p {
    font-size:2em;
    font-weight:bold;
}
.productDetail .price p {
    font-size:1.3em;
    color:red;
    font-weight:bold;
}
.productDetail .category p {
    font-size:1.2em;
    font-weight:bold;
    color:rgb(29, 78, 168);
}
.productDetail .btngroup1 input {
    padding:7px 5px 2px 5px;
    margin-bottom:5px;
    margin-right:7px;
    width:50px;
}
.productDetail .btngroup1 button {
    background:rgb(230, 230, 230);
    color:black;
    border:1px solid rgb(192, 192, 192);
    border-radius: 1px;
    font-size:1.2em;
    padding:2px 9px;
    margin: 0 10px 20px 0;
    cursor:pointer;
}
.productDetail .btngroup2 button {
    background:rgb(57, 158, 116);
    color:white;
    border:1px solid rgb(57, 158, 116);
    border-radius: 1px;
    padding:12px;
    margin-right:10px;
    cursor:pointer;
}



        </style>
    </head>
    
    <body>
        <%@ include file="/Structure/header.jsp" %>
       
       <%
            Flower flower = new Flower();
            FlowerDAO f = new FlowerDAO();
            flower = f.getFlowerDetail(request.getParameter("id"));
       %>
       <div class="productDetail">
            <div class="left">
                <div class="detailImg">
                    <img src="<%=flower.getImg()%>">
                </div>
            </div>
           <div class="right">
                <div class="name">
                    <p><%=flower.getfName()%> </p>
                </div>
                <div class="price">
                    <p><%=flower.getPrice()%> đ</p>
                </div>
                <div class="category">
                    <p><%=flower.getCategory()%></p>
                </div>
                <div>
                    <p>Lorem Ipsum is simply dummy text of the printing and typesetting 
                        industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s,
                        when an unknown printer took a galley of type and scrambled it to make a type specimen
                        book.</p>
                </div>
                <div class="btngroup1">
                        <div><p>Số lượng</p></div>
                        <div>
                            <button>+</button>
                            <input type="text">
                            <button>+</button>
                        </div>
                </div>
                <div class="btngroup2">
                    <button>Mua ngay</button>
                    <button>Thêm vào giỏ hàng</button>
                </div>
              
           </div>
           
       </div>
         <%@ include file="/Structure/footer.jsp" %>

    </body>
</html>