package cn.jonson.proxy2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyBoss {
	
	/*
	 * 对接口方法进行代理
	 */
	@SuppressWarnings("unchecked")
	public static <T> T getProxy(final int discount, final Class<?> interfaceClass, final Class<?> implementsClass) {
		return (T) Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[] {interfaceClass}, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				// TODO Auto-generated method stub
				Integer resultValue = (Integer)method.invoke(implementsClass.newInstance(), args);
				return resultValue - discount;
			}
		});
		
	}
}
