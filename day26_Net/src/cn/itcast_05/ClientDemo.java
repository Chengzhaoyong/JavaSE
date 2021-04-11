package cn.itcast_05;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
/*
 *   TCP协议发送数据
 *     A：创建发射端Socket对象
 *         这一步如果成功，说明成功连接
 *         
 *     B：获取输入流，写入数据
 *     C：释放资源
 */

public class ClientDemo {
  public static void main(String[] args) throws IOException {
	//  A：创建发射端Socket对象
	Socket s=new Socket("永哥",10086);
	// B：获取输入流，写入数据
	OutputStream os=s.getOutputStream();
	
	os.write("hello,我来了".getBytes());
	
	os.close();
	
	
	
	
	
	
}
}
