package com.nguyenvanthuan.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.nguyenvanthuan.service.TaiKhoanService;

@Controller
@RequestMapping("dangnhap")
public class DangNhapController {

	@GetMapping
	public String ViewDangNhap() {

		return "QuanLy";
	}

	@Autowired
	TaiKhoanService taikhoanService;

	@PostMapping
	@Transactional
	public String XuLyDangNhap(@RequestParam String tendangnhap, @RequestParam String matkhau) {
		boolean kiemtra = taikhoanService.KiemTraDangNhap(tendangnhap, matkhau);
		if(kiemtra) {
			System.out.println("Success");
		}
		else {
			System.out.println("failure");
		}
		return "dangnhap";
	}
}
