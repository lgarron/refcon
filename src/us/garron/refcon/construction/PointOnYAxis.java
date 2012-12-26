package us.garron.refcon.construction;

import us.garron.refcon.axiom.Axiom;
import us.garron.refcon.axiom.PseudoAxiom2PointFromTwoLines;
import us.garron.refcon.math.*;

public class PointOnYAxis extends Point {

//	public PointOnYAxis(Expression x, Axiom axiom) {
//		super(x, new RCInteger(0), axiom);
//	}

	public PointOnYAxis(Expression x, Expression y, Axiom axiom) {
		super(x, y, axiom);
	}
	
	public static PointOnYAxis fromIntersection(Line l1, Line l2, Axiom axiom) {
		int placeholder = 0;
		Expression dummyExpression = new RCInteger(0);
		return new PointOnYAxis(dummyExpression, new RCInteger(0), axiom);
	}
}
