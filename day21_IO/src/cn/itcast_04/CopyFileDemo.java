package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 *  字符转化流-----本身也叫字符流 -------InputStreamReader-----OutputStreamWriter
 */
import java.io.OutputStreamWriter;

public class CopyFileDemo {
		public static void main(String[] args) throws IOException {
			//封装数据源
			InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"));
			
			//封装目的地
			OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("b.txt"));
			
			
//			//写数据
			int ch=0;		
			while((ch=isr.read())!=-1) {
				
			osw.write(ch);
		}
//			
//			char[] chs=new char[1024];
//			int len=0;
//			while((len=isr.read(chs))!=-1) {
//				osw.write(chs);
//			}
			isr.close();
			osw.close();
		}
}
