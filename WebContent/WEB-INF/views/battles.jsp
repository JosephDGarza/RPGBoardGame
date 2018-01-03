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

<!-- -->

.health{
background-image:url("http://www.symbols.com/gi.php?type=1&id=2201");
background-size: 500px 60px;
background-repeat: no-repeat;
}



.bargraph {
	text-align: left;
    list-style: none;
    width:250px;
    border-style: solid;
    }

ul.bargraph li {
    height: 35px;
    color: blue;
    text-align: left;
    font-style: italic;
    font-weight:bolder;
    font-size: 17px;
    line-height: 35px;
   
    margin-bottom: 5px;
   
   
    }

ul.bargraph li.reddeep {

background: #ED1C24;
width:100%;
}

ul.bargraph li.greenbright {

background: #36B669;
}
 



<!-- -->
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Battle</title>

</head>
<body>
<div class="image">
${imgurl}
</div>
	<div>
	
	
	<input type="hidden" id="id" name="id" value="${id}">
<input type="hidden" id="imgurl" name="imgurl" value="${imgurl}">
<input type="hidden" id="name" name="name" value="${name}">
<input type="hidden" id="str" name="str" value="${str}">
<input type="hidden" id="hp" name="hp" value="${hp}">
<input type="hidden" id="currentHp" name="currentHp" value="${currentHp}">





		<div class="div1">
			<h3>Enemy stats</h3>
			<ul class="bargraph"><br> 
			${name}'s Hp<span id="ebar"></span><span id="enemyhp"></span>
			${str} Str
			</ul>
					
		</div>

<div class="div2">
			<h3>Player stats</h3>
			<ul class="bargraph"><br> 
			${playerName}'s  hp <span id="pbar"></span> <span id="playerhp"></span> 
			</li> ${playerStr} Str<br> ${playerCrit} Crit<br>
			${playerDodge} Dodge<br>
			</ul>
		</div>

		<div class="div3">
			<input type="button" value="punch"
				onclick="attack(playerhp, playerstr, displayphp, enemyhp, enemystr, displayehp)">

			<h2 id="result"></h2>
			<form action="boards" method="POST">
			<input type="hidden" id="playerName" name="playerName" value="${playerName}">
<input type="hidden" id="playerCurrentHp" name="playerCurrentHp">
<input type="hidden" id="playerHp" name="playerHp" value="${playerHp}">
<input type="hidden" id="playerStr" name="playerStr">
<input type="hidden" id="playerCrit" name="playerCrit" value="${playerCrit}">
<input type="hidden" id="playerDodge" name="playerDodge" value="${playerDodge}">
<input type="hidden" id="diceroll" name="diceroll">
			<span id ="continue"></span>
			</form>
<div class="info_header">
			<p id="CombatLog"></p>
		</div>
		</div>		
	</div>
	
	
	
	
	


<!-- 
<ul class="bargraph">
    <li class="reddeep">XHTML / CSS</li>
    <li class="greenbright" style="width: 80%;">Javascript</li>
</ul>

  -->




	<input type="hidden" id="pCrit" name="pCrit" value="${playerCrit}">
	<input type="hidden" id="dice" name="dice" value="${diceroll}">
	<input type="hidden" id="pname" name="pname" value="${playerName}">
	<input type="hidden" id="php" name="php" value="${playerCurrentHp}">
	<input type="hidden" id="pmaxhp" name="pmaxhp" value="${playerHp}">
	<input type="hidden" id="pstr" name="pstr" value="${playerStr}">
	<input type="hidden" id="pdodge" name="pdodge" value="${playerDodge}">

	<input type="hidden" id="ename" name="ename" value="${name}">
	<input type="hidden" id="ehp" name="ehp" value="${currentHp}">
	<input type="hidden" id="emaxhp" name="emaxhp" value="${hp}">
	<input type="hidden" id="estr" name="estr" value="${str}">
	<input type="hidden" id="eattack" name="eattack" value="${attack}">
	<input type="hidden" id="emiss" name="emiss" value="${miss}">
	<input type="hidden" id="emissScript" name="emissScript" value="${missScript}">
	



</body>

