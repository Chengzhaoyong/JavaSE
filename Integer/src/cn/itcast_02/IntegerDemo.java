package cn.itcast_02;
/*
 *   Integer�Ĺ��췽����
 *   public Integer(int value)
 *   public Integer(String s):
 *   ����ַ����������������
 */
public class IntegerDemo {
			public static void main(String[] args) {
				int i=100;
				Integer ii=new Integer(i);
				System.out.println(ii);
				
				String s="100";
				Integer ss=new Integer(100);
				System.out.println(ss);
			}
}
