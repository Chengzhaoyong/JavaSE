package cn.itcast.day06.demo04;

  public class Student {
	private String name;
	private int age;

	public Student() {
		System.out.println("无参数的构造方法执行了");
	}
	public Student(int num) {
		System.out.println("有参数的构造方法执行"+num);
	}
	public Student(String name,int num) {
		this.name=name;
		age=num;
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
