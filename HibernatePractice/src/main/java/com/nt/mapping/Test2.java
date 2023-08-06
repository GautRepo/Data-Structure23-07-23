package com.nt.mapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test2 {

	public static void main(String[] args) {
		
		Sleeper s = new Sleeper();
		s.setClr("blue");
		
		Sleeper s2 = new Sleeper();
		s2.setClr("green");
		
		List<Sleeper> list = Arrays.asList(s,s2);
		
		
		Man man = new Man();
		man.setName("Gautam");
		man.setList(list);
		
		Man man2 = new Man();
		man2.setName("Aqua");
		man2.setList(list);
		
		List<Man> list2 = Arrays.asList(man,man2);
		
		s.setList(list2);
		s2.setList(list2);
		
		Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		session.save(s);
		session.save(s2);
		session.save(man);
		session.save(man2);
		
		tx.commit();
		session.close();
		sf.close();
		

	}

}
