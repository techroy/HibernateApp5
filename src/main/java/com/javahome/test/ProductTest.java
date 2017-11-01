package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javahome.model.Product;
import com.javahome.model.ProductKey2;

public class ProductTest {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession(factory);

		Transaction tx = session.beginTransaction();
		
		ProductKey2 productKey = new ProductKey2(4, "chair");
		//ProductKey productKey = new ProductKey();
		
		productKey.setPid(6);
		productKey.setPname("phone");
		
		Product productBean = new Product();
		
		productBean.setProductKey2(productKey);
		productBean.setPrice(3000);
		
		
		session.save(productBean);
		tx.commit();
		
		
		HibernateUtil.close(factory, session);

	}

}
