package buyticket;

public class Station {
	
	public static int ticketLeft = 100;
	
	public synchronized int saleTicket(BuyThread b) {
		if (ticketLeft == 0) {
			System.out.println("车站票已卖完！" + b.getName());
		} else {
			System.out.println("车站出售第" + ticketLeft-- + "张票给" + b.getName());
		}
		return ticketLeft;
	}
}
