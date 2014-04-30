package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crestwoodcomputing.hlm.hlmBeans.business.User;
import com.crestwoodcomputing.hlm.hlmBeans.enums.Gender;

/**
 * Servlet implementation class FindMatchesServlet
 */
@WebServlet("/findMatches")
public class FindMatchesServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	
	// private User foo;
	
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindMatchesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
		
		
		User user = new User();
		
		user.setGender(Gender.FEMALE);
		
		
		
		
		
		
		// forward request and response on to JSP "foo.jsp"
		
		System.out.println("Executing: Hlm/findMatches");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
