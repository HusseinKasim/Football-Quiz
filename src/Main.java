	import javax.swing.*;
	import java.awt.*;
	import java.awt.event.*;

	
	
public class Main implements ActionListener {

	static int balance = 200000;
	static int count = 1;
	static int count2 = 1;
	static int quizBalance = balance; 
	int time = 10;
	int toggleCount = 0;
	public Timer t;
	
	
		//Intro screen attributes
		static JFrame frame = new JFrame("Football Quiz");
		JPanel panel = new JPanel();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JButton startButton = new JButton("Start");
		JButton exitButton = new JButton("Exit");
		JLabel gameName = new JLabel("Football Quiz");
		
		
		//Play screen attributes
		JFrame playFrame =  new JFrame("Football Quiz");
		JPanel playPanel = new JPanel();
		JPanel bluePlayPanel = new JPanel();
		JButton goToSquad = new JButton("Squad");
		JButton goToMarket = new JButton("Transfer Market");
		JButton goToClub = new JButton("Club");
		JButton goToQuiz = new JButton("Quiz");
		 JLabel quizBalanceLabel = new JLabel("quizBalance");
		
		 
		 
		//Quiz screen attributes
				JFrame quizFrame =  new JFrame("Quiz");
				JPanel quizPanel = new JPanel();
				JPanel blueQuizPanel = new JPanel();
				static JLabel questionLabel = new JLabel();
				static JButton option1Button = new JButton();
				static JButton option2Button = new JButton();
				static JButton option3Button = new JButton();
				static JButton option4Button = new JButton();
				JButton quizExitButton = new JButton("Exit");
				JLabel timerLabel = new JLabel("Timer: " + time);
				
				
				
				
		//Squad screen attributes
		JFrame squadFrame =  new JFrame("Squad");
		static JPanel squadPanel = new JPanel();
		JButton squadBackButton = new JButton("Back");
		JPanel blueSquadPanel = new JPanel();
		
		
		
        static JLabel GK_label = new JLabel("GK");
        static JLabel DEF1_label = new JLabel("RB");
        static JLabel DEF2_label = new JLabel("CB");
        static JLabel DEF3_label = new JLabel("CB");
        static JLabel DEF4_label = new JLabel("LB");
        static JLabel MID1_label = new JLabel("CM");
        static JLabel MID2_label = new JLabel("CM");
        static JLabel MID3_label = new JLabel("CAM");
        static JLabel ATT1_label = new JLabel("RW");
        static JLabel ATT2_label = new JLabel("ST");
        static JLabel ATT3_label = new JLabel("LW");
        static JLabel GK_DEF_Space = new JLabel("                                                                                                                                                            "); //FIX SPACES
        static JLabel DEF_MID_Space = new JLabel("                                                                                                                                                                                                                                  ");
        static JLabel MID_ATT_Space = new JLabel("                                                                                                                                                                                                                                              ");
        JLabel formationLabel = new JLabel();
        
        
        
		//Club screen attributes
        JFrame clubFrame = new JFrame("Club");
        static JPanel clubPanel = new JPanel();
        static JPanel clubPanel2 = new JPanel();
        JButton clubBackButton = new JButton("Back");
        JButton clubPlayerSell1 = new JButton("Sell");
        JButton clubNextButton = new JButton("Next");
        JButton clubBackButton2 = new JButton("Back");
        JPanel blueClubPanel = new JPanel();
        JPanel blueClubPanel2 = new JPanel();
        
        
        
        //Players in club
        static JLabel clubPlayer1 = new JLabel(" ");
        static JLabel clubPlayer2 = new JLabel(" ");
        static JLabel clubPlayer3 = new JLabel(" ");
        static JLabel clubPlayer4 = new JLabel(" ");
        static JLabel clubPlayer5 = new JLabel(" ");
        static JLabel clubPlayer6 = new JLabel(" ");
        static JLabel clubPlayer7 = new JLabel(" ");
        static JLabel clubPlayer8 = new JLabel(" ");
        static JLabel clubPlayer9 = new JLabel(" ");
        static JLabel clubPlayer10 = new JLabel(" ");
        static JLabel clubPlayer11 = new JLabel(" ");
        static JLabel clubPlayer12 = new JLabel(" ");
        static JLabel clubPlayer13 = new JLabel(" ");
        static JLabel clubPlayer14 = new JLabel(" ");
        static JLabel clubPlayer15 = new JLabel(" ");
        static JLabel clubPlayer16 = new JLabel(" ");
        
        
        
		
		//Transfer Market attributes
		JFrame transferMarketFrame = new JFrame("Transfer Market");
		JButton transferMarketBackButton = new JButton("Back");
		JPanel transferMarketPanel = new JPanel();
		JLabel tableHeader = new JLabel("Player                        Position            Price");
		static JLabel balance_displayed = new JLabel();
		JPanel blueTransferMarketPanel = new JPanel();
		JPanel blueTransferMarketPanel2 = new JPanel();
		JButton transferMarketNextPageButton = new JButton("Next");
		
		
		
