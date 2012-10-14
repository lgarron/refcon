package us.garron.refcon.math;

import us.garron.refcon.axiom.*;
import us.garron.refcon.construction.*;

public class GeometricMean extends Expression {

	private Expression first;
	private Expression second;
	
	public GeometricMean(Expression first, Expression second) {
		this.first = first;
		this.second = second;
	}
	
	public float getValue() {
		return (float) Math.sqrt(first.getValue()*second.getValue());
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == GeometricMean.class &&
				this.first.equals(((GeometricMean) other).first) &&
				this.second.equals(((GeometricMean) other).second)
		);
	}

	public String toString() {
		return "geometric_mean(" + first.getValue() + ", " + second.getValue() + ")"; 
	}

	public PointOnXAxis constructUndeduplicated() {

		PointOnXAxis ptSecond = second.construct();
		PointOnXAxis ptMinusFirst = new Minus(first).construct();
		PointOnXAxis ptCenter = Construction.meanOfPointsOnXAxis(ptMinusFirst, ptSecond);
		Line orthogonalRootLine = Axiom5PointToLineThroughPoint.fold(ptSecond, Line.yAxis, ptCenter);
		Line rootLine = Axiom4LineOntoSelfThroughPoint.fold(orthogonalRootLine, ptSecond);
		PointOnYAxis ptYIntercept = PointOnYAxis.fromIntercept(rootLine);
		PointOnXAxis geometricMean = Construction.PointOnXAxisfromPointOnYAxis(ptYIntercept);
		return geometricMean;
	}

}
