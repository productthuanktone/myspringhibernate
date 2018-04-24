package com.nguyenvanthuan.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nguyenvanthuan.daoImp.TaiKhoanImp;
import com.nguyenvanthuan.entity.TaiKhoan;

@Repository
public class TaiKhoanDAO implements TaiKhoanImp {
	@Autowired
	SessionFactory sessionFactory;

	public boolean KiemTraDangNhap(String tendangnhap, String matkhau) {
		// TODO Auto-generated method stub
		Session session = sessionFactory.getCurrentSession();
		try {
			TaiKhoan taikhoan = (TaiKhoan) session
					.createQuery("FROM taikhoan where TenDangNhap='" + tendangnhap + "' AND MatKhau='" + matkhau + "'")
					.getSingleResult();
			if (taikhoan != null) {
				return true;
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}

	}
}
