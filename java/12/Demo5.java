package cn.jonson.string;

/*
	String 的构造方法：
		String() 创建一个空内容的字符串对象；
		String(byte[] bytes) 使用一个字节数组创建一个字符串对象
		String(byte[] bytes, int offset, int length)
			bytes要解码的数组
			offset 指定数组从 数组的 哪个索引开始解码
			length	要解码多个元素

		String(char[] value) 使用一个字符数组构建一个字符串
		String(char[] value, int offset, int count) 使用一个字符串数组构建一个字符串，指定开始的索引，与使用的字符个数
		String(int[] codePoints, int offset, int count)
		String(String original)

		记住： 使用字节数组或者字符数组都可以创建一个字符串对象

*/

public class Demo5 {
	public static void main(String[] args) {
		String str = new String();
		byte[] buf = {97, 98, 99};

		str = new String(buf);
		System.out.println("字符串的内容：" + str);
		str = new String(buf, 1, 2);
		char[] arr = {'你', '好', '啊'};
		System.out.println("字符串的内容：" + str);

		str = new String(arr); //使用字符数组构建一个字符串
		System.out.println("字符串的内容：" + str);
		str = new String(arr, 1, 2);
		System.out.println("字符串的内容：" + str);

		int[] buf2 = {65, 66, 67};
		str = new String(buf2, 0, 3);
		str = new String("abc");
		System.out.println("字符串的内容：" + str);
	}
}
