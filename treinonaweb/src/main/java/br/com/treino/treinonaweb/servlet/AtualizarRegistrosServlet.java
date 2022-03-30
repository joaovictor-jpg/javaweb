package br.com.treino.treinonaweb.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AtualizarRegistrosServlet
 */
@WebServlet("/atualizarRegistros")
public class AtualizarRegistrosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String parameterNome = request.getParameter("nome");
		String parameterDate = request.getParameter("date");
		String parameterId = request.getParameter("id");
		Date dataCadastro = null;
		
		Integer id = Integer.valueOf(parameterId);
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
			dataCadastro = sdf.parse(parameterDate);
		} catch (Exception e) {
			throw new ServletException(e);
		}
		
		Banco banco = new Banco();
		Navio navio = banco.buscaPorId(id);
		
		navio.setNome(parameterNome);
		navio.setDataCadastro(dataCadastro);
		
		response.sendRedirect("listaNavio");
		
	}

}
