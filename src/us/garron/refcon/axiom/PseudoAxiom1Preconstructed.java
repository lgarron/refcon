package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class PseudoAxiom1Preconstructed extends Axiom {
	
	public PseudoAxiom1Preconstructed() {
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
		};
	}

	public String description(Locus locus) {
		return locus.name() + " is pre-constructed.";
	}
}
