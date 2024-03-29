import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Player {
	public static final int LEFT = 0;

	public static final int RIGHT = 1;

	public static final int UP = 2;

	public static final int DOWN = 3;
	
	private int x=0;
	private int y=0;
	private int max_x=0;
	private int max_y=0;
	private Image player;
	
public Player() {
	try {
		player=ImageIO.read(new File("C:\\Temp\\player.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void setFieldSize(int max_x, int max_y) {
	this.max_x=max_x;
	this.max_y=max_y;
	
}
public void move( int direction) {
	switch (direction) {
	case LEFT:
		x-=2;
		break;
	case RIGHT:
		x+=2;
		break;
	case UP:
		y-=2;
		break;
	case DOWN:
		y+=2;
		break;
	}
	if (x<0) {
		x= max_x-player.getWidth(null);
	}
	if (x<max_x-player.getWidth(null)) {
		x= 0;
	}
	if (y<0) {
		x= max_y-player.getHeight(null);
	}
	if (y<max_y-player.getHeight(null)) {
		y= 0;
	}
}
public void draw(Graphics g) {
	g.drawImage(player, x, y, null);
	
}
}
