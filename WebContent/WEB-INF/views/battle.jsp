<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

.info_header {
	display: flex;
	flex-direction: row;
	float: center;
	text-align: center;
}

.info_header p {
	margin: 0px 20px 0px 20px;
	padding: 5px;
	height: 220px;
	overflow: scroll;
	float: center;
	text-align: center;
}
.div1 {
	float: left;
}

.div2 {
	float: right;
	text-align: right;
}

.div3 {
	float: center;
	text-align: center;
}

.image {
	float: center;
	text-align: center;
}

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Battle</title>
<div class="image">
<img src="http://img2.wikia.nocookie.net/__cb20141220023915/villains/images/e/ed/King_Wart.jpg"
	width="500" height="500">
	
	
	
	<img src="https://s3.amazonaws.com/indieobscura-www/assets/editorial/2017/04/little-nightmares-monsters-the-janitor.png"
	width="500" height="500">
	
	</div>
</head>
<body>
	<div>
		<div class="div1">
			<h3>Enemy stats</h3>
			<br> <span id="enemyhp"></span>/${enemyHp} Frog King's Hp<br>
			${enemyStr} Str
		</div>

<div class="div2">
			<h3>Player stats</h3>
			<br> ${playerName}<br> <span id="playerhp"></span> /
			${playerHp} hp <br> ${playerStr} Str<br> ${playerCrit} Crit<br>
			${playerDodge} Dodge<br>
		</div>

		<div class="div3">
			<input type="button" value="punch"
				onclick="attack(playerhp, playerstr, displayphp, enemyhp, enemystr, displayehp)">

			<h2 id="result"></h2>
			<form action="boards" method="POST">
			<input type="hidden" id="playerName" name="playerName" value="${playerName}">
<input type="hidden" id="playerCurrentHp" name="playerCurrentHp">
<input type="hidden" id="playerHp" name="playerHp" value="${playerHp}">
<input type="hidden" id="playerStr" name="playerStr" value="${playerStr}">
<input type="hidden" id="playerCrit" name="playerCrit" value="${playerCrit}">
<input type="hidden" id="playerDodge" name="playerDodge" value="${playerDodge}">
			<span id ="continue"></span>
			</form>
<div class="info_header">
			<p id="CombatLog"></p>
		</div>
		</div>


		
	</div>



	<input type="hidden" id="php" name="php" value="${playerCurrentHp}">
	<input type="hidden" id="pstr" name="pstr" value="${playerStr}">

	<input type="hidden" id="ehp" name="ehp" value="${enemyCurrentHp}">
	<input type="hidden" id="estr" name="estr" value="${enemyStr}">




</body>

<script type="text/javascript">
	var playerhp = document.getElementById("php").value;
	var playerstr = document.getElementById("pstr").value;
	var displayphp = document.getElementById("playerhp");
	displayphp.innerHTML = playerhp;

	var enemyhp = document.getElementById("ehp").value;
	var enemystr = document.getElementById("estr").value;
	var displayehp = document.getElementById("enemyhp");
	displayehp.innerHTML = enemyhp;

	function attack() {
		if (playerhp > 0) {
			if (enemyhp > 0) {

			

				if (enemyhp - playerstr <= 0) {
					displayehp.innerHTML = 0;
					var win = "You have won!";
					var next = "<input type=\"submit\" value=\"Continue Forward\">";
					document.getElementById("playerCurrentHp").value = playerhp;
					document.getElementById("result").innerHTML = win;
					document.getElementById("continue").innerHTML = next;
				} 
				
				
				else {
				var plog= "";
				var elog= "";
					plog += "You hit enemy for " + playerstr + "<br>";
				 
					displayehp.innerHTML = enemyhp - playerstr;
					playerhp = playerhp - enemystr;
					document.getElementById("CombatLog").innerHTML += plog
					elog += "Enemy hit you for " + enemystr + "<br><br>";
					document.getElementById("CombatLog").innerHTML += elog
					displayphp.innerHTML = playerhp;
					
					
					if (playerhp < 1) {
					displayphp.innerHTML = 0;
						var death = "You have died";

						document.getElementById("result").innerHTML = death;
					}
				}
					
				console.log(displayphp.innerHTML);

				enemyhp = enemyhp - playerstr;
				console.log(playerhp);
			}
		}

	}
</script>
</html>