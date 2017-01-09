package cn.jonson.proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyPerson {
	public static void main(String[] args) {
		final MyPerson p = new MyPerson();
		
		PersonInterface proxy = (PersonInterface) Proxy.newProxyInstance(MyPerson.class.getClassLoader(), MyPerson.class.getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("proxy is coming ....");
				
				if (method.getName().equals("saySomeThing")) {
					System.out.println("say some thing is special handler ...");
					p.saySomeThing();
					
				} else {
					Object invoke = method.invoke(p, args);
					System.out.println("proxy is leaving....");
				}
				return null;
			}
		});
		
		proxy.doSomeThing();
		proxy.saySomeThing();
	}
	
}
