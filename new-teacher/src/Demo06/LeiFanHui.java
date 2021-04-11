package Demo06;

/*
 *   返回值类型：
 *       基本类型：（不用讲）
 *       引用类型：
 *       类：返回的是该类的对象
 *       抽象类：返回的是该抽象类的子类对象
 *       接口：返回的是该接口的实现类的对象
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
