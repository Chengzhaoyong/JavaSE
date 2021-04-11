package cn.itcast_03;

public class ThreadSleepDemo {
		public static void main(String[] args) {
			ThreadSleep my1=new ThreadSleep();
			ThreadSleep my2=new ThreadSleep();
			ThreadSleep my3=new ThreadSleep();
			
			my1.setName("cheng");
			my2.setName("zhao");
			my3.setName("yong");
			
			my1.start();
			my2.start();
			my3.start();
		}
}
