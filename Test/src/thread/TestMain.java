package thread;

public class TestMain {

	private static TestSync ts = new TestSync();
	
	public static void main(String[] args) {
		TestThread t = new TestThread(ts);
		TestThread2 t2 = new TestThread2(ts);
		new Thread(t).start();
		new Thread(t2).start();
		Thread dameonT = new Thread(new DameonThread());
		dameonT.setDaemon(true);
		dameonT.start();
	}

}

class TestFriendly {}
