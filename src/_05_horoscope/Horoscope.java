package _05_horoscope;

import javax.swing.JOptionPane;

public class Horoscope {
public static void main(String[] args) {
	
	String useless = JOptionPane.showInputDialog("What is your zodiac sign?");
	
	JOptionPane.showMessageDialog(null, "The angle of Jupiter says that you should not leave your house for the next 2 months.");
}
}
