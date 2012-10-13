package us.garron.refcon.construction;

import us.garron.refcon.axiom.*;

public class Constructions {

  public static PointOnXAxis mean(PointOnXAxis m, PointOnXAxis n) {
    Line lineM = Axiom4LineOntoSelfThroughPoint.fold(Locus.xAxis, m);
    Line lineMean = Axiom7LineOntoSelfAndPointToLine.fold(Locus.xAxis, n, lineM);
    PointOnXAxis ptMean= PointOnXAxis.fromIntercept(lineMean);
    return ptMean;
  }

  public static PointOnXAxis twice(PointOnXAxis m) {
    Line diag = Axiom3LineToLine.fold(Locus.xAxis, Locus.yAxis);
    Line lineM = Axiom4LineOntoSelfThroughPoint.fold(Locus.xAxis, m);
    Point ptM = Point.fromIntersection(diag, lineM);
    Line lineDouble = Axiom4LineOntoSelfThroughPoint.fold(diag, ptM);
    PointOnXAxis ptDouble = PointOnXAxis.fromIntercept(lineDouble);
    return ptDouble;
  }
  
}
