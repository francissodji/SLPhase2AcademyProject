package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.dao.UserDao;
import com.dao.UserDaoImplem;


@WebServlet("/UserLogin")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//private UserDao userDao = new UserDaoImplem();
	
	

    public UserController() {

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			String aReturnUserName = authenticateLogin(request, response);
			
			//create the cookie
			if(!aReturnUserName.equals("NOTCORRECT"))
			{
				//Create and Add cookie to the response
				Cookie usernamecookie = new Cookie("userName",aReturnUserName); 
				
				response.addCookie(usernamecookie);
				
				//Session
				//Session session = request.st
			}
			
			
			
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}


	private String authenticateLogin(HttpServletRequest request, HttpServletResponse response) {
		
		String theUnameCookie = "NOTCORRECT";
		
		String theUsername = request.getParameter("aUsername");
		String thePassword = request.getParameter("aPassword");
		
		
		UserDao userDao = new UserDaoImplem();
		
		boolean result = userDao.validateAuthentication(theUsername,thePassword);
		
		if(result)
		{
			theUnameCookie = theUsername;
			
			try {
				RequestDispatcher dispatcher = request.getRequestDispatcher("generalMenu.jsp");
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else
		{
			
			try {
				RequestDispatcher dispatcher = request.getRequestDispatcher("errorLogin.jsp");
				dispatcher.forward(request, response);
			} catch (ServletException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return theUnameCookie;
	}

}
