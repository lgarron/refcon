package us.garron.refcon.construction;

import us.garron.refcon.axiom.PseudoAxiom1PointFromTwoLines;
import us.garron.refcon.math.*;

public class PointOnXAxis extends Point {

	public PointOnXAxis(Expression x) {
		super(x, new RCInteger(0));
	}
	
	public static PointOnXAxis fromIntercept(Line lineIntercept) {
		Point p = PseudoAxiom1PointFromTwoLines.define(Line.xAxis, lineIntercept);
		return new PointOnXAxis(p.x());
	}

}
