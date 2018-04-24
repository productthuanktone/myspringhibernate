package com.nguyenvanthuan.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nguyenvanthuan.entity.LoaiSanPham;
import com.nguyenvanthuan.entity.SanPham;
import com.nguyenvanthuan.service.LoaiSanPhamService;
import com.nguyenvanthuan.service.SanPhamService;

@Controller
@RequestMapping("chitiet")
public class ChiTietController {
	@Autowired
	SanPhamService sanPhamsv;
	@Autowired
	LoaiSanPhamService loaispservice;

	@GetMapping("/{masanpham}")
	@Transactional
	public String TrangChiTiet(@PathVariable int masanpham, ModelMap modelMap) {
		System.out.println("ma san phan" + masanpham);
		SanPham sanPham = sanPhamsv.LayDanhSachSanPhamCT(masanpham);
		List<LoaiSanPham> listloaisp = loaispservice.DanhSachLoaiSP();
		modelMap.addAttribute("sanpham", sanPham);
		modelMap.addAttribute("loaisp", listloaisp);
		return "NewChiTiet";
	}

}
