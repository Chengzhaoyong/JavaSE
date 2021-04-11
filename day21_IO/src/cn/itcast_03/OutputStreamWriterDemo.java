package cn.itcast_03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *   OutputStreamWriter�ķ�����
 *   public void write(int c):дһ���ַ�
 *   public void write(char[] cbuf):дһ���ַ�����
 *   public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
 *   public void write(String str):дһ���ַ���
 *   public void write(String str,int off,int len):дһ���ַ�����һ����
 */
public class OutputStreamWriterDemo {
	public static void main(String[] args) throws IOException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("ows2.txt"));
		// д����
		osw.write("a");
		osw.write(97);
		// Ϊʲô����û�н�ȥ
		// �ַ�=2���ֽ�
		// �ļ������ݴ洢������λ���ֽ�
		// osw.flush();

		// public void write(char[] cbuf):дһ���ַ�����
		char[] chs = { 'a', 'b', 'c', 'd', 'e' };
		osw.write(chs);

		// public void write(char[] cbuf,int off,int len):дһ���ַ������һ����
		osw.write(chs, 2, 2);

		// public void write(String str):дһ���ַ���
		String s = "helloworld";
		osw.write(s);
		
		// public void write(String str,int off,int len):дһ���ַ�����һ����
		osw.write(s, 2, 2);
		
		
		// �ͷ���Դ
		osw.close();// �ر���ʱ����ˢ��һ�£��ڹ�
	}
}
