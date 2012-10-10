package us.garron.refcon.math;

/*
 * Principal (positive) square root.
 */
public class Sqrt implements Expression {

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

}