		JPanel transferMarketPanel2 = new JPanel();
		JButton transferMarketBackButton2 = new JButton("Back");
		JLabel tableHeader2 = new JLabel("Player                         Position            Price");
		static JLabel balance_displayed2 = new JLabel();
		
		
		    //Players on Transfer Market
		static JLabel availablePlayer1 = new JLabel("Timo Werner                 ST              £50,000,000");
		static JLabel availablePlayer2 = new JLabel("Eden Hazard                  LW            £100,000,000");
		static JLabel availablePlayer3 = new JLabel("Lionel Messi                  RW            £350,000,000");
		static JLabel availablePlayer4 = new JLabel("Kevin De Bruyne           CAM          £250,000,000");
		static JLabel availablePlayer5 = new JLabel("Alisson Becker             GK             £80,000,000");
		static JLabel availablePlayer6 = new JLabel("Virgil Van Dijk                CB            £150,000,000");
		static JLabel availablePlayer7 = new JLabel("Cesar Azpilicueta         CB            £50,000,000");
		static JLabel availablePlayer8 = new JLabel("Ferland Mendy               LB            £70,000,000");
		static JLabel availablePlayer9 = new JLabel("Sergi Roberto                RB            £50,000,000");
		static JLabel availablePlayer10 = new JLabel("N'golo Kante                  CM            £150,000,000");
		static JLabel availablePlayer11 = new JLabel("Cesc Fabregas             CM            £20,000,000");
		static JLabel availablePlayer12 = new JLabel("Rodri                               CM            £60,000,000");
		static JLabel availablePlayer13 = new JLabel("Kai Havertz                   CAM          £80,000,000");
		static JLabel availablePlayer14= new JLabel("Kylian Mbappe               ST             £180,000,000");
		static JLabel availablePlayer15= new JLabel("Wissam Ben Yedder    ST             £80,000,000");
		static JLabel availablePlayer16= new JLabel("Jan Oblak                        GK            £130,000,000");
		
		// Player buy buttons
		static JButton WernerBuyButton = new JButton("Buy");
		static JButton HazardBuyButton = new JButton("Buy");
		static JButton MessiBuyButton = new JButton("Buy");
		static JButton KDBBuyButton = new JButton("Buy");
		static JButton AlissonBuyButton = new JButton("Buy");
		static JButton VVDBuyButton = new JButton("Buy");
		static JButton AzpiBuyButton = new JButton("Buy");
		static JButton F_MendyBuyButton = new JButton("Buy");
		static JButton S_RobertoBuyButton = new JButton("Buy");
		static JButton KanteBuyButton = new JButton("Buy");
		static JButton FabregasBuyButton = new JButton("Buy");
		static JButton RodriBuyButton = new JButton("Buy");
		static JButton HavertzBuyButton = new JButton("Buy");
		static JButton MbappeBuyButton = new JButton("Buy");
		static JButton BenYedderBuyButton = new JButton("Buy");
		static JButton OblakBuyButton = new JButton("Buy");
		
		
		//Player Add To Squad Button
		static JButton WernerSquadAddButton = new JButton("Add");
		static JButton HazardSquadAddButton = new JButton("Add");
		static JButton MessiSquadAddButton = new JButton("Add");
		static JButton KDBSquadAddButton = new JButton("Add");
		static JButton AlissonSquadAddButton = new JButton("Add");
		static JButton VVDSquadAddButton = new JButton("Add");
		static JButton AzpiSquadAddButton = new JButton("Add");
		static JButton FMendySquadAddButton = new JButton("Add");
		static JButton SRobertoSquadAddButton = new JButton("Add");
		static JButton KanteSquadAddButton = new JButton("Add");
		static JButton FabregasSquadAddButton = new JButton("Add");
		static JButton RodriSquadAddButton = new JButton("Add");
		static JButton HavertzSquadAddButton = new JButton("Add");
		static JButton MbappeSquadAddButton = new JButton("Add");
		static JButton BenYedderSquadAddButton = new JButton("Add");
		static JButton OblakSquadAddButton = new JButton("Add");
		
		
		
