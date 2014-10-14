package test.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import test.repository.UsersRepository;

@SuppressWarnings("serial")
public class TestServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		
		UsersRepository ur = (UsersRepository) context.getBean("usersRepository");
		
		PrintWriter out = response.getWriter();
		out.print(ur.getById(Integer.parseInt(request.getParameter("id"))));
		
	}
}
