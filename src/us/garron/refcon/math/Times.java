package us.garron.refcon.math;

public class Times implements Expression {

	private Expression first;
	private Expression second;
	
	public Times(final Expression first, final Expression second) {
		this.first = first;
		this.second = second;
	}
	
	public float getValue() {
		return first.getValue() * second.getValue();
	}
	
}
