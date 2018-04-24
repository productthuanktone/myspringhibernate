package com.nguyenvanthuan.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

import com.nguyenvanthuan.entity.LoaiSanPham;
import com.nguyenvanthuan.daoImp.LoaiSanPhamImp;


@Repository
@Scope(proxyMode=ScopedProxyMode.TARGET_CLASS)
public class LoaiSanPhamDAO implements LoaiSanPhamImp {
	@Autowired
	SessionFactory sessionFactory;

	@Override
	@Transactional
	public List<LoaiSanPham> DanhSachLoaiSP() {
		Session session = sessionFactory.getCurrentSession();
		List<LoaiSanPham> listLoaiSP=(List<LoaiSanPham>)session.createQuery("from loaisanpham").getResultList();
		return listLoaiSP;
	}
	

}
