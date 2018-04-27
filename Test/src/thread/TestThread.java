package thread;

public class TestThread implements Runnable {
	
	private TestSync t;
	
	public TestThread(TestSync t) {
		this.t = t;
	}
	
	@Override
	public void run() {
		t.printA();
	}
	
}
