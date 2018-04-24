package com.nguyenvanthuan.entity;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity(name = "nhanvien")
public class NhanVien {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idNhanVien;
	String hotenNhanVien;
	String gioitinhNhanVien;
	int sdtNhanVien;
	String emailNhanVien;
	String diachiNhanVien;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idNhanVien")
	Set<SanPham> sanphams;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "TenDangNhap")
	TaiKhoan taiKhoan;

	public Set<SanPham> getSanphams() {
		return sanphams;
	}

	public void setSanphams(Set<SanPham> sanphams) {
		this.sanphams = sanphams;
	}

	int getIdNhanVien() {
		return idNhanVien;
	}

	public void setIdNhanVien(int idNhanVien) {
		this.idNhanVien = idNhanVien;
	}

	public String getHotenNhanVien() {
		return hotenNhanVien;
	}

	public void setHotenNhanVien(String hotenNhanVien) {
		this.hotenNhanVien = hotenNhanVien;
	}

	public String getGioitinhNhanVien() {
		return gioitinhNhanVien;
	}

	public void setGioitinhNhanVien(String gioitinhNhanVien) {
		this.gioitinhNhanVien = gioitinhNhanVien;
	}

	public int getSdtNhanVien() {
		return sdtNhanVien;
	}

	public void setSdtNhanVien(int sdtNhanVien) {
		this.sdtNhanVien = sdtNhanVien;
	}

	public String getEmailNhanVien() {
		return emailNhanVien;
	}

	public void setEmailNhanVien(String emailNhanVien) {
		this.emailNhanVien = emailNhanVien;
	}

	public TaiKhoan getTaiKhoan() {
		return taiKhoan;
	}

	public void setTaiKhoan(TaiKhoan taiKhoan) {
		this.taiKhoan = taiKhoan;
	}

	public String getDiachiNhanVien() {
		return diachiNhanVien;
	}

	public void setDiachiNhanVien(String diachiNhanVien) {
		this.diachiNhanVien = diachiNhanVien;
	}

	public NhanVien(String hotenNhanVien, String gioitinhNhanVien, int sdtNhanVien, String emailNhanVien,
			String diachiNhanVien) {
		super();
		this.hotenNhanVien = hotenNhanVien;
		this.gioitinhNhanVien = gioitinhNhanVien;
		this.sdtNhanVien = sdtNhanVien;
		this.emailNhanVien = emailNhanVien;
		this.diachiNhanVien = diachiNhanVien;
	}

	public NhanVien() {
		super();
	}

}
