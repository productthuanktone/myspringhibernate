<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="NewHeaderQL.jsp"></jsp:include>
      <!-- Breadcrumbs-->
      <ol class="breadcrumb">
        <li class="breadcrumb-item">
          <a href="#">Dashboard</a>
        </li>
        <li class="breadcrumb-item active">Tables</li>
      </ol>
      <!-- Example DataTables Card-->
      <div class="card mb-3">
        <div class="card-header">
          <i class="fa fa-table"></i> Bảng Nhân Viên</div>
        <div class="card-body">
          <div class="table-responsive">
            <table class="table table-bordered" id="dataTable" width="100%" cellspacing="0">
              <thead>
                <tr>
                  <th>STT</th>
                  <th>Họ Tên</th>
                  <th>Số Điện Thoại</th>
                  <th>Giới Tính</th>
                  <th>Email</th>
                  <th>Địa Chỉ</th>
                  <th>Action</th>
                </tr>
              </thead>
              <tfoot>
                <tr>
                  <th>STT</th>
                  <th>Họ Tên</th>
                  <th>Số Điện Thoại</th>
                  <th>Giới Tính</th>
                  <th>Email</th>
                  <th>Địa Chỉ</th>
                  <th>Action</th>
                </tr>
              </tfoot>
              <tbody>

<!--                Start Danh Sach Nhan Vien -->              
                <% int i=1; %>
                <c:forEach var="nhanvien" items="${listnhanvien}" >        
                 <tr>
                        <td><%=i++%></td>
                        <td>${nhanvien.getHotenNhanVien()}</td>
                        <td>${nhanvien.getSdtNhanVien()}</td>
                        <td>${nhanvien.getGioitinhNhanVien() }</td>
                        <td  style="color: #DD0000">${nhanvien.getEmailNhanVien() }</td>
                        <td>${nhanvien.getDiachiNhanVien() }</td>
                        <td></td>
                 </tr>
                </c:forEach>
<!--                End Danh Sach Nhan Vien -->
              </tbody>
            </table>
          </div>
        </div>
        <div class="card-footer small text-muted">Updated yesterday at 11:59 PM</div>
      </div>
    </div>
   <jsp:include page="NewFooterQL.jsp"></jsp:include>