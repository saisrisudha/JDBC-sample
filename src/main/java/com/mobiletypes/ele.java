package com.mobiletypes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ele {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/oneplus";
    	//username,password
    	String username="root";
    	String password="270819";
    	 Connection con=DriverManager.getConnection(url,username,password);
    	 int mid=5;
    	 String mname="lenovo";
    	 int mPrice=45000;
    	 String Query="insert into mobile values(?,?,?)";
    	 PreparedStatement pst=con.prepareStatement(Query);
    	 pst.setInt(1,mid);
    	 pst.setString(2,mname);
    	 pst.setInt(3,mPrice);
    	 int count=pst.executeUpdate();
    	 System.out.println(count+"rows(s)effected");
    	 con.close();

	}

}
