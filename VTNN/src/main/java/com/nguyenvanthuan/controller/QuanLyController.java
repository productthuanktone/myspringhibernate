package com.nguyenvanthuan.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("quanly")
public class QuanLyController {
	@Autowired
	@GetMapping
	public String TrangChu() {

		return "NewQuanLy";
	}
	@PostMapping
	@Transactional
	public String LoadNv() {
		System.out.println("sdasdasd");
		return "DanhSachNhanVien";
	}
}