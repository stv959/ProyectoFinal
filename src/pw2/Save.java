package pw2;
import java.io.IOException;  
import javax.jdo.PersistenceManager;

import javax.servlet.http.*;
import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class Save extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String nombre = req.getParameter("nombre");
		String apellido = req.getParameter("apellido");
		String email = req.getParameter("email");		
		String tipo = req.getParameter("tipo");	
		boolean activo=Boolean.parseBoolean(req.getParameter("activo"));
		final PersistenceManager pm = PMF.get().getPersistenceManager();			
		try{
			Key key;
			Persona p = new Persona(nombre, apellido, email,tipo,activo);
			
			try{
				pm.makePersistent(p);
				resp.getWriter().println("Persona grabada correctamente.");
				resp.sendRedirect("/listapersonas");
			}catch(Exception e){
				System.out.println(e);
				resp.getWriter().println("Ocurrio un error, vuelva a intentarlo.");
				resp.sendRedirect("/paginaprincipal.html");
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			pm.close();
		}
		
	}
}
