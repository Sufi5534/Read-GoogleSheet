package com.wheebox.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import com.wheebox.model.student_data;


@Repository
public class UserDao {

	@Autowired
	private HibernateTemplate HibernateTemplate;
	
	@Autowired
	SessionFactory sF;
	
	public List <student_data> getAllitems() {
		Session session=sF.openSession();
        System.out.println("testing dao");
		List<student_data> list = null;
		Transaction transaction= null;
		
		System.out.println("Transection start");
		try {
			String SQL_QUERY=" from student_data ";
			transaction = session.beginTransaction();
			Query query=session.createQuery(SQL_QUERY);
		   // query.setParameter(0, 0);
		    
			
			list = (List<student_data>) query.list();
			//System.out.println(list);
		}catch(Exception e){
			System.out.println(e);
			return null;
		}
		if(!list.isEmpty())
		{
			//System.out.println(list.get(0));
			return list;
		}
		return null;
	}
//    public List <student_data> getAllitems()
//    {
//    	return sF.getCurrentSession().createQuery("from student_data").list();
//    }
	
	
	
	
}
