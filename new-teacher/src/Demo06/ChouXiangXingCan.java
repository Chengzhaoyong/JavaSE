package Demo06;

abstract class Person{
	public abstract void study();
}//�����಻�ܴ�������
class PersonDemo{
	public void method(Person p) {//p��ʵҪ���Ƕ���
		p.study();//p=new Student();   Person p=new Student();
	}
}

//����һ��ѧ����
class Student1 extends Person{
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
			
}
public class ChouXiangXingCan {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Student1();// ����person�ǳ��󣬲���ʵ������ֻ��ͨ�������
		pd.method(p);
		
	}

}
