package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class Axiom4LineOntoSelfThroughPoint extends Axiom {

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

	public String description(Locus locus) {
		return "Create " + locus.name() + " by folding " + l.name() + " onto itself, so that the fold goes through " + p.name() + ".";
	}
	
}
