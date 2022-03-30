package br.com.alura.gerenciador.servlet;

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
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("Chegou aqui!");
		String parameter = request.getParameter("nome");
		String parameter2 = request.getParameter("date");
		Date parse = null;
		
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			parse = sdf.parse(parameter2);			
		} catch (Exception e) {
			throw new ServletException(e);
		}

		Empresa empresa = new Empresa();
		empresa.setNome(parameter);
		empresa.setDataAbertura(parse);

		Banco banco = new Banco();
		banco.adicionar(empresa);

		response.sendRedirect("listaEmpresa");
		
//		// Chamar o servelet
//		RequestDispatcher requestDispatcher =
//				request.getRequestDispatcher("/listaEmpresa");
//		request.setAttribute("empresa", empresa.getNome());
//		requestDispatcher.forward(request, response);
	}

}
