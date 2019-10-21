package fr.douviz.ocr_part1;

import fr.douviz.ocr_part1.exceptions.NomVilleException;
import fr.douviz.ocr_part1.exceptions.NombreHabitantException;

public class Ocr1Main {

	public static void main(String[] args) {

		Ville v = null;
		try {
			v = new Ville("re", 12000, "France");
		} catch (NombreHabitantException | NomVilleException e) {
			System.out.println(e.getMessage());
		} 
		finally {
			if (v == null) {
				v = new Ville();
			}
		}

		System.out.println(v.toString());
	}

}
