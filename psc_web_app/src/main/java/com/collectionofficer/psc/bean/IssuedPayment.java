package com.collectionofficer.psc.bean;

import java.sql.Date;

public class IssuedPayment {
	private int issued_Id;
	private int finance_officer_Id;
	private String issued_status;
	private int farmer_Id;
	private int paddy_Id;
	private int total_weight;
	private int total_amount;
	private Date purchase_date;
	private int regional_center_Id;
	
	
	
//	public IssuedPayment(String issued_status, int farmer_Id, int paddy_Id,
//			int total_weight, int total_amount, Date purchase_date, int regional_center_Id) {
//		super();
//		this.issued_status = issued_status;
//		this.farmer_Id = farmer_Id;
//		this.paddy_Id = paddy_Id;
//		this.total_weight = total_weight;
//		this.total_amount = total_amount;
//		this.purchase_date = purchase_date;
//		this.regional_center_Id = regional_center_Id;
//	}
	

	//insert issued payment details
	public IssuedPayment(String issued_status, int farmer_Id, int paddy_Id, int total_weight,
			int total_amount, Date purchase_date, int regional_center_Id) {
		super();
		this.issued_status = issued_status;
		this.farmer_Id = farmer_Id;
		this.paddy_Id = paddy_Id;
		this.total_weight = total_weight;
		this.total_amount = total_amount;
		this.purchase_date = purchase_date;
		this.regional_center_Id = regional_center_Id;
	}
	
	

	public int getRegional_center_Id() {
		return regional_center_Id;
	}



	public void setRegional_center_Id(int regional_center_Id) {
		this.regional_center_Id = regional_center_Id;
	}



	public IssuedPayment(int issued_Id) {
		super();
		this.issued_Id = issued_Id;
	}

	public int getIssued_Id() {
		return issued_Id;
	}
	public void setIssued_Id(int issued_Id) {
		this.issued_Id = issued_Id;
	}
	public int getFinance_officer_Id() {
		return finance_officer_Id;
	}
	public void setFinance_officer_Id(int finance_officer_Id) {
		this.finance_officer_Id = finance_officer_Id;
	}
	public String getIssued_status() {
		return issued_status;
	}
	public void setIssued_status(String issued_status) {
		this.issued_status = issued_status;
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
	
	
	
	
	
}
