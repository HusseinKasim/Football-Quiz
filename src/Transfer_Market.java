import java.util.ArrayList;

public class Transfer_Market {

	
	double yourBalance;
	
	static ArrayList<Player> transfer_Market = new ArrayList<Player>();
	
	
	public void addToMarket()
	{
	
	transfer_Market.add(Player.Timo_Werner);
	transfer_Market.add(Player.Eden_Hazard);
	transfer_Market.add(Player.Lionel_Messi);
	transfer_Market.add(Player.Kevin_DeBruyne);
	transfer_Market.add(Player.Alisson_Becker);
	transfer_Market.add(Player.Virgil_VanDijk);
	transfer_Market.add(Player.Cesar_Azpilicueta);
	transfer_Market.add(Player.Ferland_Mendy);
	transfer_Market.add(Player.Sergi_Roberto);
	transfer_Market.add(Player.Ngolo_Kante);
	transfer_Market.add(Player.Cesc_Fabregas);
	transfer_Market.add(Player.Rodri);
	transfer_Market.add(Player.Kai_Havertz);
	transfer_Market.add(Player.Kylian_Mbappe);
	transfer_Market.add(Player.Wissam_BenYedder);
	}
	
	
	
public static void fixTransferMarketBalance(Player p)
{
	 if(Main.balance == 0)
	   {
		   Main.balance_displayed.setText("Balance:  £" + Main.balance);
		   Main.balance_displayed2.setText("Balance:  £" + Main.balance);
	   }
	   else
	   {
	   Main.balance_displayed.setText("Balance:  £" + Main.balance + ",000,000");
	   Main.balance_displayed2.setText("Balance:  £" + Main.balance + ",000,000");
	   
	   if(p == Player.Timo_Werner)
	   {
	   Main.availablePlayer1.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Eden_Hazard)
	   {
	   Main.availablePlayer2.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Lionel_Messi)
	   {
	   Main.availablePlayer3.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Kevin_DeBruyne)
	   {
	   Main.availablePlayer4.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Alisson_Becker)
	   {
	   Main.availablePlayer5.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Virgil_VanDijk)
	   {
	   Main.availablePlayer6.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Cesar_Azpilicueta)
	   {
	   Main.availablePlayer7.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Ferland_Mendy)
	   {
	   Main.availablePlayer8.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Sergi_Roberto)
	   {
	   Main.availablePlayer9.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Ngolo_Kante)
	   {
	   Main.availablePlayer10.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Cesc_Fabregas)
	   {
	   Main.availablePlayer11.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Rodri)
	   {
	   Main.availablePlayer12.setText(p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Kai_Havertz)
	   {
	   Main.availablePlayer13.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Kylian_Mbappe)
	   {
	   Main.availablePlayer14.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Wissam_BenYedder)
	   {
	   Main.availablePlayer15.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   else if(p == Player.Jan_Oblak)
	   {
	   Main.availablePlayer16.setText(p.firstName + " " + p.lastName  + " is now in your club.");
	   }
	   
	   
	   
	}
}

}
