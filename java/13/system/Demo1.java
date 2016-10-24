package cn.jonson.lin;

import java.util.Arrays;
import java.util.Properties;

/*
	System 系统类 主要用于获取系统属性的数据

	System类常用的方法：
		arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
			src - 数据源
			srcPods - 源数组中的起始位置
			dest - 目标数组
			destPos - 目标数组的起始位置

	currentTimeMillis() 获取当前系统时间
	exit(int status) 退出jvm 参数是0 表示正常退出，非0表示异常退出

	gc() 建议jvm赶快启动垃圾回收
	getenv(String name) 根据环境变量的名字获取环境变量
	getProperty(key)

	finalize() 如果一个对象被垃圾回收的时候，会先调用对象的finalize方法
*/

class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.name + "被回收了...");
	}
}

public class Demo1 {
	public static void main(String[] args) {
		int[] srcArr = {10, 12, 14, 16, 19};
		//把数组srcArr的数组元素拷贝到 destArr数组中
		int[] destArr = new int[4];

		System.arraycopy(srcArr, 1, destArr, 0, 4);
		System.out.println("目标数组的元素：" + Arrays.toString(destArr));
		System.out.println("当前的系统时间：" + System.currentTimeMillis());
		System.out.println("环境变量： " + System.getenv("JAVA_HOME"));

		for (int i = 0; i<4 ; i++) {
			new Person("狗娃" + i);
			System.gc();//建议马上启动垃圾回收期
		}

		Properties properties = System.getProperties(); //获取系统的所有属性
		properties.list(System.out);

		String value = System.getProperty("os.name");
		System.out.println("当前系统:" + value);
	}
}