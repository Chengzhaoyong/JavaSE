package cn.itcast_06;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *  һ��һ������Ķ�ȡ
 *  read(byte[] b)
 */

public class FileInputStreamDemo {
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("e:\\moive\\����1.mp4");
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
