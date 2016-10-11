/*
打包jar 
打包格式：
	jar cvf jar文件名 class文件夹或者文件

打包jar注意事项：
	1. 打包jar之后必须要在清单文件上指定入口类：
		Main-Class: 包名.类名
	2. 要能够双击执行，只对图形化程序起作用
*/

package qq; 
import javax.swing.*;

class Demo11 {
	public static void main(String[] args) {
		System.out.println("QQ程序");
		JFrame frame = new JFrame("QQ程序");
		frame.setSize(400, 500);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}