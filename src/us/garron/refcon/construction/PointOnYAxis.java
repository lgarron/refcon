package us.garron.refcon.construction;

import us.garron.refcon.axiom.PsuedoAxiom1PointFromTwoLines;
import us.garron.refcon.math.*;

public class PointOnYAxis extends Point {

	public PointOnYAxis(Expression x) {
		super(x, new RCInteger(0));
	}
	
	public static PointOnYAxis fromIntercept(Line lineIntercept) {
		Point p = PsuedoAxiom1PointFromTwoLines.define(Line.yAxis, lineIntercept);
		return new PointOnYAxis(p.y());
	}

}
