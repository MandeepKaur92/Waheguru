package com.kn.pp.mj.week3.Outline;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Outline
 */
@WebServlet("/Outline")
public class Outline extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Outline() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.sendRedirect("https://www.google.com/search?q=lambton+college+toronto+computer+software+and+database+development+outline&rlz=1C1CHZN_enIN941IN941&sxsrf=APq-WBufzEK_UqdO3MMbilCem8CPeW2C-w%3A1643584678524&ei=phz3YcquH56vptQPrsGbwAY&ved=0ahUKEwjKma-Hztr1AhWel4kEHa7gBmgQ4dUDCA4&uact=5&oq=lambton+college+toronto+computer+software+and+database+development+outline&gs_lcp=Cgdnd3Mtd2l6EAM6BwgjELADECc6BwgAEEcQsAM6BQgAEM0COgcIIxCwAhAnOgQIIRAKSgQIQRgASgQIRhgAUOICWKT7A2DLhgRoCHACeACAAdoEiAHbTpIBDDYuMzMuMi4xLjUuNJgBAKABAcgBCcABAQ&sclient=gws-wiz");
	}

}
