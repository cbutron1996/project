package collegeInvader;

import java.awt.Graphics;
import java.awt.Image;

public class Professor extends GameObject {


	public static int SPEED = 1;
	
	Professor(int x, int y, int w, int h, Image img) {
		super(x, y, w, h, img);
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw(Graphics g) {
		g.drawImage(img, x, y, Width, Height, null);
		
	}

	@Override
	void update() {
		 x += SPEED;
		 rectangle.x += SPEED;	 
	}
	
	public void changeImage(){
		this.img = ImageCache.explosion;
	}
	public void remove(){
		Shooter.getInstance().getProfessors().remove(this);
	}

}
