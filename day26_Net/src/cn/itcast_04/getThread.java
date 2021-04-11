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
			
			// C������Socket����Ľ��ܷ�����������
			ds.receive(dp);
			
			   String s=new String(dp.getData(),0,dp.getData().length);
			System.out.println(dp.getAddress().getHostAddress()+"���͵����ݣ�"+s);
			
			
			}
			
	}catch(IOException e) {
		e.printStackTrace();
		
	}
		}

}
