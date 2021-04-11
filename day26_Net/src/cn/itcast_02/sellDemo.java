package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
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
	      byte[] bys="hello,我来了".getBytes();
	      //长度
	      int len=bys.length;
	      //IP地址对象
	      InetAddress address=InetAddress.getByName("10.30.146.14");
	      //端口
	      int port=10086;
	       DatagramPacket dp=new DatagramPacket(bys,len,address,port);
	       
	       // C：调用Socket对象的发送方法发送数据包
	       ds.send(dp);
	       
	       //释放资源
	       ds.close();
	       
	       
	       
	    
	      
	      
	      
	      
	}
	

}
