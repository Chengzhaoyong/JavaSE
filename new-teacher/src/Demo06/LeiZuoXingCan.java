package Demo06;
/*
 *     ��ʽ������
 *     	�������ͣ�
 *     	�������ͣ�
 *                  �ࣺ�����������ʱ�������Ѿ������ˣ�  ��Ҫ���Ǹ���Ķ���
 *                 ������:��Ҫ���Ǹö�������������
 *               �ӿڣ��ýӿڵ�ʵ�ֶ���
 */


class Student{
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
}
class StudentDemo{
	public void method(Student s) {//ss=new Student();  Student s=new Student();
	  s.study();	
	}
}
public class LeiZuoXingCan {
		public static void main(String[] args) {
			StudentDemo sd=new StudentDemo();
			Student ss=new Student();
			sd.method(ss);//�൱�ڽ�ss����s
		}
}
