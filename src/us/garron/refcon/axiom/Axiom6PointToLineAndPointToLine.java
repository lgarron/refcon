package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class Axiom6PointToLineAndPointToLine extends Axiom {

	private final Point p1;
	private final Line l1;
	private final Point p2;
	private final Line l2;
	private final Line foldLine;
	
	public Axiom6PointToLineAndPointToLine(Point p1, Line l1, Point p2, Line l2) {
		this.p1 = p1;
		this.l1 = l1;
		this.p2 = p2;
		this.l2 = l2;
		foldLine = new Line(Locus.dummyPoint, Locus.dummyPoint, this);
	}
	
	public static Line fold(Point p1, Line l1, Point p2, Line l2) {
		return (new Axiom6PointToLineAndPointToLine(p1, l1, p2, l2)).foldLine;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) p1,
				(Locus) l1,
				(Locus) p2,
				(Locus) l2
		};
	}

	public String description(Locus locus) {
		return "Create " + locus.name() + " by simultaneously folding folding " + p1.name() + " onto " + l2.name() + " and " + p2.name() + " onto " + l2.name() + ".";
	}
	
}
