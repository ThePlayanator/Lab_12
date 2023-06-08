package q5_w12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Rainfall {

	public static void main(String[]args) {
		
		// Creates new file.
		String fname = "rainfalldata.txt";
		
		// List of data in array
		int raindata[] = {4,1,0,6,19,1};
		
		// Create an output stream 
		try (DataOutputStream outstream = new DataOutputStream(new FileOutputStream(fname)))
		{
			// Insert data into file
			for (int rainfall : raindata)
			{
				outstream.writeInt(rainfall);
			}
			
			// Clear any buffers
			outstream.flush();
			
			// Close the file
			outstream.close();
			
			// Prompt the end of program when succeed
			System.out.println("Data of rainfall has been written into the file " + fname);
		
		} catch (IOException e) {
			// Prompt message if error occurred
			System.out.println("Error occured when writing data into file" + e.getMessage());
		}
		
		/*
		 * Use displayRainData method in displayrain class to display the data.
		 */
		displayrain display = new displayrain("rainfalldata.txt");
		display.displayRainData();
		
		/*
		 * Use calcAvg method in RainAvg class to calculate average rainfall.
		 */
		RainAvg average = new RainAvg("rainfalldata.txt");
		average.calcAvg();
	}
}
