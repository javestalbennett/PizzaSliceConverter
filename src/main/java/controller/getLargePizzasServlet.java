package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.largePizza;

/**
 * Servlet implementation class getLargePizzasServlet
 */
@WebServlet("/getLargePizzasServlet")
public class getLargePizzasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getLargePizzasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userSlices = request.getParameter("largePizzas");
		largePizza userPizzas = new 
			largePizza(Integer.parseInt(userSlices));
		request.setAttribute("userNumSlices", userPizzas);
		getServletContext().getRequestDispatcher("/largeResult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(userPizzas.toString());
		writer.close();
	}
}
