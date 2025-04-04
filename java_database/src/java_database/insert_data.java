package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class insert_data {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:mysql://localhost:3306/mydb5";
		String dbuname="root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
		
		String q="insert into stu2 values(?,?,?,?);";
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setInt(1,120);
		pstmt.setString(2, "VIJAY");
		pstmt.setInt(3,100);
		pstmt.setInt(4,90);
		
		
		//Execute query we use execute update
		int rowinserted=pstmt.executeUpdate();
		if(rowinserted>0)
		{
			System.out.println("A new Student is inserted successfully");
			
		}
		//ResultSet rs= stmt.executeQuery(q);
		con.close();
		
}

	
}