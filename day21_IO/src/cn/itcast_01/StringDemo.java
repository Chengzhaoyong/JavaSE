package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *    String(byte[] bytes,String charsetName):ͨ��ָ�����ַ�������Ϊ�ֽ�����
 *    byte[] getBytes(String charsetName):ʹ��ָ�����ַ����ϰ��ַ�������Ϊ�ֽ�����
 */
public class StringDemo {
		public static void main(String[] args) throws UnsupportedEncodingException {
			//String--byte[]
			String s="���";
			//[-60, -29, -70, -61]
		//	byte[] bys=s.getBytes("UTF-8");  ����ͽ��벻һ��  你好
			byte[] bys=s.getBytes();
			System.out.println(Arrays.toString(bys));
			
			
			//byte[]-----String
			String ss=new String(bys);
			System.out.println(ss);
		}
}
