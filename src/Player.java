import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Player {

	String firstName;
	String lastName;
     double position; //  0=GK, 1.1=RB, 1.2=CB, 1.3= LB, 2.1=CDM, 2.2=CM, 2.3=CAM, 3.1=RW, 3.2=ST, 3.3=LW
    double price; //in millions
    JLabel clubLabel = new JLabel(" ");
    
    
    
    //Transfer Market and base info
    public Player(String firstName, String lastName, double position, double price)
    {
    	this.firstName = firstName;
    	this.lastName = lastName;
    	this.position = position;
    	this.price = price;
    }
   
    
    
    
    //Players in the game

	static Player Timo_Werner = new Player("Timo", "Werner", 3.2, 50);
	static Player Eden_Hazard = new Player("Eden", "Hazard", 3.3, 100);
	static Player Lionel_Messi = new Player("Lionel", "Messi", 3.1, 350);
	static Player Kevin_DeBruyne = new Player("Kevin", "De Bruyne", 2.3, 250);
	static Player Alisson_Becker = new Player("Alisson", "Becker", 0, 80);
	static Player Virgil_VanDijk = new Player("Virgil", "Van Dijk", 1.21, 150);
	static Player Cesar_Azpilicueta = new Player("Cesar", "Azpilicueta", 1.22, 50);
	static Player Ferland_Mendy = new Player("Ferland", "Mendy", 1.3, 70);
	static Player Sergi_Roberto = new Player("Sergi", "Roberto", 1.1, 50);
	static Player Ngolo_Kante = new Player("N'golo", "Kante", 2.1, 150);
	static Player Cesc_Fabregas = new Player("Cesc", "Fabregas", 2.2, 20);
	static Player Rodri = new Player("", "Rodri", 2.2, 60);
	static Player Kai_Havertz = new Player("Kai", "Havertz", 2.3, 80);
	static Player Kylian_Mbappe = new Player("Kylian", "Mbappe", 3.2, 180);
	static Player Wissam_BenYedder = new Player("Wissam", "Ben Yedder", 3.2, 80);
	static Player Jan_Oblak = new Player("Jan", "Oblak", 0, 130);
	
	
	public static void buyWerner() {
	Main.WernerBuyButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == Main.WernerBuyButton)
			{
				if(Main.balance >= Player.Timo_Werner.price && !Club.clubPlayers.contains(Timo_Werner))
				{	
			   Transfer_Market.transfer_Market.remove(Player.Timo_Werner);
			   Main.balance-=Player.Timo_Werner.price;
			   Transfer_Market.fixTransferMarketBalance(Timo_Werner);
			   Club.addToClub(Timo_Werner);
			   Main.WernerSquadAddButton.setBackground(new Color(0, 102, 255));
			   Main.WernerSquadAddButton.setForeground(Color.WHITE);
			   Main.WernerSquadAddButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == Main.WernerSquadAddButton)
						{	
								Player.addWernerToSquad();
						}
						
					}
				});
			   Main.WernerSquadRemoveButton.setBackground(new Color(0, 102, 255));
			   Main.WernerSquadRemoveButton.setForeground(Color.WHITE);
			   Main.WernerSquadRemoveButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == Main.WernerSquadRemoveButton)
						{	
								Player.RemoveWernerFromSquad();
						}
						
					}
				});
				}
			}
		}
	});
	}
	
	
	
	public static void buyHazard() {
	Main.HazardBuyButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == Main.HazardBuyButton)
			{
				if(Main.balance >= Player.Eden_Hazard.price && !Club.clubPlayers.contains(Eden_Hazard))
				{
			   Transfer_Market.transfer_Market.remove(Player.Eden_Hazard); 
			   Main.balance-=Player.Eden_Hazard.price;		   
			   Transfer_Market.fixTransferMarketBalance(Eden_Hazard);
			   Club.addToClub(Eden_Hazard);
			   Main.HazardSquadAddButton.setBackground(new Color(0, 102, 255));
			   Main.HazardSquadAddButton.setForeground(Color.WHITE);
			   Main.HazardSquadAddButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == Main.HazardSquadAddButton)
						{	
								Player.addHazardToSquad();
						}
						
					}
				});
			   Main.HazardSquadRemoveButton.setBackground(new Color(0, 102, 255));
			   Main.HazardSquadRemoveButton.setForeground(Color.WHITE);
			   Main.HazardSquadRemoveButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == Main.HazardSquadRemoveButton)
						{	
								Player.RemoveHazardFromSquad();
						}
						
					}
				});
				}
			}
		}
			});
	}
	
	public static void buyMessi()
	{
		Main.MessiBuyButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e)
		{
			if(e.getSource() == Main.MessiBuyButton)
			{
				if(Main.balance >= Player.Lionel_Messi.price && !Club.clubPlayers.contains(Lionel_Messi))
				{
			   Transfer_Market.transfer_Market.remove(Player.Lionel_Messi);  
			   Main.balance-=Player.Lionel_Messi.price;
			   Transfer_Market.fixTransferMarketBalance(Lionel_Messi);
			   Club.addToClub(Lionel_Messi);
			   Main.MessiSquadAddButton.setBackground(new Color(0, 102, 255));
			   Main.MessiSquadAddButton.setForeground(Color.WHITE);
			   Main.MessiSquadAddButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == Main.MessiSquadAddButton)
						{	
								Player.addMessiToSquad();
						}
						
					}
				});
			   Main.MessiSquadRemoveButton.setBackground(new Color(0, 102, 255));
			   Main.MessiSquadRemoveButton.setForeground(Color.WHITE);
			   Main.MessiSquadRemoveButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e)
					{
						if(e.getSource() == Main.MessiSquadRemoveButton)
						{	
								Player.RemoveMessiFromSquad();
						}
						
					}
				});
				}
			}
		}
	});
	}
	
	public static void buyKDB() {
		Main.KDBBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.KDBBuyButton)
				{
					if(Main.balance >= Player.Kevin_DeBruyne.price && !Club.clubPlayers.contains(Kevin_DeBruyne))
					{
				   Transfer_Market.transfer_Market.remove(Player.Kevin_DeBruyne);  
					Main.balance-=Player.Kevin_DeBruyne.price;
					  Transfer_Market.fixTransferMarketBalance(Kevin_DeBruyne);
					  Club.addToClub(Kevin_DeBruyne);
					   Main.KDBSquadAddButton.setBackground(new Color(0, 102, 255));
					   Main.KDBSquadAddButton.setForeground(Color.WHITE);
					   Main.KDBSquadAddButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
								if(e.getSource() == Main.KDBSquadAddButton)
								{	
										Player.addKDBToSquad();
								}
								
							}
						});
					   Main.KDBSquadRemoveButton.setBackground(new Color(0, 102, 255));
					   Main.KDBSquadRemoveButton.setForeground(Color.WHITE);
					   Main.KDBSquadRemoveButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
								if(e.getSource() == Main.KDBSquadRemoveButton)
								{	
										Player.RemoveKDBFromSquad();
								}
								
							}
						});
					}
				}
			}
		});
		}
	
	public static void buyAlisson()
	{
		Main.AlissonBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.AlissonBuyButton)
				{
					if(Main.balance >= Player.Alisson_Becker.price && !Club.clubPlayers.contains(Alisson_Becker))
					{
				   Transfer_Market.transfer_Market.remove(Player.Alisson_Becker);  
				   Main.balance-=Player.Alisson_Becker.price;
				   Transfer_Market.fixTransferMarketBalance(Alisson_Becker);
				   Club.addToClub(Alisson_Becker);
				   Main.AlissonSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.AlissonSquadAddButton.setForeground(Color.WHITE);
				   Main.AlissonSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.AlissonSquadAddButton)
							{	
									Player.addAlissonToSquad();
							}
							
						}
					});
				   Main.AlissonSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.AlissonSquadRemoveButton.setForeground(Color.WHITE);
				   Main.AlissonSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.AlissonSquadRemoveButton)
							{	
									Player.RemoveAlissonFromSquad();
							}
							
						}
					});
					}
					}
				}
		});
	
	}
	
	public static void buyVVD()
	{
		Main.VVDBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.VVDBuyButton)
				{
					if(Main.balance >= Player.Virgil_VanDijk.price && !Club.clubPlayers.contains(Virgil_VanDijk))
					{
				   Transfer_Market.transfer_Market.remove(Player.Virgil_VanDijk);  
				   Main.balance-=Player.Virgil_VanDijk.price;
				   Transfer_Market.fixTransferMarketBalance(Virgil_VanDijk);
				   Club.addToClub(Virgil_VanDijk);
				   Main.VVDSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.VVDSquadAddButton.setForeground(Color.WHITE);
				   Main.VVDSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.VVDSquadAddButton)
							{	
									Player.addVVDToSquad();
							}
							
						}
					});
				   Main.VVDSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.VVDSquadRemoveButton.setForeground(Color.WHITE);
				   Main.VVDSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.VVDSquadRemoveButton)
							{	
									Player.RemoveVVDFromSquad();
							}
							
						}
					});
					}
				}
				}
		});
	}
	
	public static void buyAzpilicueta()
	{

		Main.AzpiBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
					if(e.getSource() == Main.AzpiBuyButton)
					{
						if(Main.balance >= Player.Cesar_Azpilicueta.price && !Club.clubPlayers.contains(Cesar_Azpilicueta))
						{	
					   Transfer_Market.transfer_Market.remove(Player.Cesar_Azpilicueta);  
					   Main.balance-=Player.Cesar_Azpilicueta.price;
					   Transfer_Market.fixTransferMarketBalance(Cesar_Azpilicueta);
					   Club.addToClub(Cesar_Azpilicueta);
					   Main.AzpiSquadAddButton.setBackground(new Color(0, 102, 255));
					   Main.AzpiSquadAddButton.setForeground(Color.WHITE);
					   Main.AzpiSquadAddButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
								if(e.getSource() == Main.AzpiSquadAddButton)
								{	
										Player.addAzpiToSquad();
								}
								
							}
						});
					   Main.AzpiSquadRemoveButton.setBackground(new Color(0, 102, 255));
					   Main.AzpiSquadRemoveButton.setForeground(Color.WHITE);
					   Main.AzpiSquadRemoveButton.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e)
							{
								if(e.getSource() == Main.AzpiSquadRemoveButton)
								{	
										Player.RemoveAzpiFromSquad();
								}
								
							}
						});
						}
						}
				}
			});
	}
	
	public static void buyF_Mendy()
	{
		Main.F_MendyBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.F_MendyBuyButton)
				{
					if(Main.balance >= Player.Ferland_Mendy.price && !Club.clubPlayers.contains(Ferland_Mendy))
					{
				   Transfer_Market.transfer_Market.remove(Player.Ferland_Mendy);  
				   Main.balance-=Player.Ferland_Mendy.price;
				   Transfer_Market.fixTransferMarketBalance(Ferland_Mendy);
				   Club.addToClub(Ferland_Mendy);
				   Main.FMendySquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.FMendySquadAddButton.setForeground(Color.WHITE);
				   Main.FMendySquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.FMendySquadAddButton)
							{	
									Player.addFMendyToSquad();
							}
							
						}
					});
				   Main.FMendySquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.FMendySquadRemoveButton.setForeground(Color.WHITE);
				   Main.FMendySquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.FMendySquadRemoveButton)
							{	
									Player.RemoveFMendyFromSquad();
							}
							
						}
					});
					}
				}
				}
		});
	}

	public static void buyS_Roberto()
	{
		Main.S_RobertoBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.S_RobertoBuyButton)
				{
					if(Main.balance >= Player.Sergi_Roberto.price && !Club.clubPlayers.contains(Sergi_Roberto))
					{
				   Transfer_Market.transfer_Market.remove(Player.Sergi_Roberto);  
				   Main.balance-=Player.Sergi_Roberto.price;
				   Transfer_Market.fixTransferMarketBalance(Sergi_Roberto);
				   Club.addToClub(Sergi_Roberto);
				   Main.SRobertoSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.SRobertoSquadAddButton.setForeground(Color.WHITE);
				   Main.SRobertoSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.SRobertoSquadAddButton)
							{	
									Player.addSRobertoToSquad();
							}
							
						}
					});
				   Main.SRobertoSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.SRobertoSquadRemoveButton.setForeground(Color.WHITE);
				   Main.SRobertoSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.SRobertoSquadRemoveButton)
							{	
									Player.RemoveSRobertoFromSquad();
							}
							
						}
					});
					}
				}
			}
		});
	}
	
	public static void buyKante()
	{
		Main.KanteBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.KanteBuyButton)
				{
					if(Main.balance >= Player.Ngolo_Kante.price && !Club.clubPlayers.contains(Ngolo_Kante))
					{
				   Transfer_Market.transfer_Market.remove(Player.Ngolo_Kante);  
				   Main.balance-=Player.Ngolo_Kante.price;
				   Transfer_Market.fixTransferMarketBalance(Ngolo_Kante);
				   Club.addToClub(Ngolo_Kante);
				   Main.KanteSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.KanteSquadAddButton.setForeground(Color.WHITE);
				   Main.KanteSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.KanteSquadAddButton)
							{	
									Player.addKanteToSquad();
							}
							
						}
					});
				   Main.KanteSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.KanteSquadRemoveButton.setForeground(Color.WHITE);
				   Main.KanteSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.KanteSquadRemoveButton)
							{	
									Player.RemoveKanteFromSquad();
							}
							
						}
					});
					}
					}
				}
		});
	}
	
	public static void buyFabregas()
	{
		Main.FabregasBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.FabregasBuyButton)
				{
					if(Main.balance >= Player.Cesc_Fabregas.price && !Club.clubPlayers.contains(Cesc_Fabregas))
					{
				   Transfer_Market.transfer_Market.remove(Player.Cesc_Fabregas);  
				   Main.balance-=Player.Cesc_Fabregas.price;
				   Transfer_Market.fixTransferMarketBalance(Cesc_Fabregas);
				   Club.addToClub(Cesc_Fabregas);
				   Main.FabregasSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.FabregasSquadAddButton.setForeground(Color.WHITE);
				   Main.FabregasSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.FabregasSquadAddButton)
							{	
									Player.addFabregasToSquad();
							}
							
						}
					});
				   Main.FabregasSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.FabregasSquadRemoveButton.setForeground(Color.WHITE);
				   Main.FabregasSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.FabregasSquadRemoveButton)
							{	
									Player.RemoveFabregasFromSquad();
							}
							
						}
					});
					}
				}
				}
		});
	}
	
	public static void buyRodri()
	{
		Main.RodriBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.RodriBuyButton)
				{
					if(Main.balance >= Player.Rodri.price && !Club.clubPlayers.contains(Rodri))
					{
				   Transfer_Market.transfer_Market.remove(Player.Rodri);  
				   Main.balance-=Player.Rodri.price;
				   Transfer_Market.fixTransferMarketBalance(Rodri);   
				   Club.addToClub(Rodri);
				   Main.RodriSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.RodriSquadAddButton.setForeground(Color.WHITE);
				   Main.RodriSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.RodriSquadAddButton)
							{	
									Player.addRodriToSquad();
							}
							
						}
					});
				   Main.RodriSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.RodriSquadRemoveButton.setForeground(Color.WHITE);
				   Main.RodriSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.RodriSquadRemoveButton)
							{	
									Player.RemoveRodriFromSquad();
							}
							
						}
					});
					}
					}
				}
		});
	}
	
	public static void buyHavertz()
	{
		Main.HavertzBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.HavertzBuyButton)
				{
					if(Main.balance >= Player.Kai_Havertz.price && !Club.clubPlayers.contains(Kai_Havertz))
					{ 	
				   Transfer_Market.transfer_Market.remove(Player.Kai_Havertz);  
				   Main.balance-=Player.Kai_Havertz.price;
				   Transfer_Market.fixTransferMarketBalance(Kai_Havertz);
				   Club.addToClub(Kai_Havertz);
				   Main.HavertzSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.HavertzSquadAddButton.setForeground(Color.WHITE);
				   Main.HavertzSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.HavertzSquadAddButton)
							{	
									Player.addHavertzToSquad();
							}
							
						}
					});
				   Main.HavertzSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.HavertzSquadRemoveButton.setForeground(Color.WHITE);
				   Main.HavertzSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.HavertzSquadRemoveButton)
							{	
									Player.RemoveHavertzFromSquad();
							}
							
						}
					});
					}
				}
				}
		});
	}
	
	public static void buyMbappe()
	{
		Main.MbappeBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.MbappeBuyButton)
				{
					if(Main.balance >= Player.Kylian_Mbappe.price && !Club.clubPlayers.contains(Kylian_Mbappe))
					{	
				   Transfer_Market.transfer_Market.remove(Player.Kylian_Mbappe);
				   Main.balance-=Player.Kylian_Mbappe.price;
				   Transfer_Market.fixTransferMarketBalance(Kylian_Mbappe);
				   Club.addToClub(Kylian_Mbappe);
				   Main.MbappeSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.MbappeSquadAddButton.setForeground(Color.WHITE);
				   Main.MbappeSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.MbappeSquadAddButton)
							{	
									Player.addMbappeToSquad();
							}
							
						}
					});
				   Main.MbappeSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.MbappeSquadRemoveButton.setForeground(Color.WHITE);
				   Main.MbappeSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.MbappeSquadRemoveButton)
							{	
									Player.RemoveMbappeFromSquad();
							}
							
						}
					});
				   
					}
					}
				}					
		});
	}
	
	public static void buyBenYedder()
	{
		Main.BenYedderBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.BenYedderBuyButton)
				{
					if(Main.balance >= Player.Wissam_BenYedder.price && !Club.clubPlayers.contains(Wissam_BenYedder))
					{
				   Transfer_Market.transfer_Market.remove(Player.Wissam_BenYedder);
				   Main.balance-=Player.Wissam_BenYedder.price;
				   Transfer_Market.fixTransferMarketBalance(Wissam_BenYedder);
				   Club.addToClub(Wissam_BenYedder);
				   Main.BenYedderSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.BenYedderSquadAddButton.setForeground(Color.WHITE);
				   Main.BenYedderSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.BenYedderSquadAddButton)
							{	
									Player.addBenYedderToSquad();
							}
							
						}
					});
				   Main.BenYedderSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.BenYedderSquadRemoveButton.setForeground(Color.WHITE);
				   Main.BenYedderSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.BenYedderSquadRemoveButton)
							{	
									Player.RemoveBenYedderFromSquad();
							}
							
						}
					});
					}
				}
				}				
		});
	}

	
	
	public static void buyOblak()
	{
		Main.OblakBuyButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				if(e.getSource() == Main.OblakBuyButton)
				{
					if(Main.balance >= Player.Jan_Oblak.price && !Club.clubPlayers.contains(Jan_Oblak))
					{
				   Transfer_Market.transfer_Market.remove(Player.Jan_Oblak);
				   Main.balance-=Player.Jan_Oblak.price;
				   Transfer_Market.fixTransferMarketBalance(Jan_Oblak);
				   Club.addToClub(Jan_Oblak);
				   Main.OblakSquadAddButton.setBackground(new Color(0, 102, 255));
				   Main.OblakSquadAddButton.setForeground(Color.WHITE);
				   Main.OblakSquadAddButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.OblakSquadAddButton)
							{	
									Player.addOblakToSquad();
							}
							
						}
					});
				   Main.OblakSquadRemoveButton.setBackground(new Color(0, 102, 255));
				   Main.OblakSquadRemoveButton.setForeground(Color.WHITE);
				   Main.OblakSquadRemoveButton.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e)
						{
							if(e.getSource() == Main.OblakSquadRemoveButton)
							{	
									Player.RemoveOblakFromSquad();
							}
							
						}
					});
					}
				}
				}				
		});
	}
	
	
	
	
	public static void addWernerToSquad()
	{
			Squad.squad.add(Player.Timo_Werner);
			Main.squadPanel.add(Main.WernerImg);
			Main.WernerImg.setBounds(204, 25, 40, 40);
			   Main.WernerImg.setIcon(new ImageIcon(new ImageIcon(".//img//WernerCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	
	public static void RemoveWernerFromSquad()
	{
					Squad.squad.remove(Player.Timo_Werner);
					Main.squadPanel.remove(Main.WernerImg);
					Main.ATT2_label.setText("EMPTY");
	}
	
	
	
	public static void addHazardToSquad()
	{
			Squad.squad.add(Player.Eden_Hazard);
			Main.squadPanel.add(Main.HazardImg);
			Main.HazardImg.setBounds(42, 25, 40, 40);
			   Main.HazardImg.setIcon(new ImageIcon(new ImageIcon(".//img//HazardCropped.png").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveHazardFromSquad()
	{
					Squad.squad.remove(Player.Eden_Hazard);
					Main.squadPanel.remove(Main.HazardImg);
					Main.ATT3_label.setText("EMPTY");
	}
	
	
	public static void addMessiToSquad()
	{
			Squad.squad.add(Player.Lionel_Messi);
			Main.squadPanel.add(Main.MessiImg);
			Main.MessiImg.setBounds(365, 25, 40, 40);
			   Main.MessiImg.setIcon(new ImageIcon(new ImageIcon(".//img//MessiCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveMessiFromSquad()
	{
					Squad.squad.remove(Player.Lionel_Messi);
					Main.squadPanel.remove(Main.MessiImg);
					Main.ATT1_label.setText("EMPTY");
	}
	
	
	public static void addKDBToSquad()
	{
			Squad.squad.add(Player.Kevin_DeBruyne);
			Main.squadPanel.add(Main.KDBImg);
			Main.KDBImg.setBounds(326,125,100,40);
			   Main.KDBImg.setIcon(new ImageIcon(new ImageIcon(".//img//KDBCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveKDBFromSquad()
	{
					Squad.squad.remove(Player.Kevin_DeBruyne);
					Main.squadPanel.remove(Main.KDBImg);
					Main.MID3_label.setText("EMPTY");
	}
	
	public static void addAlissonToSquad()
	{
			Squad.squad.add(Player.Alisson_Becker);
			Main.squadPanel.add(Main.AlissonImg);
			Main.AlissonImg.setBounds(201,265,100,70);
			   Main.AlissonImg.setIcon(new ImageIcon(new ImageIcon(".//img//AlissonCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveAlissonFromSquad()
	{
					Squad.squad.remove(Player.Alisson_Becker);
					Main.squadPanel.remove(Main.AlissonImg);
					Main.GK_label.setText("EMPTY");
	}
	
	
	public static void addVVDToSquad()
	{
			Squad.squad.add(Player.Virgil_VanDijk);
			Main.squadPanel.add(Main.VVDImg);
			Main.VVDImg.setBounds(141,225,100,40);
			   Main.VVDImg.setIcon(new ImageIcon(new ImageIcon(".//img//VVDCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveVVDFromSquad()
	{
					Squad.squad.remove(Player.Virgil_VanDijk);
					Main.squadPanel.remove(Main.VVDImg);
					Main.DEF2_label.setText("EMPTY");
	}
	
	
	public static void addAzpiToSquad()
	{
			Squad.squad.add(Player.Cesar_Azpilicueta);
			Main.squadPanel.add(Main.AzpiImg);
			Main.AzpiImg.setBounds(269,225,100,40);
			   Main.AzpiImg.setIcon(new ImageIcon(new ImageIcon(".//img//AzpiCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveAzpiFromSquad()
	{
					Squad.squad.remove(Player.Cesar_Azpilicueta);
					Main.squadPanel.remove(Main.AzpiImg);
					Main.DEF3_label.setText("EMPTY");
	}
	
	
	public static void addFMendyToSquad()
	{
			Squad.squad.add(Player.Ferland_Mendy);
			Main.squadPanel.add(Main.FMendyImg);
			Main.FMendyImg.setBounds(16,225,100,40);
			   Main.FMendyImg.setIcon(new ImageIcon(new ImageIcon(".//img//FMendyCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveFMendyFromSquad()
	{
					Squad.squad.remove(Player.Ferland_Mendy);
					Main.squadPanel.remove(Main.FMendyImg);
					Main.DEF4_label.setText("EMPTY");
	}
	
	
	public static void addSRobertoToSquad()
	{
			Squad.squad.add(Player.Sergi_Roberto);
			Main.squadPanel.add(Main.SRobertoImg);
			Main.SRobertoImg.setBounds(381,225,100,40);
			   Main.SRobertoImg.setIcon(new ImageIcon(new ImageIcon(".//img//RobertoCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveSRobertoFromSquad()
	{
					Squad.squad.remove(Player.Sergi_Roberto);
					Main.squadPanel.remove(Main.SRobertoImg);
					Main.DEF1_label.setText("EMPTY");
	}
	
	public static void addKanteToSquad()
	{
			Squad.squad.add(Player.Ngolo_Kante);
			Main.squadPanel.add(Main.KanteImg);
			Main.KanteImg.setBounds(85,125,100,40);
			   Main.KanteImg.setIcon(new ImageIcon(new ImageIcon(".//img//KanteCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveKanteFromSquad()
	{
					Squad.squad.remove(Player.Ngolo_Kante);
					Main.squadPanel.remove(Main.KanteImg);
					Main.MID1_label.setText("EMPTY");
	}
	
	public static void addFabregasToSquad()
	{
			Squad.squad.add(Player.Cesc_Fabregas);
			Main.squadPanel.add(Main.FabregasImg);
			Main.FabregasImg.setBounds(209,125,100,40);
			   Main.FabregasImg.setIcon(new ImageIcon(new ImageIcon(".//img//FabregasCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveFabregasFromSquad()
	{
					Squad.squad.remove(Player.Cesc_Fabregas);
					Main.squadPanel.remove(Main.FabregasImg);
					Main.MID2_label.setText("EMPTY");
	}
	
	
	public static void addRodriToSquad()
	{
			Squad.squad.add(Player.Rodri);
			Main.squadPanel.add(Main.RodriImg);
			Main.RodriImg.setBounds(198,125,100,40);
			   Main.RodriImg.setIcon(new ImageIcon(new ImageIcon(".//img//RodriCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveRodriFromSquad()
	{
		Squad.squad.remove(Player.Rodri);
		Main.squadPanel.remove(Main.RodriImg);
		Main.MID2_label.setText("EMPTY");
}

	
	
	public static void addHavertzToSquad()
	{
			Squad.squad.add(Player.Kai_Havertz);
			Main.squadPanel.add(Main.HavertzImg);
			Main.HavertzImg.setBounds(318,125,100,40);
			   Main.HavertzImg.setIcon(new ImageIcon(new ImageIcon(".//img//HavertzCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	public static void RemoveHavertzFromSquad()
	{
					Squad.squad.remove(Player.Kai_Havertz);
					Main.squadPanel.remove(Main.HavertzImg);
					Main.MID3_label.setText("EMPTY");
	}
	
	
	public static void addMbappeToSquad()
	{
			Squad.squad.add(Player.Kylian_Mbappe);
			Main.squadPanel.add(Main.MbappeImg);
			Main.MbappeImg.setBounds(205,25,100,40);
			   Main.MbappeImg.setIcon(new ImageIcon(new ImageIcon(".//img//MbappeCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	
	public static void RemoveMbappeFromSquad()
	{
					Squad.squad.remove(Player.Kylian_Mbappe);
					Main.squadPanel.remove(Main.MbappeImg);
					Main.ATT2_label.setText("EMPTY");
	}
	
	
	public static void addBenYedderToSquad()
	{
			Squad.squad.add(Player.Wissam_BenYedder);
			Main.squadPanel.add(Main.BenYedderImg);
			Main.BenYedderImg.setBounds(213,25,100,40);
			   Main.BenYedderImg.setIcon(new ImageIcon(new ImageIcon(".//img//BenYedderCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	
	public static void RemoveBenYedderFromSquad()
	{
					Squad.squad.remove(Player.Wissam_BenYedder);
					Main.squadPanel.remove(Main.BenYedderImg);
					Main.ATT2_label.setText("EMPTY");
	}
	
	
	public static void addOblakToSquad()
	{
			Squad.squad.add(Player.Jan_Oblak);
			Main.squadPanel.add(Main.OblakImg);
			Main.OblakImg.setBounds(199,265,100,70);
			   Main.OblakImg.setIcon(new ImageIcon(new ImageIcon(".//img//OblakCropped.jpg").getImage().getScaledInstance(40,40, Image.SCALE_SMOOTH)));
	}
	
	public static void RemoveOblakFromSquad()
	{
					Squad.squad.remove(Player.Jan_Oblak);
					Main.squadPanel.remove(Main.OblakImg);
					Main.GK_label.setText("EMPTY");
	}
	
	
public static void playerButtonPosition(Player pl, int x, int y, int z, int k, int clubCount)
{
	if(Main.count == clubCount)
	{
	if(pl == Player.Timo_Werner)
	{
		 Main.clubPanel.add(Main.WernerSquadAddButton);
		  Main.WernerSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Eden_Hazard)
	{
		  Main.clubPanel.add(Main.HazardSquadAddButton);
		  Main.HazardSquadAddButton.setBounds(x,y,z,k);
	}
	
	else if(pl == Player.Lionel_Messi)
{
		 Main.clubPanel.add(Main.MessiSquadAddButton);
		 Main.MessiSquadAddButton.setBounds(x,y,z,k);
}
	else if(pl == Player.Kevin_DeBruyne)
	{
		  Main.clubPanel.add(Main.KDBSquadAddButton);
		  Main.KDBSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Alisson_Becker)
	{
		  Main.clubPanel.add(Main.AlissonSquadAddButton);
		  Main.AlissonSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Virgil_VanDijk)
	{
		  Main.clubPanel.add(Main.VVDSquadAddButton);
		  Main.VVDSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Cesar_Azpilicueta)
	{
		  Main.clubPanel.add(Main.AzpiSquadAddButton);
		  Main.AzpiSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Ferland_Mendy)
	{
		  Main.clubPanel.add(Main.FMendySquadAddButton);
		  Main.FMendySquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Sergi_Roberto)
	{
		  Main.clubPanel.add(Main.SRobertoSquadAddButton);
		  Main.SRobertoSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Ngolo_Kante)
	{
		  Main.clubPanel.add(Main.KanteSquadAddButton);
		  Main.KanteSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Cesc_Fabregas)
	{
		  Main.clubPanel.add(Main.FabregasSquadAddButton);
		  Main.FabregasSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Rodri)
	{
		  Main.clubPanel.add(Main.RodriSquadAddButton);
		  Main.RodriSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Kai_Havertz)
	{
		  Main.clubPanel.add(Main.HavertzSquadAddButton);
		  Main.HavertzSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Kylian_Mbappe)
	{
		  Main.clubPanel.add(Main.MbappeSquadAddButton);
		  Main.MbappeSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Wissam_BenYedder)
	{
		  Main.clubPanel.add(Main.BenYedderSquadAddButton);
		  Main.BenYedderSquadAddButton.setBounds(x,y,z,k);
	}
	else if(pl == Player.Jan_Oblak)
	{
		  Main.clubPanel.add(Main.OblakSquadAddButton);
		  Main.OblakSquadAddButton.setBounds(x,y,z,k);
	}
	}
}
	

public static void playerButtonPosition2(Player pl, int x, int y, int z, int k, int clubCount)
{
	if(Main.count == clubCount )
{
if(pl == Player.Timo_Werner)
{
	 Main.clubPanel2.add(Main.WernerSquadAddButton);
	  Main.WernerSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Eden_Hazard)
{
	  Main.clubPanel2.add(Main.HazardSquadAddButton);
	  Main.HazardSquadAddButton.setBounds(x,y,z,k);
}

else if(pl == Player.Lionel_Messi)
{
	 Main.clubPanel2.add(Main.MessiSquadAddButton);
	 Main.MessiSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kevin_DeBruyne)
{
	  Main.clubPanel2.add(Main.KDBSquadAddButton);
	  Main.KDBSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Alisson_Becker)
{
	  Main.clubPanel2.add(Main.AlissonSquadAddButton);
	  Main.AlissonSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Virgil_VanDijk)
{
	  Main.clubPanel2.add(Main.VVDSquadAddButton);
	  Main.VVDSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Cesar_Azpilicueta)
{
	  Main.clubPanel2.add(Main.AzpiSquadAddButton);
	  Main.AzpiSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Ferland_Mendy)
{
	  Main.clubPanel2.add(Main.FMendySquadAddButton);
	  Main.FMendySquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Sergi_Roberto)
{
	  Main.clubPanel2.add(Main.SRobertoSquadAddButton);
	  Main.SRobertoSquadAddButton.setBounds(x,y,z,k);
}

else if(pl == Player.Ngolo_Kante)
{
	  Main.clubPanel2.add(Main.KanteSquadAddButton);
	  Main.KanteSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Cesc_Fabregas)
{
	  Main.clubPanel2.add(Main.FabregasSquadAddButton);
	  Main.FabregasSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Rodri)
{
	  Main.clubPanel2.add(Main.RodriSquadAddButton);
	  Main.RodriSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kai_Havertz)
{
	  Main.clubPanel2.add(Main.HavertzSquadAddButton);
	  Main.HavertzSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kylian_Mbappe)
{
	  Main.clubPanel2.add(Main.MbappeSquadAddButton);
	  Main.MbappeSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Wissam_BenYedder)
{
	  Main.clubPanel2.add(Main.BenYedderSquadAddButton);
	  Main.BenYedderSquadAddButton.setBounds(x,y,z,k);
}
else if(pl == Player.Jan_Oblak)
{
	  Main.clubPanel2.add(Main.OblakSquadAddButton);
	  Main.OblakSquadAddButton.setBounds(x,y,z,k);
}
}
	}

public static void playerRemoveButtonPosition(Player pl, int x, int y, int z, int k, int clubCount)
{
	if(Main.count2 == clubCount)
{
if(pl == Player.Timo_Werner)
{
	 Main.clubPanel.add(Main.WernerSquadRemoveButton);
	  Main.WernerSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Eden_Hazard)
{
	  Main.clubPanel.add(Main.HazardSquadRemoveButton);
	  Main.HazardSquadRemoveButton.setBounds(x,y,z,k);
}

else if(pl == Player.Lionel_Messi)
{
	 Main.clubPanel.add(Main.MessiSquadRemoveButton);
	 Main.MessiSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kevin_DeBruyne)
{
	  Main.clubPanel.add(Main.KDBSquadRemoveButton);
	  Main.KDBSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Alisson_Becker)
{
	  Main.clubPanel.add(Main.AlissonSquadRemoveButton);
	  Main.AlissonSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Virgil_VanDijk)
{
	  Main.clubPanel.add(Main.VVDSquadRemoveButton);
	  Main.VVDSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Cesar_Azpilicueta)
{
	  Main.clubPanel.add(Main.AzpiSquadRemoveButton);
	  Main.AzpiSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Ferland_Mendy)
{
	  Main.clubPanel.add(Main.FMendySquadRemoveButton);
	  Main.FMendySquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Sergi_Roberto)
{
	  Main.clubPanel.add(Main.SRobertoSquadRemoveButton);
	  Main.SRobertoSquadRemoveButton.setBounds(x,y,z,k);
}

else if(pl == Player.Ngolo_Kante)
{
	  Main.clubPanel.add(Main.KanteSquadRemoveButton);
	  Main.KanteSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Cesc_Fabregas)
{
	  Main.clubPanel.add(Main.FabregasSquadRemoveButton);
	  Main.FabregasSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Rodri)
{
	  Main.clubPanel.add(Main.RodriSquadRemoveButton);
	  Main.RodriSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kai_Havertz)
{
	  Main.clubPanel.add(Main.HavertzSquadRemoveButton);
	  Main.HavertzSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kylian_Mbappe)
{
	  Main.clubPanel.add(Main.MbappeSquadRemoveButton);
	  Main.MbappeSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Wissam_BenYedder)
{
	  Main.clubPanel.add(Main.BenYedderSquadRemoveButton);
	  Main.BenYedderSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Jan_Oblak)
{
	  Main.clubPanel.add(Main.OblakSquadRemoveButton);
	  Main.OblakSquadRemoveButton.setBounds(x,y,z,k);
}
}
}

public static void playerRemoveButtonPosition2(Player pl, int x, int y, int z, int k, int clubCount)
{
	if(Main.count2 == clubCount)
{
if(pl == Player.Timo_Werner)
{
	 Main.clubPanel2.add(Main.WernerSquadRemoveButton);
	  Main.WernerSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Eden_Hazard)
{
	  Main.clubPanel2.add(Main.HazardSquadRemoveButton);
	  Main.HazardSquadRemoveButton.setBounds(x,y,z,k);
}

else if(pl == Player.Lionel_Messi)
{
	 Main.clubPanel2.add(Main.MessiSquadRemoveButton);
	 Main.MessiSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kevin_DeBruyne)
{
	  Main.clubPanel2.add(Main.KDBSquadRemoveButton);
	  Main.KDBSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Alisson_Becker)
{
	  Main.clubPanel2.add(Main.AlissonSquadRemoveButton);
	  Main.AlissonSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Virgil_VanDijk)
{
	  Main.clubPanel2.add(Main.VVDSquadRemoveButton);
	  Main.VVDSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Cesar_Azpilicueta)
{
	  Main.clubPanel2.add(Main.AzpiSquadRemoveButton);
	  Main.AzpiSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Ferland_Mendy)
{
	  Main.clubPanel2.add(Main.FMendySquadRemoveButton);
	  Main.FMendySquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Sergi_Roberto)
{
	  Main.clubPanel2.add(Main.SRobertoSquadRemoveButton);
	  Main.SRobertoSquadRemoveButton.setBounds(x,y,z,k);
}

else if(pl == Player.Ngolo_Kante)
{
	  Main.clubPanel2.add(Main.KanteSquadRemoveButton);
	  Main.KanteSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Cesc_Fabregas)
{
	  Main.clubPanel2.add(Main.FabregasSquadRemoveButton);
	  Main.FabregasSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Rodri)
{
	  Main.clubPanel2.add(Main.RodriSquadRemoveButton);
	  Main.RodriSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kai_Havertz)
{
	  Main.clubPanel2.add(Main.HavertzSquadRemoveButton);
	  Main.HavertzSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Kylian_Mbappe)
{
	  Main.clubPanel2.add(Main.MbappeSquadRemoveButton);
	  Main.MbappeSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Wissam_BenYedder)
{
	  Main.clubPanel2.add(Main.BenYedderSquadRemoveButton);
	  Main.BenYedderSquadRemoveButton.setBounds(x,y,z,k);
}
else if(pl == Player.Jan_Oblak)
{
	  Main.clubPanel2.add(Main.OblakSquadRemoveButton);
	  Main.OblakSquadRemoveButton.setBounds(x,y,z,k);
}
}
}
}
