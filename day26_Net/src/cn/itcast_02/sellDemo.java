package cn.itcast_02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
/*
 *    UDPЭ�鷢�����ݣ�
 *       A�����������Socket����
 *       B��	�������ݣ��������ݴ��
 *       C������Socket����ķ��ͷ����������ݰ�
 *       D:�ͷ���Դ
 */

public class sellDemo {
	public static void main(String[] args) throws IOException {
	//	  A�����������Socket����
		DatagramSocket ds=new DatagramSocket();
		
		//  B���������ݣ��������ݴ��
		//��������
	      byte[] bys="hello,������".getBytes();
	      //����
	      int len=bys.length;
	      //IP��ַ����
	      InetAddress address=InetAddress.getByName("10.30.146.14");
	      //�˿�
	      int port=10086;
	       DatagramPacket dp=new DatagramPacket(bys,len,address,port);
	       
	       // C������Socket����ķ��ͷ����������ݰ�
	       ds.send(dp);
	       
	       //�ͷ���Դ
	       ds.close();
	       
	       
	       
	    
	      
	      
	      
	      
	}
	

}
