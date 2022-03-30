package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AlterarEmpresaServlet
 */
@WebServlet("/alteraEmpresa")
public class AlterarEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parameterNome = request.getParameter("nome");
		String parameterId = request.getParameter("id");
		String parameterDate = request.getParameter("date");
		Date parse = null;
		
		Integer id = Integer.valueOf(parameterId);
				
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			parse = sdf.parse(parameterDate);			
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Empresa emp = banco.buscaPeloId(id);
		emp.setNome(parameterNome);
		emp.setDataAbertura(parse);
		
		response.sendRedirect("listaEmpresa");
	}

}
