package cn.itcast_05;

public class sellTicket implements Runnable{
			private int ticket=100;
			public void run() {
				while(ticket>0) {
					System.out.println(Thread.currentThread().getName()+"���ڳ���"+(ticket--)+"��Ʊ");
				}
			}
}
