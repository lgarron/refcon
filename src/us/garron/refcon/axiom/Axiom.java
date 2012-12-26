package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public abstract class Axiom {
	
	public abstract Locus[] lociBuiltFrom();
	
	// TODO: Make abstract and provide custom descriptions like "created by folding Point 1 to Point 2".
	@Deprecated
	public abstract String description(Locus locus);
//	{
//		Locus[] lociBuiltFrom = lociBuiltFrom();
//		String description = "using " + getClass().getName() + ": ";
//		for (Locus locus : lociBuiltFrom) {
//			description += locus.name() + ", ";
//		}
//		return description;
//	}
	
	public void generateConstruction(StepByStep stepByStep) {
		Locus[] lociBuiltFrom = lociBuiltFrom();
		for (Locus locus : lociBuiltFrom) {
			locus.generateConstruction(stepByStep);
		}
	}
	
}
