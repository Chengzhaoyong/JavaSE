package cn.itcast_02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 *    OutputStreamWriter(OutputStream out):����Ĭ�ϱ�����ֽ���������ת���ַ���
 *    OutputStreamWriter(OutputStream out,String charsetName):����ָ��������ֽ���������ת��Ϊ�ַ���
 *    
 *    ���ַ���ת��Ϊ�ַ���
 *      �ַ���=�ֽ���+�����
 *      
 */
public class OutputStreamWriterDDemo {
	public static void main(String[] args) throws IOException{
		//��������
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("ows.txt"));
		
		//д����
		osw.write("�й�");
		
		//�ͷ���Դ
		osw.close();
		
		
	}
}
