package cn.itcast_01;

public class sellTicketDemo {
		public static void main(String[] args) {
			sellTicket t=new sellTicket();
			
			Thread t1=new Thread(t,"´°¿Ú1");
			Thread t2=new Thread(t,"´°¿Ú2");
			
			t1.start();
			t2.start();
		}
}
