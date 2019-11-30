package fr.douviz.ocr_part1.patternStrategy;

public class Pacifiste implements EspritCombatif {
	@Override
	public void combat() {
		System.out.println("Je ne combats pas !");
	}
}