package com.mobiletypes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
public class getmobile {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		Scanner Scan=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/oneplus";
    	//username,password
    	String username="root";
    	String password="270819";
    	Connection con=DriverManager.getConnection(url,username,password);
    	System.out.println("******Add your mobile into database");
    	System.out.println("enter mobileId");
    	int mid=Scan.nextInt();
    	System.out.println("Enter mobileName");
    	Scan.nextLine();
    	String mname=Scan.nextLine();
    	System.out.println("Enter mobilePrice");
    	int mPrice=Scan.nextInt();
    	String Query="insert into mobile values(?,?,?)";
    	PreparedStatement pst=con.prepareStatement(Query);
		pst.setInt(1, mid);
		pst.setString(2,mname);
		pst.setInt(3, mPrice);
		
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) effected");
    	con.close();
    	Scan.close();	
    	
	}

}
