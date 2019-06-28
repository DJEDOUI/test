package ma.exelib.projet.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.table.DefaultTableModel;

public class myConnection {

	public static DefaultTableModel getData() {

		String URL = "jdbc:mysql://localhost:3306/tplogin?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		// public static String URL = "jdbc:mysql://localhost:3306/tplogin";
		final String LOGIN = "root";
		final String PASSWORD = "root";

		DefaultTableModel dm = new DefaultTableModel();

		dm.addColumn("Id");
		dm.addColumn("Nom");
		dm.addColumn("Prénom");
		dm.addColumn("Ville");

		String sql = "select * from personne";

		try {
			Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rst = stmt.executeQuery(sql);
			while (rst.next()) {
				String id = rst.getString(1);

				String nom = rst.getString(2);
				String prenom = rst.getString(3);
				String ville = rst.getString(4);
				Object[] rowData = { id, nom, prenom, ville };
				dm.addRow(rowData);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			IHM.displayErreur(ex);
		}
		return dm;
	}

	public static DefaultTableModel UpdateData() {

		String URL = "jdbc:mysql://localhost:3306/tplogin?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
		// public static String URL = "jdbc:mysql://localhost:3306/tplogin";
		final String LOGIN = "root";
		final String PASSWORD = "root";

		DefaultTableModel dm = new DefaultTableModel();

		String sql = "UPDATE personne SET Nom_Personne = ?, Prenom_Personne = ?, Ville_Personne = ? WHERE id_Personne = ?";

		try {
			Connection con = DriverManager.getConnection(URL, LOGIN, PASSWORD);
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rst = stmt.executeQuery(sql);
			while (rst.next()) {
				String id = rst.getString(1);
				String nom = rst.getString(2);
				String prenom = rst.getString(3);
				String ville = rst.getString(4);
				Object[] rowData = { id, nom, prenom, ville };
				dm.addRow(rowData);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
			IHM.displayErreur(ex);
		}
		return dm;
	}

}
