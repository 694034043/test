package deadlock;

public class ExcuteThread implements Runnable {

	private String a;
	private String b;
	
	public ExcuteThread(String a, String b) {
		super();
		this.a = a;
		this.b = b;
	}

	@Override
	public void run() {
		ResourceClass.methodA(a, b);
	}

}
