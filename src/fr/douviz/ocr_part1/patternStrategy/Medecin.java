package fr.douviz.ocr_part1.patternStrategy;

public class Medecin extends Personnage {
	public Medecin() {
		this.soin = new Operation();
	}

	public Medecin(EspritCombatif esprit, Soin soin, Deplacement dep) {
		super(esprit, soin, dep);
	}
}
