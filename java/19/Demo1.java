import java.io.File;
/*
	IO流(Input Output)
	IO技术的主要作用是解决设备与设备之间的 数据传输问题。比如 硬盘--->内存 内存的数据---->硬盘

	IO技术的应用场景：
		导出报表， 上传照片， 下载、 解析xml文件

	数据保存到硬盘上，该数据就可以做到永久性保存。 数据一般是以文件的形式保存到硬盘上

	sun 使用了一个File类描述了文件或者文件夹
	File类可以描述一个文件或者文件夹

	File类的构造方法：
		File(String pathname) 指定文件或者文件夹的路径创建一个File文件
		File(File parent, String child) 根据parent抽象路径名 和 child 路径名字字符串创建一个新的File实例
		File(String parent, String child)

	目录分隔符： 在windows机器上的 目录分隔符是  \, 在linux机器上目录分隔符是/ .

	注意： 在windows 上  \ 与 / 都可以用作目录分隔符， 而且， 如果写 / 的时候只需要写一个即可

*/

public class Demo1 {
	public static void main(String[] args) {
		File file = new File("./a.txt");

	}
}