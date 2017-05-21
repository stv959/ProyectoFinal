package pw2;

import java.io.IOException;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.api.datastore.KeyFactory;

@SuppressWarnings("serial")
public class SaveJuego extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		
		String outlast = req.getParameter("Outlast");
		String warh = req.getParameter("Warhammer");
		String Epic = req.getParameter("Ultimate");
		String Sniper = req.getParameter("Sniper");
		String PREY = req.getParameter("PREY");						 
		final PersistenceManager pm = PMF.get().getPersistenceManager();			
		try{
			Key key;			
			juegos c = new juegos(outlast,warh,Epic,Sniper,PREY);		
			try{
				pm.makePersistent(c);
				resp.getWriter().println("Persona grabada correctamente.");
				resp.sendRedirect("/listajuegos");
			}catch(Exception e){
				System.out.println(e);
				resp.getWriter().println("Ocurrió un error, vuelva a intentarlo.");
				resp.sendRedirect("#");			
			}
		}catch(Exception e){
			System.out.println(e);
		}finally{
			pm.close();
		}
		
	}
}
