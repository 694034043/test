package buyticket;

public class TestMain {

	public static void main(String[] args) {
		Station s = new Station();
		BuyThread bt1 = new BuyThread("黄牛", s);
		BuyThread bt2 = new BuyThread("学生", s);
		BuyThread bt3 = new BuyThread("打工仔", s);
		Thread t1 = new Thread(bt1);
		Thread t2 = new Thread(bt2);
		Thread t3 = new Thread(bt3);
		t1.start();
		t2.start();
		t3.start();
		
	}

}
