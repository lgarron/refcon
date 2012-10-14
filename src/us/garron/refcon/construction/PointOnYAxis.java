package us.garron.refcon.construction;

import us.garron.refcon.math.*;

public class PointOnYAxis extends Point {

	public PointOnYAxis(Expression x) {
		super(x, new RCInteger(0));
	}
	
	public static PointOnYAxis fromIntercept(Line lineIntercept) {
		//TODO: implement without cast (so that x is guaranteed to be 0 without the general implementation of pointFromIntersection) 
		return (PointOnYAxis) Point.fromIntersection(Line.xAxis, lineIntercept);
	}

}
