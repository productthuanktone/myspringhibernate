package com.nguyenvanthuan.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="taikhoan")
public class TaiKhoan {
	@Id
	String TenDangNhap;
	String MatKhau;
	String LoaiTK;
	public String getTenDangNhap() {
		return TenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		TenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	public String getLoaiTK() {
		return LoaiTK;
	}
	public void setLoaiTK(String loaiTK) {
		LoaiTK = loaiTK;
	}
	public TaiKhoan(String tenDangNhap, String matKhau, String loaiTK) {
		super();
		TenDangNhap = tenDangNhap;
		MatKhau = matKhau;
		LoaiTK = loaiTK;
	}
	public TaiKhoan() {
		super();
	}
	
}
