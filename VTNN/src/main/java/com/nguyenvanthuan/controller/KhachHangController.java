package com.nguyenvanthuan.controller;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.nguyenvanthuan.entity.KhachHang;
import com.nguyenvanthuan.entity.TaiKhoan;

@Controller
@RequestMapping("khachhang")
public class KhachHangController {
	@Autowired
	SessionFactory sessionFactory;
	@GetMapping
	public String ViewKhachhang(){
		
		return "khachhang";
	}
	@GetMapping("them")
	public String ViewthemKhachhang(){
		
		return "themkhachhang";
	}
	@Transactional
	@PostMapping
	public String ThemKhachHang(@RequestParam String tenkh, @RequestParam int sdtkh, @RequestParam String email,
			@RequestParam String diachikh, @RequestParam String tendangnhap, @RequestParam String gioitinh,
			@RequestParam String matkhau) {
		String loaitk="User";
		Session session = sessionFactory.getCurrentSession();
		KhachHang kh = new KhachHang(tenkh, sdtkh, email, diachikh, gioitinh);
		TaiKhoan tk = new TaiKhoan(tendangnhap, matkhau,loaitk);
		kh.setTaiKhoan(tk);
		session.save(kh);
		return "khachhang";
	}
}
