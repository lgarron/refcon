package us.garron.refcon.math;

import us.garron.refcon.construction.PointOnXAxis;

public class PositiveGiven extends Expression {

	private final String name;
	private final float value;

	public PositiveGiven(final String name, final float value) {
		if (value <= 0) {
			throw new RuntimeException("PositiveGiven with name \"" + name + "\" initialized with non-positive float " + value + ".");
		}
		this.name = name;
		this.value = value;
	}
	
	public float getValue() {
		return value;
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == PositiveGiven.class &&
				this.value == ((PositiveGiven) other).value
		);
	}
	
	public String toString() {
		return "(" + name + ": " + Float.toString(value) + ")"; 
	}

	public PointOnXAxis constructUndeduplicated() {
		//TODO Elegant solution
		return new PointOnXAxis(this);
	}
	
}
