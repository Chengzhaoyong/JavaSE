package cn.itcast_05;

public class sellTicketDemo {
		public static void main(String[] args) {
			sellTicket st=new sellTicket();
			
			Thread t1=new Thread(st,"´°¿Ú1");
			Thread t2=new Thread(st,"´°¿Ú2");
			Thread t3=new Thread(st,"´°¿Ú3");
			
			t1.start();
			t2.start();
			t3.start();
			
		}
}
