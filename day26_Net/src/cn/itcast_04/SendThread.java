package cn.itcast_04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SendThread implements Runnable {
	private DatagramSocket ds;
	public SendThread(DatagramSocket ds) {
		this.ds=ds;
	}
	@Override
	public void run(){
		// TODO Auto-generated method stub
		try {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	     String line=null;
	     while((line=br.readLine())!=null){
	    	 if(line.equals("886")){
	    		 break;
	    	 }
	    	 byte[] bys=line.getBytes();
	    	 int len=bys.length;
	    	   InetAddress address=InetAddress.getByName("10.30.146.14");
	    	     int port=10086;
	    	  DatagramPacket dp=new DatagramPacket(bys,len,address,port);
	    	  
	    // C：调用Socket对象的发送方法发送数据包
	    	  ds.send(dp);
	     }
	     }
		catch(IOException e) {
	    	 e.printStackTrace();
	     }}
	}


