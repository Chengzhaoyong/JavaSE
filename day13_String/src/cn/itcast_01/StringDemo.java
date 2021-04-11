package cn.itcast_01;
/*
 *   �ַ����������ɶ����ɵ�һ����Ҳ���Կ���һ���ַ�����
 *   ͨ���鿴API�����ǿ���֪��
 *   A���ַ�������ֵ��abc��Ҳ���Կ���һ���ַ�������
 *   B���ַ����ǳ�����һ������ֵ���Ͳ��ܱ��ı�
 *   
 *   ���췽����
 *       public String(){}:�չ���
 *       public String(byte[] bytes):���ֽ�����ת���ַ���
 *       public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
 *       public String(char[] value):���ַ�����ת���ַ���
 *       public String(char[] value,int index,int count):���ַ�����ת��һ�����ַ���
 *       public String(String original):���ַ�����ת���ַ���
 *       
 */
public class StringDemo {
  public static void main(String[] args) {
	  
	   // public String(){}:�չ���
	     String s1=new String();
	     System.out.println("s1="+s1);//�Ѿ���дtoString������
	     System.out.println(s1.length());
	     System.out.println("===============");
	     
	     //   public String(byte[] bytes):���ֽ�����ת���ַ���
	     byte[] bys= {97,98,99,100,101};
	     String s2=new String(bys);
	     System.out.println("s2="+s2);
	     System.out.println(s2.length());
	     System.out.println("===============");
	     
	     // public String(byte[] bytes,int index,int length):���ֽ������һ����ת���ַ���
	     String s3=new String(bys,1,3);
	     System.out.println("s3="+s3);
	     System.out.println(s3.length());
	     System.out.println("===============");
	     
	     //  public String(char[] value):���ַ�����ת���ַ���
	     char[] chs= {'a','b','c','d','e','��','ѧ','ϰ'};
	     String s4=new String(chs);
	     System.out.println("s4="+s4);
	     System.out.println(s4.length());
	     System.out.println("===============");
	     
	     // public String(char[] value,int index,int count):���ַ�����ת��һ�����ַ���
	     String s5=new String(chs,0,5);
	     System.out.println("s5="+s5);
	     System.out.println(s5.length());
	     System.out.println("===============");
	     
	     // public String(String original):���ַ�����ת���ַ���
	     String s6=new String("abcde");
	     System.out.println("s6="+s6);
	     System.out.println(s6.length());
	     System.out.println("===============");
	     
	     String s7="abcde";//"abcde"Ҳ���Ե��ɶ���
	     System.out.println("s7="+s7);
	     System.out.println(s7.length());
	     
	     
	     
}
}
