package cn.jonson.string;

import java.util.Arrays;

/*
字符串的判断方法：
	boolean endsWith(String str) 是否以指定的字符串结束
	boolean isEmpty() 长度是否为 0， 如"", null
	boolean contains(CharSequences) 是否包含指定序列 应用：搜索
	boolean equals(Object anObject) 是否相等

字符串的判断方法：
	char[] toCharArray()  将字符串转为字符数组
	byte[] getBytes()	字节数组与字符数组、字符串他们三者之间是可以相互转换的

*/

public class Demo7 {
	public static void main(String[] args) {
		String str = "Demo.java";
		System.out.println("是否已指定的字符串结束" + str.endsWith("java"));
		System.out.println("判断字符串是否为空：" + str.isEmpty());
		System.out.println("判断两个字符串内容是否相同：" + "Demo.java".equals(str));
		System.out.println("判断两个字符串内容是否一样：（忽略大小写）" + "DEMO.java".equalsIgnoreCase(str));


		//转换方法
		char[] buf = str.toCharArray(); // 把字符串转换成字符串数组
		System.out.println("字符数组：" + Arrays.toString(buf));
		byte[] buf2 = str.getBytes(); //把字符串转成字节数组
		System.out.println("字节数组：" + Arrays.toString(buf2));
	}
}