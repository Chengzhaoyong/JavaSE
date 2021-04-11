package Demo04;
/*
 * 抽象类的概述：
 *   动物不应该定义为具体的东西，而且动物中的吃，睡，也不应该是具体的
 *   我们把一个不是具体的功能称为抽象的功能呢，而一个类中如果有抽象的功能，该类必须是抽象类
 *   
 *   抽象类的特点：
 *   1.抽象类和抽象方法必须用abstract关键字修饰
 *   2.抽象类中不一定有抽象方法，但是有抽象方法的类必须定义为抽象类
 *   3.抽象类不能实例化
 *   因为它不是具体的
 *   抽象类中有构造方法，但是不能实例化?构造方法有什么用呢
 *   用于子类访问父类数据的初始化
 *   
 *   4.抽象的子类:
 *   A:如果不想重写抽象方法，该子类是个抽象类
 *   B：重写所有的抽象方法，这个时候子类是个具体类
 *   
 */

abstract class Animal{//抽象类的声明格式
	public abstract void eat();
}

abstract class Dog extends Animal{
	//如果不想重写抽象方法，该子类是个抽象类
}
 class Cat extends Animal{
	public void eat() {
		System.out.println("猫吃鱼");
	}
}
public class AbstractDemo01 {
		public static void main(String[] args) {
			//通过多态的
			Animal a=new Cat();
			a.eat();
			 
		}
}
