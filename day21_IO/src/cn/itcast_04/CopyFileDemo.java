package cn.itcast_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 *  �ַ�ת����-----����Ҳ���ַ��� -------InputStreamReader-----OutputStreamWriter
 */
import java.io.OutputStreamWriter;

public class CopyFileDemo {
		public static void main(String[] args) throws IOException {
			//��װ����Դ
			InputStreamReader isr=new InputStreamReader(new FileInputStream("a.txt"));
			
			//��װĿ�ĵ�
			OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("b.txt"));
			
			
//			//д����
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
