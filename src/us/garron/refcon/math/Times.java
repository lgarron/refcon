package us.garron.refcon.math;

import us.garron.refcon.axiom.Axiom1ThroughTwoPoints;
import us.garron.refcon.axiom.PseudoAxiom4PointOnYAxis;
import us.garron.refcon.construction.*;

public class Times extends Expression {

	private Expression first;
	private Expression second;
	
	public Times(final Expression first, final Expression second) {
		this.first = first;
		this.second = second;
	}
	
	public float getValue() {
		return first.getValue() * second.getValue();
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == Times.class &&
				this.first.equals(((Times) other).first) &&
				this.second.equals(((Times) other).second)
		);
	}
	
	public String toString() {
		return "(" + first.toString() + "*" + second.toString() + ")"; 
	}

	public PointOnXAxis constructUndeduplicated() {

		PointOnXAxis ptFirst = first.construct();
		PointOnXAxis ptSecond = second.construct();
		
		PointOnYAxis ptFirstMirrored = Construction.PointOnYAxisfromPointOnXAxis(ptFirst);
		// 1 is to first...
		Line scalingLine1 = Axiom1ThroughTwoPoints.fold(Construction.point_1_0(), ptFirstMirrored);
		// as second is to...
		Line scalingLine2 = Construction.parallelLineToLineThroughPoint(scalingLine1, ptSecond);
		// the product! (1/first = second/?)
		PointOnYAxis ptProductOnYAxis = PseudoAxiom4PointOnYAxis.fromIntercept(scalingLine2);
		
		PointOnXAxis ptProduct = Construction.PointOnXAxisfromPointOnYAxis(ptProductOnYAxis);
		return ptProduct;
	}
	
}
