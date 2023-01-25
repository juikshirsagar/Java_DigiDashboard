package filehandlingoperations.com;

import java.io.FileWriter;
import java.io.IOException;

//use the FileWriter class along with its write() method in order to write some text to the file
public class WriteToFile {

	public static void main(String[] args) {

		try {  
	        FileWriter fwrite = new FileWriter("C:FileOperationExample.txt");  
	        // writing the content into the FileOperationExample.txt file  
	        fwrite.write("A named location used to store related information is referred to as a File.");   
	   
	        // Closing the stream  
	        fwrite.close();   
	        System.out.println("Content is successfully wrote to the file.");  
	    } catch (IOException e) {  
	        System.out.println("Unexpected error occurred");  
	        e.printStackTrace();  
	        }  
	}

}
