package part2;
import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import draw.StdDraw;


public class SierpinskiTriangle { 
   
	private Point2D.Double top, right, left;
	private Color background = new Color(34, 129, 34);
	private Color foreground = StdDraw.YELLOW;
	
	public SierpinskiTriangle() {
		StdDraw.setXscale(0, 150); 
		StdDraw.setYscale(75, 150); 
		
		top = new Point2D.Double(75, 150);
		right = new Point2D.Double(150, 75);
		left = new Point2D.Double(0, 75);
		 
		StdDraw.clear(StdDraw.GRAY); 
	}
   
	public void sierpinski(Point2D.Double a, Point2D.Double b, Point2D.Double c, int n) {
	   
	   Point2D.Double newA = new Point2D.Double(((a.x + c.x) / 2), ((a.y + c.y) / 2));
	   Point2D.Double newB = new Point2D.Double(((a.x + b.x) / 2), ((a.y + b.y) / 2));
	   Point2D.Double newC = new Point2D.Double(((b.x + c.x) / 2), ((b.y + c.y) / 2));
	   drawTriangle(a, b, c, Color.BLACK);
	   n--;
	   if (n <= 0) {
		   drawTriangle(a, newA, newB, Color.WHITE);
		   drawTriangle(b, newB, newC, Color.WHITE);
		   drawTriangle(newA, newC, c, Color.WHITE);
	   } else {
		   sierpinski(a, newA, newB, n);
		   sierpinski(b, newB, newC, n);
		   sierpinski(newA, newC, c, n);
	   		
		 
//		   return sierpinski(((b.x + a.x) / 2), ((c.x + a.x) / 2), ((a.x + c.x) / 2));
//		   drawTriangle(newA, newB, newC, Color.BLACK);
//		   return sierpinski(newA, newB, newC, n + 1);
		   
	   }
    }
   
	public void drawTriangle(Point2D.Double a, Point2D.Double b, Point2D.Double c, Color color) {
	   double[] x = {a.x, b.x, c.x};
	   double[] y = {a.y, b.y, c.y};
	   StdDraw.setPenColor(color);
	   StdDraw.filledPolygon(x, y);
	}
	
	public void draw(int n) {
		sierpinski(top, right, left, n);
	}
	
	
	
	public static void main(String[] args) { 
		SierpinskiTriangle triangle = new SierpinskiTriangle();
		triangle.draw(8);
	}
}
