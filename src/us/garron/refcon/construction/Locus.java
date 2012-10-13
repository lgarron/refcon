package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.RCInteger;

public interface Locus {
	
	// Special loci
	public final Line xAxis = Line.makeHorizontalLine(new RCInteger(0));
	public final Line yAxis = Line.makeVerticalLine(new RCInteger(0));
	public final PointOnXAxis origin = PointOnXAxis.fromIntercept(yAxis);

	@Deprecated
	public final Point dummyPoint = new Point(new RCInteger(100), new RCInteger(200));
	@Deprecated
	public final Line dummyLine= new Line(dummyPoint, dummyPoint);
	
	public Axiom axiom();
	
}
