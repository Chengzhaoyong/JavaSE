package cn.itcast_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *  一次一个数组的读取
 *  read(byte[] b)
 */

public class FileInputStreamDemo {
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("e:\\moive\\流浪1.mp4");
			FileOutputStream fos=new FileOutputStream("e:\\haha.mp4");
			long start=System.currentTimeMillis();
			byte[] by=new byte[1024];
			int b=0;
			while((b=fis.read(by))!=-1) {
				fos.write(by,0,b);
			}
			long end=System.currentTimeMillis();
			System.out.println(end-start);
			
			fis.close();
			fos.close();
		}
}
