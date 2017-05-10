package collegeInvader;

import java.awt.Graphics;
import java.awt.Image;
import java.util.concurrent.CopyOnWriteArrayList;

public class Student extends GameObject{
	private static final int SPEED = 4;
	private static final int START_HEALTH = 5;
	
	public int health;
	public static int score;
	public boolean left = false;
	public boolean right = false;
	private int initialX;
	private int initialY;

	

	Student(int x, int y, int w, int h, Image img) {
		super(x, y, w, h, img);
		
		this.initialX = x;
		this.initialY = y;
		this.health = START_HEALTH;
		this.score = 0;
		
	}

	@Override
	void draw(Graphics g) {
		g.drawImage(img, x, y, Width, Height, null);
	}

	@Override
	void update() {
		if(left){
			x -= SPEED;
			rectangle.x -= SPEED;
		}
		if (right){
			x += SPEED;
			rectangle.x += SPEED;
		}
	}
	
	public void reset(){
		this.x = this.initialX;
		this.y = this.initialY;
		this.rectangle.x = this.initialX;
		this.rectangle.y = this.initialY;
		
		this.health = this.START_HEALTH;
	}
	

}
