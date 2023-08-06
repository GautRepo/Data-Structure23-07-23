package com.nt.pojo;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test1 {

	public static void main(String[] args) throws IOException {
		
		//Transient 
		//persistence 
		//detached
		//remove

		Name n = new Name("Laptop","Kumar");
		
		HibernatePrac hp = new HibernatePrac();
		hp.setHcount(10L);
		hp.setDate(new Date());
		hp.setName(n);
		hp.setX(100);
		FileInputStream fis = new FileInputStream("D:\\Games\\sign.jpg");
		byte[] b = new byte[fis.available()];
		fis.read(b);
		hp.setImage(b);
		
		
		
		Configuration con = new Configuration().configure("hibernate.cfg.xml");
									//.addAnnotatedClass(HibernatePrac.class);
		
		SessionFactory sf = con.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		/*Criteria c = session.createCriteria(HibernatePrac.class);
		
		c.add(Restrictions.eq("name.fname", "Kumar"));
		
		List<HibernatePrac> list = c.list();
		
		list.forEach(e -> System.out.println(e.getDate()));*/
		
		
		//session.save(hp);
		
		//hp.setHcount(100L);
		
		/*HibernatePrac hp1= session.get(HibernatePrac.class, 1);
		System.out.println("fetching completed");
		System.out.println(hp1.getName());*/
		
		/*System.out.println("_________________");
		HibernatePrac hp2= session.load(HibernatePrac.class, 1);
		System.out.println("fetching completed");
		System.out.println(hp2.getName());*/
		
		/*HibernatePrac hp2 =session.get(HibernatePrac.class, 1);
		System.out.println(hp2.getDate());
		tx.commit();
		
		session.close();
		
		Session s2 = sf.openSession();
		HibernatePrac hp3 =s2.get(HibernatePrac.class, 1);
		System.out.println(hp3.getDate());
		s2.close();*/
		
		//String query ="FROM HibernatePrac as h WHERE h.hid=:X";
		
		String query ="SELECT * FROM h01_hibernate";
		
		//Query q =session.createQuery(query);
		
		
		//q.setParameter("X", 1);
		
		/*NativeQuery q = session.createSQLQuery(query);
		
		List<Object[]> list = q.getResultList();
		
		for(Object[] obj : list) {
			
			System.out.println(obj[4]);
		}*/
		
		/*int end=3;
		
		while (end <= 6) {
		
			q.setFirstResult(end - 3);
		
			q.setMaxResults(end);
		
			List<HibernatePrac> list = q.getResultList();
		
			list.forEach(e -> System.out.println(e.getName() + " " + e.getHid()));
			end = end + 3;
			System.out.println("_____________");
		}*/
		
		
		tx.commit();
		
		session.close();
		sf.close();

	}

}
