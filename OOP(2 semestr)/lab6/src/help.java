import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.awt.Color;
import javax.swing.JPanel;
import java.util.Scanner;


public class help extends JPanel {
	private int w=0;
	private int h=0;
	private int max=0;
	private int ix=0;
	private int iy=0;
	private int[][] arr;
	Color color = new Color(255,255,255);
	public void loadFile(String fileName) {
		try {
			Scanner sc = new Scanner(new File(fileName));
			w= sc.nextInt();
			h= sc.nextInt();
			arr= new int[w][h];
			for (int y=0;y<h;y++) {
				for (int x=0;x<w;x++) {
					arr[x][y]=sc.nextInt();
				}
			}
			
			sc.close();
			for (int y=0;y<h;y++) {
				for (int x=0;x<w;x++) {
					if (arr[x][y]>max) {
						max=arr[x][y];
						ix=x;
						iy=y;
					}
				}
					
				}
			for (int y=0;y<h;y++) {
				for (int x=ix;x<w-1;x++) {
					if (ix!=w) {
					arr[x][y]=arr[x+1][y];
					}
				}
			}
			w--;
			repaint();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void treatments(int arr[][]) {
		
		
	}
	public void paint(Graphics g) {
		super.paint(g);
		for (int y=0;y<h;y++) {
			for (int x=0;x<w;x++) {
				color = new Color((arr[x][y]*20+20)%255,(arr[x][y]*5+200),(arr[x][y]*90+90)%255);
				g.setColor(color);
				g.fillRect(10+x*20, 10+y*20, 20, 20);
				//g.drawRect(10+x*20, 10+y*20, 20, 20);
			}
		}
	}
}
