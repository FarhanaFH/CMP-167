/*
 *  Name: Farhana Hussen
 *  Email: farhana.hussen@lc.cuny.edu
 */

public class Homework6Methods {
public static int getMaxOf2Ints(int A1, int A2) {
return A1 > A2 ? A1 : A2;}
public static int getMinOf2Ints(int A1, int A2) {

return A1 < A2 ? A1 : A2;
}
public static int getMaxOf3Ints(int A1, int A2, int A3) {
int max = A1;

if (max < A2)
max = A2;

if (max < A3)
max = A3;

return max;
}
public static int getMedianOf3Ints(int A1, int A2, int A3) {
if (A2 <= A1 && A1 <= A3)

return A1;
else if (A3 <= A1 && A1 <= A2)
return A1;

else if (A1 <= A2 && A2 <= A3)
return A2;
else if (A3 <= A2 && A2 <= A1)
return A2;
else
return A3;
}
public static void printMinOf3Ints(int A1, int A2, int A3) {

int min = A1;
if (min > A2)
min = A2;
if (min > A3)
min = A3;
System.out.println("The min is " + min);
}
public static int getProdOfAllPositiveInts(int N) {

if (N <= 0)
return 0;
int product = 1;
for (int i = 2; i <= N; i++)
product = product * i;
return product;
}

public static int getProdOfAllNegativeInts(int N) {
if (N >= 0)
return 0;
int product = 1;
for (int i = -1; i >= N; i--)
product *= i;
return product;
}

public static boolean isProdOfAllNegativeIntsNegative(int N) {
return getProdOfAllNegativeInts(N) < 0; 
}

public static char getCharAtIndex(String s, int index) {

if (s == null || index < 0 || index > s.length() - 1)
return '?';
else
return s.charAt(index);
}

public static int getCountOfCharInString(String s, char c) {
int occurrences = 0;
for (int i = 0; i < s.length(); i++) {
if (s.charAt(i) == c)
occurrences += 1;
}
return occurrences;
}
public static String getStringReversed(String s) {
String reversed = "";
for (int i = 0; i < s.length(); i++) {
reversed = s.charAt(i) + reversed;
}
return reversed;
}
public static String getStringTitleCased(String s) {

String[] data = s.split(" ");
String capitalized="";

for (int i = 1; i < data.length; i++) {
String dataNew = data[i].toLowerCase();
capitalized += dataNew.substring(0,1).toUpperCase()+dataNew.substring(1)+" ";
}

return capitalized;

}
public static void main(String[] args) {
System.out.println("getProdOfAllPositiveInts(5) = "
+getProdOfAllPositiveInts(5));
System.out.println("getProdOfAllNegativeInts(-3) = "
+getProdOfAllNegativeInts(-3));

System.out.println("isProdOfAllNegativeIntsNegative(-3) = "
+isProdOfAllNegativeIntsNegative(-3));
System.out.println("getMedianOf3Ints(-5,-1,-8) = " + getMedianOf3Ints(-5, -1, -8));
System.out.println("getCharAtIndex(Helo,3) = "+ getCharAtIndex("Helo",3));
System.out.println("getCharAtIndex(Helo,4) = "+ getCharAtIndex("Helo",4));

System.out.println("getStringTitleCased(\"the dog ate my homework!\") = "
+ getStringTitleCased("the dog ate my homework!"));
System.out.println("getStringTitleCased(tHe Dog atE My HOMEwoRk!) = "
+getStringTitleCased("tHe Dog atE My HOMEwoRk!"));
System.out.println("getStringTitleCased(THE DOG ATE MY HOMEWORK!) = "
+getStringTitleCased("THE DOG ATE MY HOMEWORK!"));
}
}

