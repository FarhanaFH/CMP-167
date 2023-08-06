/*Name: Farhana
 *Description:  program named CircleSphere that prompts the user for a double value representing a radius. 
 *Date created: March 22, 2023
*Date modified: March 23, 2023
*Email: 
 */

import java.util.Scanner;
public class PatternOne { 
public static void main(String[] args) {
int n,i,j;
Scanner scanner= new Scanner(System.in); 
System.out.println("Please enter a number 1...9 : ");
n=scanner.nextInt(); 
for(i=1;i<=n;i++)
{
for(j=1;j<=i;j++)
{	
System.out.print(j+" ");
}
System.out.println();
}
}
}
