package cn.itcast_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
/*
 *    UDP协议发送数据：
 *       A：创建发射端Socket对象
 *       B：	创建数据，并把数据打包
 *       C：调用Socket对象的发送方法发送数据包
 *       D:释放资源
 */

public class sellDemo {
	public static void main(String[] args) throws IOException {
	//	  A：创建发射端Socket对象
		DatagramSocket ds=new DatagramSocket();
		
		//  B：创建数据，并把数据打包
		//创建数据
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
	

}
