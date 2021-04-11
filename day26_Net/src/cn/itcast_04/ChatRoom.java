package cn.itcast_04;

import java.io.IOException;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ChatRoom {
	public static void main(String[] args) throws SocketException ,IOException{
		DatagramSocket dssend=new DatagramSocket();
		DatagramSocket dsget=new DatagramSocket(10086);
		
		
		SendThread st=new SendThread(dssend);
		getThread gt=new getThread(dsget);
		
		
		Thread t1=new Thread(st);
		Thread t2=new Thread(gt);
		
		t1.start();
		t2.start();
		
		
		
	}

}
