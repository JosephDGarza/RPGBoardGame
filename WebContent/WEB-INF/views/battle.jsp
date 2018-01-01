<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>
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
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Battle</title>
<img
	src="http://img2.wikia.nocookie.net/__cb20141220023915/villains/images/e/ed/King_Wart.jpg"
	width="500" height="500">
</head>
<body>
	<div>
		<div class="div1">
			<h3>Enemy stats</h3>
			<br> <span id="enemyhp"></span>/${enemyHp} Frog King's Hp<br>
			${enemyStr} Str
		</div>



		<div class="div3">
			<input type="button" value="punch"
				onclick="attack(playerhp, playerstr, displayphp, enemyhp, enemystr, displayehp)">
		</div>


		<div class="div2">
			<h3>Player stats</h3>
			<br> ${playerName}<br> <span id="playerhp"></span> /
			${playerHp} hp <br> ${playerStr} Str<br> ${playerCrit} Crit<br>
			${playerDodge} Dodge<br>
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

	function attack(playerhp, playerstr, displayphp, enemyhp, enemystr,
			displayehp) {
		displayphp.innerHTML = playerhp - enemystr;
		displayehp.innerHTML = enemyhp - playerstr;
		playerhp = playerhp - enemystr;
		enemyhp = enemyhp - playerstr;
	
	return enemyhp, playerhp, displayphp, displayehp;
	}
</script>
</html>