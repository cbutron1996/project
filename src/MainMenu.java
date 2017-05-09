import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import jframe.stuff;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenu extends JPanel implements ActionListener {
	JFrame frame;
	public static void main (String [] arqs){
	stuff gui = new stuff();
	gui.go();}
	
	public void go() {
	frame= new JFrame();
	frame.setTitle("College Invaders");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ;
	JButton button=new JButton ("start game");
	JButton hs=new JButton ("high scores");
	JButton options=new JButton ("options");
	JButton quit = new JButton ("quit");
	button.addActionListener(this); 
	frame.add (button); 
	frame.add (hs); 
	//frame. setSize (300,300) ; 
	frame. setVisible (true) ;
}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		frame.repaint();
		
	}}

