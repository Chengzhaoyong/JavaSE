package cn.itcast_03;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.FileOutputStream;

/*
 *  �����ı��ļ���
 *   
 *   ����Դ��������              FileInputStream
 *a.txt
 *   
 *   
 *   Ŀ�ĵأ�����ȥ	   FileOutputStream
 *   b.txt
 *   
 *   ��һ�θ�������û�г����κ����⣬Ϊʲô��
 *     ��һ�����ǳ��������ԭ����������ÿ�λ�ȡһ���ֽ����ݣ��ͰѸ��ֽ�����ת�����ַ����ݣ�Ȼ���������̨
 *     ����һ�Σ�ͨ��IO����ȡ���ݣ�д���ı������ȡһ���ֽڣ���д��һ���ֽڣ�û�����κε�ת��
 *     �������ת��
 */
public class CopyFileDemo {
		public static void main(String[] args) throws IOException {
			//��װ����Դ
			FileInputStream fis=new FileInputStream("a.txt");
			//��װĿ�ĵ�
			FileOutputStream fos=new FileOutputStream("b.txt");
			
			int by=0;
			while((by=fis.read())!=-1) {
				fos.write(by);
			}
			
			fis.close();
			fos.close();
			
			
		}
}
