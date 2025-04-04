package java_database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class delete1 {

	public static void main(String[] args) throws SQLException,ClassNotFoundException{
		// TODO Auto-generated method stub
		String jdbcURL="jdbc:mysql://localhost:3306/mydb5";
		String dbuname="root";
		String dbpwd="Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
		
		String updatesql="delete from stu2 where sid =?";
		PreparedStatement pstmt = con.prepareStatement(updatesql);
		
		pstmt.setInt(1,115);
		
		int rowDeleted=pstmt.executeUpdate();
		if(rowDeleted>0)
		{
			System.out.println("Student deleted successfully");
			
		}
		con.close();

}

}
