import java.util.ArrayList;



public class Club {
  static ArrayList<Player> clubPlayers = new ArrayList<Player>();
  
  
	public static void addToClub(Player p)
	{
		 if(Main.count == 1)
			{
			 	clubPlayers.add(p);
				Main.clubPlayer1.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,62,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 2)
			{
				clubPlayers.add(p);
				Main.clubPlayer2.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,102,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 3)
			{
				clubPlayers.add(p);
				Main.clubPlayer3.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,142,70,15, Main.count);
				Main.count++;
				}
			else if(Main.count == 4)
			{
				clubPlayers.add(p);
				Main.clubPlayer4.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,182,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 5)
			{
				clubPlayers.add(p);
				Main.clubPlayer5.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,222,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 6)
			{
				clubPlayers.add(p);
				Main.clubPlayer6.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,262,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 7)
			{
				clubPlayers.add(p);
				Main.clubPlayer7.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,302,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 8)
			{
				clubPlayers.add(p);
				Main.clubPlayer8.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition(p,160,342,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 9)
			{
				clubPlayers.add(p);
				Main.clubPlayer9.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,62,70,15, Main.count);
				Main.count++;
				}
			else if(Main.count == 10)
			{
				clubPlayers.add(p);
				Main.clubPlayer10.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,102,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 11)
			{
				clubPlayers.add(p);
				Main.clubPlayer11.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,142,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 12)
			{
				clubPlayers.add(p);
				Main.clubPlayer12.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,182,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 13)
			{
				clubPlayers.add(p);
				Main.clubPlayer13.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,222,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 14)
			{
				clubPlayers.add(p);
				Main.clubPlayer14.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,262,70,15, Main.count);
				Main.count++;
			}
			else if(Main.count == 15)
			{
				clubPlayers.add(p);
				Main.clubPlayer15.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,302,70,15, Main.count);
				Main.count++;
			}	
			else if(Main.count == 16)
			{
				clubPlayers.add(p);
				Main.clubPlayer16.setText(p.firstName + " " + p.lastName);
				Player.playerButtonPosition2(p,160,342,70,15, Main.count);
				Main.count++;
			}	
		 
		 if(Main.count2 == 1)
			{
				Player.playerRemoveButtonPosition(p, 250, 62, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 2)
			{
				Player.playerRemoveButtonPosition(p, 250, 102, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 3)
			{
				Player.playerRemoveButtonPosition(p, 250, 142, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 4)
			{
				Player.playerRemoveButtonPosition(p, 250, 182, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 5)
			{
				Player.playerRemoveButtonPosition(p, 250, 222, 80, 15, Main.count2);

				Main.count2++;
			}
			else if(Main.count2 == 6)
			{
				Player.playerRemoveButtonPosition(p, 250, 262, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 7)
			{
				Player.playerRemoveButtonPosition(p, 250, 302, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 8)
			{
				Player.playerRemoveButtonPosition(p, 250, 342, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 9)
			{
				Player.playerRemoveButtonPosition2(p, 250, 62, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 10)
			{
				Player.playerRemoveButtonPosition2(p, 250, 102, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 11)
			{
				Player.playerRemoveButtonPosition2(p, 250, 142, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 12)
			{
				Player.playerRemoveButtonPosition2(p, 250, 182, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 13)
			{
				Player.playerRemoveButtonPosition2(p, 250, 222, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 14)
			{
				Player.playerRemoveButtonPosition2(p, 250, 262, 80, 15, Main.count2);
				Main.count2++;
			}
			else if(Main.count2 == 15)
			{
				Player.playerRemoveButtonPosition2(p, 250, 302, 80, 15, Main.count2);
				Main.count2++;
			}	
			else if(Main.count2 == 16)
			{
				Player.playerRemoveButtonPosition2(p, 250, 342, 80, 15, Main.count2);
				Main.count2++;
			}	
		 
		
	}

		
	}

