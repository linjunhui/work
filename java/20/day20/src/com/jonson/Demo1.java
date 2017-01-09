package com.jonson;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//readTest1();
		readTest2();
		//readTest3();
		readTest4();
	}
	
	//缓冲数组的大小一般是1024的倍数，理论上缓冲数组越大效率越高
	
	//方式4，使用缓冲数组配合循环
	public static void readTest4() throws IOException {
		File file = new File("/Users/lin/Desktop/1.png");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		long startTime = System.currentTimeMillis();
		 
		//建立缓冲数组配合循环读取文件的数据
		int length = 0;
		byte[] buf = new byte[4];
		//当没有数据可读时返回-1
		while((length = fileInputStream.read(buf)) != -1) {
			System.out.println(new String(buf, 0, length));
		}
		long endTime = System.currentTimeMillis();
		fileInputStream.close();
		System.out.println("读取的时间是:" + (endTime - startTime));
	}
	
	//方式3：使用缓冲数组读取
	//无法读取文件完整的字节，受限于byte数组大大小
	public static void readTest3() throws IOException {
		File file = new File("/Users/lin/Desktop/1.png");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//建立缓冲字节数组，读取文件的数据
		byte[] buf = new byte[1024];
		//返回值：读取了多少个字节到缓冲数组中
		int length = fileInputStream.read(buf); //数据已经读取到了byte数组中了
		
		String str = new String(buf);//使用平台默认的字符集 解码指定的byte数组
		String str1 = new String(buf, 0, length);
		System.out.println("内容长度：" + length);

		//System.out.println("内容是：" + str);
		System.out.println("内容是：" + str1);
	}
	
	
	public static void readTest2() throws IOException {
		File file = new File("/Users/lin/Desktop/1.png");
		FileInputStream fileInputStream = new FileInputStream(file);
		
		long startTime = System.currentTimeMillis();
		
		int content;
		while((content = fileInputStream.read()) != -1) 
			System.out.print((char)content);
		fileInputStream.close();
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("读取的时间是:" + (endTime - startTime));
	}
	
	//无法读取完整的一个文件数据，只能读取一个字节
	public static void readTest1() throws IOException {
		File file = new File("/Users/lin/work/java/20/a.txt");
		//建立数据输入的通道
		FileInputStream fileInputStream = new FileInputStream(file);
		
		//读取文件中的数据
		int content = fileInputStream.read();
		
		System.out.println("读到内容：" + content);
		//关闭资源
		fileInputStream.close();
	}
}
 