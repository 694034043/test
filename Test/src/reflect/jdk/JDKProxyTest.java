package reflect.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import reflect.HelloWorld;
import reflect.HelloWorldImpl;

public class JDKProxyTest implements InvocationHandler {
	
	private Object target = null;
	
	public Object bind(Object target) {
		this.target = target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("before proxy...");
		Object obj = method.invoke(target, args);
		System.out.println("after proxy...");
		return obj;
	}
	
	public static void main(String[] args) {
		JDKProxyTest jdk = new JDKProxyTest();
		HelloWorld proxy = (HelloWorld) jdk.bind(new HelloWorldImpl());
		proxy.sayHello();
	}

}
