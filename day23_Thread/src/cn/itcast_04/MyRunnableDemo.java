package cn.itcast_04;

public class MyRunnableDemo {
		public static void main(String[] args) {
			MyRunnable m=new MyRunnable();
			Thread t1=new Thread(m,"¡÷«‡œº");
			Thread t2=new Thread(m,"¡ı“‚");
			
			t1.start();
			t2.start();
			
		}
}
