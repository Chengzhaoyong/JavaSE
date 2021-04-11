package Demo03;

import Demo02.mianshiti;

/*
 * 继承的代码体现
 * 由于继承方法有一个现象：方法重写
 * 就会覆盖父类的方法，所以我们要用关键字final
 * 
 * final可以修饰类，方法，变量
 * 
 * 特点：
 *    final可以修饰类，但是不能被继承
 *    final可以修饰方法，该方法不能重写
 *    final可以修饰变量，该变量不能重写，因为这个变量是个常量
 *    常量：final  int  age=10;-----定义常量
 *  
 *    面试题：final修饰局部变量的问题
 *    
 *    基本类型：基本类型的值不能发生改变
 *    引用类型:引用类型的地址值不能发生改变，但是，该对象的堆内存中的值是可以改变的
 *    
 *       
 */
class Student{
	int age=20;
}
public class final01 {
	public static void main(String[] args) {
		final Student ss=new Student();
		ss.age=200;
		System.out.println(ss.age);
	}
}
