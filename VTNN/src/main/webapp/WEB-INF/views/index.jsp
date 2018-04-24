<jsp:include page="header.jsp"></jsp:include>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div id="tieude-sanpham" class="container">
	<div>
		<span>SẢN PHẨM</span>
	</div>
	<div class="row">
	<c:forEach var="sanpham" items="${listsanpham}">
		<div class="col-sm-6 col-md-3">
				<div class="sanpham wow bounceIn">
					<img alt="hinh"
						src='<c:url value="/resources/image/${sanpham.getImage() }"/>' /><br>
					<span>${sanpham.getTenSanPham() }</span> <br>
					<span class="gia">150.000đ</span>
				</div>
		</div>
	</c:forEach>
		
		<!-- End San pham -->
	</div>
</div>
<jsp:include page="footer.jsp"></jsp:include>