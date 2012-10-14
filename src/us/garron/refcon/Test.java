package us.garron.refcon;

import us.garron.refcon.math.*;
import us.garron.refcon.math.convenience.*;

public class Test {

	public static void main(String[] args) {

		final Expression x = new Sqrt(new RCInteger(2));
		final Expression y = new Subtract(new RCInteger(4), new RCInteger(2));

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
		
		final Expression g1 = new Minus(new RCInteger(1));
		final Expression g2 = new Minus(new RCInteger(1));
		final Expression g3 = new RCInteger(1);
		
		final Expression goldenRatioSmallNegative = new QuadraticEquationRoot1(g1, g2, g3);
		
		System.out.println("Golden ratio: " + goldenRatioSmallNegative.getValue());

		////////////////////////////////

		final Expression w = new PositiveGiven("width", 2);
		final Expression h = new PositiveGiven("height", 1);
		
		final Expression boxOfMaximumVolume = new QuadraticEquationRoot1(
				new Times (w, h),
				new Minus(new Times(new RCInteger(4), new Plus(w, h))),
				new RCInteger(12)
		);
		
		System.out.println("Value for box of maximum volume: " + boxOfMaximumVolume.getValue());

		////////////////////////////////

		final Expression v1 = new Times(new Sqrt(new RCInteger(33)), new Divide(new RCInteger(3), new RCInteger(55)));
		final Expression v2 = new Times(new Sqrt(new RCInteger(33)), new Divide(new RCInteger(3), new RCInteger(55)));
		final Expression v3 = new Times(new Sqrt(new RCInteger(33)), new Divide(new RCInteger(6), new RCInteger(110)));

		System.out.println("Equal? " + v1.equals(v2));
		System.out.println("Equal? " + v1.equals(v3));

		new Times(new Minus(new RCInteger(33)), new Divide(new RCInteger(3), new RCInteger(55))).construct();
		new Times(new Minus(new RCInteger(33)), new Divide(new RCInteger(3), new RCInteger(25))).construct();
		new Times(new Minus(new RCInteger(33)), new Divide(new RCInteger(3), new PositiveGiven("alpha", 55))).construct();
		v1.construct();
		v2.construct();
		v3.construct();
		System.out.println(v3.construct().name());
		
	}

}
