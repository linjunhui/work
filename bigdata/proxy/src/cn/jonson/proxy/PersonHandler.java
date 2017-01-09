package cn.jonson.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//代理处理器
/*
 * 
 */
public class PersonHandler implements InvocationHandler {
	
	private Object obj;
	
	public PersonHandler(Object obj) {
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	/*
	 * 传入   代理的对象， 代理对象的方法方法，方法的参数列表
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("berfore");
		//普通的Java反射代码，通过反射执行类的方法
		Object result = method.invoke(obj, args);
		System.out.println("after");
		return result;
	}

}
