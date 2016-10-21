/*
包：
java中的包就相当于Windows的文件夹

包的作用：
	1.解决类名重复产生冲突的问题
	2.便于软件版本的发布

定义包的格式：
	package 包名；

包名命名规范：包名全部小写

包语句要注意的事项：
	1.package语句必须位于java文件中的第一个语句
	2.如果一个类加上了包语句，那么该类的完整类名就是：包名.类名
	3.一个java文件只能有一个包语句

问题： 每次编译的时候都需自己创建文件夹，把对应的class文件存储到 文件夹中

	javac -d 指定类文件的存放路径 java源文件

*/
// javac -d . Demo1.java 会在当前目录创建包，并存入.class 文件
package aa;
class Demo1 {
	public static void main(String[] args) {
		System.out.println("这是Demo的main方法");
	}
}