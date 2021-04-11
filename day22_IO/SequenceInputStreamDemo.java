package cn.itcast_06;

import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;

/*
 *    合并流：
 *    现在想要：
 *       a.txt+b.txt-----c.txt
 */
public class SequenceInputStreamDemo {
		public static void main(String[] args) throws IOException {
			//SequenceInputStream(InputStream s1,InputStream s2)
			//需求：把SystemIntDemo和SystemOutDemo复制在copy.txt中
			FileInputStream s1=new FileInputStream("SystemInDemo.java");
			
			FileInputStream s2=new FileInputStream("SystemOutDemo.java");
			SequenceInputStream sis=new SequenceInputStream(s1,s2);
			BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("copy.txt"));
			
			byte[] bys=new byte[1024];
			int len=0;
			while((len=sis.read(bys))!=-1) {
				bos.write(bys,0,len);
			}
			sis.close();
			bos.close();
			
		}
}
