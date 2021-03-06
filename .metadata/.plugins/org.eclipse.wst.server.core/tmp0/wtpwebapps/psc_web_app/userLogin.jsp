<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>User Login</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.bundle.min.js">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js">
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet">

<!-- Custom StyleSheet -->
<link rel="stylesheet"
	href="LoginAssets/LoginCSS.css" />
</head>
<body>
	<div class="container-fluid px-1 px-md-5 px-lg-1 px-xl-5 py-5 mx-auto">
		<div class="card card0 border-0">
			<div class="row d-flex">
				<div class="col-lg-6">
					<div class="card1 pb-5">
						<div class="row">
							<img
								src="LoginAssets/LoginImages/PSC_Logo.png"
								class="logo">
						</div>
						<div class="row px-3 justify-content-center mt-4 mb-5 border-line">
							<img
								src="LoginAssets/LoginImages/paddy1.jpg"
								class="image">
						</div>
					</div>
				</div>
				<div class="col-lg-6">
					<div class="card2 card border-0 px-4 py-5">

						<div class="row px-3 mb-4"></div>
						<form action="login" method="post" target="_blank">
							<div class="row px-3">
								<label class="mb-1">
									<h6 class="mb-0 text-sm">Email</h6>
								</label> <input class="mb-4" type="text" name="collection_officer_Email"
									placeholder="Enter a valid email address">
							</div>
							<div class="row px-3">
								<label class="mb-1">
									<h6 class="mb-0 text-sm">Password</h6>
								</label> <input type="password" name="collection_officer_Password"
									placeholder="Enter password">
							</div>
							<div class="row px-3 mb-4">
								<div
									class="custom-control custom-checkbox custom-control-inline">
									<input id="chk1" type="checkbox" name="chk"
										class="custom-control-input"> <label for="chk1"
										class="custom-control-label text-sm">Remember me</label>
								</div>
								<a href="#" class="ml-auto mb-0 text-sm">Forgot Password?</a>
							</div>
							<div class="row mb-3 px-3">
								<button type="submit" class="btn btn-blue text-center">Login</button>
							</div>
						</form>
						<div class="row mb-4 px-3">
							<small class="font-weight-bold">Don't have an account? <a
								class="text-danger ">Register</a></small>
						</div>
					</div>
				</div>
			</div>
			<div class="bg-blue py-3">
				<div class="row px-3" style="margin-left: 31%;">
					<small class="ml-4 ml-sm-5 mb-2">Copyright &copy; 2021
						Paddy Storage Cooperation. All rights reserved.</small>

				</div>
			</div>
		</div>
	</div>
</body>
</html>