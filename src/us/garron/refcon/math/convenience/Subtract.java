package us.garron.refcon.math.convenience;

import us.garron.refcon.construction.PointOnXAxis;
import us.garron.refcon.math.*;

public class Subtract extends Expression {
	
	private Expression subExpression;
	
	public Subtract (final Expression minuend, final Expression subtrahend) {
		subExpression = new Plus(minuend, new Minus(subtrahend)); 
	}

	public float getValue() {
		return subExpression.getValue();
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == Subtract.class &&
				this.subExpression.equals(((Subtract) other).subExpression)
		);
	}
	
	public String toString() {
		return subExpression.toString(); 
	}

	public PointOnXAxis constructUndeduplicated() {
		return subExpression.construct();
	}
	
}
