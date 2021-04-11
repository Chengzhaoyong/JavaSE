package cn.itcast_03;
/*
 *   public static void yield():暂停正在执行的线程对象，并执行其他线程
 *   让多个线程执行更和谐，但是不能保证一个一次执行
 */
public class ThreadYieldDemo {
	public static void main(String[] args) {
		ThreadYield ty1=new ThreadYield();
		ThreadYield ty2=new ThreadYield();
		
		ty1.setName("程兆永");
		ty2.setName("帅哥");
		
		ty1.start();
		ty2.start();
	}
}
