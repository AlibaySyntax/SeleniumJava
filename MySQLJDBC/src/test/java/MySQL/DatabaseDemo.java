package MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.testng.annotations.Test;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class DatabaseDemo {
	String dbUrl="jdbc:mysql://18.232.148.34:3306/syntaxhrm_mysql";
	String dbUsername="syntax_hrm";
	String dbPassword="syntaxhrm123";
@Test
public void databaseDemo() throws SQLException	{
System.out.println("next line");
// Creating connection
Connection connection=DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
System.out.println("Conn is created");
System.out.println(connection);

// Create a statemant
java.sql.Statement statement = connection.createStatement();

// Execute Query and store results from database in ResultSet object
java.sql.ResultSet resultSet = statement.executeQuery("Select*from hs_hr_emploees where emp_numbe<3700 order by emp_number");

// Get values from resultSet
resultSet.next();
String columnData=resultSet.getString("emp_firstname");
System.out.println(columnData);

resultSet.next();
columnData = resultSet.getString("emp_firstname");
System.out.println(columnData);

System.out.println("--Printing values using loop--");
while(resultSet.next()) {
columnData=resultSet.getString("emp_firstname");
System.out.println(columnData);
}

// Close all db connections
resultSet.close();
statement.close();
connection.close();
}	
}
