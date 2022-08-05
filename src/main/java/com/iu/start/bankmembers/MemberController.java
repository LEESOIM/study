package com.iu.start.bankmembers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/MemberController")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("멤버 관리");
//		request.setCharacterEncoding("UTF-8");
//		response.setCharacterEncoding("UTF-8");
		
		String path = request.getPathInfo();
		if(path.equals("/login")) {
			
			if(request.getMethod().equals("POST")) {
				System.out.println("로그인 처리");
			} else {
				path = "/WEB-INF/view/member/login.jsp";
			}
			
			//redirect
//			response.sendRedirect("../");
//			return;
			
		}else if(path.equals("/join")) {
			path = "/WEB-INF/view/member/join.jsp";
		}
		
		RequestDispatcher veiw = request.getRequestDispatcher(path);
		veiw.forward(request, response);
		
		

		
//		String method = request.getMethod();
//		String url = request.getRequestURL().toString();
//		String uri = request.getRequestURI();
//		String pathInfo = request.getPathInfo(); //맨끝 URL을 판단할수있다
//		String contextPath = request.getContextPath(); //루트폴더명
//		System.out.println(method);
//		System.out.println(url);
//		System.out.println(uri);
//		System.out.println(pathInfo);
//		System.out.println(contextPath);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
