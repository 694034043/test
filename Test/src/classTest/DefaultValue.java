package classTest;

import java.util.Date;
import java.util.Properties;

public class DefaultValue {

	static {
		System.out.println(1);
	}
	static {
		System.out.println(2);
	}
	byte b;
	char c;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("-----Memory usage:");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = " + rt.totalMemory() + " Free Memory = " + rt.freeMemory());
//		DefaultValue dv = new DefaultValue();
//		System.out.println(dv.b);
//		System.out.println(dv.c);
//		System.out.println(dv.s);
//		System.out.println(dv.i);
//		System.out.println(dv.l);
//		System.out.println(dv.f);
//		System.out.println(dv.d);
//		System.out.println(dv.bool);
	}
	static {
		System.out.println(3);
	}
}
