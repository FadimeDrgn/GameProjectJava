package Entities;

public class Campaign {
	private int CampaignId;
	private String CampaignName;
	private double discount;

    public Campaign () {
		
	}

	public Campaign(int campaignId, String campaignName, double discount) {
		CampaignId = campaignId;
		CampaignName = campaignName;
		this.discount = discount;
	}

	public int getCampaignId() {
		return CampaignId;
	}

	public void setCampaignId(int campaignId) {
		CampaignId = campaignId;
	}

	public String getCampaignName() {
		return CampaignName;
	}

	public void setCampaignName(String campaignName) {
		CampaignName = campaignName;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
}
