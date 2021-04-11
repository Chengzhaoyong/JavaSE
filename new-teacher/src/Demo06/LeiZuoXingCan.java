package Demo06;
/*
 *     形式参数：
 *     	基本类型：
 *     	引用类型：
 *                  类：（匿名对象的时候我们已经讲过了）  需要的是该类的对象
 *                 抽象类:需要的是该对象类的子类对象
 *               接口：该接口的实现对象
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
			sd.method(ss);//相当于将ss传给s
		}
}
