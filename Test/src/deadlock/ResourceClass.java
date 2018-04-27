package deadlock;

public class ResourceClass {
	
	static void methodA(String a, String b) {

		synchronized (a) {
			System.out.println("MethodA use a");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (b) {
				System.out.println("MethodA use b");
			}
		}
		
	}
	static void methodB(String a, String b) {
		synchronized (b) {
			System.out.println("MethodB use b");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			synchronized (a) {
				System.out.println("MethodB use a");
			}
		}
	}
	
}
