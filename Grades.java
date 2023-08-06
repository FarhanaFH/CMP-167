/*Name: Farhana 
 *Description: program that reads a list of exam grades entered as int's in the range of 0 to 100
 *Date created: March 22, 2023
*Date modified: March 23, 2023
*Email: 
 */

import java.util.ArrayList;  
import java.util.Scanner; 
public class Grades
{
public static void main(String[] args) {	
ArrayList<Integer> list_grade = new ArrayList<>(); 
int[] count_grade = new int[10];
int grade;
Scanner scan = new Scanner(System.in);

 while(true)
{
 System.out.println("Enter a grade: "); 
 grade = scan.nextInt();

 if (grade < 0)

 break;

list_grade.add(grade); }

for (int i = 0; i < list_grade.size();i++) {
	
grade = list_grade.get(i);

 if(grade >= 93 && grade <= 100)

 count_grade[0] += 1;

 else if( grade >= 90 && grade < 93)

count_grade[1] += 1;

 else if( grade >= 87 && grade < 90)

count_grade[2] += 1;

 else if( grade >= 83 && grade < 87)

count_grade[3] += 1;

else if( grade >= 80 && grade < 83)

 count_grade[4] += 1;

else if( grade >= 77 && grade < 80)

 count_grade[5] += 1;

 else if( grade >= 73 && grade <77)

count_grade [6] += 1;

 else if( grade >= 70 && grade <73)

 count_grade [7] += 1;

else if(grade >= 60 && grade < 70)

count_grade [8] += 1;
 else
count_grade [9] += 1;
}
 System.out.println("Total number of grades = " + list_grade.size());

System.out.println("Number of A's  = " + count_grade[0]);

System.out.println("Number of A-'s = " + count_grade[1]);

System.out.println("Number of B+'s = " + count_grade[2]);

System.out.println("Number of B's  = " + count_grade[3]);

System.out.println("Number of B-'s = " + count_grade[4]);

System.out.println("Number of C+'s = " + count_grade[5]);

System.out.println("Number of C's  = " + count_grade[6]);

System.out.println("Number of C-'s = " + count_grade[7]) ;

System.out.println("Number of D's  = " + count_grade[8]) ;

System.out.println("Number of F's  = " + count_grade[9]) ;


}
}
