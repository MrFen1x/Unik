package ghffghg;
import java.awt.Graphics;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	private int ft =0;
	public void setft(int x) {
		ft =x;
		repaint();
	}
	
void req(int kk,Graphics q,int n,int x, int y) {
	if (kk>0) {
	draw(q,x,y,n);
	req(kk-1,q,n/2,x-100,y-100);
	}
	 
}
	void draw(Graphics q,int x, int y, int n) { 
		q.drawLine(x, y, x-n, y+n*2);
		
		
	}
		
	
	public void paint(Graphics q) {
		super.paint(q);
		req(4,q,50,500,200);
	}
}
