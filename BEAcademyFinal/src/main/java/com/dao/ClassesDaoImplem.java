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

import com.beans.Classes;

public class ClassesDaoImplem implements ClassesDao {

private SessionFactory factory;
    
    
    public ClassesDaoImplem() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
        factory = meta.getSessionFactoryBuilder().build();
    }
	
	public Integer addClasses(Classes classes) {
		
		Integer classId = null;
		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//add the new record
		classId = (Integer)session.save(classes);
		trans.commit();;
		session.close();
		return classId;
	}
	
	
	

	public void updateClasses(Integer classesId, String designClasses) {

		Session session = factory.openSession();
		Transaction trans = session.beginTransaction();
		
		//1. fetch the object of specific emoployeeID - select query to be executed
    	Classes classes = session.get(Classes.class, classesId);
    	
    	
    	//2. Modify classes designation
    	classes.setDesignClasses(designClasses);
    	
    	//3. send the object back
    	session.update(classes);
    	
    	trans.commit();
    	session.close();
		
	}

	public void deleteClasses(Integer classesId) {
		// TODO Auto-generated method stub
		
	}
	
	public List<Classes> getlistAllClasses() {
		
		List<Classes> allclasses = null;
		Session session = factory.openSession();
    	Transaction txn = session.beginTransaction();
    	
    	String hql = "FROM Classes";
    	@SuppressWarnings("unchecked")
		TypedQuery<Classes> query = session.createQuery(hql);
    	allclasses = query.getResultList();
    	session.close();
    	
    	return allclasses;
	}

	@Override
	public List<Classes> getListAllClassesAndAllSubject() {
		List<Classes> allClassAndSubject = null;

		Session session = factory.openSession();
    	Transaction trans = session.beginTransaction();
		
    	String hql = "select C.idClasses, C.designClasses, S.designSubject FROM Classes C "
    			+ "join Subject S";
    	@SuppressWarnings("unchecked")
		TypedQuery<Classes> query = session.createQuery(hql);
    	allClassAndSubject = query.getResultList();
    	
    	trans.commit();
    	session.close();
    	
    	
		return allClassAndSubject;
	}

}
