package cn.itcast_05;
/*
 *    我想依次一次的输出
 *      用过Java提供的唤醒等待机制
 *       
 *       等待唤醒：
 *        Object类中提供了三个方法：
 *            wait():等待
 *            notify():唤醒单个线程
 *            notifyAll():唤醒所有线程
 *         为什么这些方法定义在Thread类中的
 *          这些方法的调用必须通过锁对象调用，而我们刚才使用的锁对象是任意锁对象
 *          所以，这些方法必须定义在Object类中
 */
public class StudentDemo {
		public static void main(String[] args) {
			Student s=new Student();
			
			setThread st=new setThread(s);
			getThread gt=new getThread(s);
			
			Thread s1=new Thread(st);
			Thread s2=new Thread(gt);
			
			s1.start();
			s2.start();
		}
}
