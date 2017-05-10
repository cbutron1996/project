package collegeInvader;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
/*******
 * 
 * @author Xiaowen Huang
 * this class loads all the images needed for the game
 *
 */
public class ImageCache {
	//bullet
	public static Image pencil;
	public static Image chalk;
	public static Image desk;
	
	//professors
	public static Image professor_mrs1;
	public static Image professor_mrs2;
	
	public static Image professor_mr1;
	public static Image professor_mr2;
	public static Image professor_mr3;
	
	//students
	public static Image student;
	
	//professor reaction
	public static Image professor_melting;
	public static Image professor_skeleton1;
	public static Image professor_skeleton2;
	
	//other effects
	public static Image explosion;
	public static Image fire;
	public static Image blood_splatter;
	
	//health
	public static Image health;
	public static Image no_health;
	
	//background
	public static Image background1;
	//public static Image background2;
	// public static Image background3;
	
	
	
	private static final String IMAGE_DIR = "Graphics/";
	
	public ImageCache(){
		load();
	}
	
	public void load(){
		
		
		//bullet
		ImageCache.pencil = loadImage("student_shot_FANCY.png");
		ImageCache.chalk = loadImage("student_shot1_FANCY.png");
		ImageCache.desk = loadImage("desk_FANCY.png");
		
		//professors
		ImageCache.professor_mrs1 = loadImage("prof3_FANCY.png");
		ImageCache.professor_mrs2 = loadImage("prof5_FANCY.png");
		ImageCache.professor_mr1 = loadImage("prof1_FANCY.png");
		ImageCache.professor_mr2 = loadImage("prof2_FANCY.png");
		ImageCache.professor_mr3 = loadImage("prof4_FANCY.png");
		
		//students
		ImageCache.student = loadImage("student_FANCY.png");
		
		//professor reaction
		ImageCache.professor_melting = loadImage("melting.png");
		ImageCache.professor_skeleton1 = loadImage("skeleton.png");
		ImageCache.professor_skeleton2 = loadImage("skeleton2.png");
		
		//health
		ImageCache.health = loadImage("HEALTH_FANCY.png");
		ImageCache.no_health = loadImage("NO_HEALTH_FANCY.png");
		
		//background
		ImageCache.background1 = loadImage("background2.png");
		//ImageCache.background2 = loadImage("");
		//ImageCache.background3 = loadImage("");
		
		//other effects
		ImageCache.explosion = loadImage("explosion.png");
		ImageCache.fire = loadImage("firePerson.png");
		ImageCache.blood_splatter = loadImage("bloodsplatter.png");
		
		
		
	}
	
	private Image loadImage(String img){
		try {
			return ImageIO.read(new File(IMAGE_DIR + img));
		} catch (IOException e){
			e.printStackTrace();
		}
		return null;
	}
}
