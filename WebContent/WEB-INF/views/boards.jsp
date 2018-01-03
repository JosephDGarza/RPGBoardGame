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
.image {
float: center;
text-align: center;
}

body{
background-image:url("https://wallpaperdownload.xyz/wp-content/uploads/2016/10/really-cool-wallpapers2.jpg");
	background-size: cover;
	background-attachment: fixed;
	background-repeat: no-repeat;
	  color: rgb(242,252,255);
    text-align: left;
    font-style: italic;
    font-weight:bolder;
    font-size: 17px;
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
		<input type="hidden" value="You rolled a ${dice}" id="rolled">
		<input type="hidden" value="${diceroll}" id="dicerolled">
		<input type="hidden" value="${tile} is the square you will be on" id="roll">
		
		<input type= "button" value="roll" onclick="rollFunction()">
		<span id="win"></span>
		
		<span id="rollDisplay"></span>
		
		<form action="battles" method="POST">
		<span id="buttonAppear"></span>
<input type="hidden" id="playerName" name="playerName" value="${playerName}">
<input type="hidden" id="playerCurrentHp" name="playerCurrentHp" value="${playerCurrentHp}">
<input type="hidden" id="playerHp" name="playerHp" value="${playerHp}">
<input type="hidden" id="playerStr" name="playerStr" value="${playerStr}">
<input type="hidden" id="playerCrit" name="playerCrit" value="${playerCrit}">
<input type="hidden" id="playerDodge" name="playerDodge" value="${playerDodge}">
<input type="hidden" id="tile"	name="tile" value="${tile}">
<input type="hidden" id="rollCount" name="rollCount" value="${rollCount}">

<input type="hidden" id="diceroll" name="diceroll" value="${diceroll}">
		</form>
<div class="image">
<img src="https://image.ibb.co/dhKngb/boardstart.png">
</div>


</body>

<script type="text/javascript">
function rollFunction() {
var rolled = document.getElementById("rolled").value
var roll = document.getElementById("roll").value;
var dice = document.getElementById("dicerolled").value;
var battle = "<input type=\"submit\" value=\"Continue Forward\">";
		
		
		document.getElementById("rollDisplay").innerHTML = "<br>" + rolled + "<br>" + roll;
		document.getElementById("buttonAppear").innerHTML = battle;
		if(dice > 17 && dice < 34){
		document.getElementById("win").innerHTML = "<br>" + "looks like you made it around the board once. Now for round 2, this one will be harder. Enemies have recieved a 10% stat increase." + "<br>";
		}
		if(dice > 34){
		document.getElementById("win").innerHTML = "<br>" + "looks like you made it around the board twice. Now for round 3, this one will be harder. Enemies received another 10% on top of their existing 10% from the previous round" + "<br>";
		}
		
				
			
				} 

</script>
</html>