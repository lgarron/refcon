package us.garron.refcon.math.convenience;

import us.garron.refcon.math.*;

public class QuadraticEquationRoot1 implements Expression {

	//	private final Expression constant;
	//	private final Expression xCoefficient;
	//	private final Expression x2Coefficient;

	private final Expression subExpression;

	public QuadraticEquationRoot1(final Expression constant, final Expression xCoefficient, final Expression x2Coefficient) {
		
		//	this.constant = constant;
		//	this.xCoefficient = xCoefficient;
		//	this.x2Coefficient = x2Coefficient;

		// b^2 - 4ac
		final Expression discriminant = new Subtract(
				new Times(xCoefficient, xCoefficient),
				new Times(new Times(new PositiveInteger(4), x2Coefficient), constant)
		);
		
		if (discriminant.getValue() < 0) {
			throw new RuntimeException("Quadratic equation initialized with negative discriminant.");
		}
		
		// (-b-sqrt(d))/(2a)
		subExpression = new Divide(
				new Plus(
						new Minus(xCoefficient),
						new Minus(new Sqrt(discriminant))
				),
				new Times(new PositiveInteger(2), x2Coefficient)
		);
	}
	
	public float getValue() {
		return subExpression.getValue();
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == QuadraticEquationRoot1.class &&
				this.subExpression.equals(((QuadraticEquationRoot1) other).subExpression)
		);
	}

}
