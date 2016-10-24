package cn.jonson.string;

import java.util.Arrays;

/*
	其它方法：
		String replace(String oldChar, String newChar) 替换
		String[] split(String regex) 切割

		String substring(int beginIndex)	;从指定索引截取子串
		String substring(int beginIndex, int endIndex)

		String toUpperCase() 转大写
		String toLowerCase() 转小写
		String trim() 去除字符串 首尾 的 空格
*/

public class Demo8 {
	public static void main(String[] args) {
		String str = "今天晚上不考试";
		System.out.println("指定新内容替换旧的内容：" + str.replace("不", "要"));
		str = "大家-早-上-好";
		String[] arr = str.split("-");
		System.out.println("字符串数组的内容：" + Arrays.toString(arr));

		str = "jonson+林俊晖";
		System.out.println("指定开始的索引值截取子串：" + str.substring(7));
		System.out.println("指定子串:" + str.substring(0, 6));

		str = "abc中国";
		System.out.println("转大写：" + str.toUpperCase());
		str = "ABCFH";
		System.out.println("转小写：" + str.toLowerCase());

		str = "         大家             最近     ";
		System.out.println("去除首尾的空格：" + str.trim());
	}
}