package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.smallPizza;

/**
 * Servlet implementation class getSmallPizzasServlet
 */
@WebServlet("/getSmallPizzasServlet")
public class getSmallPizzasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSmallPizzasServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userSmallSlices = request.getParameter("smallPizzas");
		smallPizza userPizzas = new 
			smallPizza(Integer.parseInt(userSmallSlices));
		request.setAttribute("userNumSmallSlices", userPizzas);
		getServletContext().getRequestDispatcher("/smallResult.jsp").forward(request, response);
		PrintWriter writer = response.getWriter();
		writer.println(userPizzas.toString());
		writer.close();
	}
}
