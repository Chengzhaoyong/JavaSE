package cn.itcast_04;

public class Student implements Comparable<Student>{
	private String name;
	  private int age;
	  public Student(String name, int age) {
			super();
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
	
	public int compareTo(Student s) {
		int num=this.age-s.age;
		int num2=num==0?s.name.compareTo(this.name):num;
		
		return num2;
	}
}
