package cn.itcast.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class UploadTcpServer {
    public static void main(String[] args) throws IOException {
         ServerSocket serverSocket = new ServerSocket(8002);

         while(true){

             Socket socket= serverSocket.accept();
             new Thread(new Runnable() {
                 @Override
                 public void run() {
                     try {
                         File file=new File("E:\\upload");
                         if(!file.exists()){
                             file.mkdir();
                         }
                         String dir=System.currentTimeMillis()+new Random().nextInt(9999)+" ";
                         FileOutputStream fos=new FileOutputStream(file+"\\"+dir+"blue.png");
                         InputStream is= socket.getInputStream();
                         int len=0;
                         byte[] bys=new byte[1024];
                         while((len=is.read(bys))!=-1){
                             fos.write(bys,0,len);
                         }

                         OutputStream os= socket.getOutputStream();
                         os.write("上传成功！".getBytes());


                         fos.close();
                         socket.close();
                     }catch (IOException e){
                         System.out.println(e);
                     }

                 }
             }).start();

         }




    }
}
