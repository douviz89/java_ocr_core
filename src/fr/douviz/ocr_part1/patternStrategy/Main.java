package fr.douviz.ocr_part1.patternStrategy;

import java.util.function.Consumer;
import java.util.function.Predicate;

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
		
		guerrier.setSoin(() -> System.out.println("je soigne avec une classe anonyme")); // lambda exrepssion
		
		guerrier.soigner();
		
	}

}
