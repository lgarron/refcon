package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.*;

public class Line {

	// TODO: Find a good parametrization that is not degenerate for horizontal lines, vertical lines, or lines through the origin. 
	
	private final Point p1;
	private final Point p2;
	
	private final Axiom axiom;

	public Line(final Point p1, final Point p2) {
		this.p1 = p1;
		this.p2 = p2;
		this.axiom = null;
	}
	
	public Line(final Point p1, final Point p2, Axiom axiom) {
		this.p1 = p1;
		this.p2 = p2;
		this.axiom = axiom;
	}
	
	public Point p1() {
		return p1;
	}

	public Point p2() {
		return p2;
	}
	
	public Axiom axiom() {
		return axiom;
	}
	
	/* 
	 * Convenience methods that should stay the same (and always valid to call) through implementation changes.
	 */
	
	public static Line makeVerticalLine(final Expression x) {
		return new Line(
				new Point(x, new RCInteger(0)),
				new Point(x, new RCInteger(1))
		);
	}
	
	public static Line makeHorizontalLine(final Expression y) {
		return new Line(
				new Point(new RCInteger(0), y),
				new Point(new RCInteger(1), y)
		);
	}

}
