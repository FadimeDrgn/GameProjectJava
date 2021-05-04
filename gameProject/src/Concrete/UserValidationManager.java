package Concrete;

import Abstract.UserValidationService;
import Entities.Gamer;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		if (
				gamer.getFirstName() == "Fadime"&&
				gamer.getLastName() == "Durgun"&&
				gamer.getGamerId() == 2 &&
				gamer.getNationalIdentity() == 123456789 &&
				gamer.getDateOfBirthYear() == 2000
				) {
			return true;
		}else {
			return false;
		}
	}
	
}
