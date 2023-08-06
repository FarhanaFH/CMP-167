/*
 *  Name: Farhana Hussen
 *  Description: HW 7
 *  Date Created: 
 *  Date Modified: 
 *  Email: farhana.hussen@lc.cuny.edu
 */

import java.util.Scanner;

public class Grades{


public static int readGrades(int[] grades)

{

Scanner scnr = new Scanner(System.in);

System.out.println("Enter a grade : ");

int a = scnr.nextInt();

int i = 1;

while(a != -1)

{

grades[i] = a;

i = i + 1;

System.out.println("Enter a grade : ");

a = scnr.nextInt();

}


return i;

}

public static int sum(int [] arr)

{

int sum = 0;

for(int i = 0; i < arr.length; i++)

{

sum += arr[i];

}

return sum;

}

public static int sum(int [] arr, int firstIndex, int lastIndex)

{

if(firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex)

return -666;

int sum = 0;

for(int i = firstIndex; i <= lastIndex; i++)

{

sum += arr[i];


}

return sum;

}

public static int maxValue(int[] arr, int firstIndex, int lastIndex)

{

if(firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex)

return -666;

int max = arr[firstIndex];

for(int i = firstIndex + 1; i <= lastIndex; i++)

{

if(max < arr[i])

max = arr[i];

}

return max;

}

public static int maxValue(int [] grades)

{

int max = grades[0];

for(int i=1; i < grades.length; i++)

{

if(max < grades[i])

max = grades[i];

}

return max;

}

public static int minValue(int [] grades)

{

int min = grades[0];

for(int i = 1; i < grades.length; i++)

{

if(min > grades[i])

min = grades[i];

}

return min;

}

public static int minValue(int [] arr, int firstIndex, int lastIndex)

{

if(firstIndex < 0 || lastIndex >= arr.length || firstIndex > lastIndex)

return -666;

int min = arr[firstIndex];

for(int i = firstIndex + 1; i <= lastIndex; i++)

{

if(min > arr[i])

min = arr[i];

}

return min;

}

public static int indexOfFirstMinValue(int [] arr)

{

int min = arr[0];

int index = 0;

for(int i = 1; i < arr.length; i++)

{

if(min > arr[i])

{min = arr[i]; index = i;}

}

return index;

}

public static int indexOfFirstMaxValue(int [] arr)

{

int max = arr[0];

int index = 0;

for(int i = 1; i < arr.length; i++)

{

if(max < arr[i])

{max = arr[i]; index = i;}

}

return index;

}

public static double average(int [] arr)

{

double sum = sum(arr);

return sum / arr.length;

}


public static int numberOfBelowAverageElements(int [] arr)

{

double val = average(arr);

int count = 0;

for(int i = 0; i < arr.length; i++)

{

if(arr[i] < val)

count++;

}

return count;

}


public static int numberOfAboveAverageElements(int [] arr)

{

double val = average(arr);

int count = 0;

for(int i = 0; i < arr.length; i++)

{

if(arr[i] > val)

count++;

}

return count;

}


public static void rotateElements(int [] arr)

{

int len = arr.length - 1;

int val = arr[len];

for(int i = len-1; i >= 0; i--)

{

arr[i + 1]= arr[i];

}

arr[0] = val;

}

public static void rotateElements(int [] arr, int rotationCount)

{

for(int i = 1; i < rotationCount; i++)

{

rotateElements(arr);


}

}


public static void reverseArray(int [] arr)

{

int i, k, t;

int n = arr.length;

for (i = 0; i < n / 2; i++) {

t = arr[i];

arr[i] = arr[n - i - 1];

arr[n - i - 1] = t;

}

}


public static void main(String[] args) {

Scanner in = new Scanner(System.in);

System.out.println("Enter a grade : ");

int a = in.nextInt();

while(a != -1){

int [] grad = new int[50];

grad[0] = a;

int count = readGrades(grad);

int [] grades = new int[count];

for(int i = 0; i < count; i++)

{

grades[i] = grad[i];

}

System.out.println("Number Of Grades = " + count);


int max = maxValue(grades);

System.out.println("Maximum Grade = " + max);


int min = minValue(grades);

System.out.println("Minimum Grade = " + min);

System.out.println("Enter a grade : ");

a = in.nextInt();


}

}

}