package us.garron.refcon.math;

import us.garron.refcon.construction.*;

public class Plus implements Expression {

	private Expression first;
	private Expression second;
	
	public Plus(final Expression first, final Expression second) {
		this.first = first;
		this.second = second;
	}
	
	public float getValue() {
		return first.getValue() + second.getValue();
	}

	public boolean equals(Expression other) {
		return (
				other.getClass() == Plus.class &&
				this.first.equals(((Plus) other).first) &&
				this.second.equals(((Plus) other).second)
		);
	}

	public PointOnXAxis construct() {
		PointOnXAxis ptFirst = first.construct();
		PointOnXAxis ptSecond = second.construct();
		PointOnXAxis ptMean = Constructions.mean(ptFirst, ptSecond);
		PointOnXAxis ptSum = Constructions.twice(ptMean);
		return ptSum;
	}
	
}
