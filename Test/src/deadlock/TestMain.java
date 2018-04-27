package deadlock;

public class TestMain {

	public static void main(String[] args) {
		String a = "a";
		String b = "b";
		
		new Thread(new ExcuteThread(a, b)).start();
		new Thread(new ExcuteThread2(a, b)).start();
	}

}
