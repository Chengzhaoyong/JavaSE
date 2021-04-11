package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *    
 *    UDP协议接受数据：
 *       A：创建接受端Socket对象
 *       B：	创建一个数据包（接受容器）
 *       C：调用Socket对象的接受方法接受数据
 *       D:解析数据包，并显示在控制台
 *       E：释放资源
 */
public class getDemo {
	public static void main(String[] args) throws IOException {
		//  A：创建接受端Socket对象
		DatagramSocket ds=new DatagramSocket(10086);
		
		 // B：	创建一个数据包（接受容器）
		//DatagramPacket(byte[] bys,int len)
		while(true) {
		
		DatagramPacket dp=new DatagramPacket(new byte[1024],new byte[1024].length);
		
		// C：调用Socket对象的接受方法接受数据
		ds.receive(dp);
		
		   String s=new String(dp.getData(),0,dp.getData().length);
		System.out.println(dp.getAddress().getHostAddress()+"传送的数据："+s);
		
		
		}
		
	}

}
