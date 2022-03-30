package br.com.treino.treinonaweb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtualizarNavioServelet
 */
@WebServlet("/atualizarNavio")
public class AtualizarNavioServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parameter = request.getParameter("id");
		Integer id = Integer.valueOf(parameter);
//		
		Banco banco = new Banco();
		Navio navio = banco.buscaPorId(id);
//		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/formAtualizarNavio.jsp");
		request.setAttribute("navio", navio);
		requestDispatcher.forward(request, response);
		System.out.println("Chegou aqui...");
	}
}
