package cn.jonson.lin;

import java.io.IOException;
import javax.management.RuntimeErrorException;

/*
RunTime 	该类主要代表了应用程序的运行环境
	getRuntime()	返回当前应用程序的运行环境对象
	exec(String command) 根据指定的路径执行对应的可执行文件
	freeMemory() 返回java 虚拟机中的空闲内存量 以字节为单位
	maxMemory()  返回java虚拟机试图使用的最大内存
	totalMemory() 返回java 虚拟机中的内存总量
*/

public class Demo2 {
	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();

		Process process = runtime.exec("/bin/ls -a");
		Thread.sleep(3000);
		process.destroy();

		System.out.println(" Java虚拟机中的空闲内存量：" + runtime.freeMemory());
	}
}