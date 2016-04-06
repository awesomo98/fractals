package part3;
import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;

import draw.UltraDraw;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class HTree implements KeyListener {
	
	public static void main(String[] args) {
		HTree htree = new HTree();
		htree.draw(4);
	}


	public HTree() {
		UltraDraw.setYscale(0, 150);
		UltraDraw.setXscale(0, 150);
		UltraDraw.clear(UltraDraw.GRAY);
		UltraDraw.setPenColor(UltraDraw.WHITE);
	}
	
	public void draw(int n) {
		tree(new Point2D.Double(150 / 2, 150 / 2), 75, n);
	}
	
	public void tree (Point2D.Double center, double radius, int n){
		if (n < 0) return;
		H h = new H(center, radius);
		h.draw();
		H topLeft = new H(h.getTopLeft(), h.getSize());
		H topRight = new H(h.getTopLeft(), h.getSize());
		H bottomLeft = new H(h.getTopLeft(), h.getSize());
		H bottomRight = new H(h.getTopLeft(), h.getSize());
		
		tree(h.getTopLeft(), radius / 2, (n-1));
		tree(h.getTopRight(), radius / 2,  (n-1));
		tree(h.getBottomLeft(), radius / 2, (n-1));
		tree(h.getBottomRight(), radius / 2, (n-1));
	}
	
//	public void recurTree(Double center, double d, double newSize2) {
//		double newSize = H.getSize();
//		
//		H h = new H(center, 155);
//		Point2D.Double topRight = h .getTopRight();
//		Point2D.Double topLeft = h.getTopLeft();
//		Point2D.Double bottomRight = h.getBottomRight();
//		Point2D.Double bottomLeft = h.getBottomLeft();
//		
//		newSize2 = (int) (h.getSize() / 2);
//		newSize2--;
//		
//		if (newSize2 <= 0) {
//			return;
//		} else {
//			recurTree(topRight, newSize2 - 1, newSize);
//			recurTree(topLeft, newSize2 - 1, newSize);
//			recurTree(bottomRight, newSize2 - 1, newSize);
//			recurTree(bottomLeft, newSize2 - 1, newSize);
//		}
//	}
	
	public static int recursionFactor = 2;


	@Override
	public void keyPressed(KeyEvent arg0) {
		char keychar = arg0.getKeyChar();
		System.out.println(arg0);
//		HTree.draw(recursionFactor);
	}


	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
}
