package cn.itcast_08;

public class ThreadDemo {
		public static void main(String[] args) {
			//继承Thread类实现多线程
//			new Thread() {
//				public void run() {
//				for(int x=0;x<100;x++) {
//					System.out.println(Thread.currentThread().getName()+":"+x);
//				}
//				}
//			}.start();
			
			
			//实现Runnable接口实现线程
//			new Thread(new Runnable() {
//				public void run() {
//					for(int x=0;x<100;x++) {
//						System.out.println("hello"+x);
//					}
//				}
//			}).start();
			
			
			//更复杂的
			new Thread(new Runnable() {
				public void run() {
					for(int x=0;x<100;x++) {
						System.out.println("hello"+x);
					}
				}
			}) {
				public void run() {
					for(int x=0;x<100;x++) {
						System.out.println("world"+x);
					}
				}
			}.start();
			
		}
}
