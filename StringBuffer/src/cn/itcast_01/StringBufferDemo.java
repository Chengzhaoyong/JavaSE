package cn.itcast_01;
/*
 * ���԰�ȫ�������߳̽��⣩
 * ��ȫ----ͬ��----�����ǰ�ȫ��
 * ����ȫ---��ͬ��---Ч�ʸ�һЩ
 * 
 * StringBuffer:
 *   ���԰�ȫ�Ŀɱ���ַ���
 *   
 *   StringBuffer��String������
 *   ǰ�߳��Ⱥ����ݿɱ䣬���߲��ɱ�
 *   ���ʹ��ǰ�����ַ������ӣ������˷�̫�����Դ
 *   
 *   StringBuffer�Ĺ��췽����
 *   public StringBuffer():�޲ι���
 *   public StringBuffer(int capacity):ָ���������ַ�������������
 *   public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
 *   
 *   StringBuffer�ķ�����
 *   public int capacity():���ص�ǰ����������
 *   public int length():���س��ȣ��ַ���)��ʵ��
 *   
 *   
 */
public class StringBufferDemo {
		public static void main(String[] args) {
			//  public StringBuffer():�޲ι���
			StringBuffer sb=new StringBuffer();
			System.out.println("sb:"+sb);
			System.out.println("capacity:"+sb.capacity());//��ʼ����Ϊ16
			System.out.println(sb.length());
			System.out.println("-------------");
			// public StringBuffer(int capacity):ָ���������ַ�������������
			StringBuffer sb2=new StringBuffer(30);
			System.out.println("sb:"+sb2);
			System.out.println("capacity:"+sb2.capacity());//��ʼ����Ϊ16
			System.out.println(sb2.length());
			System.out.println("-------------");
			
			//public StringBuffer(String str):ָ���ַ������ݵ��ַ�������������
			StringBuffer sb3=new StringBuffer("hello");
			System.out.println("sb3:"+sb3);
			System.out.println("capacity:"+sb3.capacity());//��ʼ����Ϊ16
			System.out.println(sb3.length());
			
		}
}
