$(document).ready(function() {
	$("#cot1").click(function() {
		$(this).addClass("activer");
	});
	$("#cot2").click(function() {
		$(this).addClass("activeb");
	});
	$("#cot3").click(function() {
		$(this).addClass("activeo");
	});
	$("#cot4").click(function() {
		$(this).addClass("activebl");
	});
	$(".btn-giohang").click(function(){
		var tensp=$(".tensp").text();
		var tensp=$(".tensp").attr("data-tensp");
		var hinh=$(".hinh").attr("data-hinh");
		var id=$(this).closest("tr").find(".id").text();
		var id=$(this).closest("tr").find(".id").attr("data-id");
		var gia=$(this).closest("tr").find(".gia").text();
		var gia=$(this).closest("tr").find(".gia").attr("data-giatien");
		var soluong=$(this).closest("tr").find(".soluong").text();
		var soluong=$(this).closest("tr").find(".soluong").attr("data-soluong");
//		alert(tensp+" "+id+" "+gia+" "+soluong);
		$.ajax({
			url:"/VTNN/api/themgiohang",
			type:"GET",
			data:{
				tensp:tensp,
				image:hinh,
				idSanPham:id,
				gia:gia,
				soluong:soluong
		
			},
			success:function(value){
				
			}
			
			
		});
	});
})