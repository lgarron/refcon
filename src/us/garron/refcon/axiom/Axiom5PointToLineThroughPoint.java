package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class Axiom5PointToLineThroughPoint implements Axiom {

	private final Point p1;
	private final Line l1;
	private final Point p2;
	private final Line foldLine;
	
	public Axiom5PointToLineThroughPoint(Point p1, Line l1, Point p2) {
		this.p1 = p1;
		this.l1 = l1;
		this.p2 = p2;
		foldLine = new Line(Locus.dummyPoint, Locus.dummyPoint, this);
	}
	
	public static Line fold(Point p1, Line l1, Point p2) {
		return (new Axiom5PointToLineThroughPoint(p1, l1, p2)).foldLine;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) p1,
				(Locus) l1,
				(Locus) p2
		};
	}
	
}
