package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface SalesService {
	void sale(Gamer gamer, Game game);
	void saleCampaign(Gamer gamer, Game game, Campaign campaign);
}
