package cn.itcast_03;

public class ThreadDaemon extends Thread{
	public void run() {
		for(int x=0;x<100;x++) {
			System.out.println(getName()+":"+x);
		}
	}
}
