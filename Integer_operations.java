import java.util.Scanner;

public class Integer_operations

{

      //main function

      public static void main(String[] args)

      {

               //Create a new object of Scanner class and

               //store it in variable input.

              Scanner sc = new Scanner(System.in);

              

              //Declare the necessary variables

              int firstInt, secondInt, thirdInt;

              int firstResult, secondResult, thirdResult;

              //Prompt the user to enter the first integer.

              System.out.print("Enter firstInt: ");

              firstInt = sc.nextInt();

              //Prompt the user to enter the second integer.

              System.out.print("Enter secondInt: ");

              secondInt = sc.nextInt();

              //Prompt the user to enter the third integer.

              System.out.print("Enter thirdInt: ");

              thirdInt = sc.nextInt();

              //Add firstInt and secondInt and divide result

              // by thirdInt

              firstResult = (firstInt+secondInt)/(thirdInt);

             

              //Multiply secondInt by thirdInt and divide

              // result by sum of second and firstInt.

              secondResult = (secondInt*thirdInt)/(secondInt+firstInt);

             

              //Multiply firstInt by thirdInt and find the

              //remainder by dividing result by secondInt.

              thirdResult = (firstInt*thirdInt)%secondInt;

             

              //Display the desired results stored in variables

              // firstResult,secondResult and thirdResult.

              System.out.println("First Result = "+firstResult);

              System.out.println("Second Result = "+secondResult);

              System.out.println("Third Result = "+thirdResult);

          }

}
