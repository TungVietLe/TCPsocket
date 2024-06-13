import java.net.*;
import java.io.*;
import java.util.*;

public class Client {

	public static void main(String[] args)
	{
		try {
			Socket client = new Socket("localhost", 5000);
			System.out.println("Client is connected");
			
			//read data from server
			BufferedReader reader = new BufferedReader(new InputStreamReader(client.getInputStream()));
			while(true) {
				String data = reader.readLine();
				System.out.println("Data from server: " + data);
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
