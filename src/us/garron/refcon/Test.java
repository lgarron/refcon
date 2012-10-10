package us.garron.refcon;

import us.garron.refcon.math.*;
import us.garron.refcon.math.convenience.*;

public class Test {

	public static void main(String[] args) {

		final Expression x = new Sqrt(new PositiveInteger(2));
		final Expression y = new Subtract(new PositiveInteger(4), new PositiveInteger(2));

		System.out.println("x: " + x.getValue());
		System.out.println("y: " + y.getValue());

		////////////////////////////////
		
		final Expression a = new PositiveGiven("a", 3);
		final Expression b = new PositiveGiven("b", 4);
		
		final Expression c = new Sqrt(new Plus(
				new Times(a, a),
				new Times(b, b)
				));
		
		System.out.println("c: " + c.getValue());

		////////////////////////////////
		
		final Expression g1 = new Minus(new PositiveInteger(1));
		final Expression g2 = new Minus(new PositiveInteger(1));
		final Expression g3 = new PositiveInteger(1);
		
		final Expression goldenRatioSmallNegative = new QuadraticEquationRoot1(g1, g2, g3);
		
		System.out.println("Golden ratio: " + goldenRatioSmallNegative.getValue());

		////////////////////////////////

		final Expression w = new PositiveGiven("width", 2);
		final Expression h = new PositiveGiven("height", 1);
		
		final Expression boxOfMaximumVolume = new QuadraticEquationRoot1(
				new Times (w, h),
				new Minus(new Times(new PositiveInteger(4), new Plus(w, h))),
				new PositiveInteger(12)
		);
		
		System.out.println("Value for box of maximum volume: " + boxOfMaximumVolume.getValue());
		
	}

}
