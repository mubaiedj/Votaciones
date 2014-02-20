package votaciones.controller.beans;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FrontController
 */
@WebServlet({"/", "/*/*"})
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String action = request.getParameter("action");
	        String view = "error";
	        
	        System.out.println("pruabbaaa");
	        
	        if (action == null || action.equals("home"))
	            view = "home";
	       

	        else if (action.equals("votar")) {
	        	view = "votar";
	        }
	        getServletContext().getRequestDispatcher("/" + view + ".jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
