package _04_are_you_happy;

import javax.swing.JOptionPane;

public class Happy {
public static void main(String[] args) {
	
	String happy = JOptionPane.showInputDialog("Are you happy?");
	if(happy.equalsIgnoreCase("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing");
	}else {
		JOptionPane.showMessageDialog(null, "Well that sucks.");
	}
}
}