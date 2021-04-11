package cn.itcast.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClient {
    public static void main(String[] args) throws IOException {
        //创建客户端对象  连接服务器的ip地址和端口号
        Socket socket=new Socket("127.0.0.1",8888);

       OutputStream os= socket.getOutputStream();

       os.write("你好，服务器".getBytes());

      InputStream is= socket.getInputStream();
      byte[] bys=new byte[1024];
      int len=is.read(bys);
      System.out.println(new String(bys,0,len));

      socket.close();

    }
}
