package cn.itcast_02;
/*
 *   �ж϶��ܣ�
 *   String ���public boolean matches��String regex��
 *   �����ж��ֻ������Ƿ�����Ҫ��
 *      A������¼���ֻ����룺
 *      B�������ֻ�����Ĺ���
 *         134008084034
 *         135894859589
 *         138958495894
 *         131849589455
 *         183493958495
 */
import java.util.Scanner;
public class Regex {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("����������ֻ����룺");
		
		String phone=sc.nextLine();
		//�����ֻ�����
		String regex="1[38]\\d{9}";
		boolean flag=phone.matches(regex);
		System.out.println(flag);;
	}
}
