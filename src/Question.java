
public class Question {
	
	String question;
	String option1;
	 String option2;
	 String option3;
	 String option4;
    int difficulty;
    String correctOption;
    
    
    public Question(String question, String option1, String option2, String option3, String option4, int difficulty, String correctOption)
    {
    	this.question = question;
    	this.option1 = option1;
    	this.option2 = option2;
    	this.option3 = option3;
    	this.option4 = option4;
    	this.difficulty = difficulty;
    	this.correctOption = correctOption;
    }
	
    
	   static Question question1 = new Question("Who won the World Cup in 2018?", "France", "Brazil", "Germany", "Italy", 3, "France");
	   static Question question2 = new Question("Who won the World Cup in 2014?", "Spain", "England", "Germany", "Brazil", 3, "Germany");
	   static Question question3 = new Question("Who won the Champions League in the 2011/12 Season?", "Barcelona", "Bayern Munich", "Chelsea", "Manchester United", 3, "Chelsea");
	   static Question question4 = new Question("Who was the top scorer in the 2014 World Cup?", "Cristiano Ronaldo", "Robben", "Lionel Messi", "James Rodriguez", 5, "James Rodriguez");
	   static Question question5 = new Question("Who won the World Cup in 2010?", "Spain", "France", "Uruguay", "Mexico", 3, "Spain");
	   static Question question6 = new Question("In what position did Southampton finish the 2015/16 Premier League season?", "10th Place", "18th Place", "4th Place", "6th Place", 7, "6th Place");
	   static Question question7 = new Question("With 365 goals, who holds the record for top Bundesliga goalscorer of all time?", "Gerd Muller", "Claudio Pizarro", "Michael Ballack", "Miroslav Klose", 7, "Gerd Muller");
	   static Question question8 = new Question("Who is the most capped Germany international of all time?", "Miroslav Klose", "Philipp Lahm", "Lothar Matthaus", "Gerd Muller", 5, "Lothar Matthaus");
	   static Question question9 = new Question("Who won the World Cup in 2018?", "France", "Brazil", "Germany", "Italy", 3, "France");
	   static Question question10 = new Question("What is the nickname of Borussia Monchengladbach?", "Die Menschen", "Die Gewinner", "Die Fohlen", "Die Spieler", 7, "Die Fohlen");
	   static Question question11 = new Question("Which MLS team does David Beckham own?","D.C. United", "Inter Miami", "Toronto F.C.", "L.A. Galaxy", 3, "Inter Miami");
	   static Question question12 = new Question("Who won the Premier League Trophy in the 2015/16 season?", "Chelsea", "Spurs", "Manchester City", "Leicester City", 3, "Leicester City");
	   static Question question13 = new Question("What trophy did Tottenham Hotspur win in 2018?", "Super Cup", "Champions League", "Premier League", "Audi Cup", 3, "Audi Cup"); 
	   static Question question14 = new Question("Which player holds the record for most Champions League winners' medals?", "Francisco Gento", "Fernando Hierro", "Cristiano Ronaldo", "Zinedine Zidane", 7, "Francisco Gento");
	   static Question question15 = new Question("What number did Cristiano Ronaldo wear at Real Madrid, besides 7?", "4", "19", "17", "9", 3, "9");
	   static Question question16 = new Question("Which manager promoted Leeds United back to the Premier League in 2020", "Garry Monk", "Marcelo Bielsa", "Uwe Rösler", "	Steve Evans", 3, "Marcelo Bielsa");
	   static Question question17 = new Question("Which of the following is the oldest football club in England?", "Notts County", "Manchester United", "Nottingham Forest", "Leeds United", 7, "Notts County");
	   static Question question18 = new Question("Which English team is based furthest south?", "Plymouth Argyle", "Southampton", "Brighton", "Portsmouth", 5, "Plymouth Argyle");
	   static Question question19 = new Question("Which player has made the most appearances in Premier League history?", "Ryan Giggs", "David James", "Frank Lampard", "Gareth Barry", 7, "Gareth Barry");
	   static Question question20 = new Question("Who has scored the most free kicks in history?", "Cristiano Ronaldo", "Lionel Messi", "Pele", "Juninho", 5, "Juninho");
	   static Question question21 = new Question("Who scored England's final goal in the 1966 World Cup final?", "James Greaves", "Geoff Hurst", "Bobby Moore", "Roger Hunt", 3, "Geoff Hurst");
	   static Question question22 = new Question("Which nation won the first European Championship (Euros) in 1960?", "West Germany", "Soviet Union", "England", "Denmark", 5, "Soviet Union");
	   static Question question23 = new Question("Who got injured during the 2014 World Cup for Brazil?", "Neymar", "Oscar", "David Luiz", "Fernandinho", 3, "Neymar");
	   static Question question24 = new Question("In what year did Arsenal leave Highbury?", "2003", "2004", "2005", "2006", 3, "2006");
	   static Question question25 = new Question("Which Premier League or EFL team is known as: The Hornets?", "West Ham", "Bournemouth", "Leeds", "Watford", 3, "Watford");
	   static Question question26 = new Question("Which club did Diego Maradona last play for in his career?", "Napoli", "Barcelona", "Sevilla", "Boca Juniors", 3, "Boca Juniors");
	   static Question question27 = new Question("Which year was the Premier League founded?", "1991", "1992", "1993", "1994", 3, "1992");
	   static Question question28 = new Question("Which Dutch player was voted 'European Player of the Century' in 1999?", "Johan Cruyff", "Marco van Basten", "Ruud Gullit", "Frank Rijkaard", 3, "Johan Cruyff");
	   static Question question29 = new Question("Who scored a ghost goal in the Bundesliga in the 2013/14 season?", "Mario Gomez", "Marco Reus", "Stefan Kießling", "Robert Lewandowski", 5, "Stefan Kießling");
	   static Question question30 = new Question("Wayne Rooney scored his Premier League first goal against which team?", "Manchester United", "Liverpool", "Arsenal", "Chelsea", 3, "Arsenal");
	   static Question question31 = new Question("How many trophies did Chelsea win in the 1990s?", "2", "3", "4", "5", 7, "4");
	   static Question question32 = new Question("What year did John Terry make his debut?", "1997", "1998", "1999", "2000", 5, "1998");
	   static Question question33 = new Question(" Who was voted best ever Chelsea player in 2003?", "Gianfranco Zola", "Jesper Grønkjær", "Eiður Guðjohnsen", "Frank Lampard", 5, "Gianfranco Zola");
	   static Question question34 = new Question("How many FA Cup medals did Ashley Cole win for Chelsea and Arsenal?", "6", "7", "8", "9", 5, "7");
	   static Question question35 = new Question("How many goals did Chelsea concede in the 2004/05 season?", "34", "27", "18", "15", 7, "15");
	   static Question question36 = new Question("Who won the Champions League in the 2020/21 season?", "Chelsea", "Manchester City", "Real Madrid", "PSG", 5, "Chelsea");
	   static Question question37 = new Question("Who scored the winning goal in the 2020/21 Champions League Final?", "Sergio Aguero", "Mason Mount", "Phil Foden", "Kai Havertz", 7, "Kai Havertz");
			   }
