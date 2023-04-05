package controllor;

import java.io.IOException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class singinServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public singinServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		HttpSession session= request.getSession();
		RequestDispatcher dispatcher=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/pathfinder_bd?useSSl=false","root","4291");
			PreparedStatement pst = con.prepareStatement("select * from Utilisateur where email= ? and password=? ");
			pst.setString(1, email);
			pst.setString(2, password);
			
			ResultSet rs = pst.executeQuery();
			if(rs.next()) {
				session.setAttribute("nom",rs.getString("nom"));
				dispatcher = request.getRequestDispatcher("mainpage.jsp");
			}else {
				request.setAttribute("status", "failed");
				dispatcher = request.getRequestDispatcher("signin.jsp");
			}
			dispatcher.forward(request, response);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
