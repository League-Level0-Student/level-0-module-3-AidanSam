package _07_years_alive;

import javax.swing.JOptionPane;

public class Years_Alive {
public static void main(String[] args) {
	
	String useless = JOptionPane.showInputDialog("What year were you born?");
	int num = Integer.parseInt(useless);
	String usething = JOptionPane.showInputDialog("How old are you");
	int number = Integer.parseInt(usething);
	
	for(int j=0; j<number; j++) {
		
		System.out.println(num += 1);
		
		
		
	}
}
}
