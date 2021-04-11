package cn.itcast_06;

public class sellTicket implements Runnable{
			private int ticket=100;
			private Object obj=new Object();
			public void run() {
				while(true) {
					synchronized(obj) {
						
					
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
}}
