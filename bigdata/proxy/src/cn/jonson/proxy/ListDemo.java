package cn.jonson.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List list = new ArrayList();
		
		Object oo = Proxy.newProxyInstance(list.getClass().getClassLoader(), list.getClass().getInterfaces(), new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				System.err.println("加入一个对象...");
				Object resultValue = method.invoke(list, args);
				System.err.println("对象加入完成...");
//				if(method.getName().equals("size")) {
//					return 100;
//				}
				return resultValue;
			}
		});
		
		List list2 = (List)oo;
		list2.add("aaaa");
		
		System.err.println("size:" + list2.size() + "," + list.size());
	}

}
