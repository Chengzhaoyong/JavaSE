package cn.itcast_04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileDemo2 {
		public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("a.txt");//
		FileWriter fw=new FileWriter("b.txt");
		
		//һ�ζ�ȡһ���ַ�
//		int ch=0;
//		while((ch=fr.read())!=-1) {
//			fw.write(ch);
//		}
		
		//һ�ζ�ȡһ���ַ�����
		char[] chs=new char[1024];
		int len=0;
		while((len=fr.read(chs))!=-1) {
			fw.write(chs,0,len);
		}
		
		fr.close();
		fw.close();
		
		
		
		}}
