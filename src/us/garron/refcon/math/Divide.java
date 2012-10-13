package us.garron.refcon.math;

import us.garron.refcon.construction.PointOnXAxis;

public class Divide implements Expression {

	private Expression first;
	private Expression second;
	
	public Divide(final Expression first, final Expression second) {
		this.first = first;
		this.second = second;
	}
	
	public float getValue() {
		return first.getValue() / second.getValue();
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == Divide.class &&
				this.first.equals(((Divide) other).first) &&
				this.second.equals(((Divide) other).second)
		);
	}

	public PointOnXAxis construct() {
		int placeholder = 0;
		throw new UnsupportedOperationException("construct is not implemented yet");
	}
	
}
