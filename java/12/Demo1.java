package cn.jonson.stringbuffer;

/*
字符串特点：字符串是常量；它们的值在创建后不能更改

字符串的内容一旦发生了变化，那么马上会创建一个新的字符串
注意： 字符串的内容不宜频繁的修改，因为一旦修改马上就会创建一个新的字符串
如果需要频繁的修改字符串的内容， 建议使用 字符串缓冲 类

StringBuffer 其实就是一个 存储 字符 的容器
*/

public class Demo1 {
	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = str1 + " world";
		System.out.println("str1 与 str2 是同一个 对象吗？" + (str1==str2));
	}
}