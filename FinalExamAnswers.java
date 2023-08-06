import java.util.Scanner;
public class FinalExamAnswers
{
   public static void main(String args[]){
String sentence;
Scanner sc = new Scanner(System.in);
System.out.println("Enter a sentence:");
System.out.print("User enters: ");
sentence = sc.nextLine();
manipualteString(sentence);
   }
   public static void manipualteString(String sentence){
   String[] words=sentence.split(" ");
   int n=1,i;
   int len = words.length;
   System.out.print("Method prints: ");
   for(i=len-1;i>=0;i--){
   if(n%2!=0)
   System.out.print(words[i]+" ");
   else
   System.out.print(words[i].toUpperCase()+" ");
   n++;
   }
  
   }
}