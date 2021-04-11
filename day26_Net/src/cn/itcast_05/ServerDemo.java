package cn.itcast_05;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/*
 *    TCP协议接受数据
 *      A：创建接收端Socket对象
 *      B：监听接收端连接，返回一个对应的Socket对象
 *      C；获取输入流，读取数据在控制台
 *      D：释放资源
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
	//	  A：创建接收端Socket对象
		ServerSocket ss=new ServerSocket(10086);
		// B：监听接收端连接，返回一个对应的Socket对象
		Socket s=ss.accept();
		
		//  C；获取输入流，读取数据在控制台
		InputStream is=s.getInputStream();
		String ip=s.getInetAddress().getHostAddress();
		
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String s1=new String(bys,0,len);
		
		System.out.println(ip+":"+s1);
		
		s.close();
	}

}
