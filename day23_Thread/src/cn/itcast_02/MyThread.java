package cn.itcast_02;

public class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
  public void run() {
	  for(int x=0;x<400;x++) {
		  System.out.println(getName()+":"+x);
	  }
  }
}
