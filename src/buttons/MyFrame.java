package buttons;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JButton button;
	JLabel label;
	
	MyFrame() {
		ImageIcon image = new ImageIcon("E:\\Tutors\\Tutors\\Images\\ai.png");
		ImageIcon image2 = new ImageIcon("E:\\Tutors\\Tutors\\Images\\NôngLamNLU.png");
		
		label = new JLabel();
		label.setIcon(image2);
		label.setBounds(150,240,150,150);
		label.setVisible(false);
		
		button = new JButton();
		button.setBounds(100,100,250,100);
		button.addActionListener(e -> System.out.println("poo"));
		button.setText("I'm a Button !");
		button.setFocusable(false);
		button.setIcon(image);
		button.setHorizontalTextPosition(JButton.CENTER);
		button.setVerticalTextPosition(JButton.BOTTOM);
		button.setFont(new Font("Comic Sans", Font.BOLD,25));
		button.setIconTextGap(5);
		button.setForeground(Color.cyan);
		button.setBackground(Color.LIGHT_GRAY);
		button.setBorder(BorderFactory.createEtchedBorder());
//		button.setEnabled(false);  Khóa button
		
		this.setTitle("Nông Lâm University");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		this.setSize(500,500);
		this.setLayout(null);
		this.setVisible(true);
		this.add(button);
		this.add(label);
	}
	

	public static void main(String[] args) {
		new MyFrame();
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			label.setVisible(true);
		}
		
	}
}
