package Demo06;

abstract class Person{
	public abstract void study();
}//抽象类不能创建对象
class PersonDemo{
	public void method(Person p) {//p其实要的是对象
		p.study();//p=new Student();   Person p=new Student();
	}
}

//定义一个学生类
class Student1 extends Person{
	public void study() {
		System.out.println("Good Good Study,Day Day Up");
	}
			
}
public class ChouXiangXingCan {
	public static void main(String[] args) {
		PersonDemo pd = new PersonDemo();
		Person p = new Student1();// 由于person是抽象，不能实例化，只能通过子类调
		pd.method(p);
		
	}

}
