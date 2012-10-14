package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.*;

public class Point extends Locus {

	private final Expression x;
	private final Expression y;
	
	private final String name;
	
	private final Axiom axiom;

	public Point(final Expression x, final Expression y) {
		this.x = x;
		this.y = y;
		this.axiom = null;
		this.name = "Point " + super.nextName();
	}

	public Point(final Expression x, final Expression y, Axiom axiom) {
		this.x = x;
		this.y = y;
		this.axiom = axiom;
		this.name = "Point " + super.nextName();
	}
	
	public Expression x() {
		return x;
	}

	public Expression y() {
		return y;
	}
	
	public String name() {
		return name;
	}
	
	public Axiom axiom() {
		return axiom;
	}
	
	public static Point fromIntersection(Line l1, Line l2) {
		// TODO: implement stub
		return null;
	}
	
}
