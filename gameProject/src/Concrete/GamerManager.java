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
			System.out.println(gamer.getFirstName() + " adl� oyuncu sisteme eklendi.");
		} else {
			System.out.println(gamer.getFirstName() + " adl� oyuncunun bilgileri do�rulanamad�.");
		}
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� oyuncu bilgisi g�ncellendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " adl� oyuncu sistemden silindi.");
		
	}

}
