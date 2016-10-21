/*
11. 目前有数组 int[] arr = {11, 2, 4, 2, 10, 11},
定义一个函数清除该数组的重复元素，返回的数组存储了那些非重复的元素而且数组不许浪费长度

分析：
	1.确定新数组的长度
	2.原数组的长度 - 重复的个数

*/

import java.util.*;
class Demo12 {
	public static void main(String[] args) {
		int[] arr = {11, 2, 4, 2, 19, 11};
		arr = clearRepeat(arr);
		System.out.println("清除重复元素的数组：" + Arrays.toString(arr));

	}

	public static int[] clearRepeat(int[] arr) {
		//先计算重复元素的个数
		int count = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j<arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}

		int newLength = arr.length - count;
		int[] newArr = new int[newLength];

		int index = 0;

		for(int i = 0; i<arr.length; i++) {
			int temp = arr[i];
			boolean flag = false;

			//拿旧数组的元素 与 新数组的元素 每个比较一次
			//如果数在 新数组中出现了标记为true
			for (int j = 0; j<newArr.length; j++) {
				if (temp == newArr[j]) {
					flag = true;
					break;
				}
			}
			// 标记为false说明，该数没有在新数组中出现，存入新数组
			if (flag == false) {
				newArr[index++] = temp;
			}
		}

		return newArr;
	}
}