package cn.itcast_07;

public class sellTicket implements Runnable{
			private static int ticket=100;
			private Object obj=new Object();
			private int x=0;
			public void run() {
				if(x%2==0) {
					
				
				while(true) {
					synchronized(this) {
						
					
					if(ticket>0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"正在出售"+(ticket--)+"张票");
					}
					
				}}
			}
				else {
					sellTicket();
				}
			//	
}
			public  synchronized void sellTicket() {
				while(true) {
				
						
					
					if(ticket>0) {
						try {
							Thread.sleep(100);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+"正在出售"+(ticket--)+"张票");
					}
					
				}
			
			}
}
