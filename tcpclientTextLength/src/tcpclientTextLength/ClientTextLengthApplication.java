package tcpclientTextLength;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * This method launch the frame and manage the connection to the server.
 * 
 * @author WongKakLok
 *
 */

public class ClientTextLengthApplication {
	
	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		
		// Launch client-side frame
		ClientTextLengthFrame clientTextLengthFrame = new ClientTextLengthFrame();
		clientTextLengthFrame.setVisible(true);
		
		// Connect to the server @ localhost, port 4228
		Socket socket = new Socket(InetAddress.getLocalHost(), 4228);
		
		// Update the status of the connection
		clientTextLengthFrame.updateConnectionStatus(socket.isConnected());
		
		// Read from network
		DataInputStream dis = new DataInputStream(socket.getInputStream());
		
		// Display the word length
		int textLength = dis.readInt();
		clientTextLengthFrame.readTextLength(textLength);
		
		// Close everything
		dis.close();
		socket.close();

	}
}
