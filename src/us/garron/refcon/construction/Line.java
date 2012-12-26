package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;
import us.garron.refcon.math.*;

public class Line extends Locus {

	// TODO: Find a good parametrization that is not degenerate for horizontal lines, vertical lines, or lines through the origin. 
	
	private final Point p1;
	private final Point p2;
	
	// TODO: Allow name setting while being final.
	private final String name;
	
	private final Axiom axiom;
	
	// Initial lines
	public static final Line xAxis = Line.makeHorizontalLine(new RCInteger(0), "X Axis");
	public static final Line x1Line = Line.makeVerticalLine(new RCInteger(1), "X=1 Line");
	public static final Line yAxis = Line.makeVerticalLine(new RCInteger(0), "Y Axis");
	public static final Line y1Line = Line.makeHorizontalLine(new RCInteger(1), "Y=1 Line");
	
	public Line(final Point p1, final Point p2, Axiom axiom, String name) {
		this.p1 = p1;
		this.p2 = p2;
		this.axiom = axiom;
		this.name = name;
	}
	
	public Line(final Point p1, final Point p2, Axiom axiom) {
		this.p1 = p1;
		this.p2 = p2;
		this.axiom = axiom;
		this.name = "Line " + super.nextName();
	}
	
	public Point p1() {
		return p1;
	}

	public Point p2() {
		return p2;
	}
	
	public String name() {
		return name;
	}
	
	public Axiom axiom() {
		return axiom;
	}
	
	/* 
	 * Convenience methods that should stay the same (and always valid to call) through implementation changes.
	 */
	
	private static Line makeVerticalLine(final Expression x, String name) {
		return new Line(
				new Point(x, new RCInteger(0), new PseudoAxiom1Preconstructed()),
				new Point(x, new RCInteger(1), new PseudoAxiom1Preconstructed()),
				new PseudoAxiom1Preconstructed(),
				name
		);
	}
	
	private static Line makeHorizontalLine(final Expression y, String name) {
		return new Line(
				new Point(new RCInteger(0), y, new PseudoAxiom1Preconstructed()),
				new Point(new RCInteger(1), y, new PseudoAxiom1Preconstructed()),
				new PseudoAxiom1Preconstructed(),
				name
		);
	}

}
