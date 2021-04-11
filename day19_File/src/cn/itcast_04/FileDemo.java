package cn.itcast_04;
import java.io.File;
/*
 *   重命名动能：
 *   public boolean renameTo(File dest)
 *   如果路径名相同，改名
 *   不同则是改名并剪切
 *   
 *   路径以盘符开始：绝对路径   c:\\a.txt
 * 路径不以盘符开始：相对路径  a.txt
 */
public class FileDemo {
	public static void main(String[] args) {
//		File file=new File("1.jpg");
//		File newfile=new File("2.jpg");
//		System.out.println(file.renameTo(newfile));
		
		
		//如果路径名相同,改名，  不同则是改名并剪切
		File file2=new File("2.jpg");
		File file3=new File("1.jpg");
		System.out.println("renameTo:"+file2.renameTo(file3));
	}
}
