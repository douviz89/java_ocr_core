package fr.douviz.ocr_part1.patternStrategy;

public class AucunSoin implements Soin {
	@Override
	public void soigner() {
		System.out.println("Je ne donne AUCUN soin !");
	}
}