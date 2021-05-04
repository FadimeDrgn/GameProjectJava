package Entities;

public class Sale {
	private int saleId;
	private String gameName;
	private String gamerName;
	
	public Sale() {
		
	}

	public Sale(int saleId, String gameName, String gamerName) {
		super();
		this.saleId = saleId;
		this.gameName = gameName;
		this.gamerName = gamerName;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGamerName() {
		return gamerName;
	}

	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}
	
}
