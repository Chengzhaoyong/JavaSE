package cn.itcast_07;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 *   ͨ����������ķ�ʽȷʵ�ȶ�ȡһ���ֽڵķ�ʽ��ܶ࣬���ԣ�������һ���������Ƿǳ��õ�
 *   �����౻��Ϊ���������ࣨ��Ч�ࣩ
 *   д���ݣ�BufferedOutputStream(OutputStream)
 *   �����ݣ�BufferedOutputStream
 *   
 *     ���췽������ָ���������Ĵ�С����������һ���ò��ϣ���ΪĬ�ϵĻ������͹���
 *     
 *       Ϊʲô������һ��������ļ���ȡ�ļ�·�������Ǵ���һ��OutputStream������
 *       �ֽڻ������������ṩ��������Ϊ��Ч����Ƶģ������Ķ�д�������ÿ�������������ʵ��
 */
public class BufferedOutputStreamDemo {
			public static void main(String[] args) throws IOException {
				BufferedOutputStream bos=new BufferedOutputStream
						(new FileOutputStream("bos.txt"));
				//д����
				bos.write("hello".getBytes());
				
				//�ͷ���Դ
				bos.close();
				
				
			}
}
