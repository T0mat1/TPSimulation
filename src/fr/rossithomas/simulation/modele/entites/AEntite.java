package fr.rossithomas.simulation.modele.entites;

import java.util.Map;

/**
 * Classe abstraite que toute entité doit implémenter
 * @author Thomas Rossi
 * @version 1.0
 */
public abstract class AEntite {
	
	/**
	 * Liste des attributs avec leurs noms	
	 */
	protected Map<String, Number> attributs;

	/**
	 * Getter pour les attributs
	 * @return les attributs
	 */
	public Map<String, Number> getAttributs() {
		return attributs;
	}
	
	/**
	 * Getter pour un attribut
	 * @param nom le nom de l'attribut
	 * @return la valeur de l'attribut
	 */
	public Number getAttribut(String nom) {
		return attributs.get(nom);
	}
	
	/**
	 * Setter pour un attribut
	 * @param nom le nom de l'attribut
	 * @param la valeur de l'attribut
	 */
	public void setAttribut(String nom, Number valeur) {
		attributs.replace(nom, valeur);
	}
	
	/**
	 * Méthode permettant d'ajouter un attribut
	 * @param nom le nom de l'attribut
	 * @param valeur la valeur de l'attribut
	 */
	public void addAttribut(String nom, Number valeur) {
		attributs.put(nom, valeur);
	}

}
