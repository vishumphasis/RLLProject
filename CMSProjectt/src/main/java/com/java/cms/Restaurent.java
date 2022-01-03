package com.java.cms;

public class Restaurent {
	private int restaurentId;
	private String restaurentName;
	private String restaurentCity;
	private String restaurentBranch;
	private String restaurentEmail;
	private String restaurentContactNo;
	
	
	public int getrestaurentId() {
		return restaurentId;
	}
	public void setrestaurentId(int restaurentId) {
		this.restaurentId = restaurentId;
	}
	public String getrestaurentName() {
		return restaurentName;
	}
	public void setrestaurentName(String restaurentName) {
		this.restaurentName = restaurentName;
	}
	public String getrestaurentCity() {
		return restaurentCity;
	}
	public void setrestaurentCity(String restaurentCity) {
		this.restaurentCity = restaurentCity;
	}
	public String getrestaurentBranch() {
		return restaurentBranch;
	}
	public void setrestaurentBranch(String restaurentBranch) {
		this.restaurentBranch = restaurentBranch;
	}
	public String getrestaurentEmail() {
		return restaurentEmail;
	}
	public void setrestaurentEmail(String restaurentEmail) {
		this.restaurentEmail = restaurentEmail;
	}
	
	public String getrestaurentContactNo() {
		return restaurentContactNo;
	}
	public void setrestaurentContactNo(String restaurentContactNo) {
		this.restaurentContactNo = restaurentContactNo;
	}
	
	public Restaurent() {
		// TODO Auto-generated constructor stub
	}

	public Restaurent(int restaurentId, String restaurentName, String restaurentCity,String restaurentBranch, String restaurentEmail,String restaurentContactNo) {
		this.restaurentId = restaurentId;
		this.restaurentName = restaurentName;
		this.restaurentCity = restaurentCity;
		this.restaurentBranch=restaurentBranch;
		this.restaurentEmail = restaurentEmail;
		this.restaurentContactNo=restaurentContactNo;
	}
	@Override
	public String toString() {
		return "Restaurent [restaurentId=" + restaurentId + ", restaurentName=" + restaurentName + ", restaurentCity=" + restaurentCity + ",  restaurentBranch=" + restaurentBranch + ", restaurentEmail=" + restaurentEmail + " , restaurentContactNo=" + restaurentContactNo + "]";
	}

}
