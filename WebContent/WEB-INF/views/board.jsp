<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="battle" method="POST">
${Myboard}
${playerName}
${playerCurrentHp} / ${playerHp} hp <br>
${playerStr} Str<br>
${playerCrit} Crit<br>
${playerDodge} Dodge<br>

<input type="hidden" id="playerName" name="playerName" value="${playerName}">
<input type="hidden" id="playerCurrentHp" name="playerCurrentHp" value="${playerCurrentHp}">
<input type="hidden" id="playerHp" name="playerHp" value="${playerHp}">
<input type="hidden" id="playerStr" name="playerStr" value="${playerStr}">
<input type="hidden" id="playerCrit" name="playerCrit" value="${playerCrit}">
<input type="hidden" id="playerDodge" name="playerDodge" value="${playerDodge}">
<input type="submit" value="battle the frog"> 
</form>
</body>
</html>