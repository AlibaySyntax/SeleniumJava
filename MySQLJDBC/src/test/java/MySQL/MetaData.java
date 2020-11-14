package MySQL;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.testng.annotations.Test;

public class MetaData {
	
String dbUrl = "jdbc:mysql://18.232.148.34;3306/sintaxhrm_mysql";
String dbUsername = "syntax_hrm";
String dbPassword = "syntaxhrm123";

@Test
public void metaData() throws SQLException   {
Connection conn = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);

// Get info about Database
DatabaseMetaData dbMetaData=conn.getMetaData();
String dbName=dbMetaData.getDatabaseProductName();
String dbVersion=dbMetaData.getDatabaseProductVersion();

System.out.println(dbName +" "+dbVersion);

Statement st=conn.createStatement();

ResultSet rset=st.executeQuery("SELECT * FROM ohrm_job_title;");

// Get info about Result Table
ResultSetMetaData rsetData=rset.getMetaData();
int cols=rsetData.getColumnCount();
System.out.println(cols);

for(int i=1; i<=cols; i++) {
String colName=rsetData.getColumnName(i);
System.out.println(colName);
}

// Close all db connections
rset.close();
st.close();
conn.close();







}
}


