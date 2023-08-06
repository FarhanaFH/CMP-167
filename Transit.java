import java.util.Scanner;

public class 
{
public static void(String[] args) {
  
Scanner input = new Scanner(System.in); //For user input
  
System.out.println("Enter zone number :");
int zoneNumber = input.nextInt(); //Taking zoneNumber from user
  
System.out.println("Enter adult or child :");
String adultOrChild = input.next(); //Taking input from user
  
double price = 0.0;
if(zoneNumber<=2) //if zoneNumber<2
{
if(adultOrChild.equals("adult"))
price = 23.0;
else if(adultOrChild.equals("child"))
price = 11.5;
}
if(zoneNumber==3) //if zoneNumber=3
{
if(adultOrChild.equals("adult"))
price = 34.5;
else if(adultOrChild.equals("child"))
price = 23.0;
}
if(zoneNumber==4) //if zoneNumber=4
{
if(adultOrChild.equals("adult"))
price = 46.0;
else if(adultOrChild.equals("child"))
price = 23.0;
}
if(zoneNumber>4) //if zoneNumber>4
price = -1.0;
  
//Printing the result.
System.out.println("The fare for "+ adultOrChild + " to zone number " + zoneNumber + " is " + price + ".");
  
}
}