package cn.itcast_02;
import java.io.File;
import java.io.IOException;
/*
 *   创建动能：
 *     public boolean createNewFile():创建文件
 *     public boolean mkdir():创建文件夹
 *     public boolean mkdirs():创建文件夹，如果父文件夹不存在，他会创建出来，多级文件夹创建
 *     
 *     a.txt未必是文件，可能是文件夹
 *     
 */
public class FileDemo {
		public static void main(String[] args) throws IOException{
			File file=new File("e:\\demo");
			System.out.println("mkdir:"+file.mkdir());
			
			//需求：e盘目录demo创建一个文件a.txt
			File file2=new File("e:\\demo\\a.txt");
		System.out.println("createNewFile:"+file2.createNewFile());
		//注意：要想在某个目录下创建内容，该目录必须存在
		
		File file3=new File("e:\\test");
		File file4=new File("e:\\test\\b.txt");
		System.out.println("mkdir:"+file3.mkdir());
		System.out.println("mkdir:"+file4.mkdir());
		//创建多级文件夹
		File file5=new File("e:\\aa\\bb\\cc");
		System.out.println("mkdir:"+file5.mkdirs());
		
		
		}
}
