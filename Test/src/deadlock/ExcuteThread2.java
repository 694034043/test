package deadlock;

public class ExcuteThread2 implements Runnable {

	private String a;
	private String b;
	
	public ExcuteThread2(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		ResourceClass.methodB(a, b);
	}
}
