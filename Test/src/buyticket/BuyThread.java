package buyticket;

public class BuyThread implements Runnable {
	
	private String name;
	private Station station;

	public BuyThread(String name, Station station) {
		this.name = name;
		this.station = station;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public void run() {
		while (true) {
			int i = station.saleTicket(this);
			if (i <= 0) {
				break;
			}
		}
	}

}
