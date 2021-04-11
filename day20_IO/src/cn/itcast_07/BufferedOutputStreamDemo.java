package cn.itcast_07;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   通过定义数组的方式确实比读取一个字节的方式快很多，所以，看来有一个缓冲区是非常好的
 *   这种类被称为：缓冲区类（高效类）
 *   写数据：BufferedOutputStream(OutputStream)
 *   读数据：BufferedOutputStream
 *   
 *     构造方法可以指定缓冲区的大小，但是我们一般用不上，因为默认的缓冲区就够了
 *     
 *       为什么不传递一个具体的文件获取文件路径，而是传递一个OutputStream对象呢
 *       字节缓冲区流仅仅提供缓冲区，为高效而设计的，真正的读写操作还得靠基本的流对象实现
 */
public class BufferedOutputStreamDemo {
			public static void main(String[] args) throws IOException {
				BufferedOutputStream bos=new BufferedOutputStream
						(new FileOutputStream("bos.txt"));
				//写数据
				bos.write("hello".getBytes());
				
				//释放资源
				bos.close();
				
				
			}
}
