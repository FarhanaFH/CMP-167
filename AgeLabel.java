
import java.util.Scanner;
public class AgeLabel {
public static void main(String[] args) {

Scanner obj = new Scanner (System.in); // Create a Scanner object

System.out.println("Enter an age in number of days :");

int j = obj.nextInt();
float no = j/365;
if (no<=1.0)
System.out.println("You are an infant");
else if (no>1.0 && no<=3.0) System. out.println("You are a toddler");
else if (no>3.0 && no<=12.0) System.out.println("You are a child");
else if (no>12.0 && no<=19.0) System.out.println("You are a teenager");
else if (no>19.0 && no<=21.0) System.out.println("You are a young adult");
else if (no>21.0 & no<=50.0) System.out.println("You are an adult");
else if (no>50.0 && no<=65.0) System.out.println("You are middle aged");
else if (no>65.0) System.out.println("You are a senior citizen");
}
}

