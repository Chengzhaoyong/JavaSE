package cn.itcast_02;

public class MyThreadDemo {
	public static void main(String[] args) {
	//	MyThread my1=new MyThread();
	//	MyThread my2=new MyThread();
		
//		my1.setName("������");
//		my2.setName("˧��");
		
		MyThread my1=new MyThread("������");
		MyThread my2=new MyThread("˧��");
		
		
		//��ȡmain�������ڵ��߳�����
		
		//public static Thread currentThread():���ص�ǰ�̶߳���
		System.out.println(Thread.currentThread().getName());
		
		//my1.start();
		//my2.start();
	}
}
