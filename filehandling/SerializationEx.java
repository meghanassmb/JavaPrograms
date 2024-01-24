package filehandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Employee employee = new Employee(101, "Riya" , "programmer");
		//ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("C:\\assignment\\ser.txt"));
		FileOutputStream outputStream = new FileOutputStream("C:\\assignment\\ser.txt");
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
		objectOutputStream.writeObject(employee);
		objectOutputStream.flush();
		System.out.println("converted emp obj into byte stream");

	}

}
