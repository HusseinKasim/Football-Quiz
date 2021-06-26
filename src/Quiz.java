import java.util.Random;

public class Quiz {
	
	
	static Question[] questionsList = {Question.question1, Question.question2, Question.question3, Question.question4, Question.question5, Question.question6, 
    Question.question7, Question.question8, Question.question9, Question.question10, Question.question11, Question.question12, Question.question13, 
    Question.question14, Question.question15, Question.question16, Question.question17, Question.question18, Question.question19, Question.question20,
    Question.question21, Question.question22, Question.question23, Question.question24, Question.question25, Question.question26, Question.question27,
    Question.question28, Question.question29, Question.question30, Question.question31, Question.question32, Question.question33, Question.question34,
    Question.question35, Question.question36, Question.question37};
	

	 static Random rand = new Random();
	   static int seconds= 10;
 

	    public static Question getRandQues(){
	        return questionsList[rand.nextInt(questionsList.length)];
	    }
	    
		  static Question chosenQuestion;
	   public static void setQuestion()
	   {
		   
		   chosenQuestion = getRandQues();
		   Main.questionLabel.setText(chosenQuestion.question);
		   Main.option1Button.setText(chosenQuestion.option1);
		   Main.option2Button.setText(chosenQuestion.option2);
		   Main.option3Button.setText(chosenQuestion.option3);
		   Main.option4Button.setText(chosenQuestion.option4);
	   }
	   
	 
}
	
