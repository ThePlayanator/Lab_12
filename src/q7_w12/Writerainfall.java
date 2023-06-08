package q7_w12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writerainfall {

	public static void main(String[] args) {
        
		try {
        	
			String sourceFile = "rainfall_data.txt";
			
            FileWriter fileWriter = new FileWriter(sourceFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            // Writing data for Station Simpang Ampat in Alor Gajah district
            printWriter.println("Station ID: 2421003");
            printWriter.println("Station Name: Simpang Ampat");
            printWriter.println("District: Alor Gajah");
            printWriter.println("Rainfall Readings:");

            // Sample data for 6 days of rainfall
            int[] rainfallReadings = {5, 0, 0, 4, 1, 0};

            for (int i = 0; i < rainfallReadings.length; i++) {
                
            	printWriter.println("Day " + (i + 1) + ": " + rainfallReadings[i]);
            
            }

            printWriter.close();
            
            System.out.println("Data creation has ended.");
       
		} catch (IOException e) {
            e.printStackTrace();
        }
    }
}