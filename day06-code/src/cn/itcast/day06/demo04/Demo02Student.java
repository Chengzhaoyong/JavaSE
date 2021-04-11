package cn.itcast.day06.demo04;

public class Demo02Student {
	public static void main(String[] args) {
		Student one=new Student();
		Student two=new Student(18);
		System.out.println("============");
		
		Student stu=new Student();
		stu.setAge(19);
		stu.setName("ÕÔÀöÓ±");
		System.out.println(stu.getAge());
		System.out.println("ĞÕÃû£º"+stu.getName()+" ÄêÁä£º"+stu.getAge());
		System.out.println("============");
		Student stu2=new Student("ÁøÑÒ",19); 
		System.out.println("ĞÕÃû£º"+stu2.getName()+" ÄêÁä£º"+stu2.getAge());
		
	}
}
