package cn.itcast_01;
/*
 * Object����Object  �����εĸ��࣬ÿ���඼ʹ��Object��Ϊ����
 * 
 * ÿ���඼ֱ�ӻ��߼�ӵļ̳�Object��
 * 
 * Object��ķ�����
 *    public int hashCode():���ظö���Ĺ�ϣ��ֵ
 *      ע�⣺��ϣ��ֵ�Ǹ��ݹ�ϣ�㷨���������һ��ֵ�����ֵ�͵�ֵַ�йأ����ǲ���ʵ�ʵ�ֵַ
 *      ���������ǵ�ֵַ
 *      
 *      public final class getClass():����Object������ʱ��
 *      
 *      class��ķ���
 *      public String getName():��String����ʽ���ش�Class��������ʾ������
 *       
 *       */
public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.hashCode());
		Student s1=new Student();
		System.out.println(s1.hashCode());
		
		System.out.println("===========");
		Student s2=new Student();
		Class c=s.getClass();
		String str=c.getName();
		System.out.println(str);
		System.out.println("============");
		//��ʽ���
		String str2=s2.getClass().getName();
		System.out.println(str2);
		
		
	}

}
