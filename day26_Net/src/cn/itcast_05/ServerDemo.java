package cn.itcast_05;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
/*
 *    TCPЭ���������
 *      A���������ն�Socket����
 *      B���������ն����ӣ�����һ����Ӧ��Socket����
 *      C����ȡ����������ȡ�����ڿ���̨
 *      D���ͷ���Դ
 */
public class ServerDemo {
	public static void main(String[] args) throws IOException {
	//	  A���������ն�Socket����
		ServerSocket ss=new ServerSocket(10086);
		// B���������ն����ӣ�����һ����Ӧ��Socket����
		Socket s=ss.accept();
		
		//  C����ȡ����������ȡ�����ڿ���̨
		InputStream is=s.getInputStream();
		String ip=s.getInetAddress().getHostAddress();
		
		byte[] bys=new byte[1024];
		int len=is.read(bys);
		String s1=new String(bys,0,len);
		
		System.out.println(ip+":"+s1);
		
		s.close();
	}

}
