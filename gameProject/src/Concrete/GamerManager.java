package Concrete;

import Abstract.GamerService;
import Abstract.UserValidationService;
import Entities.Gamer;

public class GamerManager implements GamerService{
	
	UserValidationService userValidationService;

	public GamerManager(UserValidationService userValidationService) {		
		this.userValidationService = userValidationService;
	}

	@Override
	public void add(Gamer gamer) {
		if(userValidationService.validate(gamer)) {
			System.out.println(gamer.getFirstName() + " adlý oyuncu sisteme eklendi.");
		} else {
			System.out.println(gamer.getFirstName() + " adlý oyuncunun bilgileri doðrulanamadý.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý oyuncu bilgisi güncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adlý oyuncu sistemden silindi.");
		
	}

}
