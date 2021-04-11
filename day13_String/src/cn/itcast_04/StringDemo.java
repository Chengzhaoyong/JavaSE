package cn.itcast_04;
/*
 *   String��Ļ�ȡ����
 *   int length():��ȡ�ַ����ĳ���
 *   char charAt(int index):��ȡָ���ַ�����λ�õ��ַ�
 *   int indexOf(int ch):��ȡָ���ַ��ڴ��ַ��еĵ�һ�γ��ֵ�����
 *   
 *   int indexOf(String str):�����ַ������ڴ��ַ��е�һ�γ��ֵ�����
 *   int indexOf(int ch,int fromIndex):�����ַ��ڴ��ַ����д�ָ��λ�ó��ֵ�����
 *   int indexOf(String str,int fromIndex):�����ַ����ڴ��ַ����д�ָ��λ�ó��ֵ�����
 *   String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ
 *   String substring(int start,int end):��ָ��λ�ÿ�ʼ��ȡ�ַ�����ָ��λ��
 *
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";

		// int length():��ȡ�ַ����ĳ���
		System.out.println(s.length());
		System.out.println("=============");

		// char charAt(int index):��ȡָ���ַ�����λ�õ��ַ�
		System.out.println(s.charAt(7));
		System.out.println("===========");

		// int indexOf(int ch):��ȡָ���ַ��ڴ��ַ��еĵ�һ�γ��ֵ�����
		System.out.println(s.indexOf('l'));
		System.out.println("==============");

		// int indexOf(String str):�����ַ����ڴ��ַ��е�һ�γ��ֵ�����
		System.out.println(s.indexOf("owo"));
		System.out.println("=============");
		
		// int indexOf(int ch,int fromIndex):�����ַ��ڴ��ַ����д�ָ��λ�ó��ֵ�����
		System.out.println(s.indexOf('l',1));
		System.out.println(s.indexOf('l',29));//-1
		System.out.println("==============");
		
        //  int indexOf(String str,int fromIndex):
		//�����ַ����ڴ��ַ����д�ָ��λ�ó��ֵ�����
		System.out.println(s.indexOf("llo",1));
		System.out.println("==============");
		
		//  String substring(int start):��ָ��λ�ÿ�ʼ��ȡ�ַ�����Ĭ�ϵ�ĩβ
		System.out.println(s.substring(3));
		System.out.println("===============");
		
		// String substring(int start,int end):��ָ��λ�ÿ�ʼ��ȡ�ַ�����ָ��λ��
		System.out.println(s.substring(3,7));
	}
}
