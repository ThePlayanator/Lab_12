package q7_w12;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Readrainfall {

	   public static void main(String[] args) {
		   
	        try {
	        	
	        	String sourceFile = "rainfall_data.txt";
	        	String line;
	        	
	            FileReader fileReader = new FileReader(sourceFile);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }

	            bufferedReader.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}