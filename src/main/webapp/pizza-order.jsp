<%--
  Created by IntelliJ IDEA.
  User: courtnieferguson
  Date: 9/3/21
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="POST" action="/pizza-order">

    <select name="crust_type">
        <option value="rising">rising</option>
        <option value="thin" >thin</option>
<option value="stuffed"
    </select>

    <select name="sauce type"
            tomato
            alfredo
            buffalo
            bbq
</select>

    <select name="size">
        small
        medium
        large

    </select>
</form>
        <label for="password">Password</label>
        <input id="password" name="password" type="password">
        <br>

        <input type="submit">
</form>
</body>
</html>
