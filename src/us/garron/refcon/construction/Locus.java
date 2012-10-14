package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.*;

public abstract class Locus {
	
	@Deprecated
	public final static Point dummyPoint = new Point(new RCInteger(100), new RCInteger(200));
	@Deprecated
	public final static Line dummyLine= new Line(dummyPoint, dummyPoint);

	public abstract Axiom axiom();
	public abstract String name();
	
	private static int latestIDNumber = 0;
	protected static String nextName() {
		latestIDNumber++;
		return Integer.toString(latestIDNumber);
	}
	
}
