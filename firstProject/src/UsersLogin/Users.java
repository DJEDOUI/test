package UsersLogin;

public class Users {
	int Id_user;
	String Nom_user;
	String Prenom_user;
	String Email_user;
	String Pseudo_user;
	String PassWord_user;

	/*
	 * CONSTRUCTOR OF USER
	 */
	/**
	 * @param nom_user
	 * @param prenom_user
	 * @param email_user
	 * @param pseudo_user
	 * @param passWord_user
	 */
	public static int Id = 0;

	/**
	 *
	 */
	public Users() {
		super();
	}

	public Users(String nom_user, String prenom_user, String email_user, String pseudo_user, String passWord_user) {
		this.Id_user = Id++;
		this.Nom_user = nom_user;
		this.Prenom_user = prenom_user;
		this.Email_user = email_user;
		this.Pseudo_user = pseudo_user;
		this.PassWord_user = passWord_user;
	}

	/*
	 * GETTER AND SETTER
	 *
	 */

	// TO GET THE VALUE OF THE NAME OF THE USER
	public String getNom_user() {
		return Nom_user;
	}

	// TO DEFINE THE VALUE OF THE NAME OF THE USER
	public void setNom_user(String nom_user) {
		Nom_user = nom_user;
	}

	public int getId_user() {
		return Id_user;
	}

	public void setId_user(int id_user) {
		Id_user = id_user;
	}

	public String getPrenom_user() {
		return Prenom_user;
	}

	public void setPrenom_user(String prenom_user) {
		Prenom_user = prenom_user;
	}

	public String getEmail_user() {
		return Email_user;
	}

	public void setEmail_user(String email_user) {
		Email_user = email_user;
	}

	public String getPseudo_user() {
		return Pseudo_user;
	}

	public void setPseudo_user(String pseudo_user) {
		Pseudo_user = pseudo_user;
	}

	public String getPassWord_user() {
		return PassWord_user;
	}

	public void setPassWord_user(String passWord_user) {
		PassWord_user = passWord_user;
	}

}
