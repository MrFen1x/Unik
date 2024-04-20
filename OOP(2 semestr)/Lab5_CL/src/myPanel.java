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
	    recstar(g, x-r, y,r/2, depth - 1);
	    recstar(g,  x , y + r, r / 2, depth - 1);
	    recstar(g, x+r, y, r / 2, depth - 1);
	}
	private void star(Graphics g, int x, int y, int r) {
		g.drawLine(x, y-r, x-r/5, y - r / 5);//2
		g.drawLine(x, y-r, x+r/5, y - r / 5);//8
		g.drawLine(x - r / 5, y - r / 5,x-r, y);//3
		g.drawLine(x - r, y, x - r / 5, y +r/5);//4
		g.drawLine( x - r / 5, y +r/5, x , y + r);//5
		g.drawLine(x , y + r, x + r / 5, y + r/5);//6
		g.drawLine(x + r / 5, y + r/5, x+r, y);//7
		g.drawLine( x+r, y, x+r/5, y - r / 5);//8
	}
	   
	    
	   
	

	    
}
