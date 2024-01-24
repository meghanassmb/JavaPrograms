package filehandling;

import java.io.FileInputStream;

import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("C:\\assignment\\ser.txt"));
        Employee employee = (Employee)objectInputStream.readObject();
        System.out.println(employee);
        objectInputStream.close();
	}

}
