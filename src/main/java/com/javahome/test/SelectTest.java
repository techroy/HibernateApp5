package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.HbmBinder;

import com.javahome.model.BookBean;

public class SelectTest {

	public static void main(String[] args) {
		
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession(factory);

		BookBean bookBean = (BookBean)session.load(BookBean.class,1);
		
		System.out.println(bookBean);
		
		
		bookBean.setBookName("Java");
		
		Transaction tx  = session.beginTransaction();
		
		session.update(bookBean);
		
		tx.commit();
		
		HibernateUtil.close(factory, session);

	}

}
