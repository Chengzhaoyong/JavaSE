package cn.itcast_04;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class getThread implements Runnable{
	private DatagramSocket ds;
	public getThread(DatagramSocket ds) {
		this.ds=ds;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub\
		try {
		while(true) {
			
			DatagramPacket dp=new DatagramPacket(new byte[1024],new byte[1024].length);
			
			// C：调用Socket对象的接受方法接受数据
			ds.receive(dp);
			
			   String s=new String(dp.getData(),0,dp.getData().length);
			System.out.println(dp.getAddress().getHostAddress()+"传送的数据："+s);
			
			
			}
			
	}catch(IOException e) {
		e.printStackTrace();
		
	}
		}

}
