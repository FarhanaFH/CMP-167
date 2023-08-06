	import java.util.Scanner;

	public class mycalculatorjava {

c	    public static double add(double[] numbers) {
	        double sum = 0;
	        for (double number : numbers) {
	            sum += number;
	        }
	        return sum;
	    }

	    // Method to perform subtraction of the given numbers
	    public static double subtract(double[] numbers) {
	        double difference = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            difference -= numbers[i];
	        }
	        return difference;
	    }

	    // Method to perform multiplication of the given numbers
	    public static double multiply(double[] numbers) {
	        double product = 1;
	        for (double number : numbers) {
	            product *= number;
	        }
	        return product;
	    }

	    // Method to perform division of the given numbers
	    public static double divide(double[] numbers) {
	        double quotient = numbers[0];
	        for (int i = 1; i < numbers.length; i++) {
	            quotient /= numbers[i];
	        }
	        return quotient;
	    }

	    // Method to perform sin of a given number in radians
	    public static double sin(double number) {
	        return Math.sin(number);
	    }

	    // Method to perform cos of a given number in radians
	    public static double cos(double number) {
	        return Math.cos(number);
	    }

	    // Method to perform tan of a given number in radians
	    public static double tan(double number) {
	        return Math.tan(number);
	    }

	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);

	        // Prompt user for calculator mode
	        System.out.print("Enter the calculator mode: Standard/Scientific?\n> ");
	        String mode = input.nextLine();

	        // Loop to ask user if they want to continue using calculator
	        while (true) {

	            // Prompt user for operation to perform
	            System.out.print("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division");
	            if (mode.equalsIgnoreCase("scientific")) {
	                System.out.print(", 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:\n> ");
	            } else {
	                System.out.println(":");
	                System.out.print("> ");
	            }

	            // Read user input for operation
	            String operation = input.nextLine();

	            // Determine if operation is valid
	            if (!operation.equals("+") && !operation.equals("-") && !operation.equals("*")
	                    && !operation.equals("/") && !operation.equals("sin") && !operation.equals("cos")
	                    && !operation.equals("tan")) {
	                System.out.println("Invalid operator " + operation);
	                continue;
	            }

	            // Prompt user for number of values to operate on
	            System.out.print("How many numbers do you want to " + operation + "?\n> ");
	            int count = input.nextInt();
	            input.nextLine(); // Consume newline left-over

	            // Prompt user for values to operate on
	            double[] values = new double[count];
	            System.out.println("Enter " + count + " numbers:");
	            for (int i = 0; i < count; i++) {
	                System.out.print("> ");
	                values[i] = input.nextDouble();
	                input.nextLine(); // Consume newline left-over
	            }

	            // Perform operation and display result
	            double result = 0;
	            switch (operation) {
	                case "+":
	                    result = add(values);
	                    break;
	                case "-":
	                    result = subtract(values);
	                    break;
	                case "*
