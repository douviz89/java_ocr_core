package fr.douviz.ocr_part1.exceptions;

public class NombreHabitantException extends Exception {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NombreHabitantException(int nbre) {
		System.out.println("Nombre d'habitants n�gatif ! =>" + nbre );
	}
	
}
