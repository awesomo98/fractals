package part4;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import draw.StdDraw;
import draw.UltraDraw;


public class KochCurve {
	public static void main(String[] args) {
		KochCurve curve = new KochCurve();
		curve.draw(2);
	}

	private Double start;
	private Double firstEnd;
	private Double midEnd;
	private Double lastEnd;
	private Double end;
	
	public KochCurve() {
		UltraDraw.setYscale(0, 150);
		UltraDraw.setXscale(0, 150);
		UltraDraw.clear(UltraDraw.GRAY);
		UltraDraw.setPenColor(UltraDraw.WHITE);
		
		Double startPoint = new Point2D.Double(25, 75);
		Double midPoint = new Point2D.Double(75, 75);
	}
	
	public void drawCurve(Point2D.Double a, Point2D.Double b, Point2D.Double c) {
		double[] x = {a.x, b.x, c.x};
		double[] y = {a.x, b.x, c.x};
	}
	
	public void draw(int n) {
		curve(left, right, top);
	}
	
	public void curve(Point2D.Double a, Point2D.Double b, Point2D.Double c, int n) {
		if (n < 0) return;
		this.start = new Point2D.Double(25, 75);
		this.firstEnd = new Point2D.Double(50, 75); 
		this.midEnd = new Point2D.Double(75, 100);
		this.lastEnd = new Point2D.Double(100, 75);
		this.end = new Point2D.Double(125, 75)
		drawCurve(start, firstEnd, midEnd, lastEnd, end);
	}
}
