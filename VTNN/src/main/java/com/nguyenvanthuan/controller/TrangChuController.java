package com.nguyenvanthuan.controller;


import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
//import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nguyenvanthuan.entity.NhanVien;
import com.nguyenvanthuan.entity.SanPham;
import com.nguyenvanthuan.service.SanPhamService;

@Controller
@RequestMapping("/")
public class TrangChuController {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	SanPhamService sanphamsrevice;
	@GetMapping
	@Transactional
	public String TrangChu(ModelMap modelMap) {
		//Session session=sessionFactory.getCurrentSession();
		List<SanPham> listsp=sanphamsrevice.LaydanhsachSanPham(0);
		modelMap.addAttribute("listsanpham", listsp);
//		SanPham sanPham1=new SanPham("ccc","vvv","sssss");
//		Set<SanPham> sanphams=new HashSet<>();
//		sanphams.add(sanPham1);
//		NhanVien nhanVien=new NhanVien("dd0,","ddd",4,"dfdf","ddd");
//		nhanVien.setSanphams(sanphams);
////		session.save(nhanVien);
//		Session session = sessionFactory.getCurrentSession();
//		NhanVien nv=new NhanVien();
//		nv.setIdNhanVien(246);
//		session.delete(nv);
		return "NewTrangChu";
	}
}
