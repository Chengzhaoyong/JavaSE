package cn.itcast.day06.demo04;

public class Demo02Student {
	public static void main(String[] args) {
		Student one=new Student();
		Student two=new Student(18);
		System.out.println("============");
		
		Student stu=new Student();
		stu.setAge(19);
		stu.setName("����ӱ");
		System.out.println(stu.getAge());
		System.out.println("������"+stu.getName()+" ���䣺"+stu.getAge());
		System.out.println("============");
		Student stu2=new Student("����",19); 
		System.out.println("������"+stu2.getName()+" ���䣺"+stu2.getAge());
		
	}
}
