import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Squad {
	
	Player GK;
	Player DEF1;
	Player DEF2;
	Player DEF3;
	Player DEF4;
	Player MID1;
	Player MID2;	
	Player MID3;
	Player ATT1;
	Player ATT2;
	Player ATT3;
	
	static ArrayList<Player> squad = new ArrayList<Player>();
	
	
	

  
  
  public static void showSquad()
  {
	  
	  //prints 1 GK
		for(Player p : squad) {
			  if(p.position == 0)
			  {
				  if(p == Player.Alisson_Becker)
				  {
				Main.GK_label.setText(p.firstName);
			  }
				  else
					  Main.GK_label.setText(p.lastName);
			  }
		}
		
		  //prints 4 DEF
		for(Player p : squad) {
			 if(p.position == 1.1)
			 {
				 Main.DEF1_label.setText(" " + p.lastName + " ");
			
		  }
		}
		
		for(Player p : squad) {
			 if(p.position == 1.21)
			 {
				 Main.DEF2_label.setText(" " + p.lastName + " ");

		  }
		}
		
		for(Player p : squad) {
			if(p.position == 1.22)
			{
				 Main.DEF3_label.setText(" " + p.lastName + " ");
			}
			else
			 if(p.position == 1.22)
			 {
				 Main.DEF3_label.setText(" " + p.lastName + " ");
		  }
			 else;
				 
		}
		
		for(Player p : squad) {
			 if(p.position == 1.3)
			 {
				 Main.DEF4_label.setText(" " + p.lastName + " ");
		  }
		}
		
		System.out.println(" ");
			 
		 //prints 3 MID
		for(Player p : squad) {	 
			 if(p.position == 2.1)
			 {
				 Main.MID1_label.setText(" " + p.lastName + " ");
				 }
		}
		
		
		for(Player p : squad) {	 
			 if(p.position == 2.2)
			 {
				 Main.MID2_label.setText(" " + p.lastName + " ");
				 }
		}
		
		
		for(Player p : squad) {	 
			 if(p.position == 2.3)
			 {
				 Main.MID3_label.setText(" " + p.lastName + " ");
				 }
		}
		
						
		System.out.println(" ");
		
		
		//prints 3 ATT
		for(Player p : squad) {
			 if(p.position == 3.1)
				 Main.ATT1_label.setText(" " + p.lastName + " ");
				 }
		
		
		for(Player p : squad) {
			 if(p.position == 3.2)
				 Main.ATT2_label.setText(" " + p.lastName + " ");
				 }
		
		
		for(Player p : squad) {
			 if(p.position == 3.3)
				 Main.ATT3_label.setText(" " + p.lastName + " ");
				 }
		
		
		System.out.println(" ");
  }
  
  


	}
	

