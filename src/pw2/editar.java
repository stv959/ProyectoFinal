package pw2;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Key; 

@SuppressWarnings("serial")
public class editar extends HttpServlet {
	@SuppressWarnings("unchecked")
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html");

		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query q = pm.newQuery(Persona.class);
		 PrintWriter out = resp.getWriter();
		boolean activo=Boolean.parseBoolean(req.getParameter("activo"));
		String email=req.getParameter("email").trim();
		String nom=req.getParameter("nombre").trim();
		String ape=req.getParameter("apellido").trim();
		String tipo=req.getParameter("tipo").trim();
	
		List<Persona> personas = (List<Persona>)getServletContext().getAttribute("personas") ;
		try{
			Key key;
			Persona p =new Persona(nom,ape,email,tipo,activo);			
			try{
				pm.makePersistent(p);
				resp.getWriter().println("Persona grabada correctamente.");
				
				int a=0;
					for(Persona v:personas){
						if(v.getEmail().equals(email)){
							personas.set(a,p);						
						}
						a++; 
				}
			}catch(Exception e){
				System.out.println(e);
				resp.getWriter().println("Ocurrio un error, vuelva a intentarlo.");
				resp.sendRedirect("../");
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			pm.close();
		}
		out.println(personas);

	


	}
}
