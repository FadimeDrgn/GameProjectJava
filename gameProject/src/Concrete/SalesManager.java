package Concrete;

import Abstract.SalesService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class SalesManager implements SalesService{

	@Override
	public void sale(Gamer gamer, Game game) {
		System.out.println(gamer.getFirstName()+ " adlý oyuncuya "+ game.getGameName() + " oyunu satýldý.");
		
	}

	@Override
	public void saleCampaign(Gamer gamer, Game game, Campaign campaign) {
		double discountedprice = game.getGamePrice() - campaign.getDiscount();	
		System.out.println(gamer.getFirstName()+ " oyuncusuna " + game.getGameName() + " oyunu "+campaign.getCampaignName() + " kampanyasý ile " +  discountedprice+ " fiyatýna satýldý.");
		
	}

}
