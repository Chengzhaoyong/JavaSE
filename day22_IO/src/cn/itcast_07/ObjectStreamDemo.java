package cn.itcast_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *       序列化流：把对象按照流一样的方式存入文本文件或者在网络中传输。   对象---流数据（ObjectOutputStream ）
 *       序列化流：把文本文件中的流对象数据或者网络中的流对象数据还原成对象。   流数据---对象（ObjectInputStream ）
 */
public class ObjectStreamDemo {
		public static void main(String[] args) throws IOException, ClassNotFoundException {
			//write();
			read();
		}

		private static void read() throws IOException, ClassNotFoundException{
			// TODO Auto-generated method stub
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("oos.txt"));
			
			Object obj=ois.readObject();
			
			//释放资源
			ois.close();
			System.out.println(obj);
		}

		private static void write() throws IOException {
			// TODO Auto-generated method stub
			//创建序列化流对象
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("oos.txt"));
			
			//创建对象
			Person p=new Person("林青霞",27);
			//public final void writeObject(Object b)
			oos.writeObject(p);
			
			//释放资源		
			oos.close();
			
		}
}
