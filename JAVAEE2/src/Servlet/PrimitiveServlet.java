package Servlet;

import javax.servlet.*;

import test.Request;
import test.Response;

import java.io.IOException;
import java.io.PrintWriter;
public class PrimitiveServlet implements ServletInterface {
   public void init(ServletConfig config) throws ServletException {
       System.out.println("init");
   }
   public void service(Request request, Response response)
       throws ServletException, IOException {
        System.out.println("from service");
        PrintWriter out = response.getWriter();
        out.println("Hello. Roses are red.");
        out.print("Violets are blue.");
        }
     public void destroy() {
      System.out.println("destroy");
     }
    public String getServletInfo() {
     return null;
    }
      public ServletConfig getServletConfig() {
       return null;
     }
    }
