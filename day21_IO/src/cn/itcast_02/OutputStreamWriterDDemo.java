package cn.itcast_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *    OutputStreamWriter(OutputStream out):根据默认编码把字节流的数据转换字符流
 *    OutputStreamWriter(OutputStream out,String charsetName):根据指定编码把字节流的数据转换为字符流
 *    
 *    把字符流转换为字符流
 *      字符流=字节流+编码表
 *      
 */
public class OutputStreamWriterDDemo {
	public static void main(String[] args) throws IOException{
		//创建对象
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("ows.txt"));
		
		//写数据
		osw.write("中国");
		
		//释放资源
		osw.close();
		
		
	}
}
