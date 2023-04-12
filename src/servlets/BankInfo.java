package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BankInfo
 */
@WebServlet("/BankInfo")
public class BankInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BankInfo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String bankName = request.getParameter("bankName");
		String accountNumber = request.getParameter("accountNumber");
		String ssn = request.getParameter("ssn");
		ServletContext sc = getServletContext();
		sc.setAttribute("bankName", bankName);
		sc.setAttribute("accountNumber", accountNumber);
		sc.setAttribute("ssn", ssn);
		response.sendRedirect(request.getContextPath() + "/success.html");
	}

}
