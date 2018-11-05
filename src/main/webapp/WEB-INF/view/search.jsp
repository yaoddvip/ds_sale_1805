<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/5
  Time: 9:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>标题</title>
    <script>
        function toIndexPage(){
            location.href="toMainPage.do";
        }
    </script>
</head>
<body>
    <div class="search">
        <div class="logo" ><img src="./images/logo.jpg" onclick="toIndexPage()" alt=""></div>
        <div class="search_on">
            <div class="se">
                <input type="text" name="search" class="lf">
                <input type="submit" class="clik" value="搜索">
            </div>
            <div class="se">
                <a href="">取暖神奇</a>
                <a href="">1元秒杀</a>
                <a href="">吹风机</a>
                <a href="">玉兰油</a>
            </div>
        </div>
        <div class="card">
            <a href="">购物车<div class="num">0</div></a>

            <!--购物车商品-->
            <div class="cart_pro">
                <h6>最新加入的商品</h6>
                <div class="one">
                    <img src="images/lec1.png"/>
                    <span class="one_name">
                            商品名称商品名称商品名称商品名称
                        </span>
                    <span class="one_prece">
                            <b>￥20000</b><br />
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;删除
                        </span>
                </div>

                <div class="gobottom">
                    共<span>2</span>件商品&nbsp;&nbsp;&nbsp;&nbsp;
                    共计￥<span>20000</span>
                    <button class="goprice">去购物车</button>
                </div>

            </div>
        </div>
    </div>
</body>
</html>
