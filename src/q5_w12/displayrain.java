package q5_w12;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class displayrain {

	private String fname;
	
	public displayrain(String fname)
	{
		this.fname=fname;
	}

	public void displayRainData()
	{
		// Declare input stream object and get data from source of input
		try (DataInputStream inStream = new DataInputStream(new FileInputStream(fname)))
		{
			System.out.println("\n Rainfall Data : ");
			System.out.println("==================");
			
			// Read values in array from the stream
			for (int i=0; i<6; i++)
			{
				int rain = inStream.readInt();
				System.out.println("Day "+(i+1)+": "+rain+" mm ");
			}
			
			// Close stream 
			inStream.close();
			System.out.println("\n");
			
		} catch(IOException e) {
			// Prompt message if error occurred
			System.out.println("An error occured when reading the data");
		}
	}
}
