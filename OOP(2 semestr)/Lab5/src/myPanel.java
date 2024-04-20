import java.awt.Graphics;

import javax.swing.JPanel;

public class myPanel extends JPanel{
	public void paint(Graphics g) {
		super.paint(g);
		recstar(g,300,300,150,3);
		
	}
	public void recstar(Graphics g, int x, int y, int r, int depth) {
	    if (depth <= 0) {
	        return;
	    }
	    star(g, x, y, r);
	    recstar(g, x, y - r, r / 2, depth - 1);
	    recstar(g, x - r, y - r / 10, r / 2, depth - 1);
	    recstar(g, x - r / 2, y + r, r / 2, depth - 1);
	    recstar(g, x + r / 2, y + r, r / 2, depth - 1);
	    recstar(g, x + r, y - r / 10, r / 2, depth - 1);
	}
	private void star(Graphics g, int x, int y, int r) {
		g.drawLine(x, y-r, x-r/5, y - r / 5);
		g.drawLine(x, y-r, x+r/5, y - r / 5);
		g.drawLine(x - r / 5, y - r / 5, x - r, y - r / 10);
		g.drawLine(x - r, y - r / 10, x - r / 5, y + r / 5);
		g.drawLine(x - r / 5, y + r / 5, x - r / 2, y + r);
		g.drawLine(x - r / 2, y + r, x - r / 2, y + r);
		g.drawLine(x - r / 2, y + r, x, y + r / 5);
		g.drawLine(x, y + r / 5, x + r / 2, y + r);
		g.drawLine( x + r / 2, y + r, x + r / 5, y + r / 5);
		g.drawLine( x + r / 5, y + r / 5, x + r, y - r / 10);
		g.drawLine(x + r, y - r / 10, x + r / 5, y - r / 5);
	}
	   
	    
	   
	

	    
}
