package cn.itcast_01;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/*
 *   IO��ķ��ࣺ
 *      ����
 *          ������      ��ȡ����
 *          �������   д������
 *     �������ͣ��ֽ���
 *                                      �ֽ�������    ��ȡ����    InputStream
 *                                      �ֽ������     д������      OutStream
 *                         �ַ�����
 *                                         �ַ���������  ��ȡ����     Reader
 *                                         �ַ������      д������     Writer
 *                                         
 *                                         
 *       ע�⣺һ�������̽��IO�������û����ȷ�����ַ�����˵��Ĭ��������ǰ��������������ֵ�
 *       
 *       �������ı�������һ�仰��hello,io
 *       
 *       ������
 *       A���������������ַ��������������أ��ַ��������ֽ���֮��ų��ֵģ����ԣ��������Ƚ��ֽ�����β�����
 *       B:��������Ҫ���ļ���дһ�仰���������ǲ����ֽ������OutputStream
 *       
 *       
 *       
 *   �ֽ���������������裺
 *        A�������ֽ����������
 *        B��д����
 *        C���ͷ���Դ
 *        
 *       
 */
public class FileOutputStreamDemo {	
		public static void main(String[] args) throws IOException {
			//�����ַ������
			FileOutputStream fos=new FileOutputStream("fos.txt");
			/*�����ַ���������������˼�������
			 * 1.����ϵͳ����ȥ�����ļ�
			 * 2.����fos����
			 * 3.��fos����ָ������ļ�
			 * 
			 */
			//д����
			fos.write("hello,IO".getBytes());
			fos.write("java".getBytes());
			fos.write("java".getBytes());
			fos.write("java".getBytes());
			
			//�ͷ���Դ
			//�رմ��ļ���������ͷ�������йص�����ϵͳ��Դ
			fos.close();
			//ΪʲôҪclose����
			//A�����������������������Ϳ��Ա�����������
			//B��֪ͨϵͳȥ�ͷŸ��ļ������Դ
			
			
			
		}
}
