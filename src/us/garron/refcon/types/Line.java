package us.garron.refcon.types;

public class Line {

	private final Point p1;
	private final Point p2;

	public Line(final Point p1, final Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	
	public Point p1() {
		return p1;
	}

	public Point p2() {
		return p2;
	}
}
