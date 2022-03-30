package br.com.treino.treinonaweb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CadastrandoBarcosServlet
 */
@WebServlet("/cadastrandoBarcos")
public class CadastrandoNavioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("Chegou aqui!!");
		
		String parameter = request.getParameter("navio");
		String dataDeCadastro = request.getParameter("date");
		Date dataCadastro = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			dataCadastro = sdf.parse(dataDeCadastro);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		Navio navio = new Navio();
		navio.setNome(parameter);
		navio.setDataCadastro(dataCadastro);
		Banco banco = new Banco();
		banco.add(navio);
		
		response.sendRedirect("listaNavio");
		
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/listaNavio");
//		request.setAttribute("navio", navio.getNome());
//		requestDispatcher.forward(request, response);
	}

}
