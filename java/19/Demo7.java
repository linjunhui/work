import java.io.File;
import java.io.FilenameFilter;

/*
需求1: 指定一个文件夹，然后列出该文件夹下的所有java文件

需求2: 指定一个文件夹，然后列出文件夹下面的所有子文件与文件夹，但格式如下：
文件： 
	文件名1
	文件名2
	文件名3
	..

文件夹： 
	文件夹名1
	文件夹名2
	文件夹名3
	...


	listFiles(FilenameFilter filter)	返回当前目录符合过滤条件的子文件和子目录，对文件操作会返回null
	list(FileNameFilter filter)	返回当前目录符合过滤条件的子文件和子目录，对文件操作会返回null

*/

// 自定义一个文件名过滤器
class MyFilter implements FilenameFilter {
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(".java");
	}
}

public class Demo7 {
	public static void main(String[] args) {
		File dir = new File(".");

	}

	//列出所有的java文件
	public static void listJava(File dir) {
		File[]	files = dir.listFiles(); //获取到了所有子文件
		for (File file : files) {
			String fileName = files.getName();
		}
	}
}