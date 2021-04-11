package cn.itcast_02;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/*
 * �ڴ����飺���ڴ�����ʷ�洢��Ϣ�ģ�������������ݴ��ڴ�����ʧ
 *   �ֽ����飺 
 *       ByteArrayInputStream   //����ʶ���ˣ����ַ�����
 *       ByteArrayOutputStream
 *       
 *  �ַ����飺
 *      CharArrayReader    //������ֽڵ�һ��
 *      CharArrayWriter
 * 
 * �ַ�����
 *      StringReader
 *      StringWriter
 */
public class ByteArrayStreamDemo {
		public static void main(String[] args) throws IOException {
			ByteArrayOutputStream baos=new ByteArrayOutputStream();
			
			for(int i=0;i<10;i++) {
				baos.write(("hello"+i).getBytes());
			}
			//�ͷ���Դ
			//ͨ���鿴Դ������֪������ʲô��û�������Ը�������Ҫclose()
			//baos.close();
			
			byte[] bys=baos.toByteArray();
			ByteArrayInputStream bais=new ByteArrayInputStream(bys);
			int by=0;
			while((by=bais.read())!=-1) {
				System.out.print((char)by);
				
			}
		}
}
