package cn.itcast_04;
/*
 * ʮ����ת����������
 * public static String toString(int i,int radix)
 * ��������Կ������Ƶķ�Χ��2-36
 */
public class IntegerDemo {
			public static void main(String[] args) {
				//ʮ����ת����������
				System.out.println(Integer.toString(100, 3));
				System.out.println(Integer.toString(100, 5));
				System.out.println(Integer.toString(100, 13));
				System.out.println(Integer.toString(100, 30));
				
				System.out.println("----------");
				//����������ת��ʮ����
				System.out.println(Integer.parseInt("100",3));
				System.out.println(Integer.parseInt("100",13));
				System.out.println(Integer.parseInt("100",31));
			}
}
