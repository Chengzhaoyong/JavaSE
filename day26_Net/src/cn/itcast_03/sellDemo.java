package cn.itcast_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
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
	    	  
	    // C������Socket����ķ��ͷ����������ݰ�
	    	  ds.send(dp);
	    	  
	    	 
	     }
	    
	   
	}
	

}
