import java.util.Scanner;
public class PatternTwo {
    public static void main(String[] args) {
        int n;
        int r;
        int c;
     // take user input
        Scanner scanner = new Scanner(System.in);       
        System.out.println("Please enter a number 1...9 : ");      
        n = scanner.nextInt();
        for(r = 1; r <= n; r++) {        	
            for(c = n; c > r; c--) {            	
                System.out.print("  ");
            }            
            for(int k = r; k >= 1; k--) {
                System.out.print(" ");               
                System.out.print(k);  
            }
            System.out.println("");
        }
    }
}
