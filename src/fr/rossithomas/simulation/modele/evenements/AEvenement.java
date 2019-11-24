package fr.rossithomas.simulation.modele.evenements;

import fr.rossithomas.simulation.modele.simulateur.ASimulateur;

/**
 * Classe abstraite pour un événement
 * @author Thomas Rossi
 * @version 1.0
 */
public abstract class AEvenement {
	
	/**
	 * Le simulateur
	 * @see ASimulateur
	 * @see ISimulateur
	 */
	protected ASimulateur simulateur;

	/**
	 * @return le simulateur
	 * @see ASimulateur
	 * @see ISimulateur
	 */
	public ASimulateur getSimulateur() {
		return simulateur;
	}

	

}
