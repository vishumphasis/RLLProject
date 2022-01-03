package com.java.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.cms.ConnectionHelper;
import com.java.cms.Restaurent;

public class RestaurentDAO {
	Connection connection;
	PreparedStatement pst;
	
	public String addRestaurent(Restaurent restaurent) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "Insert into Restaurent(restaurentId,restaurentName,restaurentCity,restaurentBranch,restaurentEmail,restaurentContactNo) "
				+ " values(?,?,?,?,?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurent.getrestaurentId());
		pst.setString(2, restaurent.getrestaurentName());
		pst.setString(3, restaurent.getrestaurentCity());
		pst.setString(4, restaurent.getrestaurentBranch());
		pst.setString(5, restaurent.getrestaurentEmail());
		pst.setString(6, restaurent.getrestaurentContactNo());
		pst.executeUpdate();
		return "Record Inserted...";
	}
	
	public Restaurent searchRestaurent(int restaurentId) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurent where restaurentId=?";
		pst = connection.prepareStatement(cmd);
		pst.setInt(1, restaurentId);
		ResultSet rs = pst.executeQuery();
		Restaurent restaurent = null;
		if (rs.next()) {
			restaurent = new Restaurent();
			restaurent.setrestaurentId(rs.getInt("restaurentId"));
			restaurent.setrestaurentName(rs.getString("restaurentName"));
			restaurent.setrestaurentCity(rs.getString("restaurentCity"));
			restaurent.setrestaurentBranch(rs.getString("restaurentBranch"));
			restaurent.setrestaurentEmail(rs.getString("restaurentEmail"));
			restaurent.setrestaurentContactNo(rs.getString("restaurentContactNo"));	
		}
		return restaurent;
	}
	
	public List<Restaurent> showRestaurent() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select * from Restaurent";
		pst = connection.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		List<Restaurent> restaurentList = new ArrayList<Restaurent>();
		Restaurent restaurent = null; 
		while(rs.next()) {
			restaurent = new Restaurent();
			restaurent.setrestaurentId(rs.getInt("restaurentId"));
			restaurent.setrestaurentName(rs.getString("restaurentName"));
			restaurent.setrestaurentCity(rs.getString("restaurentCity"));
			restaurent.setrestaurentBranch(rs.getString("restaurentBranch"));
			restaurent.setrestaurentEmail(rs.getString("restaurentEmail"));
			restaurent.setrestaurentContactNo(rs.getString("restaurentContactNo"));
			restaurentList.add(restaurent);
		}
		return restaurentList;
	}

}
