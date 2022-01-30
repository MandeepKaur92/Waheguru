package com.kn.pp.mj.week3.Average;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Average
 */
@WebServlet("/Average")
public class Average extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Average() {
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
		
		response.setContentType("text/html");  
	    PrintWriter out = response.getWriter();  
	    
		     String name=request.getParameter("name");
			int num1=Integer.parseInt(request.getParameter("no1"));
			int num2=Integer.parseInt(request.getParameter("no2"));
			int num3=Integer.parseInt(request.getParameter("no3"));
			int num4=Integer.parseInt(request.getParameter("no4"));
			int num5=Integer.parseInt(request.getParameter("no5"));
			
			int marks[]= {num1,num2,num3,num4,num5};
			 
			
		
			long avg=((num1+num2+num3+num4+num5)/5);
			int max = marks[0];
			 int min =marks[0];
			 
			 for (int i = 1;i<5;i++ )
					    {
					        if ( marks[i] > max )
					            max = marks[i];
					        if  (marks[i] < min )
					            min = marks[i];
					    }
			 
			 out.print("Subject 1:"+num1+"\n Subject 2:" +num2+"\n Subject 3:" +num3+"\n Subject 4:" +num4+"\n Subject 5:" +num5+"\n Average"+avg+"\n max:"+max+"min"+min);
	}

}
