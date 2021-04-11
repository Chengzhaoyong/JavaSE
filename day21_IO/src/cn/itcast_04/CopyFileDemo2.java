package cn.itcast_04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo2 {
		public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("a.txt");//
		FileWriter fw=new FileWriter("b.txt");
		
		//一次读取一个字符
//		int ch=0;
//		while((ch=fr.read())!=-1) {
//			fw.write(ch);
//		}
		
		//一次读取一个字符数组
		char[] chs=new char[1024];
		int len=0;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs,0,len);
		}
		
		fr.close();
		fw.close();
		
		
		
		}}
