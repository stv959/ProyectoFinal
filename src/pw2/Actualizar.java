package pw2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class Actualizar extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//resp.setContentType("text/plain");
		
		final PersistenceManager pm = PMF.get().getPersistenceManager();
		final Query q = pm.newQuery(juegos.class);
		
		List<juegos> carnes = (List<juegos>) q.execute();
		
		String carne = req.getParameter("nombre");
		String precio = req.getParameter("precio");
		//for(int i = 0;i<carnes.size();i++){
			//if(carnes.get(i).getNombre().equals(carne)){
				//carnes.get(i).setCerdo(precio);
			//}
		//}
		//try{
			//req.getRequestDispatcher("listacarnes.jsp").forward(req, resp);
		//}
			
		}			
	}