package UsersLogin;

import java.sql.Connection;
//import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectionBDD {

	public static String URL = "jdbc:mysql://localhost:3306/tpLogin";
	public static final String LOGIN = "root";
	public static final String PASSWORD = "root";

	private final static String QUERY_SAVE_USERS = "INSERT INTO users (nom, prenom, email, pseudo, mdp) VALUES (?, ?, ?, ?, ?) ";

	public static void insertUsers(Users user) throws Exception {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			// DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.prepareStatement(QUERY_SAVE_USERS);
			System.out.println(con);
			stmt.setString(1, user.getNom_user());
			stmt.setString(2, user.getPrenom_user());
			stmt.setString(3, user.getEmail_user());
			stmt.setString(4, user.getPseudo_user());
			stmt.setString(5, user.getPassWord_user());
			stmt.executeUpdate();
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	//////////////////////// Trouver un user avec son pseudo

	private final static String QUERY_FIND_USER_Pseudo = "SELECT * FROM Users WHERE pseudo_user = ?";

	public static Users selectUser(String pseudo) throws SQLException {
		Connection con = null;
		PreparedStatement stmt = null;
		Users user = null;
		try {
			// DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.prepareStatement(QUERY_FIND_USER_Pseudo);
			stmt.setString(1, pseudo);
			ResultSet rset = stmt.executeQuery();
			if (rset.next()) {
				user = rsetToUser(rset);
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
	}

	private static Users rsetToUser(ResultSet rset) throws SQLException {
		Users userRetourne = new Users();
		userRetourne.setId_user(rset.getInt("id"));
		userRetourne.setNom_user(rset.getString("nom"));
		userRetourne.setPrenom_user(rset.getString("prenom"));
		userRetourne.setEmail_user(rset.getString("email"));
		userRetourne.setPseudo_user(rset.getString("pseudo"));
		userRetourne.setPassWord_user(rset.getString("mdp"));
		return userRetourne;
	}

	//////////////////////// Trouver un user avec son id

	private final static String QUERY_FIND_USER_ID = "SELECT * FROM users WHERE id = ?";

	public static Users selectUserWithId(int id) throws SQLException {
		Connection con = null;
		PreparedStatement stmt = null;
		Users user = null;
		try {
			// DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.prepareStatement(QUERY_FIND_USER_ID);
			stmt.setInt(1, id);
			ResultSet rset = stmt.executeQuery();
			if (rset.next()) {
				user = rsetToUser(rset);
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return user;
	}

	/////////////////////// RECUPERER TOUS LES USERS

	private final static String QUERY_FIND_USERS = "SELECT * FROM users ";

	public static ArrayList<Users> requetSelectUsers() throws SQLException {
		ArrayList<Users> listUsers = new ArrayList<Users>();
		Connection con = null;
		Statement stmt = null;
		try {
			// DriverManager.registerDriver(new Driver());
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(QUERY_FIND_USERS);
			while (rset.next()) {
				// MessageBean msg = rsetToMsg(rset);
				Users user = rsetToUser(rset);
				listUsers.add(user);
			}
		} finally {
			if (con != null) {
				try {
					con.close();
				} catch (final SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return listUsers;
	}

}