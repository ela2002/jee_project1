package controllor;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.UtilisateurDao;
import model.Utilisateur;

@WebServlet("/signuppage")
public class UtilisateurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private UtilisateurDao userDao=new UtilisateurDao();
   
    public UtilisateurServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/signup.jsp");
		dispatcher.forward(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom= request.getParameter("nom");
		String prenom= request.getParameter("prenom");
		String email= request.getParameter("email");
		String password= request.getParameter("password");
		
		Utilisateur user = new Utilisateur();
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setPassword(password);
		
		UtilisateurDao.addUser(user);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("../../../webapp/WEB-INF/views/signin.jsp");
		dispatcher.forward(request,response);
		
	}


	

}