<script type="text/javascript">
	var pcrit = document.getElementById("pCrit").value;
	var pdodge = document.getElementById("pdodge").value;
	var diceroll = document.getElementById("dice").value;
	var pbar = 0;
	var displaypbar = document.getElementById("pbar");
	var pmaxhp = document.getElementById("pmaxhp").value
	var playername = document.getElementById("pname").value;
	var playerhp = document.getElementById("php").value;
	var playerstr = document.getElementById("pstr").value;
	var displayphp = document.getElementById("playerhp");
	pbar = "<li class=\"greenbright\" style=\"width: " + (playerhp/pmaxhp)*100 + "%;\">" +playerhp + "/" + pmaxhp + "</li>";
	<!--displayphp.innerHTML = playerhp;-->
	displaypbar.innerHTML = pbar;
	
	var emissScript = document.getElementById("emissScript").value;
	var emiss = document.getElementById("emiss").value;
	var eattack = document.getElementById("eattack").value;
	var ebar = 0;
	var displayebar = document.getElementById("ebar");
	var emaxhp = document.getElementById("emaxhp").value
	var enemyname = document.getElementById("ename").value;
	var enemyhp = document.getElementById("ehp").value;
	var enemystr = document.getElementById("estr").value;
	var displayehp = document.getElementById("enemyhp");
	ebar = "<li class=\"reddeep\" style=\"width: " + (enemyhp/emaxhp)*100 + "%;\">" +enemyhp + "/" + emaxhp + "</li>";
	<!-- displayehp.innerHTML = enemyhp; -->
	displayebar.innerHTML = ebar;
	
	var elog= "";
	
	function attack() {
		if (playerhp > 0) {
			if (enemyhp > 0) {
			var plog= "";
			 var crit = Math.floor((Math.random() * 100) + 1);
			 if(crit <= pcrit){
			plog = "You critically hit "+ enemyname +" for " + playerstr*2 + " damage!!! <br>";
			document.getElementById("CombatLog").innerHTML += plog
			enemyhp = enemyhp - playerstr*2;
						 }
						 
						 if (crit > pcrit){
						 plog = "You hit "+ enemyname +" for " + playerstr + " damage <br>";
							document.getElementById("CombatLog").innerHTML += plog
							enemyhp = enemyhp - playerstr;
						 }
			
			
			
				if (enemyhp <= 0) {
				
				if(enemyname == "Heal"){
			playerhp = playerhp*1 + 50;
				document.getElementById("CombatLog").innerHTML= "you have been healed for 50 health!"
			}
			if(enemyname == "Strength Bonus"){
			playerstr = playerstr*1 +1;
				document.getElementById("CombatLog").innerHTML = "you have gained 1 str"
			
			}
			if(enemyname == "Time to go back some squares!"){
			 var y = Math.floor((Math.random() * 4) + 1)
			diceroll = diceroll*1 - y;
			document.getElementById("CombatLog").innerHTML = "you were sent back " + y + " spaces to roll again";
			
			}
					<!-- displayehp.innerHTML = 0; -->
					ebar = "<li class=\"reddeep\" style=\"width: 0%;\">" + "0" + "/" + emaxhp + "</li>";
					displayebar.innerHTML = ebar;
					var win = "You have won!";
					var next = "<input type=\"submit\" value=\"Continue Forward\">";
					document.getElementById("playerCurrentHp").value = playerhp;
					document.getElementById("playerStr").value = playerstr;
					document.getElementById("result").innerHTML = win;
					document.getElementById("continue").innerHTML = next;
					document.getElementById("diceroll").value = diceroll;
				} 
				
				
				else {
			
				 
				 var x = Math.floor((Math.random() * 100) + 1);
					
				 	ebar = "<li class=\"reddeep\" style=\"width: " + (enemyhp/emaxhp*100) + "%;\">" +enemyhp + "/" + emaxhp + "</li>";
				displayebar.innerHTML = ebar;
					<!-- displayehp.innerHTML = enemyhp - playerstr; -->
						
						 console.log("this is x " +x );
						 console.log(x <= emiss*1 + pdodge*1);
						 if(x <= emiss*1 + pdodge*1){
						 elog = emissScript + "<br><br>";
					document.getElementById("CombatLog").innerHTML += elog;
						 }
						 if (x > emiss*1 + pdodge*1){
						 
						 
					playerhp = playerhp - enemystr;
					pbar = "<li class=\"greenbright\" style=\"width: " + (playerhp/pmaxhp)*100 + "%;\">" +playerhp + "/" + pmaxhp + "</li>";
					document.getElementById("pbar").innerHTML = pbar;
					console.log(pbar);
					console.log(playerhp/pmaxhp);
					elog = eattack + enemystr + " damage<br><br>";
					document.getElementById("CombatLog").innerHTML += elog;
					<!--displayphp.innerHTML = playerhp;-->
					displaypbar.innerHTML = pbar;
					
					
					
					if (playerhp < 1) {
					<!-- displayphp.innerHTML = 0; -->
					pbar = "<li class=\"greenbright\" style=\"width: 0%;\">" + "0" + "/" + pmaxhp + "</li>";
					document.getElementById("pbar").innerHTML = pbar;
						var death = "You have died";

						document.getElementById("result").innerHTML = death;
					}
				}
				
			
					
				console.log(displayphp.innerHTML);

				
			
				console.log(playerhp);
				}
			}
		}

	}
</script>
</html>