package com.java.cms;

import java.sql.SQLException;
import java.util.List;

public class MenuShow {
	public static void main(String[] args) {
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

}
