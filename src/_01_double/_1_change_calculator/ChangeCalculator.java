package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * 
 * 
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
String nickle=JOptionPane.showInputDialog("how may nickles do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
        int calculate= Integer.parseInt(nickle);
		// Ask the user how many dimes they have, and convert their answer
String dime=JOptionPane.showInputDialog(null, "how many dimes do you have?");
int money=Integer.parseInt(dime);
		// Ask the user how many quarters they have, and convert their answer
String quart=JOptionPane.showInputDialog(null, "how many quarters do you have?");
int greedy=Integer.parseInt(quart);
		// Calculate how much money the user has.  Hint: Use a double variable 
double nickelAmount = calculate*0.05;
double dimeAmount = money*.1;
double quarterAmount = greedy*.25;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
JOptionPane.showMessageDialog(null, nickelAmount+dimeAmount+quarterAmount);
	}
}

