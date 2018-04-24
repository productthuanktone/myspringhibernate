package com.nguyenvanthuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenvanthuan.dao.LoaiSanPhamDAO;
import com.nguyenvanthuan.daoImp.LoaiSanPhamImp;
import com.nguyenvanthuan.entity.LoaiSanPham;
@Service
public class LoaiSanPhamService implements LoaiSanPhamImp{
	@Autowired
	LoaiSanPhamDAO  loaispdao;
	@Override
	public List<LoaiSanPham> DanhSachLoaiSP() {
		
		return loaispdao.DanhSachLoaiSP();
	}

}
