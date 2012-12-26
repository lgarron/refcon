package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.*;

public abstract class Locus {
	
	@Deprecated
	public final static Point dummyPoint = new Point(new RCInteger(100), new RCInteger(200), new PseudoAxiom1Preconstructed());
	@Deprecated
	public final static Line dummyLine= new Line(dummyPoint, dummyPoint, new PseudoAxiom1Preconstructed());

	public abstract Axiom axiom();
	public abstract String name();
	
	private static int latestIDNumber = 0;
	protected static String nextName() {
		latestIDNumber++;
		return Integer.toString(latestIDNumber);
	}
	
}
