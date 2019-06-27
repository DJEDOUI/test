package ma.exelib.projet.classes;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class IHM {

	private JFrame frmMonpersonnel;
	private JTextField NomChamp;
	private JTextField PrenomChamp;
	private JTextField VilleChamp;
	private ActionListener lstInscription;
	private JTextField ID_Champ;
	private JTable table;
	private static JLabel erreur;
	private JTextArea renduChamp;
	private JLabel VilleLabel;
	private JLabel prenomLabel;
	private JLabel NomLabel;
	private JLabel labelID;
	private JButton btnEnregistrer, btnModifier, btnSupprimer, btnCharger;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		try {
			IHM window = new IHM();
			window.frmMonpersonnel.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public IHM() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {

		frmMonpersonnel = new JFrame();
		frmMonpersonnel.setFont(new Font("Broadway", Font.PLAIN, 16));
		frmMonpersonnel.setTitle("Ma_Gestion_De_Personnel");
		frmMonpersonnel.setForeground(new Color(128, 0, 128));
		frmMonpersonnel.setIconImage(
				Toolkit.getDefaultToolkit().getImage(IHM.class.getResource("/resources/images/person-logo.png")));
		frmMonpersonnel.getContentPane().setBackground(new Color(255, 240, 245));
		frmMonpersonnel.getContentPane().addContainerListener(new ContainerAdapter() {
			@Override
			public void componentRemoved(ContainerEvent arg0) {
			}
		});
		frmMonpersonnel.setBounds(100, 100, 1054, 495);
		frmMonpersonnel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMonpersonnel.getContentPane().setLayout(null);

		lstInscription = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Personne personne = new Personne();
				personne.setNom_Personne(NomChamp.getText());
				personne.setPrenom_Personne(PrenomChamp.getText());
				personne.setVille_Personne(VilleChamp.getText());
			}
		};
//////////////////////////////////////////LABELS////////////////////////////////////////////////////////////

		NomLabel = new JLabel("Nom");
		NomLabel.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		NomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		NomLabel.setBounds(12, 24, 68, 36);
		frmMonpersonnel.getContentPane().add(NomLabel);

		prenomLabel = new JLabel("Prenom");
		prenomLabel.setFont(new Font("Franklin Gothic Book", Font.BOLD, 17));
		prenomLabel.setHorizontalAlignment(SwingConstants.CENTER);
		prenomLabel.setBounds(12, 73, 76, 29);
		frmMonpersonnel.getContentPane().add(prenomLabel);

		VilleLabel = new JLabel("Ville");
		VilleLabel.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		VilleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		VilleLabel.setBounds(24, 121, 56, 29);
		frmMonpersonnel.getContentPane().add(VilleLabel);

		renduChamp = new JTextArea("");
		renduChamp.setRows(5);
		renduChamp.setLineWrap(true);
		// renduChamp.setBackground(new Color(255, 255, 255));
		renduChamp.setFont(new Font("Franklin Gothic Book", Font.ITALIC, 17));
		renduChamp.setForeground(new Color(72, 61, 139));
		renduChamp.setBounds(25, 292, 451, 104);
		frmMonpersonnel.getContentPane().add(renduChamp);

		erreur = new JLabel("");
		erreur.setBounds(335, 24, 287, 90);
		frmMonpersonnel.getContentPane().add(erreur);
		erreur.setForeground(Color.RED);
		erreur.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));

		labelID = new JLabel("ID");
		labelID.setHorizontalAlignment(SwingConstants.CENTER);
		labelID.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		labelID.setBounds(34, 173, 31, 26);
		frmMonpersonnel.getContentPane().add(labelID);

///////////////////////////////////////CHAMPS////////////////////////////////////////////////////////////

		NomChamp = new JTextField();
		NomChamp.setBounds(106, 24, 181, 36);
		frmMonpersonnel.getContentPane().add(NomChamp);
		NomChamp.setColumns(10);
		NomChamp.addActionListener(lstInscription);

		PrenomChamp = new JTextField();
		PrenomChamp.setBounds(106, 69, 181, 36);
		frmMonpersonnel.getContentPane().add(PrenomChamp);
		PrenomChamp.setColumns(10);
		PrenomChamp.addActionListener(lstInscription);

		ID_Champ = new JTextField();
		ID_Champ.setColumns(10);
		ID_Champ.setBounds(106, 165, 181, 34);
		frmMonpersonnel.getContentPane().add(ID_Champ);

		VilleChamp = new JTextField();
		VilleChamp.setBounds(106, 118, 181, 34);
		frmMonpersonnel.getContentPane().add(VilleChamp);
		VilleChamp.setColumns(10);

