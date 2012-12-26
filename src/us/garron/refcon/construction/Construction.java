package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;

public class Construction {

  public static PointOnXAxis origin() {
    return PseudoAxiom3PointOnXAxis.fromIntercept(Line.yAxis);
  }

  public static PointOnXAxis point_1_0() {
    return PseudoAxiom3PointOnXAxis.fromIntercept(Line.x1Line);
  }
  
  public static PointOnXAxis plus(PointOnXAxis p1, PointOnXAxis p2) {
  	PointOnXAxis ptMean = Construction.meanOfPointsOnXAxis(p1, p2);
		PointOnXAxis ptSum = Construction.doublePointOnXAxis(ptMean);
		return ptSum;
  }
  
  // Constructs a point on the Y axis mirrored across the line y=x.
  public static PointOnYAxis PointOnYAxisfromPointOnXAxis(PointOnXAxis pointOnXAxis) {
    Line diag = Axiom3LineToLine.fold(Line.xAxis, Line.yAxis);
    Line lineOriginal = Axiom4LineOntoSelfThroughPoint.fold(diag, pointOnXAxis);
    PointOnYAxis ptYIntercept = PseudoAxiom4PointOnYAxis.fromIntercept(lineOriginal);
    return ptYIntercept;
  }
  
  // Constructs a point on the X axis mirrored across the line y=x.
  public static PointOnXAxis PointOnXAxisfromPointOnYAxis(PointOnYAxis pointOnYAxis) {
    Line diag = Axiom3LineToLine.fold(Line.xAxis, Line.yAxis);
    Line lineOriginal = Axiom4LineOntoSelfThroughPoint.fold(diag, pointOnYAxis);
    PointOnXAxis ptXIntercept = PseudoAxiom3PointOnXAxis.fromIntercept(lineOriginal);
    return ptXIntercept;
  }

  public static PointOnXAxis meanOfPointsOnXAxis(PointOnXAxis m, PointOnXAxis n) {
    Line lineM = Axiom4LineOntoSelfThroughPoint.fold(Line.xAxis, m);
    Line lineMean = Axiom7LineOntoSelfAndPointToLine.fold(Line.xAxis, n, lineM);
    PointOnXAxis ptMean= PseudoAxiom3PointOnXAxis.fromIntercept(lineMean);
    return ptMean;
  }

  public static PointOnXAxis doublePointOnXAxis(PointOnXAxis m) {
    Line diag = Axiom3LineToLine.fold(Line.xAxis, Line.yAxis);
    Line lineM = Axiom4LineOntoSelfThroughPoint.fold(Line.xAxis, m);
    Point ptM = PseudoAxiom2PointFromTwoLines.define(diag, lineM);
    Line lineDouble = Axiom4LineOntoSelfThroughPoint.fold(diag, ptM);
    PointOnXAxis ptDouble = PseudoAxiom3PointOnXAxis.fromIntercept(lineDouble);
    return ptDouble;
  }
  
  public static Line parallelLineToLineThroughPoint(Line l1, Point p1) {
  	Line orthogonalLine = Axiom4LineOntoSelfThroughPoint.fold(l1, p1);
  	Line parallelLine = Axiom4LineOntoSelfThroughPoint.fold(orthogonalLine, p1);
  	return parallelLine;
  }
  
}
