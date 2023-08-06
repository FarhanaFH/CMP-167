import java.util.Scanner;

public class TelephoneNumber {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Please enter a telephone number using letters : ");
			String str = scanner.nextLine();
			int count = 0, flag = 0;
			String Number = "";
			str = str.toLowerCase();
 
			for (int i = 0; i < str.length(); i++) {
			    
			    char character = str.charAt(i);
			    if (count <= 6) {
			        if (count == 3 && flag == 0) {
			            Number += '-';
			            flag = 1;
			        }
			        if (character == 'a' || character == 'b' || character == 'c') {
			            Number += 2;
			            count += 1;
			        } else if (character == 'd' || character == 'e' || character == 'f') {
			            Number += 3;
			            count += 1;
			        } else if (character == 'g' || character == 'h' || character == 'i') {
			            Number += 4;
			            count += 1;
			        } else if (character == 'j' || character == 'k' || character == 'l') {
			            Number += 5;
			            count += 1;
			        } else if (character == 'm' || character == 'n' || character == 'o') {
			            Number += 6;
			            count += 1;
			        } else if (character == 'p' || character == 'q' || character == 'r' || character == 's') {
			            Number += 7;
			            count += 1;
			        } else if (character == 't' || character == 'u' || character == 'v') {
			            Number += 8;
			            count += 1;
			        } else if (character == 'w' || character == 'x' || character == 'y' || character == 'z') {
			            Number += 9;
			            count += 1;
			        }
			    }
			}
			System.out.println(""+ Number);
		}
    }
}

