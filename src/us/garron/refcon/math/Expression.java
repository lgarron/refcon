package us.garron.refcon.math;

import java.util.ArrayList;
import java.util.List;

import us.garron.refcon.construction.PointOnXAxis;

public abstract class Expression {
	
	public abstract float getValue();
	public abstract boolean equals(Expression other);
	public abstract String toString();
	public abstract PointOnXAxis constructUndeduplicated();
	
	
	public PointOnXAxis construct() {
		return constructDeduplicated(this);
	}


	// TODO: Implement using Hashmap by implementing hashcodes for all Expression objects.
	private static final List<Expression> constructedExpressions = new ArrayList<Expression>();
	private static final List<PointOnXAxis> constructedExpressionsConstructions = new ArrayList<PointOnXAxis>();
	
	public static PointOnXAxis constructDeduplicated(Expression e) {
		
		// indexOf doesn't appear to work, so we have to search manually.
		int index = -1;
		for (int i = 0; i < constructedExpressions.size(); i++) {
			if (constructedExpressions.get(i).equals(e)) {
				index = i;
				break;
			}
		}
		if (index != -1) {
			System.out.println("Deduping " + e.toString());
			return constructedExpressionsConstructions.get(index);
		}
		else {
			System.out.println("Constructing " + e.toString());
			PointOnXAxis pt = e.constructUndeduplicated();
			constructedExpressions.add(e);
			constructedExpressionsConstructions.add(pt);
			return pt;
		}
	}
	
}
