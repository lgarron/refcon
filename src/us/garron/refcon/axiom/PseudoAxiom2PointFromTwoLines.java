package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class PseudoAxiom2PointFromTwoLines extends Axiom {

	private final Line l1;
	private final Line l2;
	private final Point intersectionPoint;
	
	private PseudoAxiom2PointFromTwoLines(Line l1, Line l2) {
		this.l1 = l1;
		this.l2 = l2;
		this.intersectionPoint = Point.fromIntersection(l1, l2, this);
	}
	
	public static Point define(Line l1, Line l2) {
		return (new PseudoAxiom2PointFromTwoLines(l1, l2)).intersectionPoint;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) l1,
				(Locus) l2
		};
	}

	public String description(Locus locus) {
		return "Label " + locus.name() + " at the intersection of " + l1.name() + " and " + l2.name() + ".";
	}

}
