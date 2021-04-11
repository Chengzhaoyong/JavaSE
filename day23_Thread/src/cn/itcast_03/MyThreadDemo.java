package cn.itcast_03;

public class MyThreadDemo {
			public static void main(String[] args) {
				ThreadPriority my1=new ThreadPriority();
				ThreadPriority my2=new ThreadPriority();
			
				ThreadPriority my3=new ThreadPriority();
				
				
				my1.setName("cheng");
				my2.setName("zhao");
				my3.setName("yong");
				
//				System.out.println(my1.getPriority());
//				System.out.println(my2.getPriority());
//				System.out.println(my3.getPriority());
				
				my1.setPriority(10);
				my2.setPriority(1);
				
				my1.start();
				my2.start();
				my3.start();
			}
}
