package cn.itcast_01;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *   public void write(int b):дһ���ֽ�
 *   public void write(byte[] b):дһ���ֽ�����
 *   public void write(byte[] b,int off,int len):дһ���ֽ������һ����
 */
public class FileOutputStreamDemo2 {
		public static void main(String[] args) throws IOException {
			//�����ֽ����������
			FileOutputStream fos=new FileOutputStream("fos2.txt");
			// public void write(int b):дһ���ֽ�
			fos.write(97);
			
			// public void write(byte[] b):дһ���ֽ�����
			byte[] bys= {97,98,99,100,101};
			fos.write(bys);
			
			//public void write(byte[] b,int off,int len):дһ���ֽ������һ����
			fos.write(bys, 1, 3);
			fos.close();
		}
}
