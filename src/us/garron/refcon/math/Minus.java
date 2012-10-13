package us.garron.refcon.math;

import us.garron.refcon.axiom.*;
import us.garron.refcon.construction.*;

public class Minus implements Expression {

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

  public PointOnXAxis construct() {
    
    Line diag = Axiom3LineToLine.fold(Locus.xAxis, Locus.yAxis);
    PointOnXAxis ptOriginal = original.construct();
    Line lineOriginal = Axiom4LineOntoSelfThroughPoint.fold(diag, ptOriginal);
    Point ptYIntercept = Point.fromIntersection(Locus.yAxis, lineOriginal);

    Line antiDiag = Axiom3LineToLine.fold(Locus.yAxis, Locus.xAxis);
    Line lineNegative = Axiom4LineOntoSelfThroughPoint.fold(antiDiag, ptYIntercept);
    
    PointOnXAxis ptNegative = PointOnXAxis.fromIntercept(lineNegative);
    
    return ptNegative;
  }
}
