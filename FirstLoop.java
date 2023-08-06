/*Name: Farhana
 *Description: Program with a loop that iterates as long as an int variable called  num is less or equal to 50.
 *Date created: March 22, 2023
*Date modified: March 23, 2023
*Email: 
 */
import java.util.Scanner;
public class FirstLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num;
		
		
		for (num = 1; num <= 50; ++num) {
			
			if (num % 2 == 0) {
				System.out.println(num+ " is an even number");
				System.out.println(num+ " is divisible by 2");
			}
			if (num % 2 != 0) {
				System.out.println(num+ " is an odd number");
			}
			if (num % 5 == 0) {
				System.out.println(num+ " is divisible by 5");
				
			}
			if (num % 8 == 0) {
				System.out.println(num+ " is divisible by 8");
			}
			if (num % 11 == 0) {
				System.out.println(num+ " is divisible by 11");
			}
			
			
		}

	}

}
