package us.garron.refcon.construction;

import us.garron.refcon.math.*;

public class PointOnXAxis extends Point {

	public PointOnXAxis(Expression x) {
		super(x, new RCInteger(0));
	}
	
	public static PointOnXAxis fromIntercept(Line lineIntercept) {
		//TODO: implement without cast (so that x is guaranteed to be 0 without the general implementation of pointFromIntersection) 
		return (PointOnXAxis) Point.fromIntersection(Locus.xAxis, lineIntercept);
	}

}
