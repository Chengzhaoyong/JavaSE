package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 *    ��InetAddress�ĳ�Ա����
 *    public static InetAddress getByName(String  host):����IP��ַ�����������ַ����õ�IP��ַ����
 */
public class InetAdressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address=InetAddress.getByName("����");
		
		String s=address.getHostAddress();
		String s1=address.getHostName();
		
		System.out.println(s);
		System.out.println(s1);
	}

}
