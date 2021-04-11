package cn.itcast_07;
import java.io.File;
/*
 *   获取动能：
 *     Public String[] list():获取指定目录下的所有文件夹或者文件夹的名称数组
 *     public File[] listFiles():获取指定目录下的所有文件夹或者文件夹的File数组
 *     
 */
public class FileDemo {
	public static void main(String[] args) {
		File file=new File("e:\\");
		String[] strArray=file.list();
		for(String s:strArray) {
			System.out.println(s);
		}
		System.out.println("============");
		File[] fileArray=file.listFiles();//因为他返回的是文件对象，不只是获取名称，还可以长度，等等
		for(File f:fileArray) {
			System.out.println(f.getName());
		}
	}
}
