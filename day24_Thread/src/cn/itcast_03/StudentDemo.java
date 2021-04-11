package cn.itcast_03;

public class StudentDemo {
		public static void main(String[] args) {
			Student s=new Student();
			
			setThread st=new setThread(s);
			getThread gt=new getThread(s);
			
			Thread s1=new Thread(st);
			Thread s2=new Thread(gt);
			
			s1.start();
			s2.start();
		}
}
