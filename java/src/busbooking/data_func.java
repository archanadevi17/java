package busbooking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map.Entry;



public class data_func{
	static String jdbcURL="jdbc:mysql://localhost:3306/mydb6";
	static String dbuname="root";
	static String dbpwd="Password@12";
	
	
	
	HashMap<Integer, busroute> map = new HashMap<Integer, busroute>();
	HashMap<Integer, ticketbook> map1 = new HashMap<Integer, ticketbook>();
	
	public void getdata()throws ClassNotFoundException,SQLException{
		
		
		System.out.println("0----0--");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
	Statement stmt = con.createStatement();
	String q="select * from busroute2";
	ResultSet rs=stmt.executeQuery(q);
	while(rs.next())
	{
	
	
		int rid =rs.getInt("rid");
		String P =rs.getString("Pickup");
		String d =rs.getString("destination");
		int Tot  =rs.getInt("Totalseats");
		int rem  =rs.getInt("remainingseats");
		int cost =rs.getInt("cost");
		
		busroute ob=new busroute(rid,P,d,Tot,rem,cost);
		map.put(ob.rid,ob);
		
	}
	 con.close();
	}

	void putdata()throws ClassNotFoundException,SQLException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
		String q="insert into booking2 values(?,?,?,?);";
		PreparedStatement pstm=con.prepareStatement(q);
		for(Entry<Integer, ticketbook> e:map1.entrySet()){
			ticketbook st=e.getValue();
			pstm.setInt(1, st.bid);
			pstm.setInt(2, st.rid);
			pstm.setInt(3, st.num);
			pstm.setInt(4, st.tot);
		}
		int rowinserted=pstm.executeUpdate();
		if(rowinserted>0)
		{
			System.out.println("A new row  inserted successfully");
			
		}
		con.close();
	}
}
	
	
	
	
	


