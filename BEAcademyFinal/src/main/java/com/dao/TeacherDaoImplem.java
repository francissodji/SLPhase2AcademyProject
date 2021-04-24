package com.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.beans.Teacher;


public class TeacherDaoImplem implements TeacherDao{
	
	private SessionFactory factory;

	 public TeacherDaoImplem() {
	        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	        factory = meta.getSessionFactoryBuilder().build();
	    }
		
	@Override
	public Integer addTeacher(Teacher teacher) {
		
		Integer teacherId = null;
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		teacherId = (Integer)session.save(teacher);
		
		trans.commit();
		session.close();
		
		return teacherId;
	}

	@Override
	public List<Teacher> getlistOfAllTeacher() {
		
		List<Teacher> allTeacher = null;
		
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		String hql = "FROM teacher";
		@SuppressWarnings("unchecked")
		TypedQuery<Teacher> query = session.createQuery(hql);
		
		allTeacher = query.getResultList();
		return allTeacher;
	}

}
