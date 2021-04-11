package cn.itcast_03;
import java.io.File;
/*
 * 需求:请大家把D：\\workplace目录下所有的java结尾的文件的就饿对路径给输入在控制台
 * 
 *     分析：
 *      A：封装目录
 *      B：获取该目录下所有文件或者文件夹的fileArray
 *      C:遍历该File数组，得到每一个File对象
 *      D：判断该file对象是否为文件夹
 *         		是：回到B
 *                                       否：继续判断是否以.java结尾
 *                  	是：就输出该文件的绝对路径
 *                                                            否：不搭理他
 *
 */
public class DuiGuiDemo {
		public static void main(String[] args) {
			//  A：封装目录
			File scrFolder=new File("d:\\workplace");
			long start=System.currentTimeMillis();
			getAllJavaFilePaths(scrFolder);
			long end=System.currentTimeMillis();
			System.out.println(end-start);//输出程序运行时间
			
		}
		public static void getAllJavaFilePaths(File scrFolder) {
		//	  B：获取该目录下所有文件或者文件夹的fileArray
			File[] fileArray=scrFolder.listFiles();
			//    C:遍历该File数组，得到每一个File对象
			for(File file:fileArray) {
				if(file.isDirectory()) {  //    D：判断该file对象是否为文件夹
				getAllJavaFilePaths(file);      //是：回到B
				
				}
				else {
				if(file.getName().endsWith(".java")) { //    否：继续判断是否以.java结尾
						System.out.println(file.getAbsolutePath());
					}
				}
			}
		}
}
