package cn.itcast_03;

import java.util.Date;

public class ThreadInterrupt extends Thread{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("�߳̿�ʼ��"+new Date());
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("�߳��ж�");
		}
		System.out.println("ִ�н�����"+new Date());
	}
		
}
