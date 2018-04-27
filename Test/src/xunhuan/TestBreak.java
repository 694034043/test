package xunhuan;

public class TestBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer: 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 2) {
					break outer;
				} else {
					System.out.println(j);
				}
			}
		}
	}
	
}
