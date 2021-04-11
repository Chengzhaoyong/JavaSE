package cn.itcast_04;
/*
 *   String类的获取功能
 *   int length():获取字符串的长度
 *   char charAt(int index):获取指定字符索引位置的字符
 *   int indexOf(int ch):获取指定字符在此字符中的第一次出现的索引
 *   
 *   int indexOf(String str):返回字符串在在此字符中第一次出现的索引
 *   int indexOf(int ch,int fromIndex):返回字符在此字符串中从指定位置出现的索引
 *   int indexOf(String str,int fromIndex):返回字符串在此字符串中从指定位置出现的索引
 *   String substring(int start):从指定位置开始截取字符串，默认到末尾
 *   String substring(int start,int end):从指定位置开始截取字符串到指定位置
 *
 *
 */
public class StringDemo {
	public static void main(String[] args) {
		String s = "helloworld";

		// int length():获取字符串的长度
		System.out.println(s.length());
		System.out.println("=============");

		// char charAt(int index):获取指定字符索引位置的字符
		System.out.println(s.charAt(7));
		System.out.println("===========");

		// int indexOf(int ch):获取指定字符在此字符中的第一次出现的索引
		System.out.println(s.indexOf('l'));
		System.out.println("==============");

		// int indexOf(String str):返回字符在在此字符中第一次出现的索引
		System.out.println(s.indexOf("owo"));
		System.out.println("=============");
		
		// int indexOf(int ch,int fromIndex):返回字符在此字符串中从指定位置出现的索引
		System.out.println(s.indexOf('l',1));
		System.out.println(s.indexOf('l',29));//-1
		System.out.println("==============");
		
        //  int indexOf(String str,int fromIndex):
		//返回字符串在此字符串中从指定位置出现的索引
		System.out.println(s.indexOf("llo",1));
		System.out.println("==============");
		
		//  String substring(int start):从指定位置开始截取字符串，默认到末尾
		System.out.println(s.substring(3));
		System.out.println("===============");
		
		// String substring(int start,int end):从指定位置开始截取字符串到指定位置
		System.out.println(s.substring(3,7));
	}
}
