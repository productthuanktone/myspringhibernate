package com.nguyenvanthuan.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenvanthuan.dao.TaiKhoanDAO;
import com.nguyenvanthuan.daoImp.TaiKhoanImp;

@Service
public class TaiKhoanService implements TaiKhoanImp{
	@Autowired
	TaiKhoanDAO taikhoanDAO;
	public boolean KiemTraDangNhap(String tendangnhap, String matkhau) {
	boolean kientra=taikhoanDAO.KiemTraDangNhap(tendangnhap, matkhau);
		return kientra;
	}
	

}
