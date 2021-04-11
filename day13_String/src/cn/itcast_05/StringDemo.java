package cn.itcast_05;
/*
 * 
 *   String的转换功能
 *    byte[] getBytes():把字符串转换字节数组
 *    char[] toCharArray():把字符串转换为字符数组、
 *    static String valueOf(char[] chs):把字符数组转换字符串
 *    static String valueOf(int i):把int类型的数据转换成字符串
 *    
 *    String toLowerCase():把字符串转换小写
 *    String toUpperCase():把字符串转换大写
 *    String concat(String str):把字符串连接起来
 */
public class StringDemo {
			public static void main(String[] args) {
				String s="JavaSE";
			//	  byte[] getBytes():把字符串转换字节数组
				byte[] bys=s.getBytes();
				for(int x=0;x<bys.length;x++) {
					System.out.println(bys[x]);
				}
				System.out.println("===========");
				
				// char[] toCharArray():把字符串转换为字符数组、
				char[] chs=s.toCharArray();
				for(int x=0;x<chs.length;x++) {
					System.out.println(chs[x]);
				}
				System.out.println("=============");
				
				//  static String valueOf(char[] chs):把字符数组转换字符串
				String ss=String.valueOf(chs);
				System.out.println(ss);
				System.out.println("==============");
				
			//   static String valueOf(int i):把int类型的数据转换成字符串
				int i=100;
				String sss=String.valueOf(i);
				System.out.println(sss);
				System.out.println("============");
				
				// String toLowerCase():把字符串转换小写
				System.out.println(s.toLowerCase());
				System.out.println(s.toUpperCase());
				System.out.println("============");
				
				//  String concat(String str):把字符串连接起来
				String s1="woaini";
				System.out.println(s1.concat(s));
				 
				
			}
			
}
