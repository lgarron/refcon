package us.garron.refcon.construction;

import java.util.ArrayList;
import java.util.List;

import us.garron.refcon.math.Divide;
import us.garron.refcon.math.Expression;
import us.garron.refcon.math.RCInteger;
import us.garron.refcon.math.convenience.Sqrt;

public class StepByStep {
	
	List<Locus> constructionList = new ArrayList<Locus>();

	public void printConstruction(Expression e) {
		PointOnXAxis constructedPoint = e.construct();
		constructedPoint.generateConstruction(this);
		for (Locus locus : constructionList) {
			System.out.println("- " + locus.axiom().description(locus));
		}
	}
	
	public void addToConstructionList(Locus locus) {
		if (!constructionList.contains(locus)) {
			constructionList.add(locus);
		}
	}
	
	public static void main (String[] args) {
		final Expression e = new Sqrt(new RCInteger(2));
		new StepByStep().printConstruction(e);
	}
	
}
