package com.java.cms;

public class Vendor {
	private int vendorId;
	private String vendorName;
	private String vendorState;
	private String vendorCity;
	private String vendorEmail;
	private String vendorMob;
	
	
	public int getvendorId() {
		return vendorId;
	}
	public void setvendorId(int vendorId) {
		this.vendorId = vendorId;
	}
	public String getvendorName() {
		return vendorName;
	}
	public void setvendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public String getvendorState() {
		return vendorState;
	}
	public void setvendorState(String vendorState) {
		this.vendorState = vendorState;
	}
	public String getvendorCity() {
		return vendorCity;
	}
	public void setvendorCity(String vendorCity) {
		this.vendorCity = vendorCity;
	}
	public String getvendorEmail() {
		return vendorEmail;
	}
	public void setvendorEmail(String vendorEmail) {
		this.vendorEmail = vendorEmail;
	}
	
	public String getvendorMob() {
		return vendorMob;
	}
	public void setvendorMob(String vendorMob) {
		this.vendorMob = vendorMob;
	}
	
	public Vendor() {
		// TODO Auto-generated constructor stub
	}

	public Vendor(int vendorId, String vendorName, String vendorState,String vendorCity, String vendorEmail,String vendorMob) {
		this.vendorId = vendorId;
		this.vendorName = vendorName;
		this.vendorState = vendorState;
		this.vendorCity=vendorCity;
		this.vendorEmail = vendorEmail;
		this.vendorMob=vendorMob;
	}
	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + ", vendorState=" + vendorState + ",  vendorCity=" + vendorCity + ", vendorEmail=" + vendorEmail + " , vendorMob=" + vendorMob + "]";
	}


}
