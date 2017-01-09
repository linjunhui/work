package cn.jonson.proxy;

import java.lang.reflect.Proxy;

import org.junit.Test;

public class PersonTest {
	@Test
	public void test() {
		
		//2.实现了具有一定服务方法的所有接口 PersonDaoImpl()
		//3.创建被代理类的实例
		// 元对象  被代理对象
		PersonDao pDao = new PersonDaoImpl();
		
		//将委托类传给 代理处理处理器 
		//返回一个指定接口的代理类实例，该接口可以将方法调用指派到指定的调用处理程序
		PersonHandler handler = new PersonHandler(pDao);//代理实例的调用处理程序
		/*1.加载被代理类
		 *
		 * 
		 * 4.返回被代理类的实例
		 * 5.获得类加载器 pDao.getClass().getClassLoader()
		 * 6.返回类加载器
		 * 7.获得已实现的所有接口
		 */
		/*
		 * 首先创建委托类对象，将其以构造函数传入代理处理器，
		 * 代理处理器ProxyHandler中会以Java反射方式调用该委托类对应的方法。
		 * 然后使用Java反射机制中的Proxy.newProxyInstance方式创建一个代理类实例，
		 * 创建该实例需要指定该实例的类加载器，需要实现的接口(即目标接口)，
		 * 以及处理代理实例接口调用的处理器。
		 * 最后，调用代理类目标接口方法时，会自动将其转发到代理处理器中的invoke方法内，
		 * invoke方法内部实现预处理，对委托类方法调用，事后处理等逻辑。
		 */
		PersonDao proxy = (PersonDao)Proxy.newProxyInstance(pDao.getClass().getClassLoader(), pDao.getClass().getInterfaces(), handler);
		proxy.say();
	}
}
