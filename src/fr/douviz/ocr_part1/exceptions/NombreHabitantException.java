package fr.douviz.ocr_part1.exceptions;

public class NombreHabitantException extends Exception {
	
	public NombreHabitantException(int nbre) {
		System.out.println("Nombre d'habitants négatif ! =>" + nbre );
	}
	
}
