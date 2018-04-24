package com.nguyenvanthuan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenvanthuan.dao.SanPhamDAO;
import com.nguyenvanthuan.daoImp.SanPhamImp;
import com.nguyenvanthuan.entity.SanPham;

@Service
public class SanPhamService implements SanPhamImp{
	@Autowired
	SanPhamDAO sanPhamdao;

	@Override
	public List<SanPham> LaydanhsachSanPham(int vitribatdau) {
		// TODO Auto-generated method stub
		return sanPhamdao.LaydanhsachSanPham(vitribatdau);
	}

	@Override
	public SanPham LayDanhSachSanPhamCT(int id) {
		return sanPhamdao.LayDanhSachSanPhamCT(id);
	}
	
}
