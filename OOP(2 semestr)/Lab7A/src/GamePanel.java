import java.awt.Graphics;

import javax.swing.JPanel;

public class GamePanel extends JPanel {
	private int px=0;
	private int py=0;
	private Player player = new Player();
	
	public void paint(Graphics g) {
		super.paint(g);
		player.draw(g);
		
	}
public void initPlayer() {
	player.setFieldSize(getWidth(),getHeight());
}
public void movePlayer(int direction) {
	player.move(direction);
	repaint();
}
}
