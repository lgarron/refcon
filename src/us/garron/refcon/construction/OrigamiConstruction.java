package us.garron.refcon.construction;

import java.util.ArrayList;
import java.util.List;

public class OrigamiConstruction {
	
	private final List<Point> points = new ArrayList<Point>();
	private final List<Line> lines = new ArrayList<Line>();
	
	public OrigamiConstruction() {
		
		// Initial loci
		lines.add(Line.xAxis);
		lines.add(Line.yAxis);
		lines.add(Line.x1Line);
		lines.add(Line.y1Line);
		
	}
	
}
