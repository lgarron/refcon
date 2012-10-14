package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.*;

public interface Locus {
	
	@Deprecated
	public final Point dummyPoint = new Point(new RCInteger(100), new RCInteger(200));
	@Deprecated
	public final Line dummyLine= new Line(dummyPoint, dummyPoint);
	
	public Axiom axiom();
	
}
