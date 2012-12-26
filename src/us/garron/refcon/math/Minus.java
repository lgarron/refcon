package us.garron.refcon.math;

import us.garron.refcon.axiom.*;
import us.garron.refcon.construction.*;

public class Minus extends Expression {

  private Expression original;
  
  public Minus(final Expression original) {
    this.original = original;
  }
  
  public float getValue() {
    return -(original.getValue());
  }

  public boolean equals(Expression other) {
    return (
        other.getClass() == Minus.class &&
        this.original.equals(((Minus) other).original)
    );
  }
	
	public String toString() {
		return "(-" + original.toString() + ")"; 
	}

  public PointOnXAxis constructUndeduplicated() {
    
    PointOnXAxis ptOriginal = original.construct();
    PointOnYAxis ptYIntercept = Construction.PointOnYAxisfromPointOnXAxis(ptOriginal);

    Line antiDiag = Axiom3LineToLine.fold(Line.yAxis, Line.xAxis);
    Line lineNegative = Axiom4LineOntoSelfThroughPoint.fold(antiDiag, ptYIntercept);
    
    PointOnXAxis ptNegative = PseudoAxiom3PointOnXAxis.fromIntercept(lineNegative);
    
    return ptNegative;
  }
}
