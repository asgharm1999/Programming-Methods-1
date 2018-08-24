
public class PromptBank {
	
	String [] statements;
	String [] questions;
	
	public PromptBank(){
		statements = new String[3]; 
		questions = new String[3];
	}

	public void populateStatementsArray(){
		statements[0] = "Tell me more about BLANK1 and BLANK2.";
		statements[1] = "BLANK1 seems important to you, so does BLANK2. Please tell me more.";
		statements[2] = "BLANK1 and BLANK2 seem to be on your mind. Let's talk about it.";
	}
	
	public void populateQuestionsArray(){
		questions[0] = "Is there anything else about BLANK1 and BLANK2?";
		questions[1] = "Does BLANK1 bother you? How about BLANK2?";
		questions[2] = "Are BLANK1 and BLANK2 things you think about often?";	
	}
	
	public String getRandomStatementTrunk(){
        int y = (int)Math.floor(Math.random() * statements.length);
        String statement = statements[y];
         return statement;
    }


    public String getRandomQuestionTrunk(){
        int x = (int)Math.floor(Math.random() * questions.length);
        String question = questions[x];
        return question;
    }
}
