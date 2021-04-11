package cn.itcast_08;
import java.io.File;
/*
 *   判断E盘目录下是否有后缀名为.jpg的文件，如果有，输出文件名
 *   分析：
 *     A：封装e判断目录
 *     B：获取该目录下所有文件或者文件夹得File数组
 *     C:遍历该File数组，得到每一个File对象，然后判断
 *     D:是否文件
 *                         是：继续判断是否以.jpg结尾
 *                         否：不理他
 *                  否：不理他
 */
public class FileDemo {
		public static void main(String[] args) {
			File file=new File("e:\\");
			
			//获取该目录下所有文件或者文件夹得File数组
			File[] fileArray=file.listFiles();
			
			//遍历该File数组，得到每一个File对象，然后判断
			for(File f:fileArray) {
				if(f.isFile()){
					if(f.getName().endsWith(".jpg")) {
						System.out.println(f.getName());
					}
				}
			}
		}
}
