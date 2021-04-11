package cn.itcast_02;

public class Student {
	
	private Student() {
		
	}
	
	static Student s=new Student();
	
	public static Student getStudent() {
		return s;
	}

}
