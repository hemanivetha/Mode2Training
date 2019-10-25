package com.hcl.college;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hcl.college.HibernateUtil;


public class CollegeCrud {
	
	public String insertSubject(Subject sub){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(sub);
		t.commit();
		return "Record Inserted";
		
	}
	
	public String generateFeedbackId(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q= s.createQuery("from FeedBack");
		int count=0;
		List<String> lst=q.list();
		String fb="";
		count=lst.size();
		count++;
		String formatted = String.format("%03d", count);
		fb= "C" + formatted;
		
		return fb;
	}
	
	
	public List<String> instructorList(){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select distinct instructor from Subject");
		List<String> lst=q.list();
		return lst;
	}
	
	public List<String> subjectList(String instructor){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery("select distinct subject from Subject where instructor='"+instructor+"'");
		List<String> lst=q.list();
		return lst;
	}
	
			
	public String insertFeedBack(FeedBack feedBack){
		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		s.save(feedBack);
		t.commit();
		return "Record Inserted";
	}
	
	public List<FbResult> feedbackList(String instructor,String subject){

		SessionFactory sf=HibernateUtil.getConnection();
		Session s=sf.openSession();
		Query q=s.createQuery(" select fbvalue,count(*) from FeedBack "
		+ " where instructor='" +instructor+ "' and subject='" +subject +"' "
		+ " group by fbvalue");

		List lst=q.list();
		List<FbResult> list=new ArrayList<FbResult>();
		FbResult res=null;
		for (Object ob : lst) {
		Object[] row=(Object[])ob;
		res=new FbResult();
		res.setFbvalue(row[0].toString());
		res.setCount(Integer.parseInt(row[1].toString()));
		System.out.println(row[0] + "  " +row[1]);
		list.add(res);
		}
		return list;
		}

}
