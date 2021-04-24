package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Teacher;
import com.dao.TeacherDao;
import com.dao.TeacherDaoImplem;

/**
 * Servlet implementation class AddTeacherController
 */
public class AddTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public AddTeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		addTeacher(request, response);
	}


	private void addTeacher(HttpServletRequest request, HttpServletResponse response) {
		
		String teacherFirstName = request.getParameter("firstNameTeach");
		String teacherMiddName = request.getParameter("middlNameTeach");
		String teacherLastName = request.getParameter("lastNameTeach");
		
		boolean isAdded = false;
		
		Teacher aTeacher = new Teacher(teacherFirstName,teacherMiddName,teacherLastName);
		
		Integer idTeacher = null;
		TeacherDao teacherDao = new TeacherDaoImplem();
		
		
		idTeacher = teacherDao.addTeacher(aTeacher);
		
		System.out.print(idTeacher);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("addTeacher.jsp");
		try {
			dispatcher.forward(request, response);
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
