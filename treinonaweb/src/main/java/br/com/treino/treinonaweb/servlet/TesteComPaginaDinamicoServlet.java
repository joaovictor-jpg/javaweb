package br.com.treino.treinonaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//apelido
@WebServlet(urlPatterns = "/teste")
public class TesteComPaginaDinamicoServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//		getOutPutStream() = para devolver um fluxo binario
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
//		out.println("<meta charset='utf-8'>");
		out.println("<title>Dinamico</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>chegou no fluxo Dinamico</h1>");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("Chegou aqui");
	}
}
