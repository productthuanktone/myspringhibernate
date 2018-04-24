package com.nguyenvanthuan.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nguyenvanthuan.daoImp.SanPhamImp;
import com.nguyenvanthuan.entity.SanPham;

@Repository
public class SanPhamDAO implements SanPhamImp {
	
	@Autowired
	SessionFactory sessionFactory;
	@Override
	public List<SanPham> LaydanhsachSanPham(int vitribatdau) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.getCurrentSession();
		@SuppressWarnings("unchecked")
		List<SanPham> listSanPham=(List<SanPham>)session.createQuery("from sanpham").setFirstResult(vitribatdau).setMaxResults(20).getResultList();
		for(SanPham sp:listSanPham) {
			System.out.println("Ten san pham la :"+sp.getTenSanPham());
		}
		return listSanPham;
	}
	@Override
	public SanPham LayDanhSachSanPhamCT(int id) {
		Session session=sessionFactory.getCurrentSession();
		String sql="FROM sanpham where idSanPham='"+id+"'";
		SanPham sanpham=(SanPham)session.createQuery(sql).getSingleResult();
		/*for(SanPham sanPham: listSanPham) {
			System.out.println("ma san pham: "+sanPham.getIdSanPham());
			for(GiaTheoNgay giatheongay:sanPham.getGiatheongays()) {
				System.out.println("Gia sam pham: "+"Ma san pham "+giatheongay.getIdSanPham()+" Gia san pham "+giatheongay.getGia()+" ----ngay-- "+giatheongay.getNgay());
			}
		}
		*/
		//System.out.println("sd"+sanpham.getGiatheongays());
		return sanpham;
	}

}
