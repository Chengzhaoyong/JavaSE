package cn.itcast_07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ClientDemo {
	public static void main(String[] args) throws IOException{
		 Socket s=new Socket("永哥",12345);
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		 //把通道的流包装
		 BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		 
		 String line=null;
				 while((line=br.readLine())!=null) {
					 if("88".equals(line)) {
						 break;
					 }
					 bw.write(line);
					 bw.newLine();
					 bw.flush();
					 
				 }
		 s.close();
		// br.close();
		 
		 
	}

}
