import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class myPanel extends JPanel{
	private int num;
	private int[] x = new int[]{190, 272, 272, 316, 316, 272, 370, 316, 316, 61, 61, 316, 10, 190};
	private int[] y = new int[]{120, 202, 120, 120, 246, 202, 300, 300, 570, 570, 300, 300, 300, 120};
	 @Override
	public void paint(Graphics g) {
	        super.paint(g);
	        switch(num) {
	        case(1):
	        	g.setColor(Color.RED);
	    		g.drawOval(100, 100, 100, 50);
	    		break;
	        case(2):
	        	g.setColor(Color.BLUE);
	    		g.drawRect(100, 100, 100, 50);
	    		break;
	        case(3):
	        	g.setColor(Color.ORANGE);
	        g.drawPolygon(x,y,14);
	    		break;
	        case(4):
	        	g.setColor(Color.GREEN);
	        	int x1=10;
	        	int y1=50;
	        	int x2=200;
	        	int y2=50;
	        	g.drawLine(x2, y2, x2, y1+140);
	        	while (x1<200) {
	        		g.drawLine(x1, y1, x2, y2);
	        		x1=x1+10;
	        		y2=y2+10;
	        	
	        }
	    		break;
	        }
	        
	    }
	 public void prom(int h) {num = h;repaint();}
}
