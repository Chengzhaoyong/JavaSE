package cn.itcast_03;

public class ThreadJionDemo {
		public static void main(String[] args) {
			ThreadJion tj1=new ThreadJion();
			ThreadJion tj2=new ThreadJion();
			ThreadJion tj3=new ThreadJion();
			
			tj1.setName("��Ԩ");
			tj2.setName("������");
			tj3.setName("��Ԫ��");
			
			tj1.start();
			try {
				tj1.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			tj2.start();
			tj3.start();
		}
}
