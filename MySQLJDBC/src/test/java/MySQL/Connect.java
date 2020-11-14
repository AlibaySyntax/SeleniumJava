package MySQL;

	import java.sql.*;
	 
	   public class Connect  {
	       public static void main (String[] args)
	       {
	           Connection conn = null;
	 
	           try
	           {
	               String userName = "whitep8";
	               String password = "whitep8";
	               String url = "jdbc:mysql://localhost:3306/test/";
	               Class.forName ("com.mysql.jdbc.Driver").newInstance ();
	               conn = DriverManager.getConnection (url, userName, password);
	               System.out.println ("Database connection established");
	           }
	           catch (Exception e)
	           {
	               System.err.println ("Cannot connect to database server");
	           }
	           finally
	           {
	               if (conn != null)
	               {
	                   try
	                   {
	                       conn.close ();
	                       System.out.println ("Database connection terminated");
	                   }
	                   catch (Exception e) { /* ignore close errors */ }
	               }
	           }
	       }
	   }

