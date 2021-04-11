package cn.itcast_05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  �ַ������������ⷽ����
 *    BufferedWriter:
 *         public void newLine():����ϵͳ���������з�
 *    
 *    BufferedReader:
 *        public void readLine():��һ������
 */
public class BufferedStreamDemo {
		public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("a.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("b,txt"));

		String s;
		while ((s = br.readLine()) != null) {
			bw.write(s);// ��һ��дһ��
			bw.newLine();// ���з�
			bw.flush();// ˢ�»�����
		}
			
			br.close();
			bw.close();
			
		}
}
