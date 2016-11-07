import	java.io.BufferedInputStream;
import 	java.io.BufferedOutputStream;
import	java.io.File;
import 	java.io.FileInputStream;
import 	java.io.FileOutputStream;
import 	java.io.IOException;

/*
我们清楚 读取数据使用缓冲数组读取效率更高，sun 也知道使用缓冲数组读取效率更高
那么，sun就给我们提供了一个 -----> 缓冲输入自己流对象,让我们更高效率的读取文件

输入字节流体系：
------|	InputStream 	输入字节流的基类。抽象
----------|		FileInputStream 读取文件数据的输入字节流
----------|		BufferedInputStream	缓冲输入字节流    缓冲输入字节流的出现主要是为了提高读取文件数据的效率。
其实该类内部只不过是维护了一个8kb的字节数组而已。

注意：凡是缓冲流都不具备读写文件的能力


使用BufferedInputStream的步骤：
	1.找到目标文件
	2.建立 数据的 输入通道
	3.建立缓冲 输入字节流流
	4.关闭资源


*/

public class Demo1 {
	//找到目标
	File file = new File(".");

	FileInputStream fileInputStream = new FileInputStream();
	BufferedInputStream bufferedOutputStream = new BufferedInputStream();
	bufferedOutputStream.read();

	FileOutputStream fileOutputStream = new FileOutputStream(bufferedOutputStream);
}