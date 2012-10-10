package us.garron.refcon.math;

public interface Expression {
	
	public abstract float getValue();
	public abstract boolean equals(Expression other);
}
