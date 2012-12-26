package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class Axiom7LineOntoSelfAndPointToLine extends Axiom {

	private final Line l1;
	private final Point p2;
	private final Line l2;
	private final Line foldLine;
	
	public Axiom7LineOntoSelfAndPointToLine(Line l1, Point p2, Line l2) {
		this.l1 = l1;
		this.p2 = p2;
		this.l2 = l2;
		foldLine = new Line(Locus.dummyPoint, Locus.dummyPoint, this);
	}
	
	public static Line fold(Line l1, Point p2, Line l2) {
		return (new Axiom7LineOntoSelfAndPointToLine(l1, p2, l2)).foldLine;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) l1,
				(Locus) p2,
				(Locus) l2
		};
	}

	public String description(Locus locus) {
		return "Create " + locus.name() + " by folding " + l1.name() + " onto itself, so that " + p2.name() + " lands on " + l2.name() + ".";
	}
	
}
