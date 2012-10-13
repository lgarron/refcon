package us.garron.refcon.math;

import us.garron.refcon.construction.PointOnXAxis;

public class RCInteger implements Expression {
	private final int value;

	public RCInteger(final int value) {
		this.value = value;
	}
	
	public float getValue() {
		return value;
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == RCInteger.class &&
				this.value == ((RCInteger) other).value
		);
	}

	public PointOnXAxis construct() {
		int placeholder = 0;
		throw new UnsupportedOperationException("construct is not implemented yet");
	}
	
}
