package cn.itcast_05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 
 *    随机访问流：  
 *      RandomAccessFile类不属于流，是object类的子类
 *                 但它融合了InputStream和OutputStream的功能
 *                支持对文件的随机访问读取和写入
 *       
 *       public RandomAccessFile(String name,String mode):第一个参数是文件路径，第二个参数是操作文件的格式。
 *       模式有四种，常用的是rw，这种方式表示可以写数据，也可以读数据
 */
public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		write();
		read();
	}

	private static void read() throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
		
		int a=raf.readInt();
		System.out.println(a);
		System.out.println("当前文件的指针位置："+raf.getFilePointer());
		char b=raf.readChar();
		System.out.println(b);
		System.out.println("当前文件的指针位置："+raf.getFilePointer());
		String c=raf.readUTF();
		System.out.println(c);
		System.out.println("当前文件的指针位置："+raf.getFilePointer());//：14   从当前文件指针读取两个字节，
	      //此值给出已编码字符串随后的字节数，而不是结果字符串的长度，随后的字节然后解释为UTF修改版格式的字节编码字符
		
		raf.seek(4);  //可以设置文件指针位置
		System.out.println("当前文件的指针位置："+raf.getFilePointer());
		char b1=raf.readChar();
		System.out.println(b1);
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
		
		raf.writeInt(100);
		raf.writeChar('a');
		
		raf.writeUTF("中国");
		raf.close();
		
	}
}
