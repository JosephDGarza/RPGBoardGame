<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<style>
.slidecontainer {
    width: 100%;
}

.slider {
    -webkit-appearance: none;
    width: 25%;
    height: 25px;
    background: #d3d3d3;
    outline: none;
    opacity: 0.7;
    -webkit-transition: .2s;
    transition: opacity .2s;
}

.slider:hover {
    opacity: 1;
}

.slider::-webkit-slider-thumb {
    -webkit-appearance: none;
    appearance: none;
    width: 25px;
    height: 25px;
    background: #4CAF50;
    cursor: pointer;
}

.slider::-moz-range-thumb {
    width: 25px;
    height: 25px;
    background: #4CAF50;
    cursor: pointer;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h1>this is the home page</h1>
<p> You may spend up to 10 points to increase your characters stats. These stats will also determine how your character levels up. So choose wisely.</p>
<p>By default your character starts with:</p>
<p>HP 100 </p>
<p>Str 3 </p>
<p>Crit 2% </p>
<p>Dodge 2% </p>
<br>
<form onsubmit="myFunction();"action="board" method="POST">
<h3>You have: <span id= "points"> </span> points left to spend</h3>
<input type="text" id="name" name="name" placeholder="Hero name" aria-label="Hero name" oninput="characterName()" required>
<div class="slidecontainer">
${hp}<br>
<input type="range" class="slider" id="myRange" name="hp" min = "0" max ="10" value="0">
<h4>HP:</h4><p><span id="demo"></span></p>

${str}<br>
<input type="range" class="slider" id="myRange1" name="str" min = "0" max ="10" value="0">
<h4>Str:</h4><p><span id="demo1"></span></p>

${crit} <br>
<input type="range" class="slider" id="myRange2" name="crit" min = "0" max ="10" value="0">
<h4>Crit:</h4> <p><span id="demo2"></span>%</p>

 ${dodge}<br>
<input type="range" class="slider" id="myRange3" name="dodge" min = "0" max ="10" value="0">
<div><h4>Dodge:</h4><p><span id="demo3"></span>%</p></div>

</div>



<h2>Summary of your character:</h2>
<p id="cname">Character name</p>

<p>HP <span id="hp"></span></p>
<p>Str <span id="str"></span></p>
<p>Crit <span id="crit"></span>%</p>
<p>Dodge <span id="dodge"></span>%</p>
<input type="submit" value="Create Character">
<p id="demo"></p>
</form>
</body>
<script>
function characterName() {
var name = document.getElementById("name").value;
document.getElementById("cname").innerHTML = "Character name: " + name;
}



var points = document.getElementById("points")

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


points.innerHTML = 10 /* - hpslider.value - strslider.value - critslider.value - dodgeslider.value; */
hpoutput.innerHTML = hpslider.value;
stroutput.innerHTML = strslider.value;
critoutput.innerHTML = critslider.value;
dodgeoutput.innerHTML = dodgeslider.value;
hp.innerHTML = hpslider.value * 25 + 100;
str.innerHTML = strslider.value*1 + 3;
crit.innerHTML = critslider.value*1 + 2;
dodge.innerHTML = dodgeslider.value*1 + 2;


hpslider.oninput = function() {
hpoutput.innerHTML = this.value;
hp.innerHTML = this.value * 25 + 100;
points.innerHTML = 10 - this.value;
}

strslider.oninput = function() {
stroutput.innerHTML = this.value;
str.innerHTML = this.value *1 + 3;
points.innerHTML = 10 - this.value;
}
critslider.oninput = function() {
  critoutput.innerHTML = this.value;
  crit.innerHTML = this.value *1 + 2;
points.innerHTML = 10 - this.value;
}
dodgeslider.oninput = function() {
  dodgeoutput.innerHTML = this.value;
  dodge.innerHTML = this.value *1 + 2;
  points.innerHTML = 10 - this.value;
}

function myFunction() {
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