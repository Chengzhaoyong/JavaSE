package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * 内存数组：用于处理历史存储信息的，程序结束，数据从内存中消失
 *   字节数组： 
 *       ByteArrayInputStream   //中文识别不了，用字符数组
 *       ByteArrayOutputStream
 *       
 *  字符数组：
 *      CharArrayReader    //步骤和字节的一样
 *      CharArrayWriter
 * 
 * 字符串：
 *      StringReader
 *      StringWriter
 */
public class ByteArrayStreamDemo {
		public static void main(String[] args) throws IOException {
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			
			for(int i=0;i<10;i++) {
				baos.write(("hello"+i).getBytes());
			}
			//释放资源
			//通过查看源码我们知道这里什么都没做，所以根本不需要close()
			//baos.close();
			
			byte[] bys=baos.toByteArray();
			ByteArrayInputStream bais=new ByteArrayInputStream(bys);
			int by=0;
			while((by=bais.read())!=-1) {
				System.out.print((char)by);
				
			}
		}
}
