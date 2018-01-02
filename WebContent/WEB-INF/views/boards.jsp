<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

.div2 {
	float: right;
	text-align: right;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Congrats</title>
</head>
<body>


${congrats}
<div class="div2">
			<h3>Player stats</h3>
			<br> ${playerName}<br> ${playerCurrentHp} /
			${playerHp} hp <br> ${playerStr} Str<br> ${playerCrit} Crit<br>
			${playerDodge} Dodge<br>
		</div>
		<input type="hidden" value="${diceroll}" id="roll">
		
		<input type= "button" value="roll" onclick="rollFunction()">
		<span id="rollDisplay"></span>
		
		<form action="battles" method="POST">
		<span id="buttonAppear"></span>
<input type="hidden" id="playerName" name="playerName" value="${playerName}">
<input type="hidden" id="playerCurrentHp" name="playerCurrentHp" value="${playerCurrentHp}">
<input type="hidden" id="playerHp" name="playerHp" value="${playerHp}">
<input type="hidden" id="playerStr" name="playerStr" value="${playerStr}">
<input type="hidden" id="playerCrit" name="playerCrit" value="${playerCrit}">
<input type="hidden" id="playerDodge" name="playerDodge" value="${playerDodge}">

<input type="hidden" id="diceroll" name="diceroll" value="${diceroll}">
		</form>
</body>

<script type="text/javascript">
function rollFunction() {
var roll = document.getElementById("roll").value;
var battle = "<input type=\"submit\" value=\"Continue Forward\">";
		
		document.getElementById("rollDisplay").innerHTML = roll;
		document.getElementById("buttonAppear").innerHTML = battle;
				
			
				} 

</script>
</html>