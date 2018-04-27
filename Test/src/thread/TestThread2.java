package thread;

public class TestThread2 implements Runnable {
	
	private TestSync t;
	
	public TestThread2(TestSync t) {
		this.t = t;
	}

	@Override
	public void run() {
		t.printB();
	}
	
}
