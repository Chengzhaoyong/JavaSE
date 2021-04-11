package cn.itcast_06;
/*
 *    实现Runnable接口的方式实现
 *     
 *     通过加入延迟，就产生了几个问题
 *      A：相同的票买多次
 *          CPU的操作必须是原子性的
 *       B：出现了负数票
 *                               随机性和延迟导致的
 *                               
 *         出现问题的原因：
 *           A：是否有多线程环境
 *           B:是否有共享数据
 *           C：是否有多条语句操作共享数据
 *           
 *          
 *           
 * 同步代码块：
 *    synchronized(对象){
 *                 需要同步的代码
 *    }
 *    
 *    A：对象是什么呢
 *       我们可以随便创建一个对象
 *    B：需要同步的代码是什么呢
 *    把多条语句操作共享数据的代码包起来
 
 *    注意：同步可以解决安全问题的根本原因就在那个对象上
 *    该对象如同一把锁
 *    多个线程必须是同把锁
 *    
 *  
 *  同步的好处：
 *            同步的出现出现解决了多线程的安全问题
 *
 *同步的弊端：
 *   当线程相当多的时候，因为每个线程都要去判断同步上的锁，这是很浪费资源的，无形中降低程序的运行效率
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
