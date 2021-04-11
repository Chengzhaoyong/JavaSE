package cn.itcast_03;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.FileOutputStream;

/*
 *  复制文本文件、
 *   
 *   数据源：从哪来              FileInputStream
 *a.txt
 *   
 *   
 *   目的地：从哪去	   FileOutputStream
 *   b.txt
 *   
 *   这一次复制中文没有出现任何问题，为什么呢
 *     上一次我们出现问题的原因在于我们每次获取一个字节数据，就把该字节数据转换了字符数据，然后输出控制台
 *     而这一次，通过IO流读取数据，写到文本，你读取一个字节，就写入一个字节，没有做任何的转换
 *     它会帮做转换
 */
public class CopyFileDemo {
		public static void main(String[] args) throws IOException {
			//封装数据源
			FileInputStream fis=new FileInputStream("a.txt");
			//封装目的地
			FileOutputStream fos=new FileOutputStream("b.txt");
			
			int by=0;
			while((by=fis.read())!=-1) {
				fos.write(by);
			}
			
			fis.close();
			fos.close();
			
			
		}
}
