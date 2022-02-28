package DisplayProduct;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/app")
public class ProductDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pId = request.getParameter("productId");
		String pName = request.getParameter("Productname");
		String price = request.getParameter("price");
		
		HttpSession theSession = request.getSession();
		
		theSession.setAttribute("pid", pId);
		theSession.setAttribute("pname", pName);
		theSession.setAttribute("price",price);
		
		response.sendRedirect("products.jsp");
		
		
	}

}