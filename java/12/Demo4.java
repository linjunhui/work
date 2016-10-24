package cn.jonson.string;
/*
	String 字符串类：
	笔试题目：new String("abc"); 创建了几个对象
	两个对象，一个对象是位于字符串常量池中，一个对象位于堆内存中
*/

public class Demo4 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("str1==str2? "+(str1==str2));
		System.out.println("str2==str3? "+(str2==str3));
		System.out.println("str3==str4? "+(str3==str4));
		System.out.println("str3.equals(str4)"+ str3.equals(str4));

		//本来 equals == 比较的都是对象的地址，String重写了equals方法比较的是字符串的内容
	}
}