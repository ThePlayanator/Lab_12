package q6_w12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadRainfall {

	public static void main(String[]args)
	{
		try {
		String fName = "rainfall_input.txt";
		DataInputStream inStream = new DataInputStream(new FileInputStream(fName));
		
		int stationCount = 0;
		int districtCount = 0;
		
		int [] totalrain = new int[6];
		int [] stationRaincount = new int[6];
		
		// Reading data for each station
		while (inStream.available()>0)
		{
			String stationID = inStream.readUTF();
			String stationName = inStream.readUTF();
			String districtName = inStream.readUTF();
			
			// Read rainfall readings
			System.out.println("Rainfall readings : ");
			
			int stationTotalRainfall = 0;
			for (int i=0;i<6;i++)
			{
				int data = inStream.readInt();
				stationTotalRainfall += data;
				totalrain[i] += data;
				stationRaincount[i] ++ ;
				
				System.out.println("Day"+(i+1)+": "+data);
			}
			
			int avgStation = stationTotalRainfall/6;
			System.out.println("Average rainfall : "+ avgStation+"\n");
			stationCount++;
			districtCount++;
			
		}
		
		inStream.close();
		
		System.out.println("Number of stations : "+ stationCount);
		System.out.println("Number of districts: " + districtCount);
		System.out.println("Average rainfall for each day: ");
		for(int i=0;i<6;i++)
		{
			int avg = totalrain[i] / (int) stationRaincount[i];
			System.out.println("Day "+(i+1)+": "+avg);
		}
	} catch (IOException e) {
		e.printStackTrace();
	}
	}
}
