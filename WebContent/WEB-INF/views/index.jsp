<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="resources/index.css" type="text/css" rel="stylesheet">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>


<div class="transbox">
<h1>Character Creation</h1>
<p> You may spend up to 10 points to increase your characters stats. These stats will also determine how your character levels up. So choose wisely.<br>
By default your character starts with:<br><br>
HP 100 <br><br>
Str 3 <br><br>
Crit 2% <br><br>
Dodge 2% </p>
<h3>Select Your Character:</h3>
<input type="radio" id="btnControl" name="character" value="warrior"/>
<label class="btn" for="btnControl"><img src="https://orig00.deviantart.net/851f/f/2013/321/0/8/redeemed_riven_transparent_background_by_77silentcrow-d6uocse.png" width="108" height="150" id="btnLeft" /></label>
<div class="reveal-if-active">
  <h3 class="green">Warrior:</h3> The warrior class gains a chance of dealing up to 8 more damage on attack (this is an invisible RNG stat. It won't reflect on your stats).
</div>

 <div>
<input type="radio" id="btnControl2" name="character" value="ninja"/>
<label class="btn" for="btnControl2"><img src="https://vignette.wikia.nocookie.net/deadliestfiction/images/6/6c/Ryu_Hayabusa_Transparent_Background.png/revision/latest?cb=20130730002718" width="102" height="150" id="btnLeft" /></label>



      <div class="reveal-if-active">
       <h3 class="green">Ninja:</h3> The ninja class strikes with lethal precision and is very agile. Ninja's gain an addition 4% crit and 4% dodge
            </div>
    </div>
    
<form onsubmit="myFunction();"action="boards" method="POST">
<h3>You have: <span id= "points"> </span> points left to spend</h3>
<h1 class="red"><span id="test"></span></h1>
<input type="text" id="name" name="playerName" placeholder="Hero name" aria-label="Hero name" oninput="characterName()" required>
<div class="slidecontainer">
${hp}<br>
<input type="range" class="slider" id="myRange" name="hp" min = "0" max ="10" value="0">
<h4>HP:<span id="demo"></span></h4>

${str}<br>
<input type="range" class="slider" id="myRange1" name="str" min = "0" max ="10" value="0">
<h4>Str:<span id="demo1"></span></h4>

${crit} <br>
<input type="range" class="slider" id="myRange2" name="crit" min = "0" max ="10" value="0">
<h4>Crit:<span id="demo2"></span>%</h4> 

 ${dodge}<br>
<input type="range" class="slider" id="myRange3" name="dodge" min = "0" max ="10" value="0">
<div><h4>Dodge:<span id="demo3"></span>%</h4></div>

</div>



<h2>Summary of your character:</h2>
<span id="cname">Character name</span><br><br>
	HP <span id="hp"></span><br><br>
	Str <span id="str"></span><br><br>
	Crit <span id="crit"></span>%<br><br>
	Dodge <span id="dodge"></span>%<br><br>
<input type="submit" value="Create Character">
<p id="demo"></p>

<input type="hidden" id="playerCurrentHp" name="playerCurrentHp">
<input type="hidden" id="playerHp" name="playerHp">
<input type="hidden" id="playerStr" name="playerStr">
<input type="hidden" id="playerCrit" name="playerCrit">
<input type="hidden" id="playerDodge" name="playerDodge">
<input type="hidden" id="tile" name="tile" value="0">
<input type="hidden" id="diceroll" name="diceroll" value="0">
<input type="hidden" id="rollCount" name="rollCount" value="0">
</form>

</div>

</body>
<script>
function characterName() {
var name = document.getElementById("name").value;
document.getElementById("cname").innerHTML = "Character name: " + name;
}





var points = document.getElementById("points");

var hpslider = document.getElementById("myRange");
var hpoutput = document.getElementById("demo");
var strslider = document.getElementById("myRange1");
var stroutput = document.getElementById("demo1");
var critslider = document.getElementById("myRange2");
var critoutput = document.getElementById("demo2");
var dodgeslider = document.getElementById("myRange3");
var dodgeoutput = document.getElementById("demo3");
var hp =  document.getElementById("hp");
var str =  document.getElementById("str");
var crit =  document.getElementById("crit");
var dodge =  document.getElementById("dodge");


points = 10 /* - hpslider.value - strslider.value - critslider.value - dodgeslider.value; */
hpoutput.innerHTML = hpslider.value;
stroutput.innerHTML = strslider.value;
critoutput.innerHTML= critslider.value;
dodgeoutput.innerHTML = dodgeslider.value;
hp.innerHTML = hpslider.value * 25 + 100;
str.innerHTML = strslider.value*1 + 3;
crit.innerHTML = critslider.value*1 + 2;
dodge.innerHTML = dodgeslider.value*1 + 2;

var php = hpslider.value * 25 + 100;
var pct = critslider.value*1 + 2;
var pstr =  strslider.value*1 + 3;
var pdodge = dodgeslider.value*1 + 2;

var ten = 10*1 -hpslider.value*1 -strslider.value*1 -critslider.value*1 -dodgeslider.value*1;
document.getElementById("points").innerHTML = ten;
hpslider.oninput = function() {
hpoutput.innerHTML = this.value;
hp.innerHTML = this.value * 25 + 100;
php = this.value * 25 + 100;
document.getElementById("points").innerHTML = ten*1 -hpslider.value*1 -strslider.value*1 -critslider.value*1 -dodgeslider.value*1;
if (hpslider.value*1 +strslider.value*1 +critslider.value*1 +dodgeslider.value*1 > 10){

var test = "You've spent too many points!";
document.getElementById("test").innerHTML= test;

}
else{ test = "";
document.getElementById("test").innerHTML= test;}
}

strslider.oninput = function() {
stroutput.innerHTML = this.value;
str.innerHTML = this.value *1 + 3;
pstr = this.value *1 + 3;
document.getElementById("points").innerHTML = ten*1 -hpslider.value*1 -strslider.value*1 -critslider.value*1 -dodgeslider.value*1;
if (hpslider.value*1 +strslider.value*1 +critslider.value*1 +dodgeslider.value*1 > 10){
var test = "You've spent too many points!";
document.getElementById("test").innerHTML= test;
}
else{ test = "";
document.getElementById("test").innerHTML= test;}

}
critslider.oninput = function() {
  critoutput.innerHTML = this.value;
  crit.innerHTML = this.value *1 + 2;
  pct = this.value *1 + 2;
document.getElementById("points").innerHTML = ten*1 -hpslider.value*1 -strslider.value*1 -critslider.value*1 -dodgeslider.value*1;
if (hpslider.value*1 +strslider.value*1 +critslider.value*1 +dodgeslider.value*1 > 10){
var test = "You've spent too many points!";
document.getElementById("test").innerHTML= test;
}
else{ test = "";
document.getElementById("test").innerHTML= test;}

}
dodgeslider.oninput = function() {
  dodgeoutput.innerHTML = this.value;
  dodge.innerHTML = this.value *1 + 2;
  pdodge = this.value *1 + 2;
document.getElementById("points").innerHTML = ten*1 -hpslider.value*1 -strslider.value*1 -critslider.value*1 -dodgeslider.value*1;
if (hpslider.value*1 +strslider.value*1 +critslider.value*1 +dodgeslider.value*1 > 10){

var test = "You've spent too many points!";
document.getElementById("test").innerHTML= test;
}
else{ test = "";
document.getElementById("test").innerHTML= test;}
}



function myFunction() {
document.getElementById("playerCurrentHp").value = php;
document.getElementById("playerHp").value = php;
document.getElementById("playerStr").value = pstr;
document.getElementById("playerCrit").value = pct;
document.getElementById("playerDodge").value = pdodge;
console.log("this is hp " + php)
console.log("this is str " + pstr)
console.log("this is crit " + pct)
console.log("this is dodge " + pdodge)


var hpslider = document.getElementById("myRange").value;
var strslider = document.getElementById("myRange1").value;
var critslider = document.getElementById("myRange2").value;
var dodgeslider = document.getElementById("myRange3").value;

if (hpslider*1 + strslider*1 + critslider*1  + dodgeslider*1  > 10 || hpslider*1 + strslider*1 + critslider*1  + dodgeslider*1 < 10) {

var check = hpslider*1 + strslider*1 + critslider*1  + dodgeslider*1;

alert ("You must spend ONLY 10 points. No less or more. You have spent: " + check);
	event.preventDefault();
    returnToPreviousPage();
    return false;
  }

  alert("Character created!");
  return true;
}




</script>

</html>