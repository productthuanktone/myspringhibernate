<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="headerQL.jsp"></jsp:include>
<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
	<div id="nhanvien" class="container">
			<form method="post">
			<div class="row">
					<div class="form-group col-md-6">
						<h1>Thêm Nhân Viên</h1>
						<input class="nhanvieninut"type="text" placeholder="Họ Tên"
							name="hoten"><br> <input class="nhanvieninut"
							text" placeholder="Số Điện Thoại" name="sdt"><br> 
							<input
							class="nhanvieninut" type="text" placeholder="Địa chỉ"
							name="diachi"><br> 
							<input class="nhanvieninut"
							type="email" class="form-control" id="exampleInputEmail1"
							aria-describedby="emailHelp" placeholder="Nhập email"
							name="email"><br> 
							<input type="radio" id="nu"name="gioitinh" value="Nu" checked"> <label>Nữ</label><br> 
							<input type="radio" id="nam" name="gioitinh" value="Nam"> <label>Nam</label>
					</div>
					<div class="col-md-6">
						<h1>Thêm Tài Khoản</h1>
						<input class="nhanvieninut" type="text"
							placeholder="Tên đăng nhập" name="tentaikhoan"> <br>
						<input class="nhanvieninut" type="password"
							placeholder="Mật khẩu mới" name="matkhau"> <br> <input
							class="nhanvieninut" type="password"
							placeholder="Nhập lại mật khẩu" name=""> <br> <label
							for="sel1">Quyền đăng nhập:</label> <select class="form-control"
							id="sel1" name="loaitaikhoan">
							<option value="User">User</option>
							<option value="Admin">Admin</option>
							<option value="Alladmin">Alldmin</option>
						</select>
						<button style="background-color:DodgerBlue;"class="nhanvieninut" type="submit" class="btn btn-primary">Submit</button>
					</div>
					
				</div>
			</form>

</div>
</main>
<jsp:include page="footerQL.jsp"></jsp:include>
