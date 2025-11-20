import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class RetriveDataInOracle{
	 
	static Connection connection = null;
	static Statement statement = null;
	static ResultSet resultSet = null;
	static final String retriveData = "SELECT * FROM STUDENTS WHERE STUDENT_AGE=21";
	
 	
	public static void main (String args[]) {
		try {
			//1. Load Driver
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//2. Build Connection
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","C##Yasin","manager");
			
			//3. Build Statement
			statement = connection.createStatement();
			
			//4.Execute Query
			resultSet = statement.executeQuery(retriveData);
			
			//5.Output 
			
			while(resultSet.next()) {
				System.out.println(resultSet.getInt("student_id")+" "+ resultSet.getString("student_name")+" "+ resultSet.getInt("student_age"));
				
			}
			//6.CLOSE CONNECTION
			connection.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}