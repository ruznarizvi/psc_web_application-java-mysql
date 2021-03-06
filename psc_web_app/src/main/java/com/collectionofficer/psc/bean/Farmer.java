package com.collectionofficer.psc.bean;

import java.sql.Date;

public class Farmer {
	private int farmer_Id;
	private String farmer_Name;
	private String farmer_Address;
	private int farmer_Contact;
	private Date registration_Date;
	private int regional_center_Id;
	
	public Farmer(String farmer_Name, String farmer_Address, int farmer_Contact, Date registration_Date,
			int regional_center_Id) {
		super();
		this.farmer_Name = farmer_Name;
		this.farmer_Address = farmer_Address;
		this.farmer_Contact = farmer_Contact;
		this.registration_Date = registration_Date;
		this.regional_center_Id = regional_center_Id;
	}
	public Farmer(int farmer_Id, String farmer_Name, String farmer_Address, int farmer_Contact, Date registration_Date) {
		super();
		this.farmer_Id = farmer_Id;
		this.farmer_Name = farmer_Name;
		this.farmer_Address = farmer_Address;
		this.farmer_Contact = farmer_Contact;
		this.registration_Date = registration_Date;
	
	}
	public int getFarmer_Id() {
		return farmer_Id;
	}
	public void setFarmer_Id(int farmer_Id) {
		this.farmer_Id = farmer_Id;
	}
	public String getFarmer_Name() {
		return farmer_Name;
	}
	public void setFarmer_Name(String farmer_Name) {
		this.farmer_Name = farmer_Name;
	}
	public String getFarmer_Address() {
		return farmer_Address;
	}
	public void setFarmer_Address(String farmer_Address) {
		this.farmer_Address = farmer_Address;
	}
	public int getFarmer_Contact() {
		return farmer_Contact;
	}
	public void setFarmer_Contact(int farmer_Contact) {
		this.farmer_Contact = farmer_Contact;
	}
	public Date getRegistration_Date() {
		return registration_Date;
	}
	public void setRegistration_Date(Date registration_Date) {
		this.registration_Date = registration_Date;
	}
	public int getRegional_center_Id() {
		return regional_center_Id;
	}
	public void setRegional_center_Id(int regional_center_Id) {
		this.regional_center_Id = regional_center_Id;
	}
	
	

}
