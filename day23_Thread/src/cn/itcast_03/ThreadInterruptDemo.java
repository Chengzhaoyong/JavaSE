package cn.itcast_03;

public class ThreadInterruptDemo {
		public static void main(String[] args) {
			ThreadInterrupt ji1=new ThreadInterrupt();
			
			
			ji1.start();
			
			//�������3�벻�������Ҿ͸�����
			try {
				Thread.sleep(3000);
				ji1.interrupt();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
