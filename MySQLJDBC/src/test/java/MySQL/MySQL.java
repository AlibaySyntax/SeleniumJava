package MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQL {
	
public static void main(String args[]) throws Exception {
	
Connection con = null;
try {
	      Class.forName("com.mysql.jdbc.Driver").newInstance();
	      con = DriverManager.getConnection("jdbc:mysql://localhost/",
	        "root", "Tuzik1234");
	      if(!con.isClosed())
	        System.out.println("Successfully connected to " +
	          "MySQL server using TCP/IP...");
	 
	    } catch(Exception e) {
	      System.err.println("Exception: " + e.getMessage());
	    } finally {
	      try {
	        if(con != null)
	          con.close();
	      } catch(SQLException e) {}
	    }
	  }
	}
