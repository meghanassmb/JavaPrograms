package filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 FileWriter writer = new  FileWriter("C:\\assignment\\xyz.txt",true);
		 writer.write("It supports only character ");
		 writer.close();
		 System.out.println("File created");

	}

}
