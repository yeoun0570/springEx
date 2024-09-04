<%--
  Created by IntelliJ IDEA.
  User: LG
  Date: 2024-09-04
  Time: 오후 12:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
    위
    %@ : WAS에서 처리해야 될 일인걸 알려줌
    html 페이지, UTF-8, java

    아래는 웹문서 구조--%>
<html>
<head>
    <title>계산기</title>
</head>
<body>
<form action="/calc/makeResult" method="post">
    <input type="number" name="num1"/>
    <input type="number" name="num2"/>
    <button type="submit">SEND</button>
</form>
</body>
</html>
