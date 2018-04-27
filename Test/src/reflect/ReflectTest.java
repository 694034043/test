package reflect;

import java.lang.reflect.Method;

public class ReflectTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		ReflectTest a = (ReflectTest) Class.forName("reflect.ReflectTest").newInstance();
		Method m = a.getClass().getMethod("print", String.class);
		m.invoke(a, "Hello");
	}
		
	public void print(String s) {
		System.out.println(s);
	}

}
