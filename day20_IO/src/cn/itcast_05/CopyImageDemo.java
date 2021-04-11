package cn.itcast_05;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImageDemo {
		public static void main(String[] args) throws IOException {
			FileInputStream fis=new FileInputStream("e:\\1.jpg");
			FileOutputStream fos=new FileOutputStream("nn.jpg");
			int by=0;
			while((by=fis.read())!=-1) {
				fos.write(by);//
			}
			fis.close();
			fos.close();
			
		}
}
