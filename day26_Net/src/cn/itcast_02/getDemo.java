package cn.itcast_02;

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
		byte[] bys=new byte[1024];
		int len=bys.length;
		
		DatagramPacket dp=new DatagramPacket(bys,len);
		
		// C：调用Socket对象的接受方法接受数据
		ds.receive(dp);
		
		//  D:解析数据包，并显示在控制台
		//public byte[] getData():获取数据缓冲区
		//public int getLength():获取数据的实际长度
		byte[] bys2=dp.getData();
		int len2=bys2.length;
		String s=new String(bys,0,len);
		//获取对方的IP
		InetAddress address=dp.getAddress();
		String ip=address.getHostAddress();
		
		System.out.println(ip+"传送的数据："+s);
		
		//释放资源
		ds.close();
		
	}

}
