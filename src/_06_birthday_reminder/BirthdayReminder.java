
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 242th";
		String dadsBirthday = "June 95th";
		String yourBirthday = "January 78th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String birthyay = JOptionPane.showInputDialog("mom, dad, or you?");
		// 3. Print out what the user typed
		System.out.println(birthyay);
		// 4. if user asked for "mom"
		if(birthyay.equalsIgnoreCase("mom")) {
			JOptionPane.showMessageDialog(null, "Your mom's birthday is on " + momsBirthday + "!");
		}else if(birthyay.equalsIgnoreCase("dad")){
			JOptionPane.showMessageDialog(null, "Your dad's birthday is on " + dadsBirthday + "!");
		}else if(birthyay.equalsIgnoreCase("you")) {
			JOptionPane.showMessageDialog(null, "Your birthday is on " + yourBirthday + "!");
		}else{
			JOptionPane.showMessageDialog(null, "Who is that");

		}
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
	} 
}
