package com.nguyenvanthuan.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity(name = "sanpham")
public class SanPham {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int idSanPham;
	String tenSanPham;
	String chitietSanPham;
	String image;
	@OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinColumn(name = "idSanPham")
	Set<GiaTheoNgay> giatheongays;
	public Set<GiaTheoNgay> getGiatheongays() {
		return giatheongays;
	}
	public void setGiatheongays(Set<GiaTheoNgay> giatheongays) {
		this.giatheongays = giatheongays;
	}
	public int getIdSanPham() {
		return idSanPham;
	}
	public void setIdSanPham(int idSanPham) {
		this.idSanPham = idSanPham;
	}
	public String getTenSanPham() {
		return tenSanPham;
	}
	public void setTenSanPham(String tenSanPham) {
		this.tenSanPham = tenSanPham;
	}
	public String getChitietSanPham() {
		return chitietSanPham;
	}
	public void setChitietSanPham(String chitietSanPham) {
		this.chitietSanPham = chitietSanPham;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public SanPham(String tenSanPham, String chitietSanPham, String image) {
		super();
		this.tenSanPham = tenSanPham;
		this.chitietSanPham = chitietSanPham;
		this.image = image;
	}
	public SanPham() {
		super();
	}
	
}
