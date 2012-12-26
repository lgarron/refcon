package us.garron.refcon.math;

import us.garron.refcon.construction.Construction;
import us.garron.refcon.construction.PointOnXAxis;

public class RCInteger extends Expression {
	private final int value;

	public RCInteger(final int value) {
		this.value = value;
	}
	
	public float getValue() {
		return value;
	}

	public boolean equals(Expression other) {
		//System.out.println("compare" + this.getValue() + " - " + other.getValue());
		return (
				other.getClass() == RCInteger.class &&
				this.value == ((RCInteger) other).value
		);
	}
	
	public String toString() {
		return Integer.toString(value); 
	}

	public PointOnXAxis constructUndeduplicated() {
		//System.out.println("Constructing " + value);
		
		if (value == 0) {
			return Construction.origin();
		}
		else if (value == 1) {
			//TODO: This may be redundant some day, but for now it avoids a bunch of semi-nontrivially-deduplicatable constructions (e.g. X axis onto self through origin, which is just Y axis).
			return Construction.point_1_0();
		}
		else if (value > 0) {
			int shifted = value >> 1;
			int leastSignificantBit = value % 2;
			
			final PointOnXAxis ptShifted = new RCInteger(shifted).construct();
			PointOnXAxis ptOut = Construction.doublePointOnXAxis(ptShifted);
			
			if (leastSignificantBit == 1) {
				ptOut = Construction.plus(ptOut, Construction.point_1_0()); 
			}
			
			return ptOut;
		}
		else {
			// n < 0
			return new Minus(this).construct();
		}
	}
	
}