		//Player Remove From Squad Button
		static JButton WernerSquadRemoveButton = new JButton("Remove");
		static JButton HazardSquadRemoveButton = new JButton("Remove");
		static JButton MessiSquadRemoveButton = new JButton("Remove");
		static JButton KDBSquadRemoveButton = new JButton("Remove");
		static JButton AlissonSquadRemoveButton = new JButton("Remove");
		static JButton VVDSquadRemoveButton = new JButton("Remove");
		static JButton AzpiSquadRemoveButton = new JButton("Remove");
		static JButton FMendySquadRemoveButton = new JButton("Remove");
		static JButton SRobertoSquadRemoveButton = new JButton("Remove");
		static JButton KanteSquadRemoveButton = new JButton("Remove");
		static JButton FabregasSquadRemoveButton = new JButton("Remove");
		static JButton RodriSquadRemoveButton = new JButton("Remove");
		static JButton HavertzSquadRemoveButton = new JButton("Remove");
		static JButton MbappeSquadRemoveButton = new JButton("Remove");
		static JButton BenYedderSquadRemoveButton = new JButton("Remove");
		static JButton OblakSquadRemoveButton = new JButton("Remove");
	
		
		//Player Images
		static JLabel WernerImg = new JLabel(" ");
		static JLabel HazardImg = new JLabel(" ");
		static JLabel MessiImg = new JLabel(" ");
		static JLabel KDBImg = new JLabel(" ");
		static JLabel AlissonImg = new JLabel(" ");
		static JLabel VVDImg = new JLabel(" ");
		static JLabel AzpiImg = new JLabel(" ");
		static JLabel FMendyImg = new JLabel(" ");
		static JLabel SRobertoImg = new JLabel(" ");
		static JLabel KanteImg = new JLabel(" ");
		static JLabel FabregasImg = new JLabel(" ");
		static JLabel RodriImg = new JLabel(" ");
		static JLabel HavertzImg = new JLabel(" ");
		static JLabel MbappeImg = new JLabel(" ");
		static JLabel BenYedderImg = new JLabel(" ");
		static JLabel OblakImg = new JLabel(" ");
		
		public Main() {
		
			introScreen();
		}
			
		public void makeFrameMovable(JFrame F)
		{
			 F.addMouseListener(new MouseAdapter() {
	                public void mousePressed(MouseEvent me) {
	                    // Get x,y and store them
	                	
	                    pX = me.getX();
	                    pY = me.getY();

	                }

	                 public void mouseDragged(MouseEvent me) {

	                    F.setLocation(F.getLocation().x + me.getX() - pX,
	                            F.getLocation().y + me.getY() - pY);
	                }
	            });

			 F.addMouseMotionListener(new MouseMotionAdapter() {
	               public void mouseDragged(MouseEvent me) {

	                    F.setLocation(F.getLocation().x + me.getX() - pX,
	                            F.getLocation().y + me.getY() - pY);
	                }
	            });
			
		}
		int pX;
		int pY;
		
	//Intro screen GUI code
		
			private void introScreen()
			{	
				 frame.setLocation(400, 150); 
			frame.setSize(450, 500);
			frame.setIconImage(Toolkit.getDefaultToolkit().getImage(".//img//FQ.png"));
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(panel);
			frame.add(panel1);
			frame.setLayout(null);
			frame.setUndecorated(true);
			squadFrame.setUndecorated(true);
			transferMarketFrame.setUndecorated(true);
			clubFrame.setUndecorated(true);
			quizFrame.setUndecorated(true);
			
			panel.add(gameName);
			
			panel.setForeground(Color.WHITE);
			panel.setBackground(new Color(0, 102, 255));
			panel.setBounds(0, 0, 450, 35);
			panel.setLayout(null);
			
			gameName.setBounds(50, 70, 450, 60);
			panel1.add(gameName);
			gameName.setForeground(Color.WHITE);
			gameName.setFont(new Font("Arial Black", Font.BOLD, 43));
			
			
			panel1.setLayout(null);
			panel1.setBackground(Color.DARK_GRAY);
			panel1.setBounds(0, 35, 450, 500);
			
			
			panel1.add(startButton);
			startButton.setForeground(Color.WHITE);
			startButton.setBackground(new Color(0, 102, 255));
			startButton.setBounds(150, 230, 149, 41);
			
			panel1.add(exitButton);
			exitButton.setForeground(Color.WHITE);
			exitButton.setBackground(new Color(0, 102, 255));
			exitButton.setBounds(150, 330, 149, 41);
			
			startButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource()==startButton)
					{
						
					    playScreen();
					    playFrame.setVisible(true);
					    frame.setVisible(false);
					}
			
