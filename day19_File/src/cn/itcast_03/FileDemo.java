package cn.itcast_03;
import java.io.File;
import java.io.IOException;
/*
 *   删除动能：
 *   public boolean delete()
 *   注意：
 *   A：如果你创建文件或者文件夹忘了写盘符路径，那么，默认在项目路径下
 *   B：java中的删除不走回收站
 *   C：
 */
public class FileDemo {
		public static void main(String[] args) throws IOException{
			File file=new File("e:\\a.txt");
			System.out.println("createNewFile:"+file.createNewFile());
			
			//我不小心弄成这样
			File file2=new File("a.txt");//没有路径，就在项目的目录下创建
			System.out.println("createNewFile:"+file2.createNewFile());
			System.out.println(file2.delete());
		}
}
