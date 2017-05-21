package pw2;
import java.io.IOException;   
import java.io.PrintWriter;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class logout extends HttpServlet {
 public void doGet(HttpServletRequest req, HttpServletResponse resp)
 throws IOException {
	 resp.setContentType("text/html");
 
	 PrintWriter out = resp.getWriter();
 
	 UserService us = UserServiceFactory.getUserService();
	 User user = us.getCurrentUser();
 	
	
	 if(user == null){
		 
		 resp.sendRedirect("paginaprincipal.html");
 	}else{
		 out.println("<!DOCTYPE html>"	
				 + "<html>"
				 +"<head>"
				+ "<meta charset='utf-8'>"
				
				+ "<title>CLickComputer</title>"
			
				 +"</head>"
			 
		 + "<body>"
		+"<center>"
		 + "<h1>Información de la Cuenta Google</h1>"
		 + "<br><a href='../'>Atras...</a>"
		 +"<br/><b>User :</b>" 
		 +"<br/>getNickname retorno : "+user.getNickname()
		 +"<br/>getAuthDomain retorno : "+user.getAuthDomain()
		 +"<br/>getEmail retorno : "+user.getEmail()
		 +"<br/>getUserId retorno : "+user.getUserId()
		 +"<br/>getFederatedIdentity retorno : "+user.getFederatedIdentity()
		 +"<br/>"
		 +"<br/><b>UserService :</b>"
		 +"<br/>isUserLoggedIn retorno : "+us.isUserLoggedIn()
		 +"<br/>getCurrentUser retorno : "+us.getCurrentUser()
		 +"<br/>"
		 +"</div>"
		 +"<a href='"+ us.createLogoutURL(req.getRequestURI())+"'> Cerrar sesion </a>"
		
		 +"</center>"
		 +" </body></html>");
		 }
	 
 }
 }