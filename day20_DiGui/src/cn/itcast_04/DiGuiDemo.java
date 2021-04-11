package cn.itcast_04;
import java.io.File;
public class DiGuiDemo {
		public static void main(String[] args) {
			File scrFolder=new File("Math");
			deleteFolder(scrFolder);
		}
		public static void deleteFolder(File scrFolder) {
			File[] fileArray=scrFolder.listFiles();
			for(File file:fileArray) {
				if(file.isDirectory()) {
					deleteFolder(file);
				}
				else {
					System.out.println(file.getName()+"-----------"+file.delete());
				}
				//System.out.println(scrFolder.getName()+"-------"+scrFolder.delete());
			}
		System.out.println(scrFolder.getName()+"-------"+scrFolder.delete());
		}
}
