package cn.itcast.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);

       Socket socket= serverSocket.accept();

      InputStream is= socket.getInputStream();
        byte[] bys=new byte[1024];
        int len=is.read(bys);
        System.out.println(new String(bys,0,len));

        OutputStream os= socket.getOutputStream();
        os.write("你好，客户端".getBytes());

        serverSocket.close();
        socket.close();



    }
}
