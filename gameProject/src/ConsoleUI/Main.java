package ConsoleUI;

import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SalesManager;
import Concrete.UserValidationManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		Gamer gamer1 = new Gamer(1, "Fadime", "Durgun", 123456789, 2000);
		
		Game game1 = new Game(1, "Minecraft", 540);
		
		Campaign campaign1 = new Campaign(1, "23 Nisan indirimi", 50);
		
		Sale sale1 = new Sale(1, "Minecraft", "Fadime");
		

		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		GamerManager gamerManager = new GamerManager(new UserValidationManager());
		gamerManager.add(gamer1);
		
		CampaignManager campaignManager = new CampaignManager(); 
		campaignManager.add(campaign1);
		
		SalesManager salesManager = new SalesManager();
		salesManager.sale(gamer1, game1);
		salesManager.saleCampaign(gamer1, game1, campaign1);
	}

}
