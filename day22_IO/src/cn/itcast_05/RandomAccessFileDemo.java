package cn.itcast_05;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * 
 *    �����������  
 *      RandomAccessFile�಻����������object�������
 *                 �����ں���InputStream��OutputStream�Ĺ���
 *                ֧�ֶ��ļ���������ʶ�ȡ��д��
 *       
 *       public RandomAccessFile(String name,String mode):��һ���������ļ�·�����ڶ��������ǲ����ļ��ĸ�ʽ��
 *       ģʽ�����֣����õ���rw�����ַ�ʽ��ʾ����д���ݣ�Ҳ���Զ�����
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
		System.out.println("��ǰ�ļ���ָ��λ�ã�"+raf.getFilePointer());
		char b=raf.readChar();
		System.out.println(b);
		System.out.println("��ǰ�ļ���ָ��λ�ã�"+raf.getFilePointer());
		String c=raf.readUTF();
		System.out.println(c);
		System.out.println("��ǰ�ļ���ָ��λ�ã�"+raf.getFilePointer());//��14   �ӵ�ǰ�ļ�ָ���ȡ�����ֽڣ�
	      //��ֵ�����ѱ����ַ��������ֽ����������ǽ���ַ����ĳ��ȣ������ֽ�Ȼ�����ΪUTF�޸İ��ʽ���ֽڱ����ַ�
		
		raf.seek(4);  //���������ļ�ָ��λ��
		System.out.println("��ǰ�ļ���ָ��λ�ã�"+raf.getFilePointer());
		char b1=raf.readChar();
		System.out.println(b1);
	}

	private static void write() throws IOException {
		// TODO Auto-generated method stub
		RandomAccessFile raf=new RandomAccessFile("raf.txt","rw");
		
		raf.writeInt(100);
		raf.writeChar('a');
		
		raf.writeUTF("�й�");
		raf.close();
		
	}
}
