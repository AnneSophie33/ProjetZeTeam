package fr.eni.zeteam.projetEncheres.bo;

public class Administrateur extends Utilisateur {

	
	public Administrateur() {

	}

	public Administrateur(int noUtilisateur, String pseudo, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit, String administrareur) {
		super(noUtilisateur, pseudo, prenom, email, telephone, rue, codePostal, ville, motDePasse, credit, true);
	}

	
}
