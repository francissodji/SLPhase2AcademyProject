package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.beans.Subject;
import com.dao.SubjectDao;
import com.dao.SubjectDaoImplem;


public class ListSubjectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListSubjectController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		getListOfSubject(request, response);
	}


	private void getListOfSubject(HttpServletRequest request, HttpServletResponse response) {
		
		List<Subject> listOfSubject = null;
		
		SubjectDao subjectDao = new SubjectDaoImplem();
		HttpSession httpSession = request.getSession();
		
		
		try {
			listOfSubject = subjectDao.getListAllSubject();
			
			httpSession.setAttribute("listOfAllSubject", listOfSubject);
			
			if(!listOfSubject.isEmpty())
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("displayListOfSubject.jsp");
				dispatcher.forward(request, response);
			}
			else
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("generalMenu.jsp");
				dispatcher.forward(request, response);
			}
			
			
		} catch (ServletException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//doGet(request, response);
	}

}
