package com.nguyenvanthuan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nguyenvanthuan.daoImp.NhanVienImp;
import com.nguyenvanthuan.entity.NhanVien;

@Repository
public class NhanVienDAO implements NhanVienImp {

	@Autowired
	SessionFactory sessionFactory;

	public List<NhanVien> LayDangSachSanPham(int nhanvienbatdau) {
		Session session = sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<NhanVien> listNhanViens = (List<NhanVien>) session.createQuery("from nhanvien")
				.setFirstResult(nhanvienbatdau).setMaxResults(20).getResultList();
		return listNhanViens;
	}

}
