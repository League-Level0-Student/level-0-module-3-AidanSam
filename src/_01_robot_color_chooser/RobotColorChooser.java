//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;
import java.util.Random;
import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;
public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot notarobot = new Robot();
		int d = 0;
		int s = 0;
		
		notarobot.setSpeed(420);

		//3. Ask the user what color they would like the robot to draw
		String useless = JOptionPane.showInputDialog("Pick a color you like");
		//5. Use an if/else statement to set the pen color that the user requested
		JOptionPane.showMessageDialog(null, "I don't care what color you like.");
        //6. If the user doesn’t enter anything, choose a random color
		notarobot.setRandomPenColor();
	
		notarobot.penDown();
	
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		Random ran=new Random();
		//4. Set the pen width to 10
		for(int j=0; j<1000; j++) {
			s=ran.nextInt(360);
			d=ran.nextInt(20);
			notarobot.show();
			notarobot.turn(s);
			notarobot.move(d);
			notarobot.hide();
			
		
		}
	    //2. Make the robot draw a shape (this will take more than one line of code)


	}
}
