package WorkingWithFile;

import java.io.File;
import java.io.IOException;

public class MyFile {
	public static void main(String[] args) {
		 try {  
		      File myObj = new File("C:\\Users\\12062\\OneDrive\\Desktop\\filename.txt");  
		      if (myObj.createNewFile()) {  
		        System.out.println("File created: " + myObj.getName());  
		      } else {  
		        System.out.println("File already exists.");  
		      }  
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();  
		    }
	}
}
