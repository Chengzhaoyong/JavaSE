package cn.itcast_03;



/*
 *    �жϹ���
 *    boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ�����ִ�Сд
 *    boolean equalsIngoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�����ƴ�Сд
 *    boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
 *    boolean startWith(String str):�ж��ַ����Ƿ���ĳ���ַ�����ͷ
 *    boolean endWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
 *    boolean isEmpty():�ж��ַ����Ƿ�Ϊ��
 *    
 *    ע�⣺
 *       �ַ�������Ϊ�պ��ַ�������Ϊ��
 *       String s="";
 *       String s=null;
 */
public class StringDemo {
		public static void main(String[] args) {
			String s1="helloworld";
			String s2="helloworld";
			String s3="Helloworld";
			
			// boolean equals(Object obj):�Ƚ��ַ����������Ƿ���ͬ�����ִ�Сд
			System.out.println(s1.equals(s2));
			System.out.println(s1.equals(s3));
			System.out.println("=============");
			
      	//  boolean equalsIngoreCase(String str):�Ƚ��ַ����������Ƿ���ͬ�����ƴ�Сд
			System.out.println(s1.equalsIgnoreCase(s2));
			System.out.println(s1.equalsIgnoreCase(s3));
			System.out.println("============");
			
			//   boolean contains(String str):�жϴ��ַ������Ƿ����С�ַ���
			System.out.println(s1.contains("hello"));
			System.out.println(s1.contains("hw"));
			System.out.println("============");
			
			// boolean startWith(String str):�ж��ַ����Ƿ���ĳ���ַ�����ͷ
			System.out.println(s1.startsWith("h"));
			System.out.println(s1.startsWith("hello"));
		    System.out.println("==============");
		    
		    // boolean endWith(String str):�ж��ַ����Ƿ���ĳ��ָ�����ַ�����β
		    System.out.println(s1.endsWith("ld"));
            System.out.println(s1.endsWith("world"));
            System.out.println("=============");
            
            // *    boolean isEmpty():�ж��ַ����Ƿ�Ϊ��
			System.out.println(s1.isEmpty());
			
			String s4="";
			String s5=null;
			System.out.println(s4.isEmpty());
			System.out.println(s5.isEmpty());//���󣬶���û�У����ܵ�����
			
		}
}
