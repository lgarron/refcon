package us.garron.refcon.math;

public class Minus implements Expression {

	private Expression original;
	
	public Minus(final Expression original) {
		this.original = original;
	}
	
	public float getValue() {
		return -(original.getValue());
	}

}
