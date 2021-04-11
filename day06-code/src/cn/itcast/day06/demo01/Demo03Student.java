package cn.itcast.day06.demo01;
/* 如何使用创建好的对象？
 * 
 * 类当中已经定义好了两个组成部分：成员变量，成员方法
 * 所以，根据类创建出来的也有这两个部分
 * 
 * 如何使用对象当中的成员变量？格式：
 * 对象名.成员变量
 * 如何使用对象中的成员方法？格式：
 * 对象名.成员方法（参数）
 * 
 */
public class Demo03Student {
		public static void main(String[] args) {
			student stu=new student();
			System.out.println(stu.name);
			System.out.println(stu.age);
			stu.name="永哥";
			stu.age=19;
			System.out.println(stu.name);
			System.out.println(stu.age);
			stu.eat();
			stu.sleep();
			stu.study();
		}
}
