package part3;
import java.awt.geom.Point2D;
import draw.StdDraw;
import java.awt.Color;


public class HTree {
	
	public static void main(String[] args) {
		HTree htree = new HTree();
		htree.draw(3);
	}


	public HTree() {
		if (n <= 0) {
			
		}
		
	}
	
	public void draw(Point2D.Double a, Point2D.Double b, Point2D.Double c, Point2D.Double d) {
		double[] x = {a.x, b.x, c.x};
		double[] y = {a.y, b.y, c.y};
		StdDraw.setPenColor(color);
		StdDraw.filledPolygon(x, y);
	}
	
}
