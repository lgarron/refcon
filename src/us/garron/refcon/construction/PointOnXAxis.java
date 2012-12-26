package us.garron.refcon.construction;

import us.garron.refcon.axiom.Axiom;
import us.garron.refcon.math.*;

public class PointOnXAxis extends Point {

//	public PointOnXAxis(Expression x, Axiom axiom) {
//		super(x, new RCInteger(0), axiom);
//	}
	
	public PointOnXAxis(Expression x, Expression y, Axiom axiom) {
		super(x, y, axiom);
	}
	
	public static PointOnXAxis fromIntersection(Line l1, Line l2, Axiom axiom) {
		int placeholder = 0;
		Expression dummyExpression = new RCInteger(0);
		return new PointOnXAxis(dummyExpression, new RCInteger(0), axiom);
	}
}
