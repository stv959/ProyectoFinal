package controlador;
import java.util.ArrayList;
import java.util.Date;
import java.util.List; 
import java.io.IOException;    
import java.io.PrintWriter;
import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

import modelo.Persona;

@SuppressWarnings("serial")
public class GmailServlet extends HttpServlet {
	@Override
	@SuppressWarnings("unchecked")
 public void doGet(HttpServletRequest req, HttpServletResponse resp)
 throws IOException {
	 resp.setContentType("text/html");


	 
	 PrintWriter out = resp.getWriter();
 
	 UserService us = UserServiceFactory.getUserService();
	 User user = us.getCurrentUser();
	 
	
	 if(user == null){
		 
		 resp.sendRedirect(us.createLoginURL(req.getRequestURI()));
 	}else{
		 out.println("<!DOCTYPE html>"	
				 + "<html>"
				 +"<head>"
				+ "<meta charset='utf-8'>"
				
				+ "<title>CLickComputer</title>"
			
				 +"</head>"
			 
		 + "<body>"
		 +"<center>"
		 + "<h1>Informaci&oacute;n de la Cuenta Google</h1>"
		 + "<input type=button value=Atras onclick='history.go(-1)'>"
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
		 +"</div>");
 	
		 
		 @SuppressWarnings("unchecked")
		 
		 
		List<Persona> personas = (List<Persona>) getServletContext().getAttribute("personas");
	
		try{ 
		
		
		 if(user.getEmail().equals("rescobedo@episunsa.edu.pe")) {
			 out.print("<a href='vista/admin/inicioadmin.jsp'> Iniciar </a>");
			 				
		 }
		
		 else if((user.getNickname().equals("stv959"))|| (user.getNickname().equals("andersonsrq"))){
			 out.print("<a href='vista/vendedor/iniciovendedor.jsp'> Iniciar</a>");
					
		 }
		
		 else if(user.getNickname().equals("gaminartrm")){
			 out.print("<a href='vista/cliente/inicio.jsp'> iniciar </a>");
									 
		 }
		 else
			 resp.sendRedirect("/logout");
		
		 out.println("<br><a href='"+ us.createLogoutURL(req.getRequestURI())+"'> Cerrar sesion </a>"
				 +"</center>"
				 +" </body></html>");
		}catch(Exception e){
			System.out.println(e);
			resp.getWriter().println("Ocurrio un error, vuelva a intentarlo.");
			resp.sendRedirect("/logout");
		}
		 
 		}
 	}	
}