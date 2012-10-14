package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;

public class Construction {

  public static PointOnXAxis origin() {
    return PointOnXAxis.fromIntercept(Line.yAxis);
  }

  public static PointOnXAxis point_1_0() {
    return PointOnXAxis.fromIntercept(Line.x1Line);
  }
  
  // Constructs a point on the Y axis mirrored across the line y=x.
  public static PointOnYAxis PointOnYAxisfromPointOnXAxis(PointOnXAxis pointOnXAxis) {
    
    Line diag = Axiom3LineToLine.fold(Line.xAxis, Line.yAxis);
    Line lineOriginal = Axiom4LineOntoSelfThroughPoint.fold(diag, pointOnXAxis);
    PointOnYAxis ptYIntercept = PointOnYAxis.fromIntercept(lineOriginal);

    return ptYIntercept;
  }

  public static PointOnXAxis meanOfPointsOnXAxis(PointOnXAxis m, PointOnXAxis n) {
    Line lineM = Axiom4LineOntoSelfThroughPoint.fold(Line.xAxis, m);
    Line lineMean = Axiom7LineOntoSelfAndPointToLine.fold(Line.xAxis, n, lineM);
    PointOnXAxis ptMean= PointOnXAxis.fromIntercept(lineMean);
    return ptMean;
  }

  public static PointOnXAxis doublePointOnXAxis(PointOnXAxis m) {
    Line diag = Axiom3LineToLine.fold(Line.xAxis, Line.yAxis);
    Line lineM = Axiom4LineOntoSelfThroughPoint.fold(Line.xAxis, m);
    Point ptM = Point.fromIntersection(diag, lineM);
    Line lineDouble = Axiom4LineOntoSelfThroughPoint.fold(diag, ptM);
    PointOnXAxis ptDouble = PointOnXAxis.fromIntercept(lineDouble);
    return ptDouble;
  }
  
}