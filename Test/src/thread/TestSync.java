package thread;

public class TestSync {

	public synchronized void printA() {
		System.out.println("A");
	}
	
	public synchronized void printB() {
		System.out.println("B");
	}
	
}
