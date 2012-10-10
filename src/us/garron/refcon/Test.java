package us.garron.refcon;

import us.garron.refcon.math.*;
import us.garron.refcon.math.convenience.*;

public class Test {

	public static void main(String[] args) {

		final Expression x = new Sqrt(new PositiveInteger(2));
		final Expression y = new Subtract(new PositiveInteger(4), new PositiveInteger(2));

		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue());

		final Expression a = new PositiveGiven("a", 3);
		final Expression b = new PositiveGiven("b", 4);
		
		final Expression c = new Sqrt(new Plus(
				new Times(a, a),
				new Times(b, b)
				));
		
		System.out.println("c: " + c.getValue());

		final Expression g1 = new Minus(new PositiveInteger(1));
		final Expression g2 = new Minus(new PositiveInteger(1));
		final Expression g3 = new PositiveInteger(1);
		
		final Expression goldenRatioSmallNegative = new QuadraticEquationRoot1(g1, g2, g3);
		
		System.out.println("Golden ratio: " + goldenRatioSmallNegative.getValue());
		
	}

}
