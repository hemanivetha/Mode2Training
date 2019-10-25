package com.hcl.hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;


public class MainProg {
	
	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		Session s=sf.openSession();
		Query q=s.createQuery("from Employ");
		//q.setFirstResult(2);
		//q.setMaxResults(5);
		//Criteria c=s.createCriteria(Employ.class);
		//c.add(Restrictions.gt("basic", 20000));
		//Criteria c1=s.createCriteria(Employ.class);
		//c1.addOrder(Order.asc("basic"));
		Criteria c2=s.createCriteria(Employ.class);
		c2.setProjection(Projections.property("name"));
		List<String> l=c2.list();
		
		//List list=c.list();
		for (String ob : l) {
			//Employ e=(Employ)ob;
			//System.out.println("Employ No :" +e.getEmpno());
			System.out.println("Employ Name :" +ob);
			//System.out.println("Dept :" +e.getDept());
			//System.out.println("Desig :" +e.getDesig());
			//System.out.println("Basic :" +e.getBasic());
		}
		
		sf.close();
		
	}

}
