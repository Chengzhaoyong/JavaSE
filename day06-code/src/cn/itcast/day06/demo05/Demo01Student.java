package cn.itcast.day06.demo05;

public class Demo01Student {
		public static void main(String[] args) {
			Student stu=new Student();
			stu.setName("¹��");
			
			stu.setAge(23);
			System.out.println("������"+stu.getName()+"�����䣺"+stu.getAge());
			System.out.println("============");
			Student stu2=new Student("���ෲ",23);
			System.out.println("������"+stu.getName()+"�����䣺"+stu.getAge());
		}
}
