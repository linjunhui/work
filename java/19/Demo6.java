import java.io.File;

/*
	文件夹相关：
		static File[] listRoots() 列出所有的根目录（windows就是所有的系统盘符)
		list()	返回目录下的文件或者目录名，包含隐藏文件。对于文件这样操作会返回null
		listFiles()		返回目录下的文件或者目录对象(File 类实例)，包含隐藏文件。对于文件这样操作会返回null

		list(FilenameFilter filter) 返回当前目录中符合过滤条件的子文件或子目录。对于文件这样操作会返回null
		listfiles(FilenameFilter filter)	返回指定当前目录中符合过滤条件的子目录或子文件，对于文件这样操作会返回null


*/

public class Demo6 {
	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for (File file : roots) {
			System.out.println(file);
		}

		File file = new File("/Users/lin/work/");
		String[] fileNames = file.list(); //把文件夹下面的所有子文件与子文件夹名存储到一个String[] 中
		for (String fileName : fileNames) {
			System.out.println(fileName);
		}

		File[] files = file.listFiles();
		for (File fileItem : files) {
			System.out.println("文件名：" + fileItem.getName());
		}
	}
}