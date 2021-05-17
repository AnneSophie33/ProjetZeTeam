package fr.eni.zeteam.projetEncheres.bo;

public class Administrateur extends Utilisateur {

	private Utilisateur admin ;
	private boolean administrateur;
	
	
	public Administrateur() {
		super();
	}

	public Administrateur(int noUtilisateur, String pseudo, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit) {
		admin = new Utilisateur(noUtilisateur, pseudo, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit);
		this.administrateur= true;
	}

	
	
	
	
	
}
