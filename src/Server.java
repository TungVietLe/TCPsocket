import java.net.*;
import java.io.*;
import java.util.*;

public class Server {

	public static void main(String[] args)
	{
		try {
			ServerSocket ss = new ServerSocket(5000);
			System.out.println("Waiting for client");
			Socket server = ss.accept();
			System.out.println("Server is connected");
			
			//send data from server to client
			Scanner scanner = new Scanner(System.in);
			PrintWriter writer = new PrintWriter(server.getOutputStream());
			while (true) {
				System.out.print("Data server to client: ");
				String data = scanner.nextLine();
				writer.println(data);
				writer.flush();
			}
			
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
