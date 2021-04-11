package cn.itcast_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *   字符流为了高效读写，也提供了对应的字符流缓冲流
 *   BufferedWriter:字符缓冲输出流
 *   BufferedReader:字符缓冲输入流
 */
public class BufferedReaderDemo {
		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new FileReader("a.txt"));
			
			int len=0;
			while((len=br.read())!=-1) {
				System.out.print((char)len);
			}
			br.close();
			
		}
}
