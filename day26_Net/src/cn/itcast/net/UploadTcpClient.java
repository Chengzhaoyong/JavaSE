package cn.itcast.net;

import java.io.*;
import java.net.Socket;

public class UploadTcpClient {
    public static void main(String[] args) throws IOException {
        Socket socket=new Socket("127.0.0.1",8002);

       OutputStream os= socket.getOutputStream();
       File file=new File("E:\\blue.png");

        FileInputStream fis=new FileInputStream(file);
     int len=0;
     byte[] bys=new byte[1024];
        while((len=fis.read(bys))!=-1){
            os.write(bys,0,len);
        }
        socket.shutdownOutput();
        //读取服务器发来的消息
        InputStream is=socket.getInputStream();
        while((len=is.read(bys))!=-1){
            System.out.println(new String(bys,0,len));
        }


        fis.close();
        os.close();

    }
}
