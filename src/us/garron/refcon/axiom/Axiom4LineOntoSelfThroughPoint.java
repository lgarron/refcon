package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class Axiom4LineOntoSelfThroughPoint implements Axiom {

	private final Line l;
	private final Point p;
	private final Line foldLine;
	
	public Axiom4LineOntoSelfThroughPoint(Line l, Point p) {
		this.l = l;
		this.p = p;
		foldLine = new Line(Locus.dummyPoint, Locus.dummyPoint, this);
	}
	
	public static Line fold(Line l, Point p) {
		return (new Axiom4LineOntoSelfThroughPoint(l, p)).foldLine;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) l,
				(Locus) p
		};
	}
	
}
