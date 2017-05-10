package collegeInvader;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.swing.JFrame;

public class Shooter extends Canvas implements KeyListener, Runnable {

	public static final int Width = 600;
	public static final int Height = 600;

	private static Shooter INSTANCE;
	private boolean gameOver = false;
	
	private static final long serialVersionUID = 1L;
	private BufferStrategy bs = null;
	private Graphics graphics = null;
	private boolean running = false;
	private Thread thread;
	
	private Student student;
	private CopyOnWriteArrayList<Professor> professors = new CopyOnWriteArrayList<Professor> ();
	private CopyOnWriteArrayList<Bullets> bullets = new CopyOnWriteArrayList<Bullets> ();
	
	public Shooter(){
		JFrame frame = new JFrame("College Invader");
		frame.setSize(Width,Height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);

		new ImageCache();
		student = new Student (250,450,50,50, ImageCache.student);
		professors = new CopyOnWriteArrayList<Professor> ();
		for(int i = 0; i < 400; i += 50){
			professors.add(new Professor(i, 100, 50, 50, ImageCache.professor_mr1));
		}
		
		for(int i = 0; i < 400; i += 50){
			professors.add(new Professor(i, 150, 50, 50, ImageCache.professor_mr2));
		}
		
		for(int i = 0; i < 400; i += 50){
			professors.add(new Professor(i, 200, 50, 50, ImageCache.professor_mr3));
		}
		
		for(int i = 0; i < 400; i += 50){
			professors.add(new Professor(i, 250, 50, 50, ImageCache.professor_mrs1));
		}
		
		for(int i = 0; i < 400; i += 50){
			professors.add(new Professor(i, 300, 50, 50, ImageCache.professor_mrs2));
		}

		
		frame.add(this);
		thread = new Thread(this); 


		frame.setVisible(true);

		addKeyListener(this);
	}
	
	public void paint(Graphics g){
		if(bs == null){
			createBufferStrategy(2);
			bs = getBufferStrategy();
			graphics = bs.getDrawGraphics();
			thread.start();
			running = true;
		}
	}
	
	
	
	@Override
	public void run() {
		while(running){
			update();
			render();
			bs.show();
			Thread.currentThread();
			try{
				Thread.sleep(10);

			}catch(InterruptedException e) {

			}
		}
	}
	
	public void update(){
		if (!gameOver){
			student.update();
			for(Professor p : professors){
				if( p.x < 0 || p.x > this.Width){
					 p.SPEED = -p.SPEED;
				}
				p.update();
			}
			
			for(Bullets b : bullets){
				b.update();
			}
			
		}

		if(student.health <= 0){
			gameOver = true;
			
		}

	}
	
	public void render(){
		
		graphics.clearRect(0, 0, Width, Height);
		graphics.setColor(Color.black);
		graphics.fillRect(0, 0, Width, Height);
		graphics.drawImage(ImageCache.background1, 0, 0, Width, Height, null);

		graphics.setColor(Color.white);
		graphics.drawString("Welcome to College Invader", Width/2-50, 50);
		//graphics.drawString("Health " + student.health, 30, 30);
		for(int i= 1; i<=5; i++){
			graphics.drawImage(ImageCache.health, i*30, 20, 25, 25, null);
		}
		
		graphics.drawString("Score " + student.score, 30, 60);
		
		if(gameOver){
			graphics.drawString("Game Over!", 250, 60);
			//graphics.drawString("The Winner is: player "+ winner , 250, 100);
			graphics.drawString("Press esc to start over", 250, 200);
		}
		

		student.draw(graphics);
		
		for(Professor p : professors){
			p.draw(graphics);
		}
		
		for(Bullets b : bullets){
			b.draw(graphics);
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		if(!gameOver){
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				student.left = true;
			}else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
				student.right = true;
			}

			
		} else {
			if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
				student.reset();
				gameOver = false;
			}
		}
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		if(!gameOver){
			if(e.getKeyCode() == KeyEvent.VK_LEFT){
				student.left = false;
			}else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
				student.right = false;
			}
			
			if(e.getKeyCode() == KeyEvent.VK_SPACE){
				Bullets b = new Bullets (student.x + student.Width/2, student.y - 4, 10, 10, ImageCache.pencil);
				b.dy = 4;
				bullets.add(b);
			}

			
		}
		
	}
	
	public Student getStudent(){
		return this.student;
	}
	
	public CopyOnWriteArrayList<Professor> getProfessors (){
		return professors;
	}
	
	public CopyOnWriteArrayList<Bullets> getBullets (){
		return bullets;
	}
	
	public static Shooter getInstance(){
		return INSTANCE;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		INSTANCE = new Shooter();
	}
	
}
