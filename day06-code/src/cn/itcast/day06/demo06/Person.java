package cn.itcast.day06.demo06;

public class Person {
		private String name;
		private int age;
		public Person() {
			
		}
		
		public Person(String name, int age) {
			this.name = name;
			this.age = age;
		}
		public void sayHello(String name) {
			System.out.println(name+",你好。我叫"+this.name+",今年"+this.age);
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
