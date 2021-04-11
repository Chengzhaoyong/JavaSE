package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *   OutputStreamWriter的方法：
 *   public void write(int c):写一个字符
 *   public void write(char[] cbuf):写一个字符数组
 *   public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
 *   public void write(String str):写一个字符串
 *   public void write(String str,int off,int len):写一个字符串的一部分
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("ows2.txt"));
		// 写数据
		osw.write("a");
		osw.write(97);
		// 为什么数据没有进去
		// 字符=2个字节
		// 文件中数据存储基本单位是字节
		// osw.flush();

		// public void write(char[] cbuf):写一个字符数组
		char[] chs = { 'a', 'b', 'c', 'd', 'e' };
		osw.write(chs);

		// public void write(char[] cbuf,int off,int len):写一个字符数组的一部分
		osw.write(chs, 2, 2);

		// public void write(String str):写一个字符串
		String s = "helloworld";
		osw.write(s);
		
		// public void write(String str,int off,int len):写一个字符串的一部分
		osw.write(s, 2, 2);
		
		
		// 释放资源
		osw.close();// 关闭流时，先刷新一下，在关
	}
}
