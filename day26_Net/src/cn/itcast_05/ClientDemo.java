package cn.itcast_05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/*
 *   TCPЭ�鷢������
 *     A�����������Socket����
 *         ��һ������ɹ���˵���ɹ�����
 *         
 *     B����ȡ��������д������
 *     C���ͷ���Դ
 */

public class ClientDemo {
  public static void main(String[] args) throws IOException {
	//  A�����������Socket����
	Socket s=new Socket("����",10086);
	// B����ȡ��������д������
	OutputStream os=s.getOutputStream();
	
	os.write("hello,������".getBytes());
	
	os.close();
	
	
	
	
	
	
}
}
