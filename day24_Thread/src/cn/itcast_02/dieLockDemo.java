package cn.itcast_02;

public class dieLockDemo {
		public static void main(String[] args) {
			dieLock d1=new dieLock(true);
			dieLock d2=new dieLock(false);
			
			d1.start();
			d2.start();
		}
}
