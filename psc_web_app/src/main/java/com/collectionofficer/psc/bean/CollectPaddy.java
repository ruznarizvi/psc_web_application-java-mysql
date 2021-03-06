package com.collectionofficer.psc.bean;

import java.sql.Date;

public class CollectPaddy {
	private int collected_paddy_details_Id;
	private int farmer_Id;
	private int paddy_Id;
	private int total_weight;
	private String paddy_Type;
	private double buying_price_per_Kg;
	private String farmer_Name;
	private int total_amount;
	private Date purchase_date;
	private int collection_officer_Id;
	private int regional_center_Id;

	//insert paddy
		public CollectPaddy(int farmer_Id, int paddy_Id, int total_weight, int total_amount, Date purchase_date, int collection_officer_Id, 
			int regional_center_Id) {
			super();
			this.farmer_Id = farmer_Id;
			this.paddy_Id = paddy_Id;
			this.total_weight = total_weight;
			this.total_amount = total_amount;
			this.purchase_date = purchase_date;
			this.collection_officer_Id = collection_officer_Id;
			this.regional_center_Id = regional_center_Id;
		}
	
	
	//edit paddy
	public CollectPaddy(int collected_paddy_details_Id, int farmer_Id, int paddy_Id, int total_weight, int total_amount) {
		super();
		this.collected_paddy_details_Id = collected_paddy_details_Id;
		this.farmer_Id = farmer_Id;
		this.paddy_Id = paddy_Id;
		this.total_weight = total_weight;	
		this.total_amount = total_amount;
	}


	//select paddy by id
	public CollectPaddy(int collected_paddy_details_Id, int farmer_Id, int paddy_Id, int total_weight) {
		super();
		this.collected_paddy_details_Id = collected_paddy_details_Id;
		this.farmer_Id = farmer_Id;
		this.paddy_Id = paddy_Id;
		this.total_weight = total_weight;
	}



  //list all paddy details
	public CollectPaddy(int collected_paddy_details_Id, int farmer_Id, int paddy_Id, int total_weight, String paddy_Type, double buying_price_per_Kg, String farmer_Name, int total_amount, Date purchase_date) {
		super();
		this.collected_paddy_details_Id = collected_paddy_details_Id;
		this.farmer_Id = farmer_Id;
		this.paddy_Id = paddy_Id;
		this.total_weight = total_weight;
		this.paddy_Type = paddy_Type;
		this.buying_price_per_Kg = buying_price_per_Kg;
		this.farmer_Name = farmer_Name;
		this.total_amount = total_amount;
		this.purchase_date = purchase_date;
	}


	public int getCollected_paddy_details_Id() {
		return collected_paddy_details_Id;
	}
	
	public void setCollected_paddy_details_Id(int collected_paddy_details_Id) {
		this.collected_paddy_details_Id = collected_paddy_details_Id;
	}
	
	public int getFarmer_Id() {
		return farmer_Id;
	}
	public void setFarmer_Id(int farmer_Id) {
		this.farmer_Id = farmer_Id;
	}
	public int getPaddy_Id() {
		return paddy_Id;
	}
	
	public void setPaddy_Id(int paddy_Id) {
		this.paddy_Id = paddy_Id;
	}

	public int getTotal_weight() {
		return total_weight;
	}
	public void setTotal_weight(int total_weight) {
		this.total_weight = total_weight;
	}


	public int getTotal_amount() {
		return total_amount;
	}


	public void setTotal_amount(int total_amount) {
		this.total_amount = total_amount;
	}
	
	public Date getPurchase_date() {
		return purchase_date;
	}


	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	

	public int getCollection_officer_Id() {
		return collection_officer_Id;
	}

	public void setCollection_officer_Id(int collection_officer_Id) {
		this.collection_officer_Id = collection_officer_Id;
	}

	
	public int getRegional_center_Id() {
		return regional_center_Id;
	}


	public void setRegional_center_Id(int regional_center_Id) {
		this.regional_center_Id = regional_center_Id;
	}
	
	
	public String getPaddy_Type() {
		return paddy_Type;
	}

	public void setPaddy_Type(String paddy_Type) {
		this.paddy_Type = paddy_Type;
	}


	public double getBuying_price_per_Kg() {
		return buying_price_per_Kg;
	}

	public void setBuying_price_per_Kg(double buying_price_per_Kg) {
		this.buying_price_per_Kg = buying_price_per_Kg;
	}


	public String getFarmer_Name() {
		return farmer_Name;
	}

	public void setFarmer_Name(String farmer_Name) {
		this.farmer_Name = farmer_Name;
	}
	

}
