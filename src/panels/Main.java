package panels;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		
		ImageIcon image = new ImageIcon("E:\\Tutors\\Tutors\\Images\\ai.png");
		
		JLabel label = new JLabel();
		label.setText("Hi !");
		label.setIcon(image);
		label.setVerticalAlignment(JLabel.BOTTOM);
		label.setHorizontalAlignment(JLabel.RIGHT);
		label.setBounds(100,100,75,75);
		
		JPanel redpanel = new JPanel();
		redpanel.setBackground(Color.red);
		redpanel.setBounds(250,0,250,250);
		redpanel.setLayout(null);
		
		JPanel bluepanel = new JPanel();
		bluepanel.setBackground(Color.blue);
		bluepanel.setBounds(0,0,250,250);
		bluepanel.setLayout(null);
		
		JPanel greenpanel = new JPanel();
		greenpanel.setBackground(Color.green);
		greenpanel.setBounds(0,250,500,250);
		greenpanel.setLayout(null);
		
		JFrame frame = new JFrame();
		frame.setTitle("Nông Lâm University");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setSize(750,750);
		frame.setVisible(true);
		greenpanel.add(label);
		frame.add(redpanel);
		frame.add(bluepanel);
		frame.add(greenpanel);
	}
}
