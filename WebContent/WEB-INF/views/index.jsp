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
<p>100 hp</p>
<p>3 str</p>
<p>2% crit</p>
<p>2% dodge</p>
<br>
<div class="slidecontainer">
<input type="range" class="slider" id="myRange" name="hp" min = "0" max ="10" value="0">
<p>hp: <span id="demo"></span></p>
${hp}<br>
<input type="range" class="slider" id="myRange1" name="str" min = "0" max ="10" value="0">
<p>str: <span id="demo1"></span></p>
${str}<br>
<input type="range" class="slider" id="myRange2" name="crit" min = "0" max ="10" value="0">
<p>crit: <span id="demo2"></span>%</p>
${crit} <br>
<input type="range" class="slider" id="myRange3" name="dodge" min = "0" max ="10" value="0">
<p>dodge: <span id="demo3"></span>%</p>
${dodge}<br>
</div>

<h2>Summary of your character:</h2>
<p>hp <span id="hp"></span></p>
<p>str <span id="str"></span></p>
<p>crit <span id="crit"></span></p>
<p>dodge <span id="dodge"></span></p>
<input type="submit" value="submit">
</body>
<script>
var slider = document.getElementById("myRange");
var output = document.getElementById("demo");
var slider1 = document.getElementById("myRange1");
var output1 = document.getElementById("demo1");
var slider2 = document.getElementById("myRange2");
var output2 = document.getElementById("demo2");
var slider3 = document.getElementById("myRange3");
var output3 = document.getElementById("demo3");
var hp =  document.getElementById("hp");
var str =  document.getElementById("str");
var crit =  document.getElementById("crit");
var dodge =  document.getElementById("dodge");
output.innerHTML = slider.value;
output1.innerHTML = slider1.value;
output2.innerHTML = slider2.value;
output3.innerHTML = slider3.value;
hp.innerHTML = slider.value * 25 + 100;
str.innerHTML = slider1.value + 3;
crit.innerHTML = slider2.value + 2;
dodge.innerHTML = slider3.value + 2;

slider.oninput = function() {
output.innerHTML = this.value;
hp.innerHTML = this.value * 25 + 100;
}

slider1.oninput = function() {
output1.innerHTML = this.value;
str.innerHTML = this.value *1 + 3;
  
}
slider2.oninput = function() {
  output2.innerHTML = this.value;
  crit.innerHTML = this.value *1 + 2;
}
slider3.oninput = function() {
  output3.innerHTML = this.value;
  dodge.innerHTML = this.value *1 + 2;
}





</script>

</html>