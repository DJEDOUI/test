package ma.exelib.projet.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;

public class ConnectionBDD {

	public static String URL = "jdbc:mysql://localhost:3306/tplogin?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
	// public static String URL = "jdbc:mysql://localhost:3306/tplogin";
	public static final String LOGIN = "root";
	public static final String PASSWORD = "root";

	/*
	 * METHODES
	 */

	// TESTER LA CONEXION
	public static void Connect() throws SQLException {
		Connection con = null;
		con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
		System.out.println(con);
	}

	// INSERER UNE PERSONNE
	private final static String QUERY_SAVE_PERSONNE = "INSERT INTO personne (Nom_Personne, Prenom_Personne, Ville_Personne) VALUES (?, ?, ?) ";

	public static void insertPersonne(Personne personne) throws Exception {
		try {
			Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			PreparedStatement stmt = con.prepareStatement(QUERY_SAVE_PERSONNE);
			stmt.setString(1, personne.getNom_Personne());
			stmt.setString(2, personne.getPrenom_Personne());
			stmt.setString(3, personne.getVille_Personne());
			stmt.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
		}

	}

	// TROUVER UNE PERSONNE AVEC SON NOM
	private final static String QUERY_FIND_PERSON_NAME = "SELECT * FROM personne WHERE Nom_Pers = ?";

	public static Personne selectPersonne(String nom) throws SQLException {
		Connection con = null;
		PreparedStatement stmt = null;
		Personne personne = null;
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.prepareStatement(QUERY_FIND_PERSON_NAME);
			stmt.setString(1, nom);
			ResultSet rset = stmt.executeQuery();
			if (rset.next()) {
				personne = rsetToPersonne(rset);
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
		return personne;
	}

	private static Personne rsetToPersonne(ResultSet rset) throws SQLException {
		Personne personneRetourne = new Personne();
		personneRetourne.setId_Personne(rset.getInt("id_Personne"));
		personneRetourne.setNom_Personne(rset.getString("Nom_Personne"));
		personneRetourne.setPrenom_Personne(rset.getString("Prenom_Personne"));
		System.out.println(personneRetourne);
		return personneRetourne;
	}

	// TROUVER UNE PERSONNE AVEC SON ID
	private final static String QUERY_FIND_PERSONNE_ID = "SELECT Nom_Personne, Prenom_Personne FROM personne WHERE id_Personne = ?";

	public static Personne selecPersonneWithId(int id) throws SQLException {
		Personne personne = null;
		try {
			Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			PreparedStatement stmt = con.prepareStatement(QUERY_FIND_PERSONNE_ID);
			stmt.setInt(1, id);
			ResultSet rset = stmt.executeQuery();
			if (rset.next()) {
				personne = rsetToPersonne(rset);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return personne;
	}

	public static DefaultTableModel getData() {

		DefaultTableModel dm = new DefaultTableModel();
		dm.addColumn("Id");
		dm.addColumn("Nom");
		dm.addColumn("Prénom");
		dm.addColumn("Ville");

		String sql = "select * from personne";

		try {
			Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			PreparedStatement stmt = con.prepareStatement(QUERY_FIND_PERSONNE_ID);

			ResultSet rst = stmt.executeQuery(sql);
			System.out.println(rst);

			while (rst.next()) {
				String id = rst.getString(1);
				String nom = rst.getString(2);
				String prenom = rst.getString(3);
				String ville = rst.getString(4);

				Object[] rowData = { id, nom, prenom, ville };
				dm.addRow(rowData);
				System.out.println(rowData);
			}

			return dm;

		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	// RECUPERER TOUS LES USERS
	private final static String QUERY_FIND_PERSONNE = "SELECT * FROM personne ";

	public static ArrayList<Personne> requetSelectPersonne() throws SQLException {
		ArrayList<Personne> listPersonnes = new ArrayList<Personne>();
		try {
			Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			Statement stmt = con.createStatement();
			ResultSet rset = stmt.executeQuery(QUERY_FIND_PERSONNE);
			while (rset.next()) {
				Personne personne = rsetToPersonne(rset);
				listPersonnes.add(personne);
			}
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return listPersonnes;
	}

	// METTRE A JOUR UNE PERSONNE
	private final static String QUERY_UPDATE_PERSONNE = "UPDATE personne SET Nom_Personne = ?, Prenom_Personne = ?, Ville_Personne = ? WHERE id_Personne = ? ";

	public static void updatePersonne(String str1, String str2, String str3, String id) throws Exception {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.prepareStatement(QUERY_UPDATE_PERSONNE);
			stmt.setString(1, str1);
			stmt.setString(2, str2);
			stmt.setString(3, str3);
			stmt.setString(4, id);
			stmt.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
	}

	// SUPPRIMER UNE PERSONNE
	private final static String QUERY_DELETE_PERSONNE = "DELETE FROM personne WHERE id_Personne = ? ";

	public static void deletePersonne(String id) throws Exception {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.prepareStatement(QUERY_DELETE_PERSONNE);
			stmt.setString(1, id);
			stmt.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
		}

	}

	// SUPPRIMER UNE TABLE
	private final static String QUERY_DELETE_TABLE = "TRUNCATE TABLE personne";

	public static void deleteTable() throws Exception {
		Connection con = null;
		PreparedStatement stmt = null;
		try {
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			stmt = con.prepareStatement(QUERY_DELETE_TABLE);
			stmt.executeUpdate();
		} catch (final SQLException e) {
			e.printStackTrace();
		}

	}

}