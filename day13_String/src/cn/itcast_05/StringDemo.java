package cn.itcast_05;
/*
 * 
 *   String��ת������
 *    byte[] getBytes():���ַ���ת���ֽ�����
 *    char[] toCharArray():���ַ���ת��Ϊ�ַ����顢
 *    static String valueOf(char[] chs):���ַ�����ת���ַ���
 *    static String valueOf(int i):��int���͵�����ת�����ַ���
 *    
 *    String toLowerCase():���ַ���ת��Сд
 *    String toUpperCase():���ַ���ת����д
 *    String concat(String str):���ַ�����������
 */
public class StringDemo {
			public static void main(String[] args) {
				String s="JavaSE";
			//	  byte[] getBytes():���ַ���ת���ֽ�����
				byte[] bys=s.getBytes();
				for(int x=0;x<bys.length;x++) {
					System.out.println(bys[x]);
				}
				System.out.println("===========");
				
				// char[] toCharArray():���ַ���ת��Ϊ�ַ����顢
				char[] chs=s.toCharArray();
				for(int x=0;x<chs.length;x++) {
					System.out.println(chs[x]);
				}
				System.out.println("=============");
				
				//  static String valueOf(char[] chs):���ַ�����ת���ַ���
				String ss=String.valueOf(chs);
				System.out.println(ss);
				System.out.println("==============");
				
			//   static String valueOf(int i):��int���͵�����ת�����ַ���
				int i=100;
				String sss=String.valueOf(i);
				System.out.println(sss);
				System.out.println("============");
				
				// String toLowerCase():���ַ���ת��Сд
				System.out.println(s.toLowerCase());
				System.out.println(s.toUpperCase());
				System.out.println("============");
				
				//  String concat(String str):���ַ�����������
				String s1="woaini";
				System.out.println(s1.concat(s));
				 
				
			}
			
}
