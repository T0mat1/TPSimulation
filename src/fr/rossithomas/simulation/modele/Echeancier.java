package fr.rossithomas.simulation.modele;

import java.util.ArrayList;
import java.util.List;

import org.javatuples.Pair;

import fr.rossithomas.simulation.modele.evenements.AEvenement;

/**
 * Classe représentant l'échéancier de la simulation.
 * L'échéancier représente une liste contenant tous les événements auxquels on associe une date.
 * @author Thomas Rossi
 * @version 1.0
 */
public class Echeancier {
	
	private static Echeancier instance = null;
	
	/**
	 * La liste des couples (evenement, date)
	 * @see AEvenement
	 */
	private List<Pair<AEvenement, Integer>> listeEcheancier;
	
	/**
	 * Constructeur private
	 */
	private Echeancier() {
		listeEcheancier = new ArrayList<>();
	}
	
	/**
	 * Getter pour le singleton de l'échéancier
	 * @return l'instance de l'échéancier
	 */
	public static Echeancier getInstance() {
		if (instance == null) {
			instance = new Echeancier();
		}
		return instance;
	}
	
	/**
	 * Méthode permettant d'ajouter un événement à une date donnée dans l'échéancier.
	 * Les éléments sont ajoutés dans l'ordre des dates croissantes, 
	 * c'est à dire que les événements vont s'éxécuter dans l'ordre de la liste.
	 * @param evenement l'événement à ajouter
	 * @param date la date à laquelle l'événement doit s'éxécuter
	 * @see AEvenement
	 */
	public void addEvenement(AEvenement evenement, Integer date) {
		for (int index = 0 ; index < listeEcheancier.size() ; index++) {
			if (listeEcheancier.get(index).getValue1() > date) {
				listeEcheancier.add(index, new Pair<>(evenement, date));
			}
		}
	}
	
	/**
	 * Méthode permettant de récupérer le prochain événement à éxécuter.
	 * @return le couple événement, date
	 * @see AEvenement
	 * @see Pair
	 */
	public Pair<AEvenement, Integer> getEvenement() {
		return listeEcheancier.get(0);
	}
	
	/**
	 * Méthode permettant de savoir si l'échéancier est vide ou non.
	 * @return <i>true</i> si l'échéancier est vide, <i>false</i> sinon.
	 */
	public Boolean estVide() {
		return listeEcheancier.isEmpty();
	}
	
	/**
	 * Méthode permettant de vider l'écéhancier
	 */
	public void viderEcheancier() {
		listeEcheancier.clear();
	}

}
