package fr.rossithomas.simulation.modele.evenements;

/**
 * Interface qu'un événement doit implémenter
 * @author Thomas Rossi
 * @version 1.0
 * @see FunctionalInterface
 */
public interface IEvenement {

	/**
	 * Fonction éxécutée par l'événement
	 */
	public void execute();
	
}
