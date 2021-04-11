package cn.itcast_01;

import java.net.InetAddress;
import java.net.UnknownHostException;
/*
 *    看InetAddress的成员方法
 *    public static InetAddress getByName(String  host):根据IP地址和主机名的字符串得到IP地址对象
 */
public class InetAdressDemo {
	public static void main(String[] args) throws UnknownHostException {
		InetAddress address=InetAddress.getByName("永哥");
		
		String s=address.getHostAddress();
		String s1=address.getHostName();
		
		System.out.println(s);
		System.out.println(s1);
	}

}
