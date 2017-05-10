package collegeInvader;
import java.applet.Applet;
import java.applet.AudioClip;

/****
 * 
 * @author Xiaowen Huang
 *
 *this class contains all the songs needed for the project
 */
public class SoundCache {
	
	//background music
	public static final AudioClip menu_background = Applet.newAudioClip(SoundCache.class.getResource("Sounds/menu_bkrnd.wav"));
	public static final AudioClip game_background1 = Applet.newAudioClip(SoundCache.class.getResource("Sounds/game_background1.wav"));
	public static final AudioClip game_background2 = Applet.newAudioClip(SoundCache.class.getResource("Sounds/game_background2.wav"));
	public static final AudioClip game_background3 = Applet.newAudioClip(SoundCache.class.getResource("Sounds/game_background3.wav"));
	
	//movement music
	public static final AudioClip professor_movement = Applet.newAudioClip(SoundCache.class.getResource("Sounds/enemy_move.wav"));
	public static final AudioClip chacellor_movement = Applet.newAudioClip(SoundCache.class.getResource("Sounds/chanc.wav"));
	
	
	//music when shooting
	public static final AudioClip student_firing = Applet.newAudioClip(SoundCache.class.getResource("Sounds/student_shoot.wav"));
	public static final AudioClip dean_firing = Applet.newAudioClip(SoundCache.class.getResource("Sounds/dean_shoot.wav"));
	public static final AudioClip vice_chancellor_firing = Applet.newAudioClip(SoundCache.class.getResource("Sounds/vice_shoot.wav"));
	public static final AudioClip provost_firing = Applet.newAudioClip(SoundCache.class.getResource("Sounds/prov_shoot.wav"));
	
	//music when player or enemies or desks are being destroyed
	public static final AudioClip student_destroy = Applet.newAudioClip(SoundCache.class.getResource("Sounds/student_death.wav"));
	public static final AudioClip professor_destroy = Applet.newAudioClip(SoundCache.class.getResource("Sounds/enemy_death.wav"));
	public static final AudioClip chancellor_destory = Applet.newAudioClip(SoundCache.class.getResource("Sounds/chanc_death.wav"));
	public static final AudioClip desk_destory = Applet.newAudioClip(SoundCache.class.getResource("Sounds/desk_death.wav"));
	
	//other
	public static final AudioClip desk_hit = Applet.newAudioClip(SoundCache.class.getResource("Sounds/desk_hit.wav"));
	public static final AudioClip high_score = Applet.newAudioClip(SoundCache.class.getResource("Sounds/new_highscore.wav"));
	public static final AudioClip game_over = Applet.newAudioClip(SoundCache.class.getResource("Sounds/game_over.wav"));
	public static final AudioClip pause_unpause = Applet.newAudioClip(SoundCache.class.getResource("Sounds/pause.wav"));
	public static final AudioClip select = Applet.newAudioClip(SoundCache.class.getResource("Sounds/click.wav"));
	
}


