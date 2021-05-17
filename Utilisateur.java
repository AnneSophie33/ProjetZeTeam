package fr.eni.zeteam.projetEncheres.bo;

public class Utilisateur {

	//Attributs
	private int noUtilisateur;
	private String pseudo;
	private String prenom;
	private String email;
	private String telephone;
	private String rue;
	private String codePostal;
	private String ville;
	private String motDePasse;
	private int credit;
	private boolean administrateur;
	
	
	//constructeurs
	public Utilisateur() {
		super();
	}



	public Utilisateur(int noUtilisateur, String pseudo, String prenom, String email, String telephone, String rue,
			String codePostal, String ville, String motDePasse, int credit) {
		super();
		this.noUtilisateur = noUtilisateur;
		this.pseudo = pseudo;
		this.prenom = prenom;
		this.email = email;
		this.telephone = telephone;
		this.rue = rue;
		this.codePostal = codePostal;
		this.ville = ville;
		this.motDePasse = motDePasse;
		this.credit = credit;
		this.administrateur = false;
	}
	
	//getters and setters
	
	
}