					else
						System.exit(0);
				}
				});
			
			
			exitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if(e.getSource() == exitButton)
					{
						System.exit(0);
						}
					}
				});
			
			frame.setVisible(true);
			makeFrameMovable(frame);	
			}
			
			//Quiz screen
			
				private void quizScreen()
				{
					
					quizFrame.setSize(450, 500);
					quizFrame.setLocation(400, 150);
					quizFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(".//img//FQ.png"));
					quizFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					quizFrame.add(quizPanel);
					quizFrame.add(blueQuizPanel);
					quizPanel.add(questionLabel);
					quizPanel.add(option1Button);
					quizPanel.add(option2Button);
					quizPanel.add(option3Button);
					quizPanel.add(option4Button);
					quizPanel.add(timerLabel);
					
					quizPanel.setLayout(null);
				
					quizPanel.add(quizBalanceLabel);
					quizBalanceLabel.setForeground(Color.WHITE);
					quizBalanceLabel.setBounds(270,-3,700,30);
					quizBalanceLabel.setText("Balance:  £" + quizBalance + ",000,000");
					
					blueQuizPanel.setForeground(Color.WHITE);
					blueQuizPanel.setBackground(new Color(0, 102, 255));
					blueQuizPanel.setBounds(0, 0, 450, 35);
					
					
					quizPanel.setLayout(null);
					quizPanel.setBackground(Color.DARK_GRAY);
					quizPanel.setBounds(0, 35, 450, 500);
					
					
					questionLabel.setForeground(Color.WHITE);
					questionLabel.setBounds(10, 50, 450, 76);

					timerLabel.setForeground(Color.WHITE);
					timerLabel.setBounds(100, 0, 450, 76);
					
					Quiz.setQuestion();
					
					
					option1Button.setForeground(Color.WHITE);
					option1Button.setBackground(new Color(0, 102, 255));
					option1Button.setBounds(25, 160, 150, 50);
					option1Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
						 if(e.getSource() == option1Button && option1Button.getText() == Quiz.chosenQuestion.correctOption)
						 {
							 time = 10;
							 balance+=Quiz.chosenQuestion.difficulty;
							 quizBalanceLabel.setText("Balance:  £" + balance + ",000,000");
							 Quiz.setQuestion();
						     quizBalance = balance; 
						 }
						}
					});
					
		
					
					option2Button.setForeground(Color.WHITE);
					option2Button.setBackground(new Color(0, 102, 255));
					option2Button.setBounds(270, 160, 150, 50);
					option2Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
						 if(e.getSource() == option2Button && option2Button.getText() == Quiz.chosenQuestion.correctOption)
						 {
							 time = 10;	
							 balance+=Quiz.chosenQuestion.difficulty;
							 quizBalanceLabel.setText("Balance:  £" + balance + ",000,000");
							 Quiz.setQuestion();
							 quizBalance = balance; 
						 }
						}
					});
					
					option3Button.setForeground(Color.WHITE);
					option3Button.setBackground(new Color(0, 102, 255));
					option3Button.setBounds(25, 260, 150, 50);
					option3Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
						 if(e.getSource() == option3Button && option3Button.getText() == Quiz.chosenQuestion.correctOption)
						 {
								time = 10;
								balance+=Quiz.chosenQuestion.difficulty;
								quizBalanceLabel.setText("Balance:  £" + balance + ",000,000");
								Quiz.setQuestion();
								quizBalance = balance; 
						 }
						}
					});
					
					option4Button.setForeground(Color.WHITE);
					option4Button.setBackground(new Color(0, 102, 255));
					option4Button.setBounds(270, 260, 150, 50);
					option4Button.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
						 if(e.getSource() == option4Button && option4Button.getText() == Quiz.chosenQuestion.correctOption)
						 {
							    time = 10;
								balance+=Quiz.chosenQuestion.difficulty;
							    quizBalanceLabel.setText("Balance:  £" + balance + ",000,000");
							    Quiz.setQuestion();
								quizBalance = balance; 
							 
						 }
						}
					});
					

					ActionListener quizTimerStart = new ActionListener() {
						 public void actionPerformed(ActionEvent evt) {
							time--;
							timerLabel.setText("Timer: " + time);
							
							if(time == 0)
							{
								Quiz.getRandQues();	
								Quiz.setQuestion();
								time = 10;
							}
						    }
				};
				
				Timer t = new Timer(1000, quizTimerStart);
			    t.start();

					
					
					quizPanel.add(quizExitButton);
					quizExitButton.setForeground(Color.WHITE);
					quizExitButton.setBackground(new Color(0, 102, 255));
					quizExitButton.setBounds(110, 370, 100, 40);		
					
					
					
					
			
					quizExitButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
					    t.stop();
					    time = 10;
						quizFrame.setVisible(false);
						playFrame.setVisible(true);
						}
					});
					
					 
					
				}
			
			//Squad screen
		
			private void squadScreen() {
				
				squadFrame.setSize(430, 500);
				squadFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(".//img//FQ.png"));
				squadFrame.setLocation(400, 150);
				squadFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				squadFrame.add(squadPanel);
				squadFrame.add(blueSquadPanel);
			
	
				squadPanel.add(balance_displayed);
				balance_displayed.setForeground(Color.WHITE);
				balance_displayed.setBounds(270,-3,700,30);
				balance_displayed.setText("Balance:  £" + balance + ",000,000");
				
				
				blueSquadPanel.setForeground(Color.WHITE);
				blueSquadPanel.setBackground(new Color(0, 102, 255));
				blueSquadPanel.setBounds(0, 0, 450, 35);
				blueSquadPanel.setLayout(null);
				
				squadPanel.setLayout(null);
				squadPanel.setBackground(Color.DARK_GRAY);
				squadPanel.setBounds(0, 35, 430, 500);
				
				
				
				squadPanel.add(ATT1_label);
				ATT1_label.setForeground(Color.WHITE);
				ATT1_label.setBounds(365,60,100,40);
				
				squadPanel.add(ATT2_label);
				ATT2_label.setForeground(Color.WHITE);
				ATT2_label.setBounds(200,60,100,40);
				
				squadPanel.add(ATT3_label);
				ATT3_label.setForeground(Color.WHITE);
				ATT3_label.setBounds(40,60,100,40);
				

				
				squadPanel.add(MID1_label);
				MID1_label.setForeground(Color.WHITE);
				MID1_label.setBounds(85,160,100,40);
				
				squadPanel.add(MID2_label);
				MID2_label.setForeground(Color.WHITE);
				MID2_label.setBounds(200,160,100,40);
				
				squadPanel.add(MID3_label);
				MID3_label.setForeground(Color.WHITE);
				MID3_label.setBounds(315,160,100,40);
			
				

				squadPanel.add(DEF1_label);
				DEF1_label.setForeground(Color.WHITE);
				DEF1_label.setBounds(376,260,100,40);
				
				squadPanel.add(DEF2_label);
				DEF2_label.setForeground(Color.WHITE);
				DEF2_label.setBounds(136,260,100,40);
				
				squadPanel.add(DEF3_label);
				DEF3_label.setForeground(Color.WHITE);
				DEF3_label.setBounds(256,260,100,40);
				
				squadPanel.add(DEF4_label);
				DEF4_label.setForeground(Color.WHITE);
				DEF4_label.setBounds(15,260,100,40);
				
			
				
				squadPanel.add(GK_label);
				GK_label.setForeground(Color.WHITE);
				GK_label.setBounds(200,300,100,70);
				
				
				
				
				squadPanel.add(squadBackButton);
				squadBackButton.setForeground(Color.WHITE);
				squadBackButton.setBackground(new Color(0, 102, 255));
				squadBackButton.setBounds(110, 390, 100, 40);		
				
				
				squadPanel.add(formationLabel);
				formationLabel.setText("4-3-3");
				formationLabel.setForeground(Color.WHITE);
				formationLabel.setBounds(270, 390, 100, 40);	
				
				squadBackButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						
					squadFrame.setVisible(false);
					playFrame.setVisible(true);
					}
				});
				
				Squad.showSquad();
				squadFrame.setVisible(true);
				
				
				
			}
			
			

			
			//Play Screen code 
			
			private void playScreen() {
				
				
				playFrame.setSize(450, 500);
				playFrame.setLocation(400, 150); 
			 	playFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(".//img//FQ.png"));
				playFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				playFrame.add(bluePlayPanel);
				playFrame.add(playPanel);
				playFrame.setUndecorated(true);
				
				

				bluePlayPanel.setLayout(null);
				bluePlayPanel.setForeground(Color.WHITE);
				bluePlayPanel.setBackground(new Color(0, 102, 255));
				bluePlayPanel.setBounds(0, 0, 450, 30);
				
				
				
				
				playPanel.setLayout(null);
				playPanel.add(goToQuiz);
				playPanel.add(goToSquad);
				playPanel.add(goToMarket);
				playPanel.add(goToClub);
				playPanel.add(exitButton);
				playPanel.setBackground(Color.DARK_GRAY);
				
				
				
				goToQuiz.setForeground(Color.WHITE);
				goToQuiz.setBackground(new Color(0, 102, 255));
				goToQuiz.setBounds(150, 100, 149, 41);
				goToQuiz.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == goToQuiz)
						{
							quizScreen();
							quizFrame.setVisible(true);
							playFrame.setVisible(false);
						}
					}
				});
				
				
				goToSquad.setForeground(Color.WHITE);
				goToSquad.setBackground(new Color(0, 102, 255));
				goToSquad.setBounds(150, 170, 149, 41);
				goToSquad.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == goToSquad)
						{
							squadScreen();
							squadFrame.setVisible(true);
							playFrame.setVisible(false);
						}				
					}
				});
				
				
				goToMarket.setForeground(Color.WHITE);
				goToMarket.setBackground(new Color(0, 102, 255));
				goToMarket.setBounds(150, 240, 149, 41);
				goToMarket.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					if(e.getSource() == goToMarket)
					{
						transferMarketScreen();
						transferMarketFrame.setVisible(true);
						playFrame.setVisible(false);
					}					
					}				
				});
				
				
				goToClub.setForeground(Color.WHITE);
				goToClub.setBackground(new Color(0, 102, 255));
				goToClub.setBounds(150, 310, 149, 41);
				goToClub.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == goToClub)
						{
							clubScreen();
							clubFrame.setVisible(true);
							playFrame.setVisible(false);
						}
					}
				});
				
				
				
				exitButton.setBounds(150, 380, 149, 41);
				exitButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(e.getSource() == exitButton)
						{
						System.exit(0);			
						}
					}
				});
				
			
				makeFrameMovable(playFrame);
			}
			
	
			
			
			//Club screen
			
			private void clubScreen() {
				
				clubFrame.setSize(450,500);
				clubFrame.setLocation(400, 150); 
				clubFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				clubFrame.add(clubPanel);
				clubFrame.add(blueClubPanel);
				clubFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(".//img//FQ.png"));
			
				
				blueClubPanel.setForeground(Color.WHITE);
				blueClubPanel.setBackground(new Color(0, 102, 255));
				blueClubPanel.setBounds(0, 0, 450, 35);
				blueClubPanel.setLayout(null);
				
				
				//Club page 1
				clubPanel.setLayout(null);
				clubPanel.setForeground(Color.WHITE);
				clubPanel.setBackground(Color.DARK_GRAY);
				clubPanel.setBounds(0, 35, 450, 500);
				clubPanel.add(balance_displayed);
				balance_displayed.setBounds(280,30,700,30);
				balance_displayed.setForeground(Color.WHITE);
				balance_displayed.setText("Balance:  £" + balance + ",000,000");
		
				
				clubPanel.add(clubBackButton);
				clubBackButton.setBounds(100, 400, 100, 40);
				clubBackButton.setForeground(Color.WHITE);
				clubBackButton.setBackground(new Color(0, 102, 255));
				clubBackButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						
					clubFrame.setVisible(false);
					playFrame.setVisible(true);
						
					}
				});
				
				clubPanel.add(clubNextButton);
				clubNextButton.setBounds(250, 400, 100, 40);
				clubNextButton.setForeground(Color.WHITE);
				clubNextButton.setBackground(new Color(0, 102, 255));
				clubNextButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == clubNextButton)
						{	
							clubPanel2.setVisible(true);
							clubPanel.setVisible(false);
						}
						
					}
				});
				

		
				
			clubPanel.add(clubPlayer1);
			clubPlayer1.setBounds(30,30,700,80);
			clubPlayer1.setForeground(Color.WHITE);
			
			
			
			clubPanel.add(clubPlayer2);
			clubPlayer2.setBounds(30,30,700,160);
			clubPlayer2.setForeground(Color.WHITE);
	          
			
			clubPanel.add(clubPlayer3);
			clubPlayer3.setBounds(30,30,700,240);
			clubPlayer3.setForeground(Color.WHITE);
	          
			
			clubPanel.add(clubPlayer4);
			clubPlayer4.setBounds(30,30,700,320);
			clubPlayer4.setForeground(Color.WHITE);
	          
			
			clubPanel.add(clubPlayer5);
			clubPlayer5.setBounds(30,30,700,400);
			clubPlayer5.setForeground(Color.WHITE);
	          
			
			clubPanel.add(clubPlayer6);
			clubPlayer6.setBounds(30,30,700,480);
			clubPlayer6.setForeground(Color.WHITE);
	          
			
			clubPanel.add(clubPlayer7);
			clubPlayer7.setBounds(30,30,700,560);
			clubPlayer7.setForeground(Color.WHITE);
	          
			
			clubPanel.add(clubPlayer8);
			clubPlayer8.setBounds(30,30,700,640);
			clubPlayer8.setForeground(Color.WHITE);
	          
			
			
			
		
			
				
				
				
		
				
				//Club page 2
			
			clubFrame.add(clubPanel2);
			clubFrame.add(blueClubPanel2);
			
			
				clubPanel2.setLayout(null);
				clubPanel2.setBackground(Color.DARK_GRAY);
				clubPanel2.setBounds(0, 35, 450, 500);
				
				clubPanel2.add(balance_displayed2);
				balance_displayed2.setBounds(280,30,700,30);
				balance_displayed2.setText("Balance:  £" + balance + ",000,000");
				balance_displayed2.setForeground(Color.WHITE);
				
				
				clubPanel2.add(clubPlayer9);
				clubPlayer9.setBounds(30,30,700,80);
				clubPlayer9.setForeground(Color.WHITE);
				
				
				clubPanel2.add(clubPlayer10);
				clubPlayer10.setBounds(30,30,700,160);
				clubPlayer10.setForeground(Color.WHITE);
				
				
				clubPanel2.add(clubPlayer11);
				clubPlayer11.setBounds(30,30,700,240);
				clubPlayer11.setForeground(Color.WHITE);
				
				
				clubPanel2.add(clubPlayer12);
				clubPlayer12.setBounds(30,30,700,320);
				clubPlayer12.setForeground(Color.WHITE);				
				
				
				clubPanel2.add(clubPlayer13);
				clubPlayer13.setBounds(30,30,700,400);
				clubPlayer13.setForeground(Color.WHITE);
				
				
				clubPanel2.add(clubPlayer14);
				clubPlayer14.setBounds(30,30,700,480);
				clubPlayer14.setForeground(Color.WHITE);
				
				
				clubPanel2.add(clubPlayer15);
				clubPlayer15.setBounds(30,30,700,560);
				clubPlayer15.setForeground(Color.WHITE);
				
				clubPanel2.add(clubPlayer16);
				clubPlayer16.setBounds(30,30,700,640);
				clubPlayer16.setForeground(Color.WHITE);
				
				
				
				clubPanel2.add(clubBackButton2);
				clubBackButton2.setBounds(100, 400, 100, 40);
				clubBackButton2.setForeground(Color.WHITE);
				clubBackButton2.setBackground(new Color(0, 102, 255));
				clubBackButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						clubPanel.setVisible(true);
						clubPanel2.setVisible(false);
						
					}
				});
				
				clubFrame.setVisible(true);
				
			}
			
			
			
	// Transfer Market Screen
			
			private void transferMarketScreen(){
				
				

				transferMarketFrame.setSize(450, 500);
				transferMarketFrame.setIconImage(Toolkit.getDefaultToolkit().getImage(".//img//FQ.png"));
				transferMarketFrame.setLocation(400, 150); 
				transferMarketFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				transferMarketFrame.add(transferMarketPanel);	
				transferMarketFrame.add(blueTransferMarketPanel);
				
			
				blueTransferMarketPanel.setForeground(Color.WHITE);
				blueTransferMarketPanel.setBackground(new Color(0, 102, 255));
				blueTransferMarketPanel.setBounds(0, 0, 450, 35);
				blueTransferMarketPanel.setLayout(null);
				
				
				transferMarketPanel.setLayout(null);
				transferMarketPanel.setBackground(Color.DARK_GRAY);
				transferMarketPanel.setBounds(0, 35, 450, 500);
				
				
				
				transferMarketPanel.add(balance_displayed);
				balance_displayed.setForeground(Color.WHITE);
				balance_displayed.setBounds(300,30,700,30);
				balance_displayed.setText("Balance:  £" + balance + ",000,000");
				
				
				transferMarketPanel.add(tableHeader);
				tableHeader.setForeground(Color.WHITE);
				tableHeader.setBounds(30,30,700,30);
				
				
				
				
				
				transferMarketPanel.add(availablePlayer1);
				availablePlayer1.setBounds(30,30,700,80);
				availablePlayer1.setForeground(Color.WHITE);
				transferMarketPanel.add(WernerBuyButton);
				WernerBuyButton.setBounds(300,65,140,15);
				WernerBuyButton.setForeground(Color.WHITE);
				WernerBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer2);
				availablePlayer2.setBounds(30,30,700,130);
				availablePlayer2.setForeground(Color.WHITE);
				transferMarketPanel.add(HazardBuyButton);
				HazardBuyButton.setBounds(300,90,140,15);
				HazardBuyButton.setForeground(Color.WHITE);
				HazardBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer3);
				availablePlayer3.setBounds(30,30,700,180);
				availablePlayer3.setForeground(Color.WHITE);
				transferMarketPanel.add(MessiBuyButton);
				MessiBuyButton.setBounds(300,115,140,15);
				MessiBuyButton.setForeground(Color.WHITE);
				MessiBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer4);
				availablePlayer4.setBounds(30,30,700,230);
				availablePlayer4.setForeground(Color.WHITE);
				transferMarketPanel.add(KDBBuyButton);
				KDBBuyButton.setBounds(300,140,140,15);
				KDBBuyButton.setForeground(Color.WHITE);
				KDBBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer5);
				availablePlayer5.setBounds(30,30,700,280);
				availablePlayer5.setForeground(Color.WHITE);
				transferMarketPanel.add(AlissonBuyButton);
				AlissonBuyButton.setBounds(300,165,140,15);
				AlissonBuyButton.setForeground(Color.WHITE);
				AlissonBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer6);
				availablePlayer6.setBounds(30,35,700,320);
				availablePlayer6.setForeground(Color.WHITE);
				transferMarketPanel.add(VVDBuyButton);
				VVDBuyButton.setBounds(300,190,140,15);
				VVDBuyButton.setForeground(Color.WHITE);
				VVDBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer7);
				availablePlayer7.setBounds(30,35,700,370);
				availablePlayer7.setForeground(Color.WHITE);
				transferMarketPanel.add(AzpiBuyButton);
				AzpiBuyButton.setBounds(300,215,140,15);
				AzpiBuyButton.setForeground(Color.WHITE);
				AzpiBuyButton.setBackground(new Color(0, 102, 255));
				
			
				transferMarketPanel.add(availablePlayer8);
				availablePlayer8.setBounds(30,35,700,420);
				availablePlayer8.setForeground(Color.WHITE);
				transferMarketPanel.add(F_MendyBuyButton);
				F_MendyBuyButton.setBounds(300,240,140,15);
				F_MendyBuyButton.setForeground(Color.WHITE);
				F_MendyBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer9);
				availablePlayer9.setBounds(30,35,700,470);
				availablePlayer9.setForeground(Color.WHITE);
				transferMarketPanel.add(S_RobertoBuyButton);
				S_RobertoBuyButton.setBounds(300,265,140,15);
				S_RobertoBuyButton.setForeground(Color.WHITE);
				S_RobertoBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer10);
				availablePlayer10.setBounds(30,35,700,520);
				availablePlayer10.setForeground(Color.WHITE);
				transferMarketPanel.add(KanteBuyButton);
				KanteBuyButton.setBounds(300,290,140,15);
				KanteBuyButton.setForeground(Color.WHITE);
				KanteBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer11);
				availablePlayer11.setBounds(30,35,700,570);
				availablePlayer11.setForeground(Color.WHITE);
				transferMarketPanel.add(FabregasBuyButton);
				FabregasBuyButton.setBounds(300,315,140,15);
				FabregasBuyButton.setForeground(Color.WHITE);
				FabregasBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer12);
				availablePlayer12.setBounds(30,35,700,620);
				availablePlayer12.setForeground(Color.WHITE);
				transferMarketPanel.add(RodriBuyButton);
				RodriBuyButton.setBounds(300,340,140,15);
				RodriBuyButton.setForeground(Color.WHITE);
				RodriBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(availablePlayer13);
				availablePlayer13.setBounds(30,35,700,670);
				availablePlayer13.setForeground(Color.WHITE);
				transferMarketPanel.add(HavertzBuyButton);
				HavertzBuyButton.setBounds(300,365,140,15);
				HavertzBuyButton.setForeground(Color.WHITE);
				HavertzBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel.add(transferMarketBackButton);
				transferMarketBackButton.setForeground(Color.WHITE);
				transferMarketBackButton.setBackground(new Color(0, 102, 255));
				transferMarketBackButton.setBounds(100, 400, 100, 40);
				transferMarketBackButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						
					transferMarketFrame.setVisible(false);
					playFrame.setVisible(true);
						
					}
				});
				
				
				transferMarketPanel.add(transferMarketNextPageButton);
				transferMarketNextPageButton.setForeground(Color.WHITE);
				transferMarketNextPageButton.setBackground(new Color(0, 102, 255));
				transferMarketNextPageButton.setBounds(250, 400, 100, 40);
				
				transferMarketNextPageButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == transferMarketNextPageButton)
						{
							
							transferMarketPanel2.setVisible(true);
							transferMarketPanel.setVisible(false);
						}
					}	
				});
			
				
				//Transfer Market Page 2
				transferMarketPanel2.setBackground(Color.DARK_GRAY);
				transferMarketPanel2.setBounds(0, 35, 450, 500);
				transferMarketPanel2.setLayout(null);
				transferMarketFrame.add(transferMarketPanel2);
				transferMarketFrame.add(blueTransferMarketPanel2);
			
				
				
				transferMarketPanel2.add(tableHeader2);
				tableHeader2.setForeground(Color.WHITE);
				tableHeader2.setBounds(30,30,700,30);
				
				transferMarketPanel2.add(balance_displayed2);
				balance_displayed2.setForeground(Color.WHITE);
				balance_displayed2.setBounds(300,30,700,30);
				balance_displayed2.setText("Balance:  £" + balance + ",000,000");
				
				transferMarketPanel2.add(transferMarketBackButton2);
				transferMarketBackButton2.setForeground(Color.WHITE);
				transferMarketBackButton2.setBackground(new Color(0, 102, 255));
				transferMarketBackButton2.setBounds(100, 400, 100, 40);
				transferMarketBackButton2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						transferMarketPanel.setVisible(true);
						transferMarketPanel2.setVisible(false);
						
					}
				});
				
				transferMarketPanel2.add(availablePlayer14);
				availablePlayer14.setBounds(30,30,700,80);
				availablePlayer14.setForeground(Color.WHITE);
				transferMarketPanel2.add(MbappeBuyButton);
				MbappeBuyButton.setBounds(300,65,140,15);
				MbappeBuyButton.setForeground(Color.WHITE);
				MbappeBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel2.add(availablePlayer15);
				availablePlayer15.setBounds(30,30,700,130);
				availablePlayer15.setForeground(Color.WHITE);
				transferMarketPanel2.add(BenYedderBuyButton);
				BenYedderBuyButton.setBounds(300,90,140,15);
				BenYedderBuyButton.setForeground(Color.WHITE);
				BenYedderBuyButton.setBackground(new Color(0, 102, 255));
				
				
				transferMarketPanel2.add(availablePlayer16);
				availablePlayer16.setBounds(30,30,700,180);
				availablePlayer16.setForeground(Color.WHITE);
				transferMarketPanel2.add(OblakBuyButton);
				OblakBuyButton.setBounds(300,115,140,15);
				OblakBuyButton.setForeground(Color.WHITE);
				OblakBuyButton.setBackground(new Color(0, 102, 255));
				
				
	
				
				//Player buy buttons
				
				Player.buyWerner();
				Player.buyHazard();
				Player.buyMessi();
				Player.buyKDB();
				Player.buyAlisson();
				Player.buyVVD();
				Player.buyAzpilicueta();
				Player.buyF_Mendy();
				Player.buyS_Roberto();
				Player.buyKante();
				Player.buyFabregas();
				Player.buyRodri();
				Player.buyHavertz();
				Player.buyMbappe();
				Player.buyBenYedder();
				Player.buyOblak();
				
				}


			
		
		
				
				
			public static void main(String[] args) {
				
				new Main();

			}




			@Override
			public void actionPerformed(ActionEvent arg0) {
		
					
				
			}



	}


