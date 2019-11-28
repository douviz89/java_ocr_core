package fr.douviz.ocr_part1.patternStrategy;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
//		Personnage[] pers = { new Guerrier(), new Civil(), new Medecin() };
//
//		for (int i = 0; i < pers.length; i++) {
//			Personnage personnage = pers[i];
//
//			System.out.println("\nInstance de " + personnage.getClass().getName());
//			System.out.println("*****************************************");
//			personnage.combattre();
//			personnage.seDeplacer();
//			personnage.soigner();
//		}
		
		Personnage guerrier = new Guerrier();
		
		guerrier.soigner();
		
		guerrier.setSoin(new Soin() {
			public void soigner() {
				System.out.println("je soigne avec une classe anonyme");
			}
		});
		
		guerrier.soigner();
	}

}
