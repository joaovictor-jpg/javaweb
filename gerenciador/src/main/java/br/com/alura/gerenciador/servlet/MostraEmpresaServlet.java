package br.com.alura.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MostraEmpresaServlet
 */
@WebServlet("/mostraEmpresa")
public class MostraEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String parameter = request.getParameter("id");
		Integer id = Integer.valueOf(parameter);
		
		Banco banco = new Banco();
		Empresa emp = banco.buscaPeloId(id);
		
		System.out.println(emp.getNome());
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/formAlterarEmpresa.jsp");
		request.setAttribute("empresa", emp);
		requestDispatcher.forward(request, response);
		
	}

}
