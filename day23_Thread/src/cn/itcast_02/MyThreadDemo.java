package cn.itcast_02;

public class MyThreadDemo {
	public static void main(String[] args) {
	//	MyThread my1=new MyThread();
	//	MyThread my2=new MyThread();
		
//		my1.setName("程兆永");
//		my2.setName("帅哥");
		
		MyThread my1=new MyThread("程兆永");
		MyThread my2=new MyThread("帅哥");
		
		
		//获取main方法所在的线程名字
		
		//public static Thread currentThread():返回当前线程对象
		System.out.println(Thread.currentThread().getName());
		
		//my1.start();
		//my2.start();
	}
}
