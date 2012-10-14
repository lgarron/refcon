package us.garron.refcon.math;

import us.garron.refcon.axiom.Axiom1ThroughTwoPoints;
import us.garron.refcon.construction.Construction;
import us.garron.refcon.construction.Line;
import us.garron.refcon.construction.PointOnXAxis;
import us.garron.refcon.construction.PointOnYAxis;

public class Divide extends Expression {

	private Expression first;
	private Expression second;
	
	public Divide(final Expression first, final Expression second) {
		this.first = first;
		this.second = second;
	}
	
	public float getValue() {
		return first.getValue() / second.getValue();
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == Divide.class &&
				this.first.equals(((Divide) other).first) &&
				this.second.equals(((Divide) other).second)
		);
	}
	
	public String toString() {
		return "(" + first.toString() + "/" + second.toString() + ")"; 
	}

	public PointOnXAxis constructUndeduplicated() {

		PointOnXAxis ptFirst = first.construct();
		PointOnXAxis ptSecond = second.construct();
		
		PointOnYAxis pt_1_0_mirrored = Construction.PointOnYAxisfromPointOnXAxis(Construction.point_1_0());
		// second is to 1...
		Line scalingLine1 = Axiom1ThroughTwoPoints.fold(ptSecond, pt_1_0_mirrored);
		// as first is to...
		Line scalingLine2 = Construction.parallelLineToLineThroughPoint(scalingLine1, ptFirst);
		// the quotient! (second/1 = first/?)
		PointOnYAxis ptQuotientOnYAxis = PointOnYAxis.fromIntercept(scalingLine2);
		
		PointOnXAxis ptQuotient = Construction.PointOnXAxisfromPointOnYAxis(ptQuotientOnYAxis);
		return ptQuotient;
	}
	
}
