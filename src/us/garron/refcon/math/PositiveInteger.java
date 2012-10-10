package us.garron.refcon.math;

public class PositiveInteger implements Expression {
	private final int value;

	public PositiveInteger(final int value) {
		if (value <= 0) {
			throw new RuntimeException("PositiveInteger initialized with non-positive integer " + value + ".");
		}
		this.value = value;
	}
	
	public float getValue() {
		return value;
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == PositiveInteger.class &&
				this.value == ((PositiveInteger) other).value
		);
	}
	
}
