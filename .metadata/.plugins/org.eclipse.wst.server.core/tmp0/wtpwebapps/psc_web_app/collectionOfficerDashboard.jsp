<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8" />
<meta content="width=device-width, initial-scale=1.0" name="viewport" />

<title>Paddy Storage Cooperation</title>
<meta content="" name="description" />
<meta content="" name="keywords" />

<!-- Google Fonts -->
<link
	href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i"
	rel="stylesheet" />

<!-- Vendor CSS Files -->
<link
	href="CollectionOfficerAssets/vendor/bootstrap/css/bootstrap.min.css"
	rel="stylesheet" />
<link
	href="CollectionOfficerAssets/vendor/bootstrap-icons/bootstrap-icons.css"
	rel="stylesheet" />
<link
	href="CollectionOfficerAssets/vendor/aos/aos.css"
	rel="stylesheet" />
<link
	href="CollectionOfficerAssets/vendor/remixicon/remixicon.css"
	rel="stylesheet" />
<link
	href="CollectionOfficerAssets/vendor/swiper/swiper-bundle.min.css"
	rel="stylesheet" />
<link
	href="CollectionOfficerAssets/vendor/glightbox/css/glightbox.min.css"
	rel="stylesheet" />
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />

<!-- Bootstrap Icons -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">

<!-- Template Main CSS File -->
<link
	href="CollectionOfficerAssets/css/style.css"
	rel="stylesheet" />

<!-- =======================================================
  * Template Name: FlexStart - v1.7.0
  * Template URL: https://bootstrapmade.com/flexstart-bootstrap-startup-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>
