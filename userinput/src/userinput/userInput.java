package userinput;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class userInput {

	private static Scanner blaj;

	public static void main(String[] args) {
		// user input and output on console
		/*
		Scanner input = new Scanner (System.in);
		JOptionPane.showInputDialog("Enter a number");
		int fromUser = input.nextInt();
		//System.out.println("First number entered is " + fromUser);
		JOptionPane.showMessageDialog(null, "First number entered is " + fromUser);
		
		JOptionPane.showInputDialog("Enter a second number");
		int fromUser2 = input.nextInt();
		System.out.println("Second number entered is " + fromUser2);
		*/
		
		String input = JOptionPane.showInputDialog("Enter Number");
		Double x = Double.parseDouble(input);
		String input1 = JOptionPane.showInputDialog("Enter Another Number");
		Double y = Double.parseDouble(input1);
		JOptionPane.showMessageDialog(null, "Your numbers " + x + " and " + y + " equal:" + "\n" + "The sum: " + (x+y) + "\n" + "The difference: " + (x-y) + "\n" + "The product: " + (x*y) + "\n" + "The quotient: " + (x/y) + "\n" + "The modulus: " + (x%y));

		JOptionPane.showMessageDialog(null, "thanks for using cedar's calculator");
		System.out.println("Your numbers " + x + " and " + y + " equal:" + "\n" + "The sum: " + (x+y) + "\n" + "The difference: " + (x-y) + "\n" + "The product: " + (x*y) + "\n" + "The quotient: " + (x/y) + "\n" + "The modulus: " + (x%y));

		/*
		System.out.println("Enter a Number");
		blaj = new Scanner (System.in); 
		int FromUser = blaj.nextInt(); 
		System.out.println("First Number entered is " + FromUser);


		System.out.println("Enter a second number");
		int FromUser2 = blaj.nextInt();
		System.out.println("Second number entered is " + FromUser2 ); 
		System.out.println("The sum of the two numbers is " + (FromUser2 + FromUser) ); 
		System.out.println("The difference of the two numbers is " + (FromUser2 - FromUser) ); 
		System.out.println("The product of the two numbers is " + (FromUser2 * FromUser) ); 
		System.out.println("The quotient of the two numbers is " + (FromUser2 / FromUser) ); 
		System.out.println("The modulus of the two numbers is " + (FromUser2 % FromUser) ); 
		*/

		
	}

}