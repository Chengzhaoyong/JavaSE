package cn.itcast.day04.demo03;
/*
 * ��ε���һ������õķ���
 *
 * 1��������
 * ��ʽ���������ƣ�����ֵ��
 * ��ʹ�õ������õ�ʱ���޷�ʹ�÷����ķ���ֵ
 * 
 * 2.��ӡ����
 * ��ʽ��System.out.println(�������ƣ�����ֵ��)
 * 
 * 3.��ֵ����
 * ��ʽ���������� ��������=�������ƣ�����ֵ��
 * 
 */
public class Demo01Methodinvoke {
		public static void main(String[] args) {
	//	sum(12,443);
		System.out.println(sum(12,443));
		int num=sum(232,234);
		num+=233;
		System.out.println(num);
		}
		public static int sum(int a,int b) {
			int result=a+b;
			return result;
		}
		
}
