package com.java.cms;

public class Menu {
	private int menuId;
	private int restaurentId;
	private String ItemName;
	private String menuType;
	private int price;
	
	
	public int getmenuId() {
		return menuId;
	}
	public void setmenuId(int menuId) {
		this.menuId = menuId;
	}
	public int getrestaurentId() {
		return restaurentId;
	}
	public void setrestaurentId(int restaurentId) {
		this.restaurentId = restaurentId;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String ItemName) {
		this.ItemName = ItemName;
	}
	public String getmenuType() {
		return menuType;
	}
	public void setmenuType(String menuType) {
		this.menuType = menuType;
	}
	public int getprice() {
		return price;
	}
	public void setprice(int price) {
		this.price = price;
	}
	
	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(int menuId,int restaurentId, String ItemName, String menuType,int price) {
		this.menuId = menuId;
		this.restaurentId = restaurentId;
		this.ItemName = ItemName;
		this.menuType = menuType;
		this.price=price;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId +",restaurentId=" + restaurentId + ", ItemName=" + ItemName + ", menuType=" + menuType + ",  price=" + price + " ]";
	}

}
