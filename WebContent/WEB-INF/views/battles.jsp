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
			${name}'s Hp<span id="ebar"></span><span id="enemyhp"></span> / ${hp}
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
	
	
	
	
	


<!-- 
<ul class="bargraph">
    <li class="reddeep">XHTML / CSS</li>
    <li class="greenbright" style="width: 80%;">Javascript</li>
</ul>

  -->






	<input type="hidden" id="pname" name="pname" value="${playerName}">
	<input type="hidden" id="php" name="php" value="${playerCurrentHp}">
	<input type="hidden" id="pmaxhp" name="pmaxhp" value="${playerHp}">
	<input type="hidden" id="pstr" name="pstr" value="${playerStr}">

	<input type="hidden" id="ename" name="ename" value="${name}">
	<input type="hidden" id="ehp" name="ehp" value="${currentHp}">
	<input type="hidden" id="emaxhp" name="emaxhp" value="${hp}">
	<input type="hidden" id="estr" name="estr" value="${str}">




</body>

<script type="text/javascript">
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
	
	
	function attack() {
		if (playerhp > 0) {
			if (enemyhp > 0) {
			
			var plog= "";
			plog += "You hit "+ enemyname +" for " + playerstr + "<br>";
			document.getElementById("CombatLog").innerHTML += plog
			
				if (enemyhp - playerstr <= 0) {
					<!-- displayehp.innerHTML = 0; -->
					ebar = "<li class=\"reddeep\" style=\"width: 0%;\">" + "0" + "/" + emaxhp + "</li>";
					displayebar.innerHTML = ebar;
					var win = "You have won!";
					var next = "<input type=\"submit\" value=\"Continue Forward\">";
					document.getElementById("playerCurrentHp").value = playerhp;
					document.getElementById("result").innerHTML = win;
					document.getElementById("continue").innerHTML = next;
				} 
				
				
				else {
				
				var elog= "";
					
				 	ebar = "<li class=\"reddeep\" style=\"width: " + ((enemyhp - playerstr)/emaxhp*100) + "%;\">" +(enemyhp - playerstr) + "/" + emaxhp + "</li>";
				displayebar.innerHTML = ebar;
					<!-- displayehp.innerHTML = enemyhp - playerstr; -->
					
					playerhp = playerhp - enemystr;
					pbar = "<li class=\"greenbright\" style=\"width: " + (playerhp/pmaxhp)*100 + "%;\">" +playerhp + "/" + pmaxhp + "</li>";
					document.getElementById("pbar").innerHTML = pbar;
					console.log(pbar);
					console.log(playerhp/pmaxhp);
					elog += enemyname + " hit you for " + enemystr + "<br><br>";
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

				enemyhp = enemyhp - playerstr;
			
				console.log(playerhp);
			}
		}

	}
</script>
</html>