package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javahome.model.BookBean;

public class Test {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession(factory);

		Transaction tx = session.beginTransaction();

		BookBean bookBean = new BookBean();

		//bookBean.setId(3);
		bookBean.setBookName("Xml");
		bookBean.setPrice(200);

		session.save(bookBean);

		tx.commit();

		HibernateUtil.close(factory, session);

	}

}
