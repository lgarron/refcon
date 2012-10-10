package us.garron.refcon.math.convenience;

import us.garron.refcon.math.*;

public class Subtract implements Expression {
	
	private Expression subExpression;
	
	public Subtract (final Expression minuend, final Expression subtrahend) {
		subExpression = new Plus(minuend, new Minus(subtrahend)); 
	}

	public float getValue() {
		return subExpression.getValue();
	}
	
}