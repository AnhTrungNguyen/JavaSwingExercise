package joptionPane;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "This is some useless info","Warning",JOptionPane.PLAIN_MESSAGE);
		JOptionPane.showMessageDialog(null, "Here is more useless info","Warning",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Really ?","Warning",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Your computer has a virtus !!!","Warning",JOptionPane.WARNING_MESSAGE);
		JOptionPane.showMessageDialog(null, "Call tech support now or else !!!","Warning",JOptionPane.ERROR_MESSAGE);
		
		JOptionPane.showConfirmDialog(null, "Trung, do you even code?", "Hello",JOptionPane.YES_NO_CANCEL_OPTION);
		String name = JOptionPane.showInputDialog("What is your name ? : ");
		System.out.println("Hello" + name);
		
		String[] responses = {"No, I hate you!","Thank you!"};
		ImageIcon image = new ImageIcon("E:\\Tutors\\Tutors\\Images\\tải xuống (8).jpeg");
		JOptionPane.showOptionDialog(null, "I love you!", "secrect message", JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE , image, responses, 0);
	}
}
