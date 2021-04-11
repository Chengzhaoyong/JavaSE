package Demo01;
/*
 * 继承的注意事项：
 * 1.子类只能继承父类所有非私有的成员（成员变量和成员方法）
 * 2.子类不能继承父类的构造方法，凡是可以通过super（后面讲）关键字去访问父类的构造方法
 * 3.不要为了部分功能去继承
 * 			class A{
 *           public void show(){}
 *           public void show2(){}
 *  		class B{
 *           public void show3(){}
 *           public void show4(){}
 *           //我们发现B类中出现和A类一样的show2()方法，所以，我们就用继承来体现
 *           class B extends A{
 *           public void show3();
 *           } 
 *  		这样其实是不好的，因为你这样的话不但有了show2(),还多了show1()...
 *                           有可能show1()就是你不想要的。
 *                           
 *          那么，我们什么时候考虑继承呢
 *          继承其实体现的是一种关系：“is a”.
 *          Person 
 *             Student
 *             Teacher
 *             水果
 *                 苹果
 *                 雪梨
 *             
 *  */

class Ba{
	private int num=10;
	private int num2=20;
	private void method() {
		System.out.println(num);
		System.out.println(num2);
	}
	public void show() {
		System.out.println(num);
		System.out.println(num2);
	}
}

class Zi extends Ba{
	
}
public class ExtendsDemo02 {
	public static void main(String[] args) {
	 Zi s=new Zi();
	 s.show();
//	 s.method();
	}
}
