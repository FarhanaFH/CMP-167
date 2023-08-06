/*
 * Name: Farhana
 * PromptBank
 * CMP 167
 * Professor: 
 * link: 
 */

import java.util.Random;

public class PromptBank {
    String[] questions;
    String[] statements;
    Random random;

    public PromptBank() {
        questions = new String[5]; 
        statements = new String[5];
        random = new Random();
    }

    public void populateStatementsArray() {
    	 
		statements[0] = "Tell me more about BLANK1 and BLANK2";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
		statements[3] = "BLANK1 is fantastic BLANK2."; 
		statements[4] = "Let's start with BLANK1 and BLANK2.";
    }
    
    public void populateQuestionsArray() {
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";
		questions[3] = "can we discuss something more about BLANK1 and BLANK2?";
		questions[4] = "What would you prefer BLANK1 or BLANK2 to discuss more about?";

    }


    public String getRandomStatementTrunk() {
        return statements[random.nextInt(5)];
    }

    public String getRandomQuestionTrunk() {
        return questions[random.nextInt(5)];
    }
}
