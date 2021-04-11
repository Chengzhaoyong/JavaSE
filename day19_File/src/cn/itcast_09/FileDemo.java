package cn.itcast_09;
import java.io.File;
import java.io.FilenameFilter;
/*
 *    判断E盘目录下是否有后缀名为.jpg得文件，如果有，就输出此文件名
 *    A:先获取所有的，然后遍历得时候，依次判断，如果满足就输出
 *    B：获取得时候就满足条件得了，然后输出即可
 *    
 *    要实现这样效果，就必须学习一个接口：文件名称过滤器
 *    public String[] list(FilenameFilter filter):
 *    public File[] listFiles(FilenameFilter filter)
 */
public class FileDemo {
		public static void main(String[] args) {
			File file=new File("e:\\");
			
			String[] arrArray=file.list(new FilenameFilter() {
					public boolean accept(File dir,String name) {
						return new File(dir,name).isFile()&&name.endsWith(".jpg");
					}
			}
			);
			for(String s:arrArray) {
				System.out.println(s);
				
			}
		}
}
