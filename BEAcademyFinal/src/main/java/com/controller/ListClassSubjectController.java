package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Classes;
import com.dao.ClassesDao;
import com.dao.ClassesDaoImplem;


public class ListClassSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		listAllClassAndSubject(request, response);
	}


	private void listAllClassAndSubject(HttpServletRequest request, HttpServletResponse response) {
		
		List<Classes> allClassAndSubj = null;
		ClassesDao classesDao = new ClassesDaoImplem();
		
		
		try {
			allClassAndSubj = classesDao.getListAllClassesAndAllSubject();
			
			HttpSession httpsession = request.getSession();
			httpsession.setAttribute("ALLCLASSANDSUBJECT",allClassAndSubj);
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/displayListClassSubject.jsp");
			
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
