package collegeInvader;

import java.awt.Graphics;
import java.awt.Image;

public class Bullets extends GameObject {

	public int dy;

	Bullets(int x, int y, int w, int h, Image img) {
		super(x, y, w, h, img);
		// TODO Auto-generated constructor stub
	}

	@Override
	void draw(Graphics g) {
		g.drawImage(img, x, y, Width, Height,null);

	}

	@Override
	void update() {
		y -= dy;
		rectangle.y -= dy;

		for(Professor p : Shooter.getInstance().getProfessors()){
			if(p.rectangle.contains(this.rectangle)){
				removeBullet();
				Student.score++;
				//p.remove();
				p.changeImage();
				System.out.println("shoots professor");
			}
		}

		if(y <  - 50){
			removeBullet();
			System.out.println("pass edge");
		} 
	} 


	private void removeBullet(){
		Shooter.getInstance().getBullets().remove(this);
		
	}

}
