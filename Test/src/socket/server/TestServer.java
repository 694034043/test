package socket.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TestServer {
	
	public void startServer(int port) throws IOException {
		ServerSocket server = new ServerSocket(port);
		Socket client = server.accept();
		while (true) {
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
