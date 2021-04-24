package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Classes;
import com.dao.ClassesDao;
import com.dao.ClassesDaoImplem;
import java.util.List;


/**
 * Servlet implementation class ListClassesController
 */
public class ListClassesController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ListClassesController() {
       
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		editListOfAllClass(request, response);
	}


	private void editListOfAllClass(HttpServletRequest request, HttpServletResponse response) {
		
		ClassesDao classDoa = new ClassesDaoImplem();
		
		List<Classes> listOfAllClass = classDoa.getlistAllClasses();
		HttpSession httpSession = request.getSession();
		
		httpSession.setAttribute("listOfAllClass", listOfAllClass);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
