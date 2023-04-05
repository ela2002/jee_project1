package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import model.Utilisateur;

 public class UtilisateurDao {
	
	 static Connection ConnexionBase() {
			Connection con = null;
			String username = "root";
			String password = "4291";

			String url = "jdbc:mysql://localhost:3306/pathfinder_bd";

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, username, password);
				System.out.println("La connection avec la base de donnée est établie.");
			} catch (Exception e) {
				System.out.print("Désolé ! la connection à la base de donnée n'est pas établie");
			}
			return con;
		}

	 
	 public static void addUser(Utilisateur user) {

			Connection con = ConnexionBase();

			Statement stmt;
			try {
				
					stmt = con.createStatement();
					String insertString = "insert into Utilisateut values ( '" + user.getNom() + "' , '" + user.getPrenom()
							+ " ', '" + user.getEmail() + "," + user.getPassword() + ");";
					int status = stmt.executeUpdate(insertString);
					if (status == 0)
						System.out.println("Le client n'a pas été ajouté");
					else
						System.out.println("Le client a été ajouté avec succes");
					stmt.close();
					con.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	 public static void main(String[] args) {
		 Utilisateur user1=new Utilisateur("ela","rebai","ela@gmail.com","blabla");
		 addUser(user1);
		 	
	 }

	 
	 
	 
	
} 
