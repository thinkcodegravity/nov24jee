test();
function test(){
	var a = 10;
	var b = false;
	var c = 10.0;
	var d = ['a', 'b'];
	var e = "hello";
	var address = {
		city: "newyork",
		state: "ny",
		zip: 123
	};
	var student = {
		name: "john",
		age: 10,
		address: {
			city: "ny",
			zip: 123
		}
	};
	try {
		var i = 0;
		console.log("1");
	} 
	catch (error){
		console.log("2");
	} 
	finally {
		console.log("3");
	}
		for (var j = 0; j < 5; j++) {
		console.log("hi:" + j);
	}

	var i = 0;
	if (i == 0) {
		console.log("i is zero");
	} else {
		console.log("i is non zero");
	}

	while (i < 2) {
		console.log("hello:" + i);
		i++;
	}
	for(var j=0;j<3;j++)
	{
		console.log("for :"+j);
	}	

}

function checkIfEmpty() {
	var emailElement=document.getElementById("emailTextBox");
	//var emailElement=$("#emailTextBox").val();
	if (emailElement.value == "") {
		alert("empty email id")
		document.getElementById("logo").style = "background:red";
		//$("#logo").css("background", "white");
	}
	else if (emailElement.value.indexOf("@") == -1) {
		alert("invalid email id")
	}
}

function checkUser() {
	var checkUserAjaxObj = {
		url: 'http://localhost/doesUserExist',
		type: 'post',
		data: {
			eid: $("#emailTextBoxReg").val()
		},
		context: this,
		success: function(data) {
			if (data == "true")
				alert("userid already taken");
		},
		error: function(data) {
			console.log("failure");
		}
	};
	$.ajax(checkUserAjaxObj);
}
$(document).ready(function() {
	$("#emailTextBoxReg").blur(checkUser);
	/*
	$("#passwordTextBox").click(checkIfEmptyJquery);
	$("#logo").mouseenter(changeLogo);
	$("#logo").mouseleave(function() {
		document.getElementById("logo").style = "background:grey";
	}
	);
	*/
});
