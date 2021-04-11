package cn.itcast.day06.demo05;
/*
 * 如何定义一个”标准的类“
 * 
 * 1.所有的成员变量都需要用private私有化
 * 2.为每个成员变量编写一对Getter Setter方法；
 * 3.编写一个无参数的构造方法；
 * 4.编写一个全参数的构造方法。
 * POJO类    ：Plain old java object
 * 
 */
public class Student {
	private String name;
	private int age;
	public Student() {
	}

	public Student(String name, int age) {
	    this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
