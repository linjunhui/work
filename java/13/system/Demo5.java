package cn.jonson.lin;

import java.util.Random;

/*
	随机数类
	Random

	需求：编写一个函数产生随机的四位验证码

*/

public class Demo5 {
	public static void main(String[] args) {
		// Random random = new Random();
		// int randomNum = random.nextInt(10) + 1;
		// System.out.println("随机数：" + randomNum);

		char[] arr = {'中', '国', '龙', 'a', 's', 'd', 'f'};
		StringBuffer sb = new StringBuffer();
		Random random = new Random();

		for (int i = 0; i < 4 ; i++) {
			int index = random.nextInt(arr.length);
			sb.append(arr[index]);
		}
		System.out.println("验证码：" + sb);
	}
}