package cn.itcast_04;

public class MyRunnableDemo {
		public static void main(String[] args) {
			MyRunnable m=new MyRunnable();
			Thread t1=new Thread(m,"����ϼ");
			Thread t2=new Thread(m,"����");
			
			t1.start();
			t2.start();
			
		}
}
