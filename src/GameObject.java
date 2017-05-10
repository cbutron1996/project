package collegeInvader;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;

public abstract class GameObject {
	protected int x;
	protected int y;
	protected int Width;
	protected int Height;
	
	protected Image img;
	protected Rectangle rectangle;
	
	GameObject(int x, int y, int w, int h, Image img){
		this.x = x;
		this.y = y;
		this.Width = w;
		this.Height = h;
		this.img = img;
		
		this.rectangle = new Rectangle (x, y, Width, Height);
		
	}
	
	abstract void draw(Graphics g);
	abstract void update();
}
