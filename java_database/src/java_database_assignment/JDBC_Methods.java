package java_database_assignment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;

public class JDBC_Methods {
		String jdbcURL="jdbc:mysql://localhost:3306/mydb5";
		String dbuname="root";
		String dbpwd="Password@12";
		
		public void insert(Stud s)throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
			
			String q="insert into Stud (sid,sname,phy,Chem)values(?,?,?,?);";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setInt(1,s.sid);
			pstmt.setString(2, s.sname);
			pstmt.setInt(3,s.phy);
			pstmt.setInt(4,s.Chem);
			pstmt.executeUpdate();
			
		}
		  public HashMap<Integer, Stud> getAllStud() throws Exception {
		        HashMap<Integer, Stud> hm = new HashMap<>();
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
		        String qn = "select * from Stud";
		        Statement stmt = con.createStatement();
		        ResultSet rs = stmt.executeQuery(qn);

		        while (rs.next()) {
		            Stud s = new Stud(rs.getInt("sid"), rs.getString("sname"), rs.getInt("phy"), rs.getInt("Chem"));
		            hm.put(s.sid, s);
		        }
		        return hm;
		    }
		  
		  public void updateAvg(int avg, int sid)  throws Exception{
			   Class.forName("com.mysql.cj.jdbc.Driver");
		        Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpwd);
		        String q = "update Stud set avg=? where sid=?";
		        PreparedStatement pstmt = con.prepareStatement(q);
		        pstmt.setInt(1,avg);
				pstmt.setInt(2,sid);
				pstmt.executeUpdate();

		  }
		}

