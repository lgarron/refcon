package us.garron.refcon.construction;

public class Point {

	private final float x;
	private final float y;

	public Point(final float x, final float y) {
		this.x = x;
		this.y = y;
	}
	
	public float x() {
		return x;
	}

	public float y() {
		return y;
	}
}
