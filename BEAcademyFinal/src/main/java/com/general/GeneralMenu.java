package com.general;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.beans.Classes;
import com.beans.User;
import com.dao.ClassesDao;
import com.dao.ClassesDaoImplem;
import com.dao.UserDao;
import com.dao.UserDaoImplem;

public class GeneralMenu {

	public static void main(String[] args) {
		
		//Scanner userScann = new Scanner(System.in);
		
		 StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
	     Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();  
	     SessionFactory factory = meta.getSessionFactoryBuilder().build(); 
	     
	     
	     //Class
	     //Create classes object and store in the database
	     /*
	     Classes classes1 = new Classes("CIS599");
	     ClassesDao classesDao = new ClassesDaoImplem();
	     Integer classId = classesDao.addClasses(classes1);
	     System.out.println("Classes Id = "+classId);
	     */
	     
	     /*
	     User aUser = new User("ADMIN","PASSWORD");
	     UserDao userDao = new UserDaoImplem();
	     userDao.addUser(aUser);
	     */
	
	     //List of classes
	     //List<Classes> listOfClasses = ClassesDao.listClasses();
	     //System.out.println(listOfClasses);

	}

}
