package part4;
import java.awt.geom.Point2D;
import draw.UltraDraw;


public class KochSnowflake {
	public static void main(String[] args) {
		KochSnowflake help = new KochSnowflake();
		help.draw(2);
	}
	
  public void draw(int n) {
	  KochCurve one = new KochCurve();
	  KochCurve two = new KochCurve();
	  KochCurve three = new KochCurve();
	  Point2D.Double left = new Point2D.Double(12.0,256.0);
	  Point2D.Double right = new Point2D.Double(500.0,256.0);
	  Point2D.Double top = new Point2D.Double(256,12.0);
	  one.draw(n,left,top,true);
	  two.draw(n,top, right, true);
	  three.draw(n, left, right, false);
	  }
}
