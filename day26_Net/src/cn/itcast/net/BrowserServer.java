package cn.itcast.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.InvalidPropertiesFormatException;

public class BrowserServer {
    public static void main(String[] args) throws IOException{
        ServerSocket serverSocket = new ServerSocket(8100);



        while(true){
            Socket socket = serverSocket.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                 try{
                     InputStream is = socket.getInputStream();
                     BufferedReader br = new BufferedReader(new InputStreamReader(is));

                     String s = br.readLine();

                     String[] arr = s.split(" ");

                     String html = arr[1].substring(1);


                     FileInputStream fis = new FileInputStream(html);
                     OutputStream os = socket.getOutputStream();
                     os.write("HTTP/1.1 OK\r\n".getBytes());
                     if(html.contains("css")){
                         os.write("Content-Type:text/css\r\n".getBytes());
                     }else if(html.contains("html")){

                         os.write("Content-Type:text/html\r\n".getBytes());
                     }else if(html.contains("png")){
                         os.write("Content-Type:image/png\r\n".getBytes());
                     }else if(html.contains("jpg")){
                         os.write("Content-Type:image/jpg\r\n".getBytes());
                     }

                     os.write("\r\n".getBytes());
                     int len = 0;
                     byte[] bys = new byte[1024];
                     while ((len = fis.read(bys)) != -1) {
                         os.write(bys, 0, len);
                     }

                     fis.close();
                     socket.close();
                 }catch (IOException e){
                     System.out.println(e);
                 }

                }
            }).start();
        }


    }
}
