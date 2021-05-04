package Entities;

public class Gamer {
	private int gamerId;
	private String firstName; 
	private String lastName;
	private long nationalIdentity;
	private int dateOfBirthYear;
	
	public Gamer () {
	}

	public Gamer(int gamerId, String firstName, String lastName, long nationalIdentity, int dateOfBirthYear) {
		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalIdentity = nationalIdentity;
		this.dateOfBirthYear = dateOfBirthYear;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getNationalIdentity() {
		return nationalIdentity;
	}

	public void setNationalIdentity(long nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}

	public int getDateOfBirthYear() {
		return dateOfBirthYear;
	}

	public void setDateOfBirthYear(int dateOfBirthYear) {
		this.dateOfBirthYear = dateOfBirthYear;
	}
	
	
}


	

