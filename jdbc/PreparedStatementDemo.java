package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PreparedStatementDemo {
	
	Connection connection;
	PreparedStatement preparedstatement;
	ResultSet resultset;
	
	public PreparedStatementDemo()throws ClassNotFoundException,SQLException
	{
		connection = MyConnection.getMyConnection();
		System.out.println("connection is established");
		
	}
	public void insertRecord(int pid,String name,String email_id,int age,String city) throws SQLException
	{
		preparedstatement = connection.prepareStatement("insert into person values(?,?,?,?,?)");
	    preparedstatement.setInt(1, pid);
	    preparedstatement.setString(2, name);
	    preparedstatement.setString(3, email_id);
	    preparedstatement.setInt(4, age);
	    preparedstatement.setString(5, city);
	    
	    int n = preparedstatement.executeUpdate();
	    System.out.println(n+ " record is inserted");
	    
	}
	
	public void searchByCity(String city) throws SQLException
	{
		preparedstatement = connection.prepareStatement("select * from person where city =?");
		preparedstatement.setString(1, city);
		
		resultset = preparedstatement.executeQuery();
		while(resultset.next())
		{
			System.out.print(resultset.getInt(1)+"\t");
			System.out.print(resultset.getString(2)+"\t");
			System.out.print(resultset.getString(3)+"\t");
			System.out.print(resultset.getInt(4)+"\t");
			System.out.print(resultset.getString(5)+"\t");
			System.out.println();
		}
	}
	
	public void updateRecord(String city,int pid) throws SQLException
	{
		preparedstatement = connection.prepareStatement("update person set city = ? where pid = ?");
		preparedstatement.setString(1, city);
		preparedstatement.setInt(2, pid);
		
		int n = preparedstatement.executeUpdate();
		System.out.println(n+ " record is updated");
		
	}
	
	public void deleteRecord(int pid) throws SQLException
	{
		preparedstatement = connection.prepareStatement("delete from person where pid = ?");
		preparedstatement.setInt(1, pid);
		
		int n = preparedstatement.executeUpdate();
		System.out.println(n+ " record is deleted");
		
	}
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		PreparedStatementDemo demo = new PreparedStatementDemo();
		int age,pid;
		String name,email_id,city;
		/*demo.insertRecord(107, "Shri", "shri@gmail.com", 28,"Mumbai");
		System.out.println("----------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter city");
		city=sc.nextLine();
		System.out.println("Search by city : "+city);
		demo.searchByCity(city);*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice.\n 1. insert new record \n 2. update record \n 3. search by city \n 4. delete by id");
        int choice = sc.nextInt();
        
        System.out.println("------------------------------");
        switch(choice)
        {
        case 1 : demo.insertRecord(107, "Shri", "shri@gmail.com", 28,"Mumbai");
                  break;
        case 2 : demo.updateRecord("Bangalore", 107); 
                    break;
        case 3 :   System.out.println("enter city");
		           city=sc.next();
		           System.out.println("Search by city : "+city);
		           demo.searchByCity(city);
		           break;
        case 4 : demo.deleteRecord(107);  
                   break;
                   
          default : System.out.println("Invalid choice");
        }
	}

}
