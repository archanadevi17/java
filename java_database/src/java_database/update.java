package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:mysql://localhost:3306/mydb5";
		String dbuname="root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
		
		String updatesql="update stu2 set deptid=? where sid =?";
		PreparedStatement pstmt = con.prepareStatement(updatesql);
		
		pstmt.setInt(1,80);
		pstmt.setInt(2,105);

		
		int rowupdated=pstmt.executeUpdate();
		if(rowupdated>0)
		{
			System.out.println("New Student updated successfully");
			
		}
		con.close();

}

}


