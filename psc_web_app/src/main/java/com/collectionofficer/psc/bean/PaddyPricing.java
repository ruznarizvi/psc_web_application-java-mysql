package com.collectionofficer.psc.bean;

public class PaddyPricing {
	private int paddy_Id;
	private String paddy_Type;
	private double selling_price_per_Kg;
	private double buying_price_per_Kg;
	
	
	public PaddyPricing(String paddy_Type, double selling_price_per_Kg, double buying_price_per_Kg) {
		super();
		this.paddy_Type = paddy_Type;
		this.selling_price_per_Kg = selling_price_per_Kg;
		this.buying_price_per_Kg = buying_price_per_Kg;
	}
	
	public PaddyPricing(int paddy_Id, String paddy_Type, double selling_price_per_Kg, double buying_price_per_Kg) {
		super();
		this.paddy_Id = paddy_Id;
		this.paddy_Type = paddy_Type;
		this.selling_price_per_Kg = selling_price_per_Kg;
		this.buying_price_per_Kg = buying_price_per_Kg;
	}
	public int getPaddy_Id() {
		return paddy_Id;
	}
	public void setPaddy_Id(int paddy_Id) {
		this.paddy_Id = paddy_Id;
	}
	public String getPaddy_Type() {
		return paddy_Type;
	}
	public void setPaddy_Type(String paddy_Type) {
		this.paddy_Type = paddy_Type;
	}
	public double getSelling_price_per_Kg() {
		return selling_price_per_Kg;
	}
	public void setSelling_price_per_Kg(double selling_price_per_Kg) {
		this.selling_price_per_Kg = selling_price_per_Kg;
	}
	public double getBuying_price_per_Kg() {
		return buying_price_per_Kg;
	}
	public void setBuying_price_per_Kg(double buying_price_per_Kg) {
		this.buying_price_per_Kg = buying_price_per_Kg;
	}
	
	
	

}
