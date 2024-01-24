package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class StatementDemo {

	Connection connection;
	Statement statement;
	ResultSet resultset;
	
	public  StatementDemo() throws ClassNotFoundException, SQLException {
	   connection = MyConnection.getMyConnection();
	   System.out.println("connection is established");
	 }
	
	public void getAllRecords()throws SQLException
	{
		//create Statement
		statement = connection.createStatement();
		
		//execute Query
		resultset = statement.executeQuery("select * from person");
		
		//retreive result
		while(resultset.next())
		{
			System.out.print(resultset.getInt("pid")+"\t");
			System.out.print(resultset.getString(2)+"\t");
			System.out.print(resultset.getString(3)+"\t");
			System.out.print(resultset.getInt(4)+"\t");
			System.out.print(resultset.getString(5)+"\t");
			System.out.println();
			
		}
		
		//close connection
		connection.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		StatementDemo statementdemo = new StatementDemo();
		statementdemo.getAllRecords();

	}

}
