package cn.itcast_02;

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
		byte[] bys=new byte[1024];
		int len=bys.length;
		
		DatagramPacket dp=new DatagramPacket(bys,len);
		
		// C������Socket����Ľ��ܷ�����������
		ds.receive(dp);
		
		//  D:�������ݰ�������ʾ�ڿ���̨
		//public byte[] getData():��ȡ���ݻ�����
		//public int getLength():��ȡ���ݵ�ʵ�ʳ���
		byte[] bys2=dp.getData();
		int len2=bys2.length;
		String s=new String(bys,0,len);
		//��ȡ�Է���IP
		InetAddress address=dp.getAddress();
		String ip=address.getHostAddress();
		
		System.out.println(ip+"���͵����ݣ�"+s);
		
		//�ͷ���Դ
		ds.close();
		
	}

}
