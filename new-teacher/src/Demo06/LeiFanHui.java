package Demo06;

/*
 *   ����ֵ���ͣ�
 *       �������ͣ������ý���
 *       �������ͣ�
 *       �ࣺ���ص��Ǹ���Ķ���
 *       �����ࣺ���ص��Ǹó�������������
 *       �ӿڣ����ص��Ǹýӿڵ�ʵ����Ķ���
 */

class Student2{
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}

class StudentDemo2{
	public Student2 getStudent() {
		//Student s=new Student();
		//Student ss=s;
	    //Student s=new Student();
//		return s;
		return new Student2();
	}
}
public class LeiFanHui {
		public static void main(String[] args) {
			StudentDemo2 sd=new StudentDemo2();
			Student2 s=sd.getStudent();//new Student2();Student2 s=new Student2();
			s.study();
		}
}
