package us.garron.refcon.math;

import us.garron.refcon.construction.PointOnXAxis;

public interface Expression {
	
	public abstract float getValue();
	public abstract boolean equals(Expression other);
	public PointOnXAxis construct();
	
}
