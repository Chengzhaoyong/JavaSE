package cn.itcast_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 *  �ֽ��������������裺
 *       A�������ֽ�����������
 *       B������read����������ȡ���ݣ�����������ʾ�ڿ���̨
 *       C���ͷ���Դ
 *       
 *   ��ȡ���ݵķ�ʽ��
 *       A:int read():һ�ζ�ȡһ���ֽ�
 *       B��int read(byte[] b):һ�ζ�ȡһ���ֽ�����
 *       
 */
public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		// FileInputStream(String name)
		FileInputStream fis = new FileInputStream("fis.txt");

//			//��һ�ζ�ȡ
//				int by=fis.read();
//				System.out.println(by);
//				System.out.println((char)by);
//				
//				//�ڶ��ζ�ȡ
//				 by=fis.read();
//				System.out.println(by);
//				System.out.println((char)by);
//				//�����ζ�ȡ
//			    by=fis.read();
//				System.out.println(by);
//				System.out.println((char)by);

		//�����ò������
//		  int by=fis.read();
//		  while(by!=-1)  { 
//			  System.out.print((char)by);
//		      by=fis.read();
//		  }
		 
		//���հ汾
		int by=0;
		while((by=fis.read())!=-1) {
			System.out.print((char)by);//���Ķ����ˣ��ַ������ֽڣ�����һ���ֽڵĶ�ȡ
		}
		
		fis.close();
	}
}
