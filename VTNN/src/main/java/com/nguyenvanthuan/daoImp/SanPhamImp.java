package com.nguyenvanthuan.daoImp;

import java.util.List;

import com.nguyenvanthuan.entity.SanPham;

public interface SanPhamImp {
	List<SanPham>LaydanhsachSanPham(int vitribatdau);
	SanPham LayDanhSachSanPhamCT(int id);
}
