/*
 *  Name: 
 *  Project 1 Mycalculator
 *  date created: 3/26/23
 *  date modified: 4/4/23
 *  Video link: 
 *
 */

import java.util.Scanner;

public class MyCalculator {

	public static void main(String [] args) {

		Scanner scnr = new Scanner(System.in);
		char startOverAgain;

		do {

			boolean valid = false;

			while(!valid) {
	            // Prompt user for number of values to operate on
				System.out.println("Enter the calculator mode: Standard/Scientific?");
				String mode = scnr.nextLine();
				if(mode.equals("Standard")){
					System.out.println("The calculator will operate in standard mode.");
					standard(scnr);
					valid = true;
				}
				else if(mode.equals("Scientific")) {
					System.out.println("The calculator will operate in scientific mode.");
					scientific(scnr);
					valid = true;
				}
				else {
					System.out.println("Enter valid mode.");
				}

			}
				startOverAgain = scnr.next().charAt(0);

			}while(startOverAgain == 'Y' || startOverAgain == 'y');

			System.out.println("Goodbye");


		}
    // Perform operation and display result

		public static void standard(Scanner scnr) {

			boolean valid = false;

			while(!valid) {
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
				char oper = scnr.next().charAt(0);

				if(oper == '+') {
					System.out.println("The addition operation has been selected");
					addition(scnr);
				}
				else if(oper == '-') {
					System.out.println("The subtraction operation has been selected");
					subtraction(scnr);

				}
				else if(oper == '*') {
					System.out.println("The multiplication operation has been selected");
					multiplication(scnr);
				}
				else if(oper == '/') {
					System.out.println("The division operation has been selected");
					division(scnr);
				}
				else {
					System.out.println("Invalid operator " + oper);
				}
			}

		}
		public static void scientific(Scanner scnr) {
			boolean valid = false;

			while(!valid) {
				System.out.println("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");

				char oper = scnr.next().charAt(0);

				if(oper == '+') {
					System.out.println("The addition operation has been selected");
					addition(scnr);
				}
				else if(oper == '-') {
					System.out.println("The subtraction operation has been selected");
					subtraction(scnr);

				}
				else if(oper == '*') {
					System.out.println("The multiplication operation has been selected");
					multiplication(scnr);
				}
				else if(oper == '/') {
					System.out.println("The division operation has been selected");
					division(scnr);
				}
				else {
					System.out.println("Invalid operator " + oper);
				}
			}


		}
		public static void addition(Scanner scnr ) {
			System.out.println("How many numbers do you want to add?: ");
			int number =scnr.nextInt();

			System.out.println("Enter " + number + " numbers");
			int sum = 0;
			int num;

			for(int i =0; i < number; i++) {
				num =scnr.nextInt();
				sum += num;
			}
			System.out.println("Result: " + sum);


		}
		public static void subtraction(Scanner scnr) {
			System.out.println("How many numbers do you want to subtract?: ");
			int number =scnr.nextInt();

			System.out.println("Enter " + number + " numbers");
			int difference = 0;
			int num;

			for(int i =0; i < number; i++) {
				num =scnr.nextInt();
				difference -= num;
			}
			System.out.println("Result: " + difference);
		}


		public static void multiplication(Scanner scnr) {
			System.out.println("How many numbers do you want to multiply?: ");
			int number =scnr.nextInt();

			System.out.println("Enter " + number + " numbers");
			int product = 1;
			int num;

			for(int i =0; i < number; i++) {
				num =scnr.nextInt();
				product *= num;
			}
			System.out.println("Result: " + product);

		}


		public static void division(Scanner scnr) {
			System.out.println("How many numbers do you want to divide?: ");
			int number =scnr.nextInt();

			System.out.println("Enter " + number + " numbers");
			int qou = 0;
			int num;

			for(int i =0; i < number; i++) {
				num =scnr.nextInt();
				qou /= num;
			}
			System.out.println("Result: " + qou);
		}
	}

