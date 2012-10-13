package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class Axiom1ThroughTwoPoints implements Axiom {

	private final Point p1;
	private final Point p2;
	private final Line foldLine;
	
	private Axiom1ThroughTwoPoints(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.foldLine = new Line(Locus.dummyPoint, Locus.dummyPoint, this);
	}
	
	public static Line fold(Point p1, Point p2) {
		return (new Axiom1ThroughTwoPoints(p1, p2)).foldLine;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) p1,
				(Locus) p2
		};
	}
	
}
