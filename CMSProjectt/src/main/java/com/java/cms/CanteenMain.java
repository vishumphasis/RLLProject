package com.java.cms;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class CanteenMain {

	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		do {
			System.out.println("O P T I O N S");
			System.out.println("---------------");
			System.out.println("1. Show Restaurant ");
			System.out.println("2. Search Restaurant");
			System.out.println("3. Show menu ");
			System.out.println("4. search menu ");
			System.out.println("5. show Customer ");
			System.out.println("6. search Customer ");
			System.out.println("7. show Vendor ");
			System.out.println("8. search Vendor ");
			System.out.println("Enter Your Choice   ");
			choice = sc.nextInt();
			switch(choice) {
			case 1 : 
				RestaurentShow();
			break;
			case 2 : 
				try {
					RestaurentSearch();
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			case 3 : 
				MenuShow();
			break;
			case 4 : 
				MenuSearch();
			break;
			case 5 : 
				CustomerShow();
			break;
			case 6 : 
				CustomerSearch();
			break;
			case 7 : 
				VendorShow();
			break;
			case 8 : 
				VendorSearch();
			break;	
			case 9 : 
				return;
			}
		} while(choice!=9);
	}
	private static void VendorSearch() {
			int vendorId;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter VendorID=    ");
			vendorId = sc.nextInt();
			VendorDAO dao = new VendorDAO();
			try {
				Vendor vendor = dao.searchVendor(vendorId);
				if (vendor!=null) {
					System.out.println(vendor);
				} else {
					System.out.println("*** Record Not Found ***");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
	private static void VendorShow() {
			VendorDAO dao = new VendorDAO();
			try {
				List<Vendor> vendorList = dao.showVendor();
				for (Vendor vendor : vendorList) {
					System.out.println(vendor);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
	private static void CustomerSearch() {
			int customerId;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter CustomerID=    ");
			customerId = sc.nextInt();
			CustomerDAO dao = new CustomerDAO();
			try {
				Customer customer = dao.searchCustomer(customerId);
				if (customer!=null) {
					System.out.println(customer);
				} else {
					System.out.println("*** Record Not Found ***");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
	public static void CustomerShow() {
			CustomerDAO dao = new CustomerDAO();
			try {
				List<Customer> customerList = dao.showCustomer();
				for (Customer customer : customerList) {
					System.out.println(customer);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		// TODO Auto-generated method stub
	public static void MenuShow() {
			MenuDAO dao = new MenuDAO();
			try {
				List<Menu> menuList = dao.showMenu();
				for (Menu menu : menuList) {
					System.out.println(menu);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		// TODO Auto-generated method stub
	public static void RestaurentSearch() throws ClassNotFoundException, SQLException {
			int restaurentId;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Restaurent    ");
			restaurentId = sc.nextInt();
			RestaurentDAO dao = new RestaurentDAO();
			try {
				Restaurent restaurent = dao.searchRestaurent(restaurentId);
				if (restaurent!=null) {
					System.out.println(restaurent);
				} else {
					System.out.println("*** Record Not Found ***");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	public static void RestaurentShow() {
			RestaurentDAO dao = new RestaurentDAO();
			try {
				List<Restaurent> restaurentList = dao.showRestaurent();
				for (Restaurent restaurent : restaurentList) {
					System.out.println(restaurent);
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		}
	}
	public static void MenuSearch() {
			int menuId;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Restaurent Id=    ");
			menuId = sc.nextInt();
			MenuDAO dao = new MenuDAO();
			try {
				Menu menu = dao.searchMenu(menuId);
				if (menu!=null) {
					System.out.println(menu);
				} else {
					System.out.println("*** Record Not Found ***");
				}
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
