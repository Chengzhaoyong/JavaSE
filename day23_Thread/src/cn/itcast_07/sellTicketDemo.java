package cn.itcast_07;
/*
 *   A：同步代码块的锁对象是什么
 *       任意对象
 *   B：同步方法的格式及锁对象问题
 *           把同步关键字加在方法上
 *   
 *     同步方法的是谁呢
 *      this
 *   
 *   C:静态方法及锁对象问题
 *     静态方法的锁对象
 *     类的字节码文件对象
 *     
 */
 
public class sellTicketDemo {
		public static void main(String[] args) {
			sellTicket st=new sellTicket();
			
			Thread t1=new Thread(st,"窗口1");
			Thread t2=new Thread(st,"窗口2");
			Thread t3=new Thread(st,"窗口3");
			
			t1.start();
			t2.start();
			t3.start();
			
		}
}
