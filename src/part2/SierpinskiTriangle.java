package part2;
import java.awt.Color;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import draw.UltraDraw;


public class SierpinskiTriangle implements MouseListener, MouseMotionListener { 
   
	private static Point2D.Double top;
	private static Point2D.Double right;
	private static Point2D.Double left;
	private Color background = new Color(34, 129, 34);
	private Color foreground = UltraDraw.YELLOW;
	
	public SierpinskiTriangle() {
		UltraDraw.addMouseListener(this);
		UltraDraw.setXscale(0, 150); 
		UltraDraw.setYscale(75, 150); 
		
		top = new Point2D.Double(75, 150);
		right = new Point2D.Double(150, 75);
		left = new Point2D.Double(0, 75);
		 
		UltraDraw.clear(UltraDraw.GRAY); 
	}
   
	public static void sierpinski(Point2D.Double a, Point2D.Double b, Point2D.Double c, int n) {
	   
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
   
	public static void drawTriangle(Point2D.Double a, Point2D.Double b, Point2D.Double c, Color color) {
	   double[] x = {a.x, b.x, c.x};
	   double[] y = {a.y, b.y, c.y};
	   UltraDraw.setPenColor(color);
	   UltraDraw.filledPolygon(x, y);
	}
	
	public static void draw(int n) {
		sierpinski(top, right, left, n);
	}
	
	
	public static int recursionFactor = 2;
	
	
	public static void main(String[] args) { 
		SierpinskiTriangle triangle = new SierpinskiTriangle();
		triangle.draw(recursionFactor);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println(e);
		recursionFactor ++;
		SierpinskiTriangle.draw(recursionFactor);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
