package cn.itcast_03;

public class ThreadPriority extends Thread {

	  public void run() {
		  for(int x=0;x<200;x++) {
			  System.out.println(getName()+":"+x);
		  }
	  }
}
