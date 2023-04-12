package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ContactInfo
 */
@WebServlet("/ContactInfo")
public class ContactInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ContactInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String country = request.getParameter("country");
		String phoneNumber = request.getParameter("phoneNumber");
		ServletContext sc = getServletContext();
		sc.setAttribute("address", address);
		sc.setAttribute("city", city);
		sc.setAttribute("state", state);
		sc.setAttribute("country", country);
		sc.setAttribute("phoneNumber", phoneNumber);
		response.sendRedirect(request.getContextPath() + "/BankInfo.html");
	}

}
