package cn.itcast_01;

public class Student {
		private String name;
		private int age;
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
		public Student(String name,int age) {
			super();
			this.age=age;
			this.name = name;
		}
	
		
}
