package cn.jonson.sb;

/*
	字符串特点: 字符串是常量，它们在创建之后不能修改
	字符串的内容一旦发生变化，那么马上会创建一个新的对象
	注意：字符串不宜频繁的修改，因为一旦修改马上就会创建一个新的对象
	如果需要频繁的修改过字符串的内容建议使用StringBuffer 字符串缓冲类

	StringBuffer 就是一个存储字符的容器
*/

public class Demo1 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1 + "world";
		System.out.println("str1与str2是同一个对象吗？"+(str1 == str2));
		
	}
}