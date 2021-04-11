package cn.itcast_01;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *   public void write(int b):写一个字节
 *   public void write(byte[] b):写一个字节数组
 *   public void write(byte[] b,int off,int len):写一个字节数组的一部分
 */
public class FileOutputStreamDemo2 {
		public static void main(String[] args) throws IOException {
			//创建字节输出流对象
			FileOutputStream fos=new FileOutputStream("fos2.txt");
			// public void write(int b):写一个字节
			fos.write(97);
			
			// public void write(byte[] b):写一个字节数组
			byte[] bys= {97,98,99,100,101};
			fos.write(bys);
			
			//public void write(byte[] b,int off,int len):写一个字节数组的一部分
			fos.write(bys, 1, 3);
			fos.close();
		}
}