<body>
	<%
	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	if (session.getAttribute("collection_officer_Email") == null) {
		response.sendRedirect("userLogin.jsp");
	}
	%>
	<!-- ======= Header ======= -->
	<header id="header" class="header fixed-top">
		<div
			class="
          container-fluid container-xl
          d-flex
          align-items-center
          justify-content-between
        ">
			<a href="dashboard.html" class="logo d-flex align-items-center">
				<!-- <img src="assets/img/logo.png" alt="" /> --> <img
				style="width: 30px;" src="CollectionOfficerAssets/img/logo_final.png" alt=""> <span
				style="font-size: 1.2rem">PADDY STORAGE COOPERATION</span>
			</a>

			<nav id="navbar" class="navbar">
				<ul>
					<li><a class="active"
						href="<%=request.getContextPath()%>/dashboardlist">Dashboard</a></li>
					<li><a class="nav-link"
						href="<%=request.getContextPath()%>/list">Collect Paddy</a></li>				
					<li><a class="nav-link "
						href="<%=request.getContextPath()%>/pricelist">Paddy
							Pricing</a></li>
					<li><a class="nav-link "
						href="<%=request.getContextPath()%>/farmerslist">Farmers</a>
					</li>
					
					<li class="dropdown"><a class="getstarted scrollto"
						href="#about"><span>Collection Officer</span> <i
							class="bi bi-chevron-down"></i></a>
						<ul>
							<li><a href="<%=request.getContextPath()%>/list"><i
									style="font-size: 1.1rem; margin-left: 38px"
									class="bi bi-person-lines-fill"><span> Profile</span></i></a></li>
							<li>
								<form action="logout">
									<div align="center">
										<button type="submit" style="margin-left:3rem;" class="btn bg-transparent logout">
											<i style="font-size: 1.1rem;" class="bi bi-box-arrow-right"><span>
													Logout</span></i>
										</button>
									</div>
								</form>
							</li>
						</ul></li>
				</ul>
				<i class="bi bi-list mobile-nav-toggle"></i>
			</nav>
			<!-- .navbar -->
		</div>
	</header>

	<!-- ======= Counts Section ======= -->

	<div class="container">
		<div class="row">
			<div class="">
				<!-- ======= Counts Section ======= -->
				<section id="counts" class="counts">
					<div class="container" data-aos="fade-up">
						<div class="row gy-4">
						 <div class="col-lg-3 col-md-6">
          <div class="count-box">
            <i class="fas fa-tractor" style="color: #15be56"></i>
            <div>
              <span>28,046kg</span>
              <p>Daily Paddy Count</p>
            </div>
          </div>
        </div>
       

        <div class="col-lg-3 col-md-6">
          <div class="count-box">
            <i class="fas fa-warehouse" style="color:darkcyan"></i>
            <div>
              <span>50,000kg</span>
              <p>Allocated Capacity</p>
            </div>
          </div>
        </div>
        <div class="col-lg-3 col-md-6">
          <div class="count-box">
            <i class="bi bi-bank" style="color: #690986;"></i>
            <div>
              <span>Rs.2M</span>
              <p>Allocated Amount</p>
            </div>
          </div>
        </div>
        <div class="col-lg-3 col-md-6">
          <div class="count-box">
            <i class="fas fa-balance-scale-right" style="color: #ee6c20"></i>

            <div>
              <span>Rs.800,000</span>
              <p>Current Account Balance</p>
            </div>
          </div>
        </div>
						</div>
					</div>
				</section>
			</div>
		</div>
	</div>

	<!-- End Counts Section -->

	<section data-aos="fade-up" data-aos-delay="200"
		style="margin-top: -5rem">
		<div class="container-xl">
			<!-- <div class="col-sm-8">
				<a
					href="http://localhost:8080/plc-web-application-login/paddyCollection.jsp"
					style="margin: 1rem" class="btn btn-secondary">View All Paddy
					Collections</a>
			</div> -->
			<div class="table-responsive" style="margin-top: 1px">
				<div class="table-wrapper">
					<div class="table-title">
						<div class="row">
							<div class="col-sm-4">
								<h2>Daily Paddy Purchases</h2>
							</div>

						</div>
					</div>
					<div class="scrollmenu">
						<table class="table table-striped table-hover">
							<thead>
								<tr>
									<!-- <th scope="col" style="width: 10%">Id</th>
							 		<th scope="col">Farmer Name</th>
									<th scope="col">Paddy Type</th> -->
									<th scope="col">Id</th>
									<th scope="col">Farmer Name</th>
									<th scope="col">Paddy Type</th>
									<th scope="col">Buying Price (Rs/1kg)</th>
									<th scope="col">Total Weight (In Kg)</th>
									<th scope="col">Total Amount</th>
									<th scope="col">Purchase Date</th>
						   								
								</tr>
							</thead>
							<tbody>
								<c:forEach var="collectPaddy"
									items="${listDashboard}">
									<tr>
										<td><c:out value="${collectPaddy.collected_paddy_details_Id}" /></td>
										<td><c:out value="${collectPaddy.farmer_Name}" /></td>
										<td><c:out value="${collectPaddy.paddy_Type}" /></td> 
										<td><c:out value="Rs.${collectPaddy.buying_price_per_Kg}" /></td>
										<td><c:out value="${collectPaddy.total_weight}kg" /></td>
										<td><c:out value="Rs.${collectPaddy.total_amount}" /></td>
										<td><c:out value="${collectPaddy.purchase_date}" /></td>
								
														
									</tr>
								</c:forEach>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</section>

	<a href="#"
		class="back-to-top d-flex align-items-center justify-content-center"><i
		class="bi bi-arrow-up-short"></i> </a>

	<!-- Vendor JS Files -->
	<script
		src="CollectionOfficerAssets/vendor/bootstrap/js/bootstrap.bundle.js"></script>
	<script
		src="CollectionOfficerAssets/vendor/aos/aos.js"></script>
	<script
		src="CollectionOfficerAssets/vendor/php-email-form/validate.js"></script>
	<script
		src="CollectionOfficerAssets/vendor/swiper/swiper-bundle.min.js"></script>
	<script
		src="CollectionOfficerAssets/vendor/purecounter/purecounter.js"></script>
	<script
		src="CollectionOfficerAssets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
	<script
		src="CollectionOfficerAssets/vendor/glightbox/js/glightbox.min.js"></script>

	<!-- Template Main JS File -->
	<script
		src="CollectionOfficerAssets/js/main.js"></script>
</body>
</html>