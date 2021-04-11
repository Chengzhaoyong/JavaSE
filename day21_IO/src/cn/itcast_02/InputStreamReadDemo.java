package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *   InputStreamReader(InputStream is):用默认的编码读取数据
 *   InputStreamReader(InputStream is,String charsetName):用默认的编码读取数据
 *   
 *   
 */
public class InputStreamReadDemo {
			public static void main(String[] args) throws IOException{
				//创建对象
				InputStreamReader isr=new InputStreamReader(new FileInputStream("ows.txt"));
				//读取数据
				int ch=0;
				while((ch=isr.read())!=-1) {
					System.out.print((char)ch);
				}
				//释放资源
				isr.close();
				
			}
}
