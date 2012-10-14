package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class PsuedoAxiom1PointFromTwoLines implements Axiom {

	private final Line l1;
	private final Line l2;
	private final Point intersectionPoint;
	
	private PsuedoAxiom1PointFromTwoLines(Line l1, Line l2) {
		this.l1 = l1;
		this.l2 = l2;
		this.intersectionPoint = Locus.dummyPoint;
	}
	
	public static Point define(Line l1, Line l2) {
		return (new PsuedoAxiom1PointFromTwoLines(l1, l2)).intersectionPoint;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) l1,
				(Locus) l2
		};
	}

}