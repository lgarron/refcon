package us.garron.refcon.construction;

import java.util.ArrayList;
import java.util.List;

import us.garron.refcon.math.*;

public class OrigamiConstruction {
	
	private final List<Point> points = new ArrayList<Point>();
	private final List<Line> lines = new ArrayList<Line>();
	
	public OrigamiConstruction() {
		
		// Initial loci
		lines.add(Locus.xAxis);
		lines.add(Locus.yAxis);
		lines.add(Line.makeHorizontalLine(new RCInteger(1)));
		lines.add(Line.makeVerticalLine(new RCInteger(1)));
		
		points.add(Locus.origin);
		
	}
	
}
