/*
 * Farhana 
 * PROJECT ELIZA
 * CMP 167
 * Professor: 
 * YouTube Link: 
 */

import java.util.Random;
import java.util.Scanner;

//1st class used 
public class ProjectEliza {
	
	//Initialize the greeting.
    private static void greet(Scanner scanner) {
        System.out.println("Hello, my name is Eliza. What is your name?");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s! Tell me what is on your mind today in one sentence.\n", name);
    }
    
    //Initialize use of first and last word of user input.
    private static String[] getFirstAndLastWordOfString(String string) {
        String[] splitString = string.trim().split(" ");
        String first = splitString[0];
        String last = splitString[splitString.length - 1];
        char lastChar = last.charAt(last.length() - 1);
        
        if (lastChar == '?' || lastChar == '!' || lastChar == '.') {
            last = last.substring(0, last.length() - 1);
        }
        
        return new String[]{first, last};
    }
    
    //Initialize use of BLANK1 and BLANK2 to replace the 1st and last word of user input.
    private static String changePrompt(String prompt, String word1, String word2) {
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        String capitalWord1 = word1.replaceFirst(Character.toString(word1.charAt(0)), Character.toString(Character.toUpperCase(word1.charAt(0))));
        String capitalWord2 = word2.replaceFirst(Character.toString(word2.charAt(0)), Character.toString(Character.toUpperCase(word2.charAt(0))));
        
        return prompt.replace("BLANK1", word1).replace("BLANK1", capitalWord1).replace("BLANK2", word2).replace("BLANK2", capitalWord2);
    }
	
    //Set up constants for questions, exclamations, and sentences with period.
    enum PromptType {
        qSentence, eSentence, pSentence
    }
    
    //Set up responses according to user input sentence types.
    private static PromptType getPromptType(String entry) {
        switch (entry.charAt(entry.length() - 1)) {
            case '?':
                return PromptType.qSentence;
            case '!':
                return PromptType.eSentence;
            case '.':
            default:
                return PromptType.pSentence;
        }
    }

    //Initialize main method to execute program.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PromptBank bank = new PromptBank();
        bank.populateStatementsArray();
        bank.populateQuestionsArray();

        greet(scanner);

        //Initialize EXIT sequence and responses.
        while (true) {
            String entry = scanner.nextLine();
            String prompt = "";

            if (entry.equalsIgnoreCase("exit")) { 
                System.out.print("Would you like to run a new session? ");
                String answer = scanner.nextLine();

                if (answer.equalsIgnoreCase("yes")) {
                    System.out.println("\n\n");
                    greet(scanner); 
                } 
                
                else if (answer.equalsIgnoreCase("no")) {
                    System.out.println("Goodbye, until next time");
                    break;
                }
            } 
            
            	else {
                PromptType type = getPromptType(entry);
                
                //Random generator responses based on sentence types.
                switch (type) {
                    case qSentence:
                        prompt = bank.getRandomQuestionTrunk();
                        break;
                    case eSentence:
                        prompt = "WOW! Dramatic! ";
                    case pSentence:
                        prompt += bank.getRandomStatementTrunk();
                        break;
                    default:
                        break;
                }
                String[] entryFirstAndLast = getFirstAndLastWordOfString(entry);

                System.out.println(changePrompt(prompt, entryFirstAndLast[0], entryFirstAndLast[1]));
            }
        }
    }
}
