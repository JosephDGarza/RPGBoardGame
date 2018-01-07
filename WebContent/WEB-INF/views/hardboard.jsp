<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/board.css" type="text/css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>RPGBoardHARD</title>
</head>
<body>

${divs}
<div class="div2">
			<h3>Player stats</h3>
			<ul class="bargraph"><br> 
			${playerPortrait}
			${playerName}'s  Hp <li class="reddeep" style="width: 100%;"><span id="pbar"></span> <span id="playerhp"></span> 
			</li>${currentExp} / ${playerExp}Exp <br>Level ${level} ${playerCharacter}<br>${playerStr} Str<br> ${playerCrit} Crit<br>
			${playerDodge} Dodge<br>
			</ul>
		</div>
		
		<input type="hidden" value="You rolled a ${dice}" id="rolled">
		<input type="hidden" value="${diceroll}" id="dicerolled">
		<input type="hidden" value="${tile} is the square you will be on" id="roll">
		
	  	<input id="dice" type="image" src="resources/images/dieroll.png" alt="submit" onclick="rollFunction()"> (click to roll your die)
		<p class="win" id="win"></p>
		<h3>Current position: ${currentTile}</h3>
		<span id="rollDisplay" class="buttons"></span>
		
		<form action="hardbattles" method="POST">
		<span id="buttonAppear"></span>
<input type="hidden" id="playerName" name="playerName" value="${playerName}">
<input type="hidden" id="playerCurrentHp" name="playerCurrentHp" value="${playerCurrentHp}">
<input type="hidden" id="playerHp" name="playerHp" value="${playerHp}">
<input type="hidden" id="playerStr" name="playerStr" value="${playerStr}">
<input type="hidden" id="playerCrit" name="playerCrit" value="${playerCrit}">
<input type="hidden" id="playerDodge" name="playerDodge" value="${playerDodge}">
<input type="hidden" id="tile"	name="tile" value="${tile}">
<input type="hidden" id="rollCount" name="rollCount" value="${rollCount}">
<input type="hidden" id="playerCharacter" name="playerCharacter" value="${playerCharacter}">
<input type="hidden" id="playerExp" name="playerExp" value="${playerExp}">
<input type="hidden" id="currentExp" name="currentExp" value="${currentExp}">
<input type="hidden" id="level" name="level" value="${level}">
<input type="hidden" id="playerPortrait" name="playerPortrait">

<input type="hidden" id="diceroll" name="diceroll" value="${diceroll}">
		</form>



</body>

<script type="text/javascript">
var playerhp = document.getElementById("playerCurrentHp").value;
var pmaxhp = document.getElementById("playerHp").value;
var pbar = "";
var displaypbar = document.getElementById("pbar");
pbar = "<li class=\"greenbright\" style=\"width: " + (playerhp/pmaxhp)*100 + "%;\">" +playerhp + "/" + pmaxhp + "</li>";
displaypbar.innerHTML = pbar;


function rollFunction() {
var rolled = document.getElementById("rolled").value
var roll = document.getElementById("roll").value;
var dice = document.getElementById("dicerolled").value;
var battle = "<button class=\"draw\">Continue Forward</button>";
		
		
		document.getElementById("rollDisplay").innerHTML = "<br>" + rolled + "<br>" + roll;
		document.getElementById("buttonAppear").innerHTML = battle;
		if(dice > 17 && dice < 34){
		document.getElementById("win").innerHTML = "<br>" + "It looks like you made it around <br> the board once. Now for round 2, <br> this one will be harder. Enemies <br> have recieved a 30% stat increase." + "<br>";
		}
		if(dice > 34){
		document.getElementById("win").innerHTML = "<br>" + "It looks like you made it around <br> the board twice. Now for round 3,  <br> this one will be harder. Enemies <br> received another 30% on top of their <br>  existing 30% from the previous round" + "<br>";
		}
		
		if(dice > 41){
		document.getElementById("win").innerHTML = "<br>" + "It looks like you made it around  <br> the board three times. Now for round <br>  4, this one will be harder.  <br> Enemies received another 25% on <br>  top of their existing buffs from <br>  previous rounds" + "<br>";
		}
		
		if (dice > 58){
		document.getElementById("win").innerHTML = "<br>" + "It looks like you made it around  <br> the board four times. Now for round <br>  5, this one will be harder. <br>  Enemies received another 25% on <br>  top of their existing buffs from <br>  previous rounds" + "<br>";
		}
		
				
			
				} 

</script>
</html>