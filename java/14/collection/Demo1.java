package cn.jonson.collection;

/*
	数组：存储同一种数据类型的  数据
	数组的特点：
	1.只能存储同一种数据类型的数据
	2.一旦初始化，长度固定
	3.数组中的元素与元素间的内存地址是连续的

	注意：Object类型的数组可以存储任意类型的数据

	需求：收集班级同学的兴趣爱好

	存储
*/

public class Demo1 {
	public static void main(String[] args) {
		Object[] arr = new Object[10];
		arr[1] = "abc";
		arr[2] = 'a';
		arr[3] = 3;
	}
}