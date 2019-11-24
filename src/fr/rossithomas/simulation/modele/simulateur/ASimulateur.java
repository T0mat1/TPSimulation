package fr.rossithomas.simulation.modele.simulateur;

import java.util.Map;

import fr.rossithomas.simulation.modele.Echeancier;
import fr.rossithomas.simulation.modele.entites.AEntite;

/**
 * Classe abstraite que doit implémenter un simulateur.
 * Idéalement, le simulateur implémenté doit être un singleton
 * @author Thomas Rossi
 * @version 1.0
 */
public abstract class ASimulateur {
	
	/**
	 * L'échéancier de la simulation
	 */
	protected Echeancier echeancier = Echeancier.getInstance();
	
	/**
	 * Dictionnaire contenant les variables de la simulation
	 */
	protected Map<String, Number> variables;
	
	/**
	 * Dictionnaire contenant les indicateurs statistiques
	 */
	protected Map<String, Number> indicateursStatistiques;
	
	/**
	 * Dictionnaire contenant les entités
	 */
	protected Map<String, AEntite> entites;

	/**
	 * Getter des variables de la simulation
	 * @return les variables
	 */
	public Map<String, Number> getVariables() {
		return variables;
	}
	
	/**
	 * Getter d'une variable
	 * @param nom de la variable
	 * @return la valeur de la variable
	 */
	public Number getVariable(String nom) {
		return variables.get(nom);
	}
	
	/**
	 * Setter d'une variable
	 * @param nom de la variable à modifier
	 * @param valeur la nouvelle valeur de la variable
	 */
	public void setVariable(String nom, Number valeur) {
		
	}
	
	/**
	 * Méthode permettant d'ajouter une variable
	 * @param nom de la variable à ajouter
	 * @param valeur de la variable à ajouter
	 */
	public void addVariable(String nom, Number valeur) {
		
	}
	
	/**
	 * Méthode permettant d'ajouter une variable
	 * La variable est initialisée à zéro en tant que Double
	 * @param nom de la variable à ajouter
	 * @see Double
	 */
	public void addVariable(String nom) {
		addVariable(nom, 0d);
	}

	/**
	 * Getter des indicateurs statistiques de la simulation
	 * @return les indicateurs statistiques
	 */
	public Map<String, Number> getIndicateursStatistiques() {
		return indicateursStatistiques;
	}
	
	/**
	 * Getter d'un indicateur statistique
	 * @param nom de l'indicateur statistique
	 * @return la valeur de l'indicateur statistique
	 */
	public Number getIndicateur(String nom) {
		return indicateursStatistiques.get(nom);
	}
	
	/**
	 * Setter d'un indicateur statistique
	 * @param nom le nom de l'indicateur statistique
	 * @param valeur la nouvelle valeur de l'indicateur statistique
	 */
	public void setIndicateur(String nom, Number valeur) {
		
	}
	
	/**
	 * Méthode permettant d'ajouter un indicateur statistique
	 * @param nom le nom de l'indicateur statistique
	 * @param valeur la valeur de l'indicateur statistique
	 */
	public void addIndicateur(String nom, Number valeur) {
		
	}
	
	/**
	 * Méthode permettant d'ajouter un indicateur statistique
	 * La valeur de l'indicateur est initialisée à zéro en tant que Double
	 * @param nom le nom de l'indicateur statistique
	 */
	public void addIndicateur(String nom) {
		addIndicateur(nom, 0d);
	}

	/**
	 * Getter des entités de la simulation
	 * @return les entites
	 */
	public Map<String, AEntite> getEntites() {
		return entites;
	}
	
	/**
	 * Getter d'une entité
	 * @param nom de l'entité
	 * @return l'entité
	 */
	public AEntite getEntite(String nom) {
		return entites.get(nom);
	}
	
	/**
	 * Setter d'une entité
	 * @param nom de l'entité
	 * @param l'entite 
	 */
	public void setEntite(String nom, AEntite entite) {
		
	}
	
	/**
	 * Méthode permettant d'ajouter une entite à la simulation
	 * @param nom de l'entite
	 * @param l'entite
	 */
	public void addEntite(String nom, AEntite entite) {
		
	}

}
