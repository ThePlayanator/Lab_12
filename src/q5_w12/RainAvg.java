package q5_w12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class RainAvg {
	
	private int avg=0;
	private int total=0;
	private int day =6;
	private String fName;
	
	public RainAvg(String fName)
	{
		this.fName=fName;
	}
	
	public void calcAvg()
	{
		/*
		 * Read data from file
		 * Calculate total and average
		 */
		
		try (DataInputStream inStream = new DataInputStream(new FileInputStream(fName)))
		{
			for (int i=0;i<day;i++)
			{
				int rain= inStream.readInt();
				// Calculate total rainfall
				total += rain;
			}
			
			// Close stream
			inStream.close();
			
			// Calculate average rainfall
			avg = total/6;
			System.out.println("Average rainfall for the week is : "+avg+ " mm \n");
		} catch (IOException e)
		{
			// Prompt message if error occurred
			System.out.println("Error occurred while reading data" + e.getMessage());
			
		}
	}
}