//////////////////////////////////////BOUTONS//////////////////////////////////////////////////////////////

		btnEnregistrer = new JButton("ENREGISTRER");
		btnEnregistrer.setBackground(new Color(255, 192, 203));
		btnEnregistrer.setForeground(new Color(0, 128, 0));
		btnEnregistrer.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		btnEnregistrer.setBounds(26, 220, 156, 46);
		frmMonpersonnel.getContentPane().add(btnEnregistrer);

		btnModifier = new JButton("MODIFIER");
		btnModifier.setFont(new Font("Franklin Gothic Book", Font.BOLD, 17));
		btnModifier.setForeground(new Color(0, 0, 128));
		btnModifier.setBackground(new Color(255, 192, 203));
		btnModifier.setBounds(194, 220, 127, 46);
		frmMonpersonnel.getContentPane().add(btnModifier);

		btnSupprimer = new JButton("SUPPRIMER");
		btnSupprimer.setBackground(new Color(255, 192, 203));
		btnSupprimer.setForeground(new Color(220, 20, 60));
		btnSupprimer.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		btnSupprimer.setBounds(335, 220, 141, 46);
		frmMonpersonnel.getContentPane().add(btnSupprimer);

		btnCharger = new JButton("CHARGER LA LISTE");
		btnCharger.setBackground(new Color(255, 192, 203));
		btnCharger.setForeground(new Color(128, 0, 128));
		btnCharger.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		btnCharger.setBounds(633, 58, 232, 58);
		frmMonpersonnel.getContentPane().add(btnCharger);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				int i = table.getSelectedRow();
				TableModel model = table.getModel();
				System.out.println(model);
				ID_Champ.setText(model.getValueAt(i, 0).toString());
				NomChamp.setText(model.getValueAt(i, 1).toString());
				PrenomChamp.setText(model.getValueAt(i, 2).toString());
				VilleChamp.setText(model.getValueAt(i, 3).toString());
			}
		});
		scrollPane.setViewportBorder(UIManager.getBorder("EditorPane.border"));
		scrollPane.setBounds(486, 126, 535, 270);
		frmMonpersonnel.getContentPane().add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i = table.getSelectedRow();
				TableModel model = table.getModel();
				System.out.println(model);
				ID_Champ.setText(model.getValueAt(i, 0).toString());
				NomChamp.setText(model.getValueAt(i, 1).toString());
				PrenomChamp.setText(model.getValueAt(i, 2).toString());
				VilleChamp.setText(model.getValueAt(i, 3).toString());
			}
		});
		table.setBackground(new Color(173, 216, 230));
		table.setModel(new DefaultTableModel(new Object[][] {}, new String[] {}));
		table.setForeground(new Color(128, 0, 128));
		table.setFont(new Font("Franklin Gothic Book", Font.BOLD | Font.ITALIC, 17));
		scrollPane.setViewportView(table);

////////////////////////////////////////////INSCRIPTION

		btnEnregistrer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if ("".equals(NomChamp.getText()) || ("".equals(PrenomChamp.getText()))) {
					renduChamp.setText("Merci de compléter tous les champs !!!!");
				} else {
					Personne pers1 = new Personne(NomChamp.getText().toUpperCase(), PrenomChamp.getText().toUpperCase(),
							VilleChamp.getText().toUpperCase());
					try {
						ConnectionBDD.insertPersonne(pers1);
						renduChamp.setText("Vous avez ajouté \nNom :" + NomChamp.getText().toUpperCase() + "\nPrénom : "
								+ PrenomChamp.getText().toUpperCase() + "\nVille : "
								+ VilleChamp.getText().toUpperCase());
						deleteChampDonneesInscription();
						refreshList();
					} catch (Exception e) {
						displayErreur(e);
						e.printStackTrace();
					}
				}
			}
		});
////////////////////////////////////////////CHARGER LISTE///////////////////////////////////

		btnCharger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				refreshList();
			}
		});

////////////////////////////////////////////SUPPRESSION

		btnSupprimer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (("".equals(ID_Champ.getText()))) {
					renduChamp.setText("Merci de choisir la personne à supprimer...");
				} else {
					try {
						ConnectionBDD.deletePersonne(ID_Champ.getText());
						deleteChampDonneesInscription();
						refreshList();
					} catch (Exception e1) {
						displayErreur(e1);
						e1.printStackTrace();
					}
				}
			}
		});

////////////////////////////////////////////MDIFICATION

		btnModifier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if ("".equals(NomChamp.getText()) || ("".equals(PrenomChamp.getText()))
						|| ("".equals(VilleChamp.getText()))) {
					renduChamp.setText("Merci de compléter tous les champs !!!!");
				} else {
					try {
						ConnectionBDD.updatePersonne(NomChamp.getText().toUpperCase(),
								PrenomChamp.getText().toUpperCase(), VilleChamp.getText().toUpperCase(),
								ID_Champ.getText());
						renduChamp.setText("Vous avez modifié " + PrenomChamp.getText().toUpperCase());
						deleteChampDonneesInscription();
						refreshList();
					} catch (Exception e2) {
						displayErreur(e2);
						e2.printStackTrace();
					}
				}
			}
		});
	}

//////////////////METHODES
	private void deleteChampDonneesInscription() {
		NomChamp.setText("");
		PrenomChamp.setText("");
		VilleChamp.setText("");
	}

	public static void displayErreur(Exception ex) {
		erreur.setText(ex.toString());
	}

	public void refreshList() {
		new myConnection();
		DefaultTableModel dm = myConnection.getData();
		table.setModel(dm);
	}
}
