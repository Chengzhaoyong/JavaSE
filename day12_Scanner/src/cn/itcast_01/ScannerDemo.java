package cn.itcast_01;
/*
 *   Scanner:���ڽ��ռ���¼�������
 *   
 *   System������һ����̬�ֶΣ�
 *   public static final Inputstream in;��׼������������Ӧ�ż���¼��
 *   
 *   InputStream is=System.in;
 *   
 *   
 *   ���췽����
 *   public Scanner��InputStream source��
 *   
 *   
 */
import java.util.Scanner;
public class ScannerDemo {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			System.out.println(x);
			
		}
}
