package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.*;

public class Point {

	private final Expression x;
	private final Expression y;
	
	private final Axiom axiom;

	public Point(final Expression x, final Expression y) {
		this.x = x;
		this.y = y;
		this.axiom = null;
	}

	public Point(final Expression x, final Expression y, Axiom axiom) {
		this.x = x;
		this.y = y;
		this.axiom = axiom;
	}
	
	public Expression x() {
		return x;
	}

	public Expression y() {
		return y;
	}
	
	public Axiom axiom() {
		return axiom;
	}
	
	public static Point fromIntersection(Line l1, Line l2) {
		// TODO: implement stub
		return null;
	}
	
}
