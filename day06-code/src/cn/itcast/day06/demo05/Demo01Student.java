package cn.itcast.day06.demo05;

public class Demo01Student {
		public static void main(String[] args) {
			Student stu=new Student();
			stu.setName("Â¹êÏ");
			
			stu.setAge(23);
			System.out.println("ĞÕÃû£º"+stu.getName()+"£¬ÄêÁä£º"+stu.getAge());
			System.out.println("============");
			Student stu2=new Student("ÎâÒà·²",23);
			System.out.println("ĞÕÃû£º"+stu.getName()+"£¬ÄêÁä£º"+stu.getAge());
		}
}
