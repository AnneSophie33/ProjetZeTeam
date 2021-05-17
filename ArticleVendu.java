package fr.eni.zeteam.projetEncheres.bo;

import java.util.Date;

public class ArticleVendu {
	//attributes
	private int noArticle;
	private String nomArticle;
	private String description;
	private Date dateDebutEncheres;
	private Date dateFinEncheres;
	//miseAPrix sur UML
	private int prixInitial;
	private int prixVente;
	private boolean administrateur;
	private int noUtilisateur;
	private int noCategorie;
	
	//constructors
	public ArticleVendu() {
		super();
	}
	public ArticleVendu(int noArticle, String nomArticle, String description, Date dateDebutEncheres,
			Date dateFinEncheres, int prixInitial, int prixVente, boolean administrateur, int noUtilisateur,
			int noCategorie) {
		super();
		this.noArticle = noArticle;
		this.nomArticle = nomArticle;
		this.description = description;
		this.dateDebutEncheres = dateDebutEncheres;
		this.dateFinEncheres = dateFinEncheres;
		this.prixInitial = prixInitial;
		this.prixVente = prixVente;
		this.administrateur = administrateur;
		this.noUtilisateur = noUtilisateur;
		this.noCategorie = noCategorie;
	}
	//getters and setters, ADMIN no setter
	
	
}
