package cn.itcast_03;

public class Student {
	private String name;
	private int age;
	public Student() {
		super();
	}
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
	public String toString() {
		return "姓名："+name+",年龄："+age;
	}
	public boolean equals(Object obj) {
//		return true;要改进
		//String的equals()方法是重写Object类的，比较的是字符串的内容是否相同
		
	//	Student s=(Student)obj;//我们是要使用学生特有的成员变量，所以要向下转型
//		if(this.name.equals(s.name)&&(this.age==s.age)) {
//			return true;
//		}
//		else {
//			return false;
//		}
		
		if(obj==this) {
			return true;//为了提高效率
		}
	 /*
	  * 判断一下，obj是不是学生的一个对象，如果是，向下转型，不是返回false
	  * 格式:对象名  instance  类名
	  * 
	  * 
	  */
		if(!(obj instanceof Student)) {
			return false;
			
		}
		   //如果是就继续
		Student s=(Student)obj;//向下转型
		return this.name.equals(s.name)&&this.age==age;
		
		
		
	}

}
