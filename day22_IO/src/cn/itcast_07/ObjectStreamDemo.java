package cn.itcast_07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
 *       ���л������Ѷ�������һ���ķ�ʽ�����ı��ļ������������д��䡣   ����---�����ݣ�ObjectOutputStream ��
 *       ���л��������ı��ļ��е����������ݻ��������е����������ݻ�ԭ�ɶ���   ������---����ObjectInputStream ��
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
			
			//�ͷ���Դ
			ois.close();
			System.out.println(obj);
		}

		private static void write() throws IOException {
			// TODO Auto-generated method stub
			//�������л�������
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("oos.txt"));
			
			//��������
			Person p=new Person("����ϼ",27);
			//public final void writeObject(Object b)
			oos.writeObject(p);
			
			//�ͷ���Դ		
			oos.close();
			
		}
}
