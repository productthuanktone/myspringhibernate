<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerQL.jsp"></jsp:include>
<div id="khachhang" class="container">
	<div class="row">
		<div class="list-group quanli col-md-2">
			<a  style="color: white;" class="list-group-item active"> Quản Lí </a> <a
				href="#" class="list-group-item">Nhân Viên</a> <a
				href="#" class="list-group-item">Khách hàng</a> <a href="#"
				class="list-group-item">Sản Phẩm</a> 
		</div>
		<div class="col-md-10">
			<form method="post">
				<div class="row">
					<div class="form-group col-md-6">
						<h1>THÔNG TIN KHÁCH HÀNG</h1>
						<input class="nhanvieninut" type="text" placeholder="Họ Tên"name="tenkh"><br> 
							<input class="nhanvieninut"type="text" placeholder="Số Điện Thoại" name="sdtkh"><br> 
							<input class="nhanvieninut" type="text" placeholder="Địa chỉ"name="diachikh"><br> 
							<input class="nhanvieninut"type="email" class="form-control" id="exampleInputEmail1"aria-describedby="emailHelp" placeholder="Nhập email"
							name="email">
							<input type="radio" id="nu"name="gioitinh" value="Nu" checked"> <label>Nữ</label><br> 
							<input type="radio" id="nam" name="gioitinh" value="Nam"> <label>Nam</label>
							
					</div>
					<div class="col-md-6">
						<h1>THÔNG TIN TÀI KHOẢN</h1>
						<input class="nhanvieninut" type="text"placeholder="Tên đăng nhập" name="tendangnhap"> <br>
						<input class="nhanvieninut" type="password"placeholder="Mật khẩu mới" name="matkhau"> <br>
						<input class="nhanvieninut" type="password"placeholder="Nhập lại mật khẩu" name=""> <br> 
						 <input type="text" name="loaitaikhoan" value="User" placeholder="">
						<button style="background-color:DodgerBlue;"class="nhanvieninut" type="submit" class="btn btn-primary">Submit</button>
					</div>
					
				</div>

			</form>
		</div>
	</div>

</div>
<jsp:include page="footerQL.jsp"></jsp:include>
