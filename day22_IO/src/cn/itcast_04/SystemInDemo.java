package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *  ����¼�����ݣ�
 *  ͨ���ַ���������װ��׼������ʵ��
 *      
 */
public class SystemInDemo {
		public static void main(String[] args) throws IOException {
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("������һ���ַ�����");
			String s=br.readLine();
			System.out.println("��������ַ�����"+s);
			System.out.println("������һ��������");
			String s1=br.readLine();
			int i=Integer.parseInt(s1);
			System.out.println("������������ǣ�"+i);
		}
}
