package cn.itcast_02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 *   InputStreamReader(InputStream is):��Ĭ�ϵı����ȡ����
 *   InputStreamReader(InputStream is,String charsetName):��Ĭ�ϵı����ȡ����
 *   
 *   
 */
public class InputStreamReadDemo {
			public static void main(String[] args) throws IOException{
				//��������
				InputStreamReader isr=new InputStreamReader(new FileInputStream("ows.txt"));
				//��ȡ����
				int ch=0;
				while((ch=isr.read())!=-1) {
					System.out.print((char)ch);
				}
				//�ͷ���Դ
				isr.close();
				
			}
}
