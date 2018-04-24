package com.nguyenvanthuan.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity(name = "khachhang")
public class KhachHang {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idKhachHang;
	String tenKhachHang;
	int sdtKhachHang;
	String emailKhachHang;
	String diachiKhachHang;
	String gioitinhKhachHang;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TenDangNhap")
	TaiKhoan taiKhoan;

	public int getIdKhachHang() {
		return idKhachHang;
	}

	public void setIdKhachHang(int idKhachHang) {
		this.idKhachHang = idKhachHang;
	}

	public String getTenKhachHang() {
		return tenKhachHang;
	}

	public void setTenKhachHang(String tenKhachHang) {
		this.tenKhachHang = tenKhachHang;
	}

	public int getSdtKhachHang() {
		return sdtKhachHang;
	}

	public void setSdtKhachHang(int sdtKhachHang) {
		this.sdtKhachHang = sdtKhachHang;
	}

	public String getEmailKhachHang() {
		return emailKhachHang;
	}

	public void setEmailKhachHang(String emailKhachHang) {
		this.emailKhachHang = emailKhachHang;
	}

	public String getDiachiKhachHang() {
		return diachiKhachHang;
	}

	public void setDiachiKhachHang(String diachiKhachHang) {
		this.diachiKhachHang = diachiKhachHang;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getGioitinhKhachHang() {
		return gioitinhKhachHang;
	}

	public void setGioitinhKhachHang(String gioitinhKhachHang) {
		this.gioitinhKhachHang = gioitinhKhachHang;
	}

	public KhachHang() {
		super();
	}

	public KhachHang(String tenKhachHang, int sdtKhachHang, String emailKhachHang, String diachiKhachHang,
			String gioitinhKhachHang) {
		super();
		this.tenKhachHang = tenKhachHang;
		this.sdtKhachHang = sdtKhachHang;
		this.emailKhachHang = emailKhachHang;
		this.diachiKhachHang = diachiKhachHang;
		this.gioitinhKhachHang = gioitinhKhachHang;
	}


}
