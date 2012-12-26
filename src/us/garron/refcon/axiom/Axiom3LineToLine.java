package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class Axiom3LineToLine extends Axiom {

	private final Line l1;
	private final Line l2;
	private final Line foldLine;
	
	private Axiom3LineToLine(Line l1, Line l2) {
		this.l1 = l1;
		this.l2 = l2;
		foldLine = new Line(Locus.dummyPoint, Locus.dummyPoint, this);
	}
	
	public static Line fold(Line l1, Line l2) {
		return (new Axiom3LineToLine(l1, l2)).foldLine;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) l1,
				(Locus) l2
		};
	}

	public String description(Locus locus) {
		return "Create " + locus.name() + " by folding " + l1.name() + " onto " + l2.name() + " (with the fold between " + l1.name() + " and " + l2.name() + ", going counterclockwise).";
	}
	
}
