package com.kn.pp.mj.week3.Average;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
			 String grades;
			 if(avg<=49 && avg >0)
			 {
				 grades="F";
			 }
			 else if(avg<=59 && avg >=50)
			 {
				 grades="D";
			}
			 else if(avg<=62 && avg >=60)
			 {
				 grades="C-";
			 }
			 else if(avg<=66 && avg >=63)
			 { 
				 grades="C";
			 }else if(avg<=69 && avg >=67)
			 { 
				 grades="C+";
			 }
			 else if(avg<=72 && avg >=70)
			 { 
				 grades="B-";
			 }
			 else if(avg<=76 && avg >=73)
			 {
				 grades="B";
			 }
			 else if(avg<=70 && avg >=77)
			 {
				 grades="B+";
			 }
			 else if(avg<=86 && avg >=80)
			 { 
				 grades="A-";
			 }
			 else if(avg<=93 && avg >=87)
			 {
				 grades="A";
			}
			 else 
			 {
				 grades="A+";
			}
			 out.println("Grade: "+grades);			 
			 out.print("Subject 1:"+num1+"\n Subject 2:" +num2+"\n Subject 3:" +num3+"\n Subject 4:" +num4+"\n Subject 5:" +num5+"\n Average"+avg+"\n max:"+max+"min"+min);
			 
			 request.setAttribute("min",min);
			 request.setAttribute("max", max);
			 request.setAttribute("avg", avg);
			 request.setAttribute("grades",grades);
			 
			 
		      //response.sendRedirect("final.jsp");
			 //response.sendRedirect("final.jsp?min="+min+"&max="+max);
			  RequestDispatcher rd=request.getRequestDispatcher("/final.jsp");  
		      rd.forward(request,response); 
			 
			 //response.sendRedirect("final.jsp?min="+min+"&max="+max+"&avg="+avg+"grades"+grades);
	}

}
