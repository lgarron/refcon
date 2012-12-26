package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class PseudoAxiom3PointOnXAxis extends Axiom {

	private final Line l1;
	private final Line l2;
	private final PointOnXAxis intersectionPoint;
	
	private PseudoAxiom3PointOnXAxis(Line lineIntercept) {
		this.l1 = Line.xAxis;
		this.l2 = lineIntercept;
		this.intersectionPoint = PointOnXAxis.fromIntersection(l1, l2, this);
	}
	
	public static PointOnXAxis fromIntercept(Line lineIntercept) {
		return (new PseudoAxiom3PointOnXAxis(lineIntercept)).intersectionPoint;
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
