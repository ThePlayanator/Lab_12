package q6_w12;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateRainfall {
	
	public static void main(String[]args)
	{
		// Declare file name
		String fName = "rainfall_input.txt";
		
		// List data in array
		String[][] raindata = {
				{"2421003", "Simpang Ampat", "Alor Gajah", "4", "1", "0", "6", "19", "1"},
				{"2322006", "Melaka Pindah", "Alor Gajah", "0", "0", "0", "2", "18", "2"},
				{"2324033", "Hospital Jasin", "Jasin", "0", "14", "0", "11", "15", "31"},
				{"2125002", "Telok Rimba", "Jasin", "0", "1", "1", "69", "53", "4"},
				{"2223023", "Sg. Duyong", "Melaka Tengah", "0", "3", "0", "43", "26", "26"},
				{"2223033", "Batu Hampar", "Melaka Tengah", "0", "2", "0", "30", "11", "22"}
				};
		
		// Create an output stream
		try (DataOutputStream outStream = new DataOutputStream(new FileOutputStream(fName))){
			
			// Insert data into file
			for (String[] data: raindata)
			{
				String StationID = data[0];
				String StationName = data[1];
				String District = data[2];
				String[] rains = {data[3],data[4],data[5],data[6],data[7],data[8]};
				
				outStream.writeUTF(StationID);
				outStream.writeUTF(StationName);
				outStream.writeUTF(District);
				
				// Writes rain data into file
				for (String writedata : rains)
				{
					outStream.writeInt(Integer.parseInt(writedata));
				}
			}
			
			// Clears buffer
			outStream.flush();
			
			// Close file
			outStream.close();
			
			// Prompt message if it succeeds
			System.out.println("Rainfall data successfully written in the file "+fName);
		} catch (IOException e)
		{
			System.out.println("Error occurred when writing data into file" + e.getMessage());
		}
	}

}
