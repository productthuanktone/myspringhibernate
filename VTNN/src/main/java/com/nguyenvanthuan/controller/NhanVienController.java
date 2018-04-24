package com.nguyenvanthuan.controller;



import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenvanthuan.entity.NhanVien;
import com.nguyenvanthuan.entity.TaiKhoan;
import com.nguyenvanthuan.service.NhanVienService;

@Controller
@RequestMapping("nhanvien")
public class NhanVienController {

	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	NhanVienService nhanvienservice;
	@GetMapping
	@Transactional
	public String ViewNhanVien(ModelMap modelMap) {
		List<NhanVien> listNhanVien=nhanvienservice.LayDangSachSanPham(0);
		modelMap.addAttribute("listnhanvien",listNhanVien);
		return "NewNhanVien";
	}
	@PostMapping
	@Transactional
	public String ViewNhanVien(@RequestParam String hoten, @RequestParam String gioitinh, @RequestParam int sdt,
			@RequestParam String diachi, @RequestParam String email, @RequestParam String tentaikhoan,
			@RequestParam String matkhau, @RequestParam String loaitaikhoan) {
		Session session = sessionFactory.getCurrentSession();
		NhanVien nv = new NhanVien(hoten, gioitinh, sdt, email, diachi);
		TaiKhoan tk = new TaiKhoan(tentaikhoan, matkhau, loaitaikhoan);
		nv.setTaiKhoan(tk);
		session.saveOrUpdate(nv);
		return "DanhSachNhanVien";
	}
	public String XoaNhanVien(@RequestParam int sdt) {
		Session session = sessionFactory.getCurrentSession();
		NhanVien nv=new NhanVien();
		nv.setIdNhanVien(sdt);
		session.delete(nv);
		return "DanhSachNhanVien";
	}
}
