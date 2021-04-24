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
import org.hibernate.mapping.TypeDef;

import com.beans.Subject;

public class SubjectDaoImplem implements SubjectDao{

	private SessionFactory factory;
	
    public SubjectDaoImplem() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        factory = meta.getSessionFactoryBuilder().build();
    }
	@Override
	public Integer AddSubject(Subject subject) {
		Integer SubjectId = null;
		
		Session session = factory.openSession();
		Transaction transact = session.beginTransaction();
		
		SubjectId = (Integer)session.save(subject);
		transact.commit();
		session.close();
		return SubjectId;
	}

	@Override
	public List<Subject> getListAllSubject() {
		List<Subject> allSubject = null;
		
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		String hql = "FROM subject";
		@SuppressWarnings("unchecked")
		TypedQuery<Subject> query = session.createQuery(hql);
		
		return allSubject;
	}

}
