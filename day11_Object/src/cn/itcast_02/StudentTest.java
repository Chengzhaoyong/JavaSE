/**
 * 
 */
package cn.itcast_02;

/**
 * @author ����С��
 *  public String toString()�����ظö�����ַ�����ʾ
 *  
 *  Integer���µľ�̬������
 *     public static String toHexString(int i):��һ������רת��һ��ʮ�����Ʊ�ʾ���ַ���
 *
 *   ���������Ϣû�����壬���Խ���������д�÷���
 *   ��ô��д��
 *      �Ѹ�������г�Ա����ֵ���ؼ���
 *      
 */

public class StudentTest {
	public static void main(String[] args) {
		Student s=new Student("����ϼ",39);
		System.out.println(s.hashCode());
		System.out.println(s.getClass().getName());
		System.out.println("===============");
	     
		System.out.println(s.toString());
		System.out.println(s);//��ӡ����ʱ���൱����toString()
		//toString()������ֵ�ȼ���
	//	getClass().getName()+'@'+Integer.toHexString(hashcode())
	}

}
