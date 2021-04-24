package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Teacher;
import com.dao.TeacherDao;
import com.dao.TeacherDaoImplem;


public class ListTeacherController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ListTeacherController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		getListOfTeacher(request, response);
	}


	private void getListOfTeacher(HttpServletRequest request, HttpServletResponse response) {
		
		List<Teacher> listOfTeacher = null;
		HttpSession httpsession = request.getSession();
		
		TeacherDao teacherDao = new TeacherDaoImplem();
		
		listOfTeacher = teacherDao.getlistOfAllTeacher();
		
		httpsession.setAttribute("listOfTeacher", listOfTeacher);
		
		if(!listOfTeacher.isEmpty())
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("displayListOfTeacher.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else
		{
			RequestDispatcher dispatcher = request.getRequestDispatcher("generalMenu.jsp");
			try {
				dispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
