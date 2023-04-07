package com.mobiletypes;
import java.sql.*;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	
        Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/oneplus";
    	//username,password
    	String username="root";
    	String password="270819";
    	 Connection con=DriverManager.getConnection(url,username,password);
    	Statement st=con.createStatement();
    	ResultSet rs=st.executeQuery("select * from mobile");
     System.out.println("mobileId\tmobileName\tmobilePrice");
    	while(rs.next())
      	{
      		String mobiledata=rs.getInt(1)+rs.getString(2)+rs.getString(3);
      	//reading the name from response
      		 System.out.println(mobiledata);
}
        con.close();
    	
    	
        
    }
}
