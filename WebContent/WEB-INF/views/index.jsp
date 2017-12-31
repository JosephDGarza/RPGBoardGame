<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>this is the home page</h1>
<p> You may spend up to 10 points to increase your characters stats. These stats will also determine how your charcter levels up. So choose wisely.</p>
<p>By default your character starts with:</p>
<p>100 hp</p>
<p>3 str</p>
<p>0% crit</p>
<p>0% dodge</p>
<br>
<input type="range" name="hp" min = "0" max ="10" value="0">
${hp}<br>
<input type="range" name="str" min = "0" max ="10" value="0">
${str}<br>
<input type="range" name="crit" min = "0" max ="10" value="0">
${crit} <br>
<input type="range" name="dodge" min = "0" max ="10" value="0">
${dodge}

</body>
</html>