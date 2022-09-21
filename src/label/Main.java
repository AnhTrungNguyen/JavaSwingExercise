package label;

import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.Border;

public class Main {

	public static void main(String[] args) {
		JLabel label = new JLabel();
		label.setText("Trung, do you even code ?");
	
		ImageIcon image = new ImageIcon("E:\\Tutors\\Tutors\\Images\\NôngLamNLU.png");
		
		Border border = BorderFactory.createLineBorder(Color.green,3);
		label.setIcon(image);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.TOP);
		label.setForeground(Color.green);
		label.setFont(new Font("MV Boli",Font.PLAIN,20));
		label.setIconTextGap(0);
		label.setBackground(Color.black);
		label.setOpaque(true);
		label.setBorder(border);
		label.setVerticalAlignment(JLabel.CENTER);
		label.setHorizontalAlignment(JLabel.CENTER);
//		label.setBounds(100,100,250,250);
		
		JFrame frame = new JFrame();
		frame.setTitle("Nông Lâm University");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
		frame.setSize(500,500);
//		frame.setLayout(null);
		frame.setVisible(true);
		frame.add(label);
//		frame.pack();
	}
}
