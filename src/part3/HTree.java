package part3;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import draw.StdDraw;
import java.awt.Color;


public class HTree {
	
	public static void main(String[] args) {
		HTree htree = new HTree(null, 0);
		htree.draw(3);
	}


	public HTree(Double center, int n) {
		if (n <= 0) return;
		StdDraw.setYscale(0, 150);
		StdDraw.setXscale(0, 150);
		
		center = new Point2D.Double();
		
		StdDraw.clear(StdDraw.GRAY);
		
		H h = new H(center, center.x);
		
		draw();
		
		
		
	}
	
	public void draw(Point2D.Double a, Point2D.Double b, Point2D.Double c, Point2D.Double d) {
		recurTree(0, 0, 0).draw();
	}
	
	public void recurTree(Double center, double d, double newSize2) {
		double newSize = H.getSize();
		
		H h = new H(center, 155);
		Point2D.Double topRight = h .getTopRight();
		Point2D.Double topLeft = h.getTopLeft();
		Point2D.Double bottomRight = h.getBottomRight();
		Point2D.Double bottomLeft = h.getBottomLeft();
		
		newSize2 = (int) (h.getSize() / 2);
		newSize2--;
		
		if (newSize2 <= 0) {
			return;
		} else {
			recurTree(topRight, newSize2 - 1, newSize);
			recurTree(topLeft, newSize2 - 1, newSize);
			recurTree(bottomRight, newSize2 - 1, newSize);
			recurTree(bottomLeft, newSize2 - 1, newSize);
		}
	}
	
}
