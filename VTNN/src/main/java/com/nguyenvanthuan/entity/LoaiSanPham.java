package com.nguyenvanthuan.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name="loaisanpham")
public class LoaiSanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idLoaiSanPham;
	String tenLSP;
	String imageLSP;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "idLoaiSanPham")
	Set<SanPham> lsanphams;
	public int getIdLoaiSanPham() {
		return idLoaiSanPham;
	}
	public void setIdLoaiSanPham(int idLoaiSanPham) {
		this.idLoaiSanPham = idLoaiSanPham;
	}
	public String getTenLSP() {
		return tenLSP;
	}
	public void setTenLSP(String tenLSP) {
		this.tenLSP = tenLSP;
	}
	public String getImageLSP() {
		return imageLSP;
	}
	public void setImageLSP(String imageLSP) {
		this.imageLSP = imageLSP;
	}
	public Set<SanPham> getLsanphams() {
		return lsanphams;
	}
	public void setLsanphams(Set<SanPham> lsanphams) {
		this.lsanphams = lsanphams;
	}
	public LoaiSanPham(String tenLSP, String imageLSP) {
		super();
		this.tenLSP = tenLSP;
		this.imageLSP = imageLSP;
	}
	public LoaiSanPham() {
		super();
	}
	
}
