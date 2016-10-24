package cn.jonson.lin;
/*
 Math 数学类， 主要提供了， 很多的数学公式

 abs(double a) 获取绝对值
 ceil(double a) 向上取整
 floor(double a) 向下取整
 round(float a) 四舍五入
 random() 产生一个随机数，大于0.0 切小于 1.0 的伪随机 double

*/

 public class Demo4 {
 	public static void main(String[] args) {
 		System.out.println("绝对值：" + Math.abs(-3));
 		System.out.println("向上取整：" + Math.ceil(3.14));
 		System.out.println("向下取整：" + Math.floor(-3.14));
 		System.out.println("四舍五入：" + Math.round(3.54));
 		System.out.println("随机数：" + Math.random());
 	}
 }