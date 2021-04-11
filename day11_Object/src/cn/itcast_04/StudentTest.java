package cn.itcast_04;
/*
 * protect void finalize():  ������������ȷ�������ڶԸö���ĸ�������ʱ��
 * 							�ɶ�����������������ô˷�����
 * protect Object clone():���������ش˶����һ��������
 * A:��д�÷���
 * 
 * Cloneable :����ʵ����Cloneable�ӿڣ���ָʾObject��clone()�������ԺϷ��ĶԸ�����а��ֶ�
 * ���ƣ�����ӿ��Ǳ�ǽӿڣ���������ʵ�ָýӿڵ���Ϳ���ʵ�ֶ�������
 */



public class StudentTest {
	public static void main(String[] args) throws CloneNotSupportedException {
		//����ѧ������
		Student s1=new Student();
		s1.setAge(27);
		s1.setName("����ϼ");
		//��¡ѧ������
		Object obj=s1.clone();
		Student s2=(Student)obj;

		
		//��ǰ������
		Student s3=s1;
		System.out.println(s3.getName()+"----"+s3.getAge());
		System.out.println("===========");
		s3.setName("����");
		s3.setAge(30);
		System.out.println(s1.getName()+"----"+s1.getAge());
		System.out.println(s2.getName()+"----"+s2.getAge());
		System.out.println(s3.getName()+"----"+s3.getAge());
		
		
	}

}
