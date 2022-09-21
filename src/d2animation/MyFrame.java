package d2animation;

import javax.swing.*;

public class MyFrame extends JFrame{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
MyPanel panel;
	
	MyFrame(){
		
		panel = new MyPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.add(panel);
		this.pack();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}  
}
