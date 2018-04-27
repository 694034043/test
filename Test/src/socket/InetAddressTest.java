package socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			InetAddress address = InetAddress.getLocalHost();
			System.out.println(address.getHostName());
			System.out.println(address.getHostName());
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
