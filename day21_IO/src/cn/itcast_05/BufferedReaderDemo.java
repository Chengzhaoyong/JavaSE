package cn.itcast_05;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *   �ַ���Ϊ�˸�Ч��д��Ҳ�ṩ�˶�Ӧ���ַ���������
 *   BufferedWriter:�ַ����������
 *   BufferedReader:�ַ�����������
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
