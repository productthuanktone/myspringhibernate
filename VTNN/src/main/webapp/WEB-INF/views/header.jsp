<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link rel="stylesheet" href='<c:url value="resources/Style/style.css"/>' />
<link rel="stylesheet"
	href='<c:url value="resources/Style/animate.css"/>' />
<link rel="stylesheet"href='<c:url value="resources/bootstrap-4.0.0-dist/css/bootstrap.min.css" />' />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div id="header" class="container-fluid ">
		<nav class="navbar navbar-expand-sm bg-dark navbar-dark"> <!-- Brand/logo -->
		<a class="navbar-brand" href="#">Logo</a> <!-- Links -->
		<ul class="navbar-nav">
			<li class="nav-item"><a class="btn btn-primary btn-lg"
				href="nhanvien" role="button" id="btnnhanvien">NHÂN VIÊN</a></li>
			<li class="nav-item">
			<a class="btn btn-primary btn-lg" href=""
				role="button">Khách Hàng</a></li>
			<li class="nav-item"><a class="btn btn-primary btn-lg" href="quanly"
				role="button">Đăng Nhập</a></li>
		</ul>
		</nav>
		<div class=" event_header container wow tada">
			<span>Ngày 3/7/2018-3/10/2018</span><br /> <span
				style="font-size: 50px">Mua 1 tặng 1 </span><br>
			<button>XEM NGAY</button>
		</div>

	</div>
	<div id="info" class="container">
		<div class="row">
			<div class="col-12 col-sm-4 col-md-4 wow slideInLeft "
				data-wow-duration="2s">
				<img class="iconcl" alt="icon_oval"
					src='<c:url value="/resources/image/icon_chatluong.jpg"/>' /> <br>
				<span class="textcl">CHẤT LƯỢNG</span><br> <span
					class="textcln">Chúng tôi cam kết sẻ mang lại cho bạn sản
					phẩm tốt nhất.</span>
			</div>
			<div class="col-12 col-sm-4  col-md-4 wow tada "
				data-wow-duration="
				2s">
				<img class="iconcl" alt="icon_oval"
					src='<c:url value="/resources/image/icon_tietkien.jpg"/>' /> <br>
				<span class="textcl">TIẾT KIỆM CHI PHÍ</span><br> <span
					class="textcln">Sản phẩm giá tốt nhất. Tiết kiệm chi phí vận
					chuyển.</span>
			</div>
			<div class="col-12 col-sm-4 col-md-4 wow slideInRight "
				data-wow-duration="1s">
				<img class="iconcl" alt="icon_oval"
					src='<c:url value="/resources/image/icon_vanchuyen.png"/>' /> <br>
				<span class="textcl">VẬN CHUYỂN</span><br> <span
					class="textcln">Cam kết giao hàng tận nơi. Vận chuyển nhanh.</span>
			</div>
		</div>
	</div>