<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
					<li><a class="nav-link"
						href="<%=request.getContextPath()%>/dashboardlist">Dashboard</a></li>
					<li><a class="active"
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
							<li><a href="profile.html"><i
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
	
	<div class="container col-md-5">
		<div class="card">
			<div class="card-body">
				<c:if test="${collectPaddy != null}">
					<form action="update" method="post">
				</c:if>
				<c:if test="${collectPaddy == null}">
					<form action="insert" method="post">
				</c:if>
				<caption>
					<h2>
						<c:if test="${collectPaddy != null}">
            			Edit Paddy
            		</c:if>
						<c:if test="${collectPaddy == null}">
            			Add New Paddy Collection
            		</c:if>
					</h2>
				</caption>

				<c:if test="${collectPaddy != null}">
					<input type="hidden" name="collected_paddy_details_Id" value="<c:out value='${collectPaddy.collected_paddy_details_Id}' />" />
				</c:if>
				<fieldset class="form-group">
					<label>Farmer Id</label> <input type="text"
						value="<c:out value='${collectPaddy.farmer_Id}' />" class="form-control"
						name="farmer_Id" required="required">
				</fieldset>

				<fieldset class="form-group">
					<label>Paddy Id</label> <input type="text"
						value="<c:out value='${collectPaddy.paddy_Id}' />" class="form-control"
						name="paddy_Id">
				</fieldset>
				
				<fieldset class="form-group">
					<label>Total Weight</label> <input type="text"
						value="<c:out value='${collectPaddy.total_weight}' />" class="form-control"
						name="total_weight">
				</fieldset>

				<button type="submit" style="margin:1rem;" class="btn btn-success">Save</button>
				</form>
			
			</div>
		</div>
	</div>
	
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