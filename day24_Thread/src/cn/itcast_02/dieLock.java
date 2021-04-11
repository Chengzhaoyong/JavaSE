package cn.itcast_02;

public class dieLock extends Thread{
	private boolean flag;
	
	public dieLock(boolean flag) {
		this.flag=flag;
	}
	public void run() {
		if(flag) {
			synchronized (MyLock.obj) {
				System.out.println("if obj");
				synchronized (MyLock.obj1) {
					System.out.println("else obj1");
				}
			}
		}
		else {
			synchronized (MyLock.obj1) {
				System.out.println("if obj1");
				synchronized (MyLock.obj) {
					System.out.println("else obj");
				}
			}
		}
	}
}
