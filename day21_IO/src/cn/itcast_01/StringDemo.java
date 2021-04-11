package cn.itcast_01;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/*
 *    String(byte[] bytes,String charsetName):通过指定的字符集解码为字节数组
 *    byte[] getBytes(String charsetName):使用指定的字符集合把字符串解码为字节数组
 */
public class StringDemo {
		public static void main(String[] args) throws UnsupportedEncodingException {
			//String--byte[]
			String s="你好";
			//[-60, -29, -70, -61]
		//	byte[] bys=s.getBytes("UTF-8");  编码和解码不一样  浣犲ソ
			byte[] bys=s.getBytes();
			System.out.println(Arrays.toString(bys));
			
			
			//byte[]-----String
			String ss=new String(bys);
			System.out.println(ss);
		}
}
