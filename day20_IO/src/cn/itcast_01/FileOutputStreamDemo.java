package cn.itcast_01;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *   IO类的分类：
 *      流向：
 *          输入流      读取数据
 *          输出流：   写出数据
 *     数据类型：字节流
 *                                      字节输入流    读取数据    InputStream
 *                                      字节输出流     写出数据      OutStream
 *                         字符流：
 *                                         字符输入流：  读取数据     Reader
 *                                         字符输出流      写出数据     Writer
 *                                         
 *                                         
 *       注意：一般情况在探讨IO流，如果没有明确按那种分类来说，默认情况下是按照数据类型来分的
 *       
 *       需求：往文本中输入一句话：hello,io
 *       
 *       分析：
 *       A：这个操作最好用字符流来做，但是呢，字符流是在字节流之后才出现的，所以，今天我先讲字节流如何操作的
 *       B:由于我是要往文件中写一句话，所以我们采用字节输出流OutputStream
 *       
 *       
 *       
 *   字节流输出流操作步骤：
 *        A：创建字节输出流对象
 *        B：写数据
 *        C：释放资源
 *        
 *       
 */
public class FileOutputStreamDemo {	
		public static void main(String[] args) throws IOException {
			//创建字符输出流
			FileOutputStream fos=new FileOutputStream("fos.txt");
			/*创建字符流输出流对象做了几件事情
			 * 1.调用系统功能去创建文件
			 * 2.创建fos对象
			 * 3.把fos对象指向这个文件
			 * 
			 */
			//写数据
			fos.write("hello,IO".getBytes());
			fos.write("java".getBytes());
			fos.write("java".getBytes());
			fos.write("java".getBytes());
			
			//释放资源
			//关闭此文件输出流并释放与此流有关的所有系统资源
			fos.close();
			//为什么要close（）
			//A：让流对象变成垃圾，这样就可以被垃圾回收了
			//B：通知系统去释放该文件相关资源
			
			
			
		}
}
