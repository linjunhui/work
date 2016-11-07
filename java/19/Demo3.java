import java.io.File;
import java.io.IOException;

/*
	创建：
		createNewFile()在指定位置创建一空文件， 成功返回true，如果已经存在就不创建然后返回false
		mkdir() 在指定位置创建目录，这只会创建路径最后一级目录，如果上级目录不存在就会会抛出异常
		mkdir() 在指定位置创建目录，这只会创建目录中所有不存在的目录
		rename(File dest) 重命名文件或者文件夹，也可以操作非空的文件夹，文件不同时相当于文件的剪切，剪切时候不能操作非空的文件夹。
			移动/重命名成功返回true， 失败返回false
*/


public	class Demo3 {
	 public static void main(String[] args) throws IOException{
	 	File file = new File("a.txt");
	 	System.out.println("创建成功了吗？" + file.createNewFile());

	 	File dir = new File("../newdir");
	 	System.out.println("文件夹创建成功吗？" + dir.mkdir());

	 	File destFile = new File("./aaaaa");
	 	System.out.println("重命名成功吗？" + file.renameTo(destFile));
	 }
}