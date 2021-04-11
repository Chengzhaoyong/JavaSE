package cn.itcast_03;



/*
 *    判断功能
 *    boolean equals(Object obj):比较字符串的内容是否相同，区分大小写
 *    boolean equalsIngoreCase(String str):比较字符串的内容是否相同，不计大小写
 *    boolean contains(String str):判断大字符串中是否包含小字符串
 *    boolean startWith(String str):判断字符串是否以某个字符串开头
 *    boolean endWith(String str):判断字符串是否以某个指定的字符串结尾
 *    boolean isEmpty():判断字符串是否为空
 *    
 *    注意：
 *       字符串内容为空和字符串对象为空
 *       String s="";
 *       String s=null;
 */
public class StringDemo {
		public static void main(String[] args) {
			String s1="helloworld";
			String s2="helloworld";
			String s3="Helloworld";
			
			// boolean equals(Object obj):比较字符串的内容是否相同，区分大小写
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println("=============");
			
      	//  boolean equalsIngoreCase(String str):比较字符串的内容是否相同，不计大小写
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println(s1.equalsIgnoreCase(s3));
			System.out.println("============");
			
			//   boolean contains(String str):判断大字符串中是否包含小字符串
			System.out.println(s1.contains("hello"));
			System.out.println(s1.contains("hw"));
			System.out.println("============");
			
			// boolean startWith(String str):判断字符串是否以某个字符串开头
			System.out.println(s1.startsWith("h"));
			System.out.println(s1.startsWith("hello"));
		    System.out.println("==============");
		    
		    // boolean endWith(String str):判断字符串是否以某个指定的字符串结尾
		    System.out.println(s1.endsWith("ld"));
            System.out.println(s1.endsWith("world"));
            System.out.println("=============");
            
            // *    boolean isEmpty():判断字符串是否为空
			System.out.println(s1.isEmpty());
			
			String s4="";
			String s5=null;
			System.out.println(s4.isEmpty());
			System.out.println(s5.isEmpty());//错误，对象都没有，不能调方法
			
		}
}
