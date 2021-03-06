package cn.itcast_03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *    InputStreamReader的方法：
 *    public read():一次读一个字符
 *    public read(char[] chs):一次读取一个字符数组
 */
public class InputStreamReaderDemo {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("ows.txt"));

		// 一次读取一个字符
		// int ch=0;
		// while((ch=isr.read())!=-1) {
		// System.out.print((char)ch);
        //   }

		char[] chs = new char[1024];
		int len = 0;
		while ((len = isr.read(chs)) != -1) {
			System.out.print(new String(chs, 0, len));
		}
		// 释放资源
		isr.close();
	}
}
