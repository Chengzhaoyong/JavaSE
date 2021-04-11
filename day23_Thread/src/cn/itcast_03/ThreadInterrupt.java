package cn.itcast_03;

import java.util.Date;

public class ThreadInterrupt extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("线程开始："+new Date());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("线程中断");
		}
		System.out.println("执行结束："+new Date());
	}
		
}
