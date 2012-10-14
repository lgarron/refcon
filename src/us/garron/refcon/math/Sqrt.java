package us.garron.refcon.math;

import us.garron.refcon.construction.PointOnXAxis;

/*
 * Principal (positive) square root.
 */
public class Sqrt extends Expression {

	private Expression original;
	
	public Sqrt(final Expression original) {
		if (original.getValue() < 0) {
			throw new RuntimeException("Can't take the square root of a positive number.");
		}
		this.original = original;
	}
	
	public float getValue() {
		return (float) Math.sqrt(original.getValue());
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == Sqrt.class &&
				this.original.equals(((Sqrt) other).original)
		);
	}
	
	public String toString() {
		return "sqrt(" + original.toString() + ")"; 
	}

	public PointOnXAxis constructUndeduplicated() {
		int placeholder = 0;
		return original.construct();
	}

}
