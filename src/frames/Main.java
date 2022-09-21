package frames;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
	
	JFrame frame = new JFrame();
	frame.setTitle("Nông Lâm University");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setResizable(false);
	frame.setSize(420,420);
	frame.setVisible(true);
	
	ImageIcon image = new ImageIcon("E:\\Tutors\\Tutors\\Images\\NôngLamNLU.png");
	frame.setIconImage(image.getImage());
	frame.getContentPane().setBackground(new Color(0x123456));
	
	}
}
