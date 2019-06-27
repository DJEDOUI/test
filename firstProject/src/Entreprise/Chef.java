package Entreprise;

public class Chef extends Employe {

	private String service;

	public Chef(String n, String p, String d, double s, String serv) {
		super(n, p, d, s);
		service = serv;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@Override
	public String Afficher() {
		// TODO Auto-generated method stub
		return (super.Afficher() + " rattaché au service: " + getService());
	}
}
