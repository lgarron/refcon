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
		
	}

}
