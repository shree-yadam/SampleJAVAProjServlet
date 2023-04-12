package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PersonalInfo
 */
@WebServlet("/PersonalInfo")
public class PersonalInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PersonalInfo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String middleName = request.getParameter("middleName");
		String gender = request.getParameter("gender");
		System.out.println("First Name: " + firstName);
		System.out.println("Middle Name: " + middleName);
		System.out.println("Last Name: " + lastName);
		System.out.println("Gender : " + gender);
		ServletContext sc = getServletContext();
		sc.setAttribute(firstName, firstName);
		sc.setAttribute(middleName, middleName);
		sc.setAttribute(lastName, lastName);
		sc.setAttribute(gender, gender);
		response.sendRedirect(request.getContextPath() + "/ContactInfo.html");
	}

}
