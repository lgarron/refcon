package us.garron.refcon.axiom;

import us.garron.refcon.construction.*;

public class PseudoAxiom4PointOnYAxis implements Axiom {

	private final Line l1;
	private final Line l2;
	private final PointOnYAxis intersectionPoint;
	
	private PseudoAxiom4PointOnYAxis(Line lineIntercept) {
		this.l1 = Line.xAxis;
		this.l2 = lineIntercept;
		this.intersectionPoint = PointOnYAxis.fromIntersection(l1, l2, this);
	}
	
	public static PointOnYAxis fromIntercept(Line lineIntercept) {
		return (new PseudoAxiom4PointOnYAxis(lineIntercept)).intersectionPoint;
	}
	
	public Locus[] lociBuiltFrom() {
		return new Locus[]{
				(Locus) l1,
				(Locus) l2
		};
	}

}
