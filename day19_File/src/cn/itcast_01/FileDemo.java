package cn.itcast_01;
import java.io.File;

/*
 * 我们要实现IO的操作，就要知道硬盘上文件的表现形式
 *  而java就提供了提供了File供我们使用
 *  
 *   File：文件和目录（文件夹）路径名的抽象表示形式
 *   构造方法：
 *     File:(String pathname):根据一个路径得到File对象
 *     File（String parent，String child）：根据一个目录和一个子文件夹得到File对象
 *     File（File patent，String child）：根据一个File对象和一个子文件/目录得到File对象
 */
public class FileDemo {
	public static void main(String[] args) {
		// File:(String pathname):根据一个路径得到File对象
		File file=new File("E:\\demo\\a.txt");
		
		// File（String parent，String child）：根据一个目录和一个子文件夹得到File对象
		File file1=new File("E:\\demo","a.txt");
		
		// File（File patent，String child）：根据一个File对象和一个子文件/目录得到File对象
		File file3=new File("E:\\demo");
		File file4=new File(file3,"a.txt");
		
	}
}
