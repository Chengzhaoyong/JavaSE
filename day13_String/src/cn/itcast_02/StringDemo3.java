package cn.itcast_02;
/*
 *    看程序写结果
 *    字符串如果是变量相加，先开空间，在拼接
 *    字符串如果是常量相加，是相加，然后在常量池找，如果有就直接返回，否则，就创建
 *    
 */
public class StringDemo3 {
	public static void main(String[] args) {
		String s1 = "hello";
		String s2 = "world";
		String s3 = "helloworld";
		// 字符串如果是变量相加，先开空间，在拼接
		System.out.println(s3 == s1 + s2);
		System.out.println(s3.equals((s1 + s2)));
		// 字符串如果是常量相加，是相加，
		//然后在常量池找，如果有就直接返回，否则，就创建
		System.out.println(s3 == "hello" + "world");
		System.out.println(s3.equals("hello" + "world"));

	}
}
