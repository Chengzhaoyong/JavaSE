package cn.itcast_03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/*
 *    
 *    UDPЭ��������ݣ�
 *       A���������ܶ�Socket����
 *       B��	����һ�����ݰ�������������
 *       C������Socket����Ľ��ܷ�����������
 *       D:�������ݰ�������ʾ�ڿ���̨
 *       E���ͷ���Դ
 */
public class getDemo {
	public static void main(String[] args) throws IOException {
		//  A���������ܶ�Socket����
		DatagramSocket ds=new DatagramSocket(10086);
		
		 // B��	����һ�����ݰ�������������
		//DatagramPacket(byte[] bys,int len)
		while(true) {
		
		DatagramPacket dp=new DatagramPacket(new byte[1024],new byte[1024].length);
		
		// C������Socket����Ľ��ܷ�����������
		ds.receive(dp);
		
		   String s=new String(dp.getData(),0,dp.getData().length);
		System.out.println(dp.getAddress().getHostAddress()+"���͵����ݣ�"+s);
		
		
		}
		
	}

}
