package cn.itcast_01;

public class sellTicketDemo {
		public static void main(String[] args) {
			sellTicket t=new sellTicket();
			
			Thread t1=new Thread(t,"����1");
			Thread t2=new Thread(t,"����2");
			
			t1.start();
			t2.start();
		}
}
