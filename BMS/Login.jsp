<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!doctype html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<!--BOOTSTRAP-->
<link rel="stylesheet" href="bootstrap_main.css">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

</head>

<style>
body {
	background-color: #eaf7f9;
	margin-left: 0;

	padding: 0;
}

header {
	padding: 0.3em;
	color: white;
	background-color:#4e91f5;
	clear: left;
	text-align: center;
	max-width: 100%;
	
}

footer {
	position: fixed;
	color: white;
	background-color: #4e91f5;
	clear: both;
	text-align: center;
	bottom: 0;
	padding: 0.4em;
	width: 100%;
margin-right: 0px;

          margin-bottom: 0px;

          margin-left: 0px;

          padding-right: 0px;

          padding-bottom: 0px;

          padding-left: 0px;
}

img {
	max-width: 100%;
}

.borderless td, .borderless th {
	border: none;
}
/* Animations */
.animate {
	-webkit-animation: animatezoom 0.6s;
	animation: animatezoom 0.6s;
}

@
-webkit-keyframes animatezoom {
	from {-webkit-transform: scale(0)
}

to {
	-webkit-transform: scale(1)
}

}
@
keyframes animatezoom {
	from {transform: scale(0)
}

to {
	transform: scale(1)
}
}
</style>

<!--..........................Script for show password on mouse hover...........................................-->
<!-- <script>
	function validate() {
		var user = document.getElementById('username').value;
		var pass = document.getElementById('password').value;
		if (user == '' && pass == '')
			return;
		if (user == 'admin' && pass == 'admin')
			alert("You are successfully logged In!!!!");
		else
			alert("Incorrect Username and Password");
	}
</script> -->
<!--.....................On Mouse Hover Password Object Type is converted to Text Object Type.....................-->


<!--.................................................PAGE HEADER.......................................-->
<header>
 	<img class="img-responsive" src="galogo.png" width="65px" height="10px"
		align="left" />
	<h2>GArib Bank</h2>
</header>

<!--................................................MAIN BODY...................................................-->
<body>
	<br />
	<div class="container-fluid">
		<div class="row">
			<br>
			<br>
			<br>

		</div>
		<div class="row">

			<div class="col-sm-5">
			<img class="img-responsive" src="ga_logo.png" width="800px" height="200px"/>
			<br>
			<h2 align="center"><b>GITESH & ABHISHEK</b></h2>
			</div>
			
			<div class="col-sm-6">
			<br>
				<form action="LoginServlet" class="form-horizontal animate" method="POST"
					id="form1">
					<div class="table-responsive">
						<table class="table borderless">
							<!--.....................................FILL DETAILS FOR LOGGING IN..................................................-->
							<tr>
								<td><h4>Username</h4></td>
								<td><input type="text" class="form-control" name="username"
									placeholder="Enter Username" id="username" required></td>
							</tr>
							<tr>
								<td><h4>Password</h4></td>
								<td><input type="password" class="form-control"
									name="password" id="password" placeholder="Enter Password" required></td>

							</tr>
							<tr>
								
								<td><br><input  type="submit" value="LOGIN"
									class="btn btn-success" onclick="validate();"></td>

								<!--Link For FORGOT PASSWORD-->
								<td><br><a href="Forgot.html"><h5>Forgot Password?</h5></a></td>

							</tr>
						</table>
					</div>
				</form>



				<!--Link For USER REGISTRATION-->
				<h2 class="animate">Create New Account ?</h2>
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a
					href="register.php"><button type="submit"
						class="btn btn-primary animate">
						<span class="glyphicon glyphicon-user"></span> CREATE
					</button></a>




			</div>
		</div>
		</div>
		
</body>

<footer>
	<p>
		<strong>© - Powered by Lalits&Kumars (Yamaha Motor Solutions India Private Ltd.)</strong>
	</p>
</footer>

</html>