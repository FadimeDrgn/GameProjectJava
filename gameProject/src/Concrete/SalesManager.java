package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+ " adl� oyuncuya "+ game.getGameName() + " oyunu sat�ld�.");
		
	}

	@Override
	public void saleCampaign(Gamer gamer, Game game, Campaign campaign) {
		double discountedprice = game.getGamePrice() - campaign.getDiscount();	
		System.out.println(gamer.getFirstName()+ " oyuncusuna " + game.getGameName() + " oyunu "+campaign.getCampaignName() + " kampanyas� ile " +  discountedprice+ " fiyat�na sat�ld�.");
		
	}

}
