package br.com.treino.treinonaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaNavioServlet
 */
@WebServlet("/listaNavio")
public class ListaNavioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Banco banco = new Banco();
		List<Navio> navios = banco.navios();
//		PrintWriter writer = response.getWriter();
//		writer.println("<html><body><ul>");
//		navios.forEach(navio -> writer.println("<li>" + navio.getNome() + "</li>"));
//		writer.println("</ul></body></html>");
		
		request.setAttribute("navios", navios);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("listaNavios.jsp");
		requestDispatcher.forward(request, response);
	}

}
