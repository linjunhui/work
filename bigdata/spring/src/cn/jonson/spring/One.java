package cn.jonson.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class One implements ApplicationContextAware, InitializingBean{
	
	public One(String one) {
		System.out.println(one);
	}

	/*
	 * 设置应用的上下文，可以加载一些初始化的设置，如设置成员变量等
	 * (non-Javadoc)
	 * @see org.springframework.context.ApplicationContextAware#setApplicationContext(org.springframework.context.ApplicationContext)
	 */
	@Override
	public void setApplicationContext(ApplicationContext arg0)
			throws BeansException {
			System.out.println("setApplicationContext");
	}
	/*
	 * 设置完成后调用
	 * (non-Javadoc)
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");
	}

}
